package com.ecbusiness.domain;

import java.io.Serializable;

/**
 * Created by Jason on 16/4/9.
 */
public class OrderShippingVo implements Serializable {

    private String orderId;
    private int logisticsCompanyId;
    private String orderShippingNo;
    private String receiveUser;
    private String toAddress;
    private String toMobile;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public int getLogisticsCompanyId() {
        return logisticsCompanyId;
    }

    public void setLogisticsCompanyId(int logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId;
    }

    public String getOrderShippingNo() {
        return orderShippingNo;
    }

    public void setOrderShippingNo(String orderShippingNo) {
        this.orderShippingNo = orderShippingNo;
    }

    public String getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getToMobile() {
        return toMobile;
    }

    public void setToMobile(String toMobile) {
        this.toMobile = toMobile;
    }
}
