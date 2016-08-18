package com.ecbusiness.service;

import com.ecbusiness.model.BrandMember;
import com.ecbusiness.model.BrandMemberCriteria;
import com.ecbusiness.mapper.BrandMemberMapper;
import com.ecbusiness.utils.StringFormatUtil;
import com.ecbusiness.utils.ValidParameterUtil;
import com.weejinfu.common.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by gaoqi on 2016/1/19.
 */
@Service
public class MemberService {

    @Autowired
    private BrandMemberMapper brandMemberMapper;

    /**
     * 用户登录时判断是否有效
     * @param userName
     * @param password
     * @return
     */
    public BrandMember isValidateUser(String userName, String password) {
        BrandMemberCriteria brandMemberCriteria = new BrandMemberCriteria();
        brandMemberCriteria.createCriteria().andUserNameEqualTo(userName);

        if (brandMemberMapper.countByExample(brandMemberCriteria) == 0) {
            return null;
        } else {
            BrandMember brandMember = brandMemberMapper.selectByExample(
                    brandMemberCriteria).get(0);
            if (!brandMember.getPassword().equalsIgnoreCase(
                    StringFormatUtil.getEncodeStr(userName + "++" +password))) {
                return null;
            } else {
                return brandMember;
            }
        }
    }

    public int addMember(BrandMember brandMember) throws BaseException{
        ValidParameterUtil.validBrandMember(brandMember);

        return brandMemberMapper.insert(brandMember);
    }

    public static String generatePassword(String userName, String password) {
        return StringFormatUtil.getEncodeStr(userName + "++" +password);
    }

//    public static void main(String[] args) {
//        System.out.print(generatePassword("gaoqida", "gaoqida02"));
//    }
}
