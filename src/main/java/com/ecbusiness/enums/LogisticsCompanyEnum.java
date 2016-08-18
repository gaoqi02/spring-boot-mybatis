package com.ecbusiness.enums;

/**
 * 快递公司的枚举
 * Created by gaoqi on 2016/1/20.
 */
public enum  LogisticsCompanyEnum {


    ZHONGTONG(0, "中通"),
    TEST(1, "测试"),
    HAHA(2, "哈哈快递公司"),
    MAMA(3, "么么快递公司"),
    ;

    private int code;
    private String desc;

    private LogisticsCompanyEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static String getDescByCode(int code) {
        LogisticsCompanyEnum[] messageTypes = values();
        for (LogisticsCompanyEnum messageType : messageTypes) {
            if (messageType.getCode() == code) {
                return messageType.getDesc();
            }
        }
        return null;
    }
}
