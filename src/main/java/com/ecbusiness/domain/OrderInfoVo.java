package com.ecbusiness.domain;

import com.ecbusiness.enums.LogisticsCompanyEnum;
import com.ecbusiness.enums.OrderStateEnum;
import com.ecbusiness.model.OrderItem;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * 系统首页展示的订单信息
 * Created by gaoqi on 2016/1/20.
 */
public class OrderInfoVo {

    private int productId;
    private int brandId;
    private String paidTime;//支付时间
    private String orderId;//订单id
    private BigDecimal orderPaidFee;//支付总金额
    private String goodsName;//订单内容即订单购买物品名称
    private BigDecimal goodsAmount; //购买的商品数量
    private String orderNotes;//定制需求即订单需求
    private String receiveUser;//收货人
    private String toMobile;//收货电话
    private String toAddress;//收货全地址
    private int logisticsCompanyId;//物流公司的id
    private String orderShippingNo;//物流订单号
    private String logisticsCompany;//物流公司的名称
    private String finishTime;//商品的完成时间
    private int orderItemId;//订单的子订单id
    private int orderState;//订单的状态
    private String orderStateString;//转中文
    private String imgUrl;//图片url
    private List<OrderItem> orderItems;//包含的orderItems
    private String logisticsTime;//发货时间
    private String businessPaidVoucher;//买线网汇款单url
    private String businessPaidTime; //买线网汇款时间

    public String getLogisticsTime() {
        return logisticsTime;
    }

    public void setLogisticsTime(String logisticsTime) {
        this.logisticsTime = logisticsTime;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getOrderStateString() {
        return orderStateString;
    }

    public void setOrderStateString(int orderState) {
        this.orderStateString = OrderStateEnum.getDescByCode(orderState);
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    public int getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(int orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getOrderPaidFee() {
        return orderPaidFee;
    }

    public void setOrderPaidFee(BigDecimal orderPaidFee) {
        this.orderPaidFee = orderPaidFee;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public BigDecimal getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(BigDecimal goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public String getOrderNotes() {
        return orderNotes;
    }

    public void setOrderNotes(String orderNotes) {
        this.orderNotes = orderNotes;
    }

    public String getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser;
    }

    public String getToMobile() {
        return toMobile;
    }

    public void setToMobile(String toMobile) {
        this.toMobile = toMobile;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getOrderShippingNo() {
        return orderShippingNo;
    }

    public void setOrderShippingNo(String orderShippingNo) {
        this.orderShippingNo = orderShippingNo;
    }

    public int getLogisticsCompanyId() {
        return logisticsCompanyId;
    }

    public void setLogisticsCompanyId(int logisticsCompanyId) {
        this.logisticsCompanyId = logisticsCompanyId;
    }

    public void setOrderStateString(String orderStateString) {
        this.orderStateString = orderStateString;
    }

    public String getBusinessPaidVoucher() {
        return businessPaidVoucher;
    }

    public void setBusinessPaidVoucher(String businessPaidVoucher) {
        this.businessPaidVoucher = businessPaidVoucher;
    }

    public String getBusinessPaidTime() {
        return businessPaidTime;
    }

    public void setBusinessPaidTime(String businessPaidTime) {
        this.businessPaidTime = businessPaidTime;
    }
}
