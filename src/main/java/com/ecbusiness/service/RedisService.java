package com.ecbusiness.service;

import com.ecbusiness.constant.CommonConstant;
import com.ecbusiness.model.BrandMember;
import com.weejinfu.common.model.Bd;
import com.weejinfu.common.util.JsonParser;
import com.weejinfu.common.util.RedisUtil;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;
import redis.clients.jedis.exceptions.JedisConnectionException;

import java.util.HashMap;

/**
 * Description:
 * <p/>
 * Created by js.lee on 7/9/15.
 */
@Service
public class RedisService  {

	private Logger logger = Logger.getLogger(this.getClass());

	private static ShardedJedisPool pool = RedisUtil.getPool();

	private ShardedJedis getJedis() {
		try {
			return pool.getResource();
		} catch (Exception e) {
			logger.error("连接池初始化失败", e);
		}
		return null;
	}

	public Long delete(String sid) {
		ShardedJedis client = getJedis();

		try {
			Long result = client.del(sid);
			logger.info(String.format("【SERVICE INFO】删除sid.key=%s, result=%s", sid, result));
			return result;
		} finally {
			pool.returnResource(client);
		}
	}

    public String getAndDeleteCaptcha(String vik) {
        String key = getCaptchaMemKeyBySessionId(vik);
        String captcha = getJedis().get(key);
        getJedis().del(key);
        logger.info(String.format("【SERVICE INFO】获取并删除图片验证码.key=%s, value=%s", key, captcha));
        return captcha;
    }

    public String getMobileCheckUUID(String uuid) {
        String key = getMobileCheckKey(uuid);
        String cacheMobile = get(key);
        logger.info(String.format("【SERVICE INFO】获取手机校验结果.key=%s, value=%s", key, cacheMobile));
        return cacheMobile;
    }

	/**
	 * 缓存图片验证码
	 *
	 * @param vik
	 *            键
	 * @param captcha
	 *            验证码
	 * @return String 状态
	 */

	public String setCaptcha(String vik, String captcha) {
		ShardedJedis client = getJedis();
		try {
			String key = getCaptchaMemKeyBySessionId(vik);
			String result = client.setex(key, CommonConstant.CAPTCHA_EXPIRED, captcha);
			logger.info(String.format("【SERVICE INFO】缓存图片验证码.key=%s, value=%s, status=%s", key, captcha, result));
			return result;
		} catch (Exception e) {
			return null;
		} finally {
			pool.returnResource(client);
		}
	}


	public static String getCaptchaMemKeyBySessionId(String sessionid) {
		return "capt:" + sessionid;
	}

	public String setSessionToCache(String sid, BrandMember bd) {
		ShardedJedis client = getJedis();
		try {
			String result = client.setex(sid, CommonConstant.SESSION_EXPIRED, JsonParser.write(bd));
			logger.info(String.format("【SERVICE INFO】缓存登录用户.key=%s, user=%s, result=%s", sid, bd, result));
			return result;
		} finally {
			pool.returnResource(client);
		}
	}

	public static String getMobileCheckKey(String uuid) {
		return "mobi:" + uuid;
	}

	public String get(String key) {
		ShardedJedis jedis = null;
		try {
			jedis = getJedis();
			return jedis.get(key);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public String setMobileCheckUUID(String uuid, String mobile) {
		String key = getMobileCheckKey(uuid);
		String result = set(key, CommonConstant.MOBILE_CHECK_EXPIRED, mobile);
		logger.info(String.format("【SERVICE INFO】缓存手机校验结果.key=%s, value=%s, status=%s", key, uuid, result));
		return result;
	}

	public String set(String key, int expiredTime, String value) {
		ShardedJedis jedis = null;
		try {
			jedis = getJedis();
			return jedis.setex(key, expiredTime, value);
		} finally {
			pool.returnResource(jedis);
		}
	}

	public Long deleteSms(String mobile) {
		String key = getSmsKey(mobile);
		Long result = delete(key);
		logger.info(String.format("【SERVICE INFO】删除短信验证码.key=%s, status=%s", key, result));
		return result;
	}

	public static String getSmsKey(String smsId) {
		return "sms:" + smsId;
	}

	public String getSms(String mobile) {
		String key = getSmsKey(mobile);
		String code = get(key);
		logger.info(String.format("【SERVICE INFO】获取短信验证码.key=%s, value=%s", key, code));
		return code;
	}

	public String setSms(String mobile, String code) {
		String key = getSmsKey(mobile);
		String result = set(key, CommonConstant.SMS_EXPIRED, code);
		logger.info(String.format("【SERVICE INFO】缓存短信验证码.key=%s, value=%s, status=%s", key, code, result));
		return result;
	}
}
