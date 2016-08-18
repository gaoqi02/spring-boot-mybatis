package com.ecbusiness.enums;

/**
 * Created by gaoqi on 2016/1/21.
 */
public enum  OrderOfflinePaidEnum {


    UNPAID("N", "51买线网未打款"),
    PAYING("Y", "51买线网申请打款中");

    private String code;
    private String desc;

    private OrderOfflinePaidEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static String getDescByCode(String code) {
        OrderOfflinePaidEnum[] messageTypes = values();
        for (OrderOfflinePaidEnum messageType : messageTypes) {
            if (messageType.getCode() .equals(code)) {
                return messageType.getDesc();
            }
        }
        return null;
    }

}
