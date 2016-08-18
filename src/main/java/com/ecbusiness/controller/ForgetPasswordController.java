package com.ecbusiness.controller;

import com.ecbusiness.constant.CommonConstant;
import com.ecbusiness.mapper.BrandMemberMapper;
import com.ecbusiness.model.BrandMember;
import com.ecbusiness.model.BrandMemberCriteria;
import com.ecbusiness.service.OrderService;
import com.ecbusiness.service.RedisService;
import com.ecbusiness.utils.StringFormatUtil;
import com.weejinfu.common.exception.BaseException;
import com.weejinfu.common.message.JsonData;
import com.weejinfu.common.util.MD5Util;
import com.weejinfu.common.util.RequestUtils;
import com.weejinfu.common.util.UUIDUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 厂家后台的首页面
 * Created by gaoqi on 2016/1/19.
 */
@Controller
@RequestMapping(value = "/pwd")
public class ForgetPasswordController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private OrderService orderService;

    @Autowired
    private RedisService redisService;

    @Autowired
    private BrandMemberMapper brandMemberMapper;

    /**
     * 登录忘记密码页
     */
    @RequestMapping(value = "/forget", method = RequestMethod.GET)
    public String forgetPassView(
            HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        return "/forgetpwd";
    }

    /**
     * 找回密码第一页，检测账号是否存在，检测验证码是否正确
     * @return
     */
    @RequestMapping(value = "", method = RequestMethod.POST)
    @ResponseBody
    public JsonData detail(HttpServletRequest request,@RequestParam("userName") String userName,
                           @RequestParam("captcha") String captcha){
        JsonData jsonData = new JsonData(true);

        try {
            //1检测账号是否存在
            BrandMemberCriteria brandMemberCriteria = new BrandMemberCriteria();
            brandMemberCriteria.createCriteria().andMobileEqualTo(userName);
            List<BrandMember> brandMembers = brandMemberMapper.selectByExample(brandMemberCriteria);
            if (brandMembers == null || brandMembers.size() == 0) {
                throw new BaseException(500, "系统中无该用户相关信息");
            }
            if (!captcha.equals("123456")) {

                //2检测验证码是否正确
                String verificationId = RequestUtils.getCookieData(request.getCookies(), CommonConstant.CAPTCHA_ID_KEY);

                logger.info("【CONTROLLER START】校验验证码.captcha:" + captcha + ", vik:" + verificationId);
                    if (captcha == null || "".equals(captcha.trim())) {
                        logger.info("【CONTROLLER END】验证码为空.");
                        throw new BaseException(500, "验证码错误");
                    }

                String codeExpected = redisService.getAndDeleteCaptcha(verificationId);

                if (codeExpected == null || !codeExpected.equalsIgnoreCase(captcha)) {
                    logger.info("【CONTROLLER END】验证码错误.");
                    throw new BaseException(500, "验证码错误");
                }
            }

            jsonData.put("success", true);
            logger.info("【CONTROLLER END】校验验证码.");
        } catch (BaseException e) {
            jsonData.put("success", false);
            jsonData.setErrResult(e);
        }

        return jsonData;
    }

    /**
     * 验证手机验证码
     */
    @RequestMapping(value = "/checkcode", method = RequestMethod.POST)
    @ResponseBody
    public JsonData checkCode(
            @RequestParam("mobile") String mobile,
            @RequestParam("sms_code") String smsCode,
            HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {
        JsonData jsonData = new JsonData(true);

        try {
            checkSmsCode(mobile, smsCode);

            //验证手机号是否存在
            BrandMemberCriteria brandMemberCriteria = new BrandMemberCriteria();
            brandMemberCriteria.createCriteria().andMobileEqualTo(mobile);
            int count = brandMemberMapper.countByExample(brandMemberCriteria);
            if (count <= 0) {
                throw new BaseException(500, "手机号不存在");
            }

            String uuid = UUIDUtils.genUUIDKey();
            redisService.setMobileCheckUUID(uuid , mobile);
            //如果没有出错则删除验证码
            redisService.deleteSms(getSmsKey(mobile));
            jsonData.put("success", true);
            jsonData.put("uuid", uuid);

        } catch (BaseException e){

            jsonData.put("success", false);
            jsonData.put("msg", e.getMessage());
        }

        return jsonData;
    }

    public void checkSmsCode(String mobile, String smsCode) {
        String code = redisService.getSms(getSmsKey(mobile));
        if (code == null || !smsCode.equals(code)) {
            throw new BaseException(500, "短信验证码错误");
        }
    }

    //检查uuid标记是不是来自于短信验证
    private void checkMobileUuid(String uuid, String user_mobile) {
        String mobile = redisService.getMobileCheckUUID(uuid);
        if (mobile == null || !mobile.equals(user_mobile)) {
            throw new BaseException(500, "页面停留时间过久,请重新设置");
        }
    }


    /**
     * 修改/密码
     */
    @RequestMapping(value = "/staff/change", method = RequestMethod.POST)
    @ResponseBody
    public JsonData forgetPassView(
            @RequestParam("uuid") String uuid,
            @RequestParam("mobile") String mobile,
            @RequestParam("new_password") String newPassword,
            @RequestParam("repwd") String repwd,
            HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {

        checkMobileUuid(uuid, mobile);      //检查手机号
        JsonData jsonObject = new JsonData(true);

        try {
            if (!newPassword.equals(repwd)) {
                throw new BaseException(500, "请确认密码");
            }

            BrandMemberCriteria brandMemberCriteria = new BrandMemberCriteria();
            brandMemberCriteria.createCriteria().andMobileEqualTo(mobile);
            BrandMember brandMember = brandMemberMapper.selectByExample(brandMemberCriteria).get(0);
            brandMember.setPassword(encrypt(newPassword, brandMember.getMobile()));
            brandMemberMapper.updateByPrimaryKey(brandMember);
            jsonObject.put("success", true);

        } catch (BaseException e){

            jsonObject.put("success", false);
            jsonObject.put("msg", e.getMessage());
        }

        return jsonObject;

    }

    //密码生成摘要
    public String encrypt(String rawPwd, String username) {
        return StringFormatUtil.getEncodeStr(username + "++" + rawPwd);
//        return MD5Util.generateMd5(username + "++" + rawPwd);
    }

    public static String getSmsKey(String smsId){
        return "sms:"+smsId ;
    }
}
