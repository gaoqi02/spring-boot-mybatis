package com.ecbusiness.service;

import com.ecbusiness.mapper.BrandMemberMapper;
import com.ecbusiness.model.BrandMember;
import com.ecbusiness.model.BrandMemberCriteria;
import com.weejinfu.common.exception.BaseException;
import com.ecbusiness.utils.StringFormatUtil;
import com.weejinfu.common.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gaoqi on 2016/3/29.
 */
@Service
public class LoginService {

    @Autowired
    private BrandMemberMapper brandMemberMapper;


    public BrandMember doLogin(String userName,String password) {

        BrandMemberCriteria brandMemberCriteria = new BrandMemberCriteria();
//        brandMemberCriteria.createCriteria().andUserNameEqualTo(userName);
        brandMemberCriteria.createCriteria().andMobileEqualTo(userName);

        List<BrandMember> brandMembers = brandMemberMapper.selectByExample(brandMemberCriteria);
        if (null != brandMembers && brandMembers.size() > 0) {
            BrandMember brandMember = brandMembers.get(0);//数据库中的
            String checkPassword = encrypt(password,userName);
            if (null != checkPassword && checkPassword.equals(brandMember.getPassword())) {
                //bdid和poilog的id一致
                return brandMember;
            } else {
                throw new BaseException(500, "用户名或密码错误");
            }

        } else {
            throw new BaseException(500, "用户名或密码错误");
        }

    }

    //密码生成摘要
    public String encrypt(String rawPwd, String username) {
        return StringFormatUtil.getEncodeStr(username + "++" + rawPwd);
//        return MD5Util.generateMd5(username + "++" + rawPwd);
    }
}
