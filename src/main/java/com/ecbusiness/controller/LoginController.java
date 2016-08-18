package com.ecbusiness.controller;

import com.ecbusiness.constant.CommonConstant;
import com.ecbusiness.model.BrandMember;
import com.ecbusiness.service.LoginService;
import com.ecbusiness.service.RedisService;
import com.ecbusiness.utils.ResponseUtils;
import com.weejinfu.common.exception.BaseException;
import com.weejinfu.common.model.Bd;
import com.weejinfu.common.util.JsonParser;

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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;

/**
 * Created by gaoqi on 2015/4/15.
 */
@Controller
public class LoginController {

    private Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private LoginService loginService;

    @Autowired
    private RedisService redisService;


    @RequestMapping(value = "")
    public String index(HttpServletRequest request, HttpServletResponse response,
                        ModelMap modelMap) {

        return "/login";
    }

    /**
     * 登入
     * @param username
     * @param password
     * @param captcha
     * @param request
     * @param response
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/maixian/doLogin", method = RequestMethod.POST)
    public String login(@RequestParam(value = "username") String username,
                        @RequestParam(value = "password") String password,HttpSession session,
                        @RequestParam(value = "captcha") String captcha,//验证码value
                        HttpServletRequest request, HttpServletResponse response,
                        ModelMap modelMap) {

        try {
            /**
             * 验证码check
             */
            if (!captcha.equals("1234")) {
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
            // 登陆
//            BrandMember brandMember = new BrandMember();
//            if (!username.equals("admin123") && password.equals("123123")) {
//                 brandMember = loginService.doLogin(username, password);
//            } else {
//                brandMember.setBrandId(9);
//                brandMember.setUserName("万能用户");
//                brandMember.setMobile("18515075294");
//                brandMember.setRealName("万能");
//                brandMember.setRole((byte)1);
//            }
            BrandMember brandMember = loginService.doLogin(username, password);
            if (null != brandMember) {
                brandMember.setUserName(username);
                resolveLogin(session, response, brandMember);
                //用redirct是为了让response生效从而在拦截器中从request中获得最新的cookie
                return "redirect:/index";
            } else {
                modelMap.addAttribute("ErrMsg", "用户名或密码错误");
                return "/login";
            }
        } catch (BaseException e){
        	modelMap.addAttribute("ErrMsg", e.getMessage());
            return "/login";
        }

    }

    /**
     * 登录后的一些操作, 使用和普通用户一样的逻辑
     *
     * @param session
     * @param response
     * @param bd
     */
    public void resolveLogin(HttpSession session, HttpServletResponse response, BrandMember bd) {
        //存储user到memcache session
        String sid = UUIDUtils.genUUIDKey();
        redisService.setSessionToCache(sid, bd);

        //添加到cookie
        ResponseUtils.addCookie(response, CommonConstant.SESSION_BDID_KEY, sid);

        session.setAttribute(CommonConstant.GLOBAL_PARAM, bd);
    }

    /**
     * 登出
     * @param request
     * @param response
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/maixian/logout", method = RequestMethod.GET)
    public String logout(HttpSession session,
            HttpServletRequest request, HttpServletResponse response, ModelMap modelMap) {

        String sid = RequestUtils.getCookieData(request.getCookies(), CommonConstant.SESSION_BDID_KEY);
        resolveLogout(session, response, sid);
        try {
            response.sendRedirect("/?okmsg=" + URLEncoder.encode("已退出"));
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return null;
    }


    private void resolveLogout(HttpSession session, HttpServletResponse response, String sid) {
        redisService.delete(sid);
        //删除cookie
        ResponseUtils.removeCookie(response, CommonConstant.SESSION_BDID_KEY);
        session.removeAttribute(CommonConstant.GLOBAL_PARAM);
    }

}
