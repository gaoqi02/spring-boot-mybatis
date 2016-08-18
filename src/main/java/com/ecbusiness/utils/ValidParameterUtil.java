package com.ecbusiness.utils;

import com.ecbusiness.model.BrandMember;
import com.weejinfu.common.exception.BaseException;

/**
 * Created by gaoqi on 2016/1/19.
 */
public class ValidParameterUtil {

    //检查注册用户传值合法性
    public static void validBrandMember(BrandMember brandMember) throws BaseException{
        if (brandMember.getUserName() == null || brandMember.getUserName().equals("")) {
            throw new BaseException(500, "用户名不可为空");
        }
        if (brandMember.getPassword() == null || brandMember.getPassword().equals("")) {
            throw new BaseException(500, "密码不可为空");
        }
        if (brandMember.getBrandId() == null || brandMember.getBrandId().intValue() == 0) {
            throw new BaseException(500, "请选择门店号");
        }
    }
}
