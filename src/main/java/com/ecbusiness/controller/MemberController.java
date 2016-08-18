package com.ecbusiness.controller;

import com.ecbusiness.constant.CommonConstant;
import com.ecbusiness.model.BrandMember;
import com.ecbusiness.mapper.BrandMemberMapper;
import com.ecbusiness.service.MemberService;
import com.weejinfu.common.exception.BaseException;
import com.weejinfu.common.message.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * Created by gaoqi on 2016/1/19.
 */
@Controller
@RequestMapping(value = "/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private BrandMemberMapper BrandMemberMapper;

    /**
     * 用户登录系统
     * @param userName
     * @param password
     * @param session
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginController(
            @RequestParam(value = "username", required = true) String userName,
            @RequestParam(value = "password", required = true) String password,
            HttpSession session) {
        JsonData jsonData = new JsonData(true);

        try {
            BrandMember brandMember = memberService.isValidateUser(userName,
                    password);
            if (brandMember == null) {
                throw new BaseException(500, "用户名或密码错误");
            } else {
                /**
                 * 这里不用redis什么存储了直接使用httpSession
                 */
                session.setAttribute("brandMember", brandMember);

                return "redirect:/index";
            }
        } catch (BaseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            jsonData.setErrResult(e);
            return "error/error";
        }

    }


    /**
     * 新添加用户--> 跳转登录页面
     * @param brandMember
     * @param session
     * @return
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public JsonData registerController(
            @RequestBody BrandMember brandMember, HttpSession session) throws ClassCastException {
        JsonData jsonData = new JsonData(true);

        try {
            BrandMember manager = (BrandMember)session.getAttribute("brandMember");

            if (manager == null) {
                throw new BaseException(500, "超时了请重新登录");
            }
            //是系统管理员或者是门店管理员
            if (manager.getRole() == CommonConstant.sys_role ||
                    (manager.getBrandId()==brandMember.getBrandId() && manager.getRole() == CommonConstant.sys_role)) {
                jsonData.put("memberId", memberService.addMember(brandMember));
            } else {
                throw new BaseException(500, "您无权操作本功能");
            }

        } catch (BaseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            jsonData.setErrResult(e);
        }

        return jsonData;

    }


}
