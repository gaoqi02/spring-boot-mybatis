package com.ecbusiness.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderShipping implements Serializable {
    private Integer orderShippingId;

    private String orderId;

    private String orderShippingNo;

    private Integer logisticCompanyId;

    private String printState;

    private String printTime;

    private Integer printUserId;

    private BigDecimal logisticWeightsActual;

    private BigDecimal logisticFeeActual;

    private Integer logisticFeeUserId;

    private String logisticFeeTime;

    private String isShipping;

    private String shippingTime;

    private String fromCompany;

    private String fromAddress;

    private String fromTel;

    private String fromUser;

    private String toUser;

    private String toAddress;

    private String toTel;

    private String toMobile;

    private String isInsurance;

    private BigDecimal goodsFee;

    private BigDecimal insuranceFee;

    private String paymentType;

    private String deliveryDateType;

    private String deliveryTimeType;

    private Integer goodsAmount;

    private String deliveryNotes;

    private String isDelete;

    private Integer addUserId;

    private String addTime;

    private Integer editUserId;

    private String editTime;

    private Integer orderDeliveryId;

    private static final long serialVersionUID = 1L;

    public Integer getOrderShippingId() {
        return orderShippingId;
    }

    public void setOrderShippingId(Integer orderShippingId) {
        this.orderShippingId = orderShippingId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderShippingNo() {
        return orderShippingNo;
    }

    public void setOrderShippingNo(String orderShippingNo) {
        this.orderShippingNo = orderShippingNo == null ? null : orderShippingNo.trim();
    }

    public Integer getLogisticCompanyId() {
        return logisticCompanyId;
    }

    public void setLogisticCompanyId(Integer logisticCompanyId) {
        this.logisticCompanyId = logisticCompanyId;
    }

    public String getPrintState() {
        return printState;
    }

    public void setPrintState(String printState) {
        this.printState = printState == null ? null : printState.trim();
    }

    public String getPrintTime() {
        return printTime;
    }

    public void setPrintTime(String printTime) {
        this.printTime = printTime == null ? null : printTime.trim();
    }

    public Integer getPrintUserId() {
        return printUserId;
    }

    public void setPrintUserId(Integer printUserId) {
        this.printUserId = printUserId;
    }

    public BigDecimal getLogisticWeightsActual() {
        return logisticWeightsActual;
    }

    public void setLogisticWeightsActual(BigDecimal logisticWeightsActual) {
        this.logisticWeightsActual = logisticWeightsActual;
    }

    public BigDecimal getLogisticFeeActual() {
        return logisticFeeActual;
    }

    public void setLogisticFeeActual(BigDecimal logisticFeeActual) {
        this.logisticFeeActual = logisticFeeActual;
    }

    public Integer getLogisticFeeUserId() {
        return logisticFeeUserId;
    }

    public void setLogisticFeeUserId(Integer logisticFeeUserId) {
        this.logisticFeeUserId = logisticFeeUserId;
    }

    public String getLogisticFeeTime() {
        return logisticFeeTime;
    }

    public void setLogisticFeeTime(String logisticFeeTime) {
        this.logisticFeeTime = logisticFeeTime == null ? null : logisticFeeTime.trim();
    }

    public String getIsShipping() {
        return isShipping;
    }

    public void setIsShipping(String isShipping) {
        this.isShipping = isShipping == null ? null : isShipping.trim();
    }

    public String getShippingTime() {
        return shippingTime;
    }

    public void setShippingTime(String shippingTime) {
        this.shippingTime = shippingTime == null ? null : shippingTime.trim();
    }

    public String getFromCompany() {
        return fromCompany;
    }

    public void setFromCompany(String fromCompany) {
        this.fromCompany = fromCompany == null ? null : fromCompany.trim();
    }

    public String getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress == null ? null : fromAddress.trim();
    }

    public String getFromTel() {
        return fromTel;
    }

    public void setFromTel(String fromTel) {
        this.fromTel = fromTel == null ? null : fromTel.trim();
    }

    public String getFromUser() {
        return fromUser;
    }

    public void setFromUser(String fromUser) {
        this.fromUser = fromUser == null ? null : fromUser.trim();
    }

    public String getToUser() {
        return toUser;
    }

    public void setToUser(String toUser) {
        this.toUser = toUser == null ? null : toUser.trim();
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress == null ? null : toAddress.trim();
    }

    public String getToTel() {
        return toTel;
    }

    public void setToTel(String toTel) {
        this.toTel = toTel == null ? null : toTel.trim();
    }

    public String getToMobile() {
        return toMobile;
    }

    public void setToMobile(String toMobile) {
        this.toMobile = toMobile == null ? null : toMobile.trim();
    }

    public String getIsInsurance() {
        return isInsurance;
    }

    public void setIsInsurance(String isInsurance) {
        this.isInsurance = isInsurance == null ? null : isInsurance.trim();
    }

    public BigDecimal getGoodsFee() {
        return goodsFee;
    }

    public void setGoodsFee(BigDecimal goodsFee) {
        this.goodsFee = goodsFee;
    }

    public BigDecimal getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(BigDecimal insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType == null ? null : paymentType.trim();
    }

    public String getDeliveryDateType() {
        return deliveryDateType;
    }

    public void setDeliveryDateType(String deliveryDateType) {
        this.deliveryDateType = deliveryDateType == null ? null : deliveryDateType.trim();
    }

    public String getDeliveryTimeType() {
        return deliveryTimeType;
    }

    public void setDeliveryTimeType(String deliveryTimeType) {
        this.deliveryTimeType = deliveryTimeType == null ? null : deliveryTimeType.trim();
    }

    public Integer getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Integer goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    public void setDeliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes == null ? null : deliveryNotes.trim();
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete == null ? null : isDelete.trim();
    }

    public Integer getAddUserId() {
        return addUserId;
    }

    public void setAddUserId(Integer addUserId) {
        this.addUserId = addUserId;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public Integer getEditUserId() {
        return editUserId;
    }

    public void setEditUserId(Integer editUserId) {
        this.editUserId = editUserId;
    }

    public String getEditTime() {
        return editTime;
    }

    public void setEditTime(String editTime) {
        this.editTime = editTime == null ? null : editTime.trim();
    }

    public Integer getOrderDeliveryId() {
        return orderDeliveryId;
    }

    public void setOrderDeliveryId(Integer orderDeliveryId) {
        this.orderDeliveryId = orderDeliveryId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderShippingId=").append(orderShippingId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderShippingNo=").append(orderShippingNo);
        sb.append(", logisticCompanyId=").append(logisticCompanyId);
        sb.append(", printState=").append(printState);
        sb.append(", printTime=").append(printTime);
        sb.append(", printUserId=").append(printUserId);
        sb.append(", logisticWeightsActual=").append(logisticWeightsActual);
        sb.append(", logisticFeeActual=").append(logisticFeeActual);
        sb.append(", logisticFeeUserId=").append(logisticFeeUserId);
        sb.append(", logisticFeeTime=").append(logisticFeeTime);
        sb.append(", isShipping=").append(isShipping);
        sb.append(", shippingTime=").append(shippingTime);
        sb.append(", fromCompany=").append(fromCompany);
        sb.append(", fromAddress=").append(fromAddress);
        sb.append(", fromTel=").append(fromTel);
        sb.append(", fromUser=").append(fromUser);
        sb.append(", toUser=").append(toUser);
        sb.append(", toAddress=").append(toAddress);
        sb.append(", toTel=").append(toTel);
        sb.append(", toMobile=").append(toMobile);
        sb.append(", isInsurance=").append(isInsurance);
        sb.append(", goodsFee=").append(goodsFee);
        sb.append(", insuranceFee=").append(insuranceFee);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", deliveryDateType=").append(deliveryDateType);
        sb.append(", deliveryTimeType=").append(deliveryTimeType);
        sb.append(", goodsAmount=").append(goodsAmount);
        sb.append(", deliveryNotes=").append(deliveryNotes);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", addUserId=").append(addUserId);
        sb.append(", addTime=").append(addTime);
        sb.append(", editUserId=").append(editUserId);
        sb.append(", editTime=").append(editTime);
        sb.append(", orderDeliveryId=").append(orderDeliveryId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}