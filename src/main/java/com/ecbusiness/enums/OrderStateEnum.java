package com.ecbusiness.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaoqi on 2016/1/19.
 */
public enum OrderStateEnum {

    PAID(21, "已支付"),

    DELIVERED(25, "已出库"),
    RECEIVED(19, "已收货"),

    BUSINESS_PAID(22, "已提交汇款信息"),
    CONFIRM_RECEIPT(23, "商家确认收款");


    private int code;
    private String desc;

    private OrderStateEnum(int code, String desc) {
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
        OrderStateEnum[] messageTypes = values();
        for (OrderStateEnum messageType : messageTypes) {
            if (messageType.getCode() == code) {
                return messageType.getDesc();
            }
        }
        return null;
    }

    public static List<Integer> getUnDeliverOrderState() {
        List<Integer> list = new ArrayList<>();
        list.add(PAID.getCode());

        return list;
    }

    public static List<Integer> getAllOrderState() {
        List<Integer> list = new ArrayList<>();
        list.add(PAID.getCode());
        list.add(DELIVERED.getCode());
        list.add(RECEIVED.getCode());
        list.add(BUSINESS_PAID.getCode());
        list.add(CONFIRM_RECEIPT.getCode());

        return list;
    }

    public static List<Integer> getDeliverOrderState() {
        List<Integer> list = new ArrayList<>();
        list.add(DELIVERED.getCode());
        list.add(RECEIVED.getCode());
        list.add(BUSINESS_PAID.getCode());
        list.add(CONFIRM_RECEIPT.getCode());

        return list;
    }

    public static List<Integer> getUnconfirmBusinessPaidState() {
        List<Integer> list = new ArrayList<>();
        list.add(PAID.getCode());
        list.add(DELIVERED.getCode());
        list.add(RECEIVED.getCode());
        list.add(BUSINESS_PAID.getCode());
        return list;
    }

    public static List<Integer> getConfirmBusinessPaidState() {
        List<Integer> list = new ArrayList<>();
        list.add(CONFIRM_RECEIPT.getCode());
        return list;
    }

}
