package com.ecbusiness.controller;

import com.ecbusiness.constant.MemcacheConstant;
import com.ecbusiness.service.RedisService;
import com.ecbusiness.utils.SmsUtils;
import com.weejinfu.common.exception.BaseException;
import com.weejinfu.common.message.JsonData;
import com.weejinfu.common.util.ParseUtils;
import com.weejinfu.common.util.RegexUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: zhengxu
 * Date: 13-11-5
 * Time: 下午8:25
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class SmsController {

    Logger logger = Logger.getLogger(getClass());

    @Autowired
    RedisService redisService;

    @RequestMapping(value = "/sms/send", method = RequestMethod.POST)
    public JsonData sendSmsCode(
            @RequestParam(value = "mobile", required = false, defaultValue = "18515075294") String mobile,
            HttpServletRequest request, ModelMap modelMap) {
        JsonData jsonData = new JsonData(true);
        boolean send = sendSms(mobile);
        jsonData.put("send", send);
        return jsonData;

    }

    private boolean sendSms(String mobile) {
//        String freqSms = redisService.getSmsWithoutDelete(MemcacheConstant.getSmsFreqKey(mobile));
//        if (StringUtils.isNotEmpty(freqSms)) {
//            throw new BaseException(500, "短信请求过于频繁");
//        }
        if (!RegexUtils.isMobileNO(mobile)) {
            throw new BaseException(500, "手机号错误");
        }

        String smsCode = redisService.getSms(MemcacheConstant.getSmsKey(mobile));
        int code = ParseUtils.parseInt(smsCode, 0);
        if (code <= 0) {
            code = (int) (Math.random() * 900000) + 100000;
        }

        //存短信
        redisService.setSms(MemcacheConstant.getSmsKey(mobile),  String.valueOf(code));
        //存计数标记
        redisService.setSms(MemcacheConstant.getSmsFreqKey(mobile),String.valueOf(code));
        String result =  SmsUtils.sendSms(mobile, "您的验证码是 " + code + " 【买线网】", "");

        if (result.equals("1&发送成功"))
            return true;
        return false;
    }

}
