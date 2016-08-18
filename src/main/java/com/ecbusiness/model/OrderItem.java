package com.ecbusiness.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderItem implements Serializable {
    private Integer orderItemId;

    private String orderId;

    private String orderGroupId;

    private Integer orderDeliveryId;

    private String goodsType;

    private Integer goodsId;

    private String goodsNo;

    private String goodsName;

    private String goodsUnit;

    private BigDecimal goodsCostPrice;

    private BigDecimal goodsOldPrice;

    private BigDecimal goodsPrice;

    private Integer goodsAmount;

    private Integer giftAmount;

    private BigDecimal canReturnAmount;

    private BigDecimal subsidy;

    private Long points;

    private BigDecimal awardMoney;

    private BigDecimal goodsSumFee;

    private Integer productCombinationId;

    private BigDecimal executePrice;

    private String isGift;

    private Integer mainGoodsId;

    private Integer pcgGiftId;

    private String orderRuleId;

    private String productRuleId;

    private BigDecimal productDown;

    private BigDecimal cartDown;

    private BigDecimal cartPrice;

    private String productCouponIds;

    private String productCouponNums;

    private String orderCouponIds;

    private String orderCouponNums;

    private String repairState;

    private String isComment;

    private String isShow;

    private String isDelete;

    private Integer addUserId;

    private String addTime;

    private Integer editUserId;

    private String editTime;

    private String comments;

    private String imgUrl;//前台展示的图片

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    private static final long serialVersionUID = 1L;

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderGroupId() {
        return orderGroupId;
    }

    public void setOrderGroupId(String orderGroupId) {
        this.orderGroupId = orderGroupId == null ? null : orderGroupId.trim();
    }

    public Integer getOrderDeliveryId() {
        return orderDeliveryId;
    }

    public void setOrderDeliveryId(Integer orderDeliveryId) {
        this.orderDeliveryId = orderDeliveryId;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType == null ? null : goodsType.trim();
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsUnit() {
        return goodsUnit;
    }

    public void setGoodsUnit(String goodsUnit) {
        this.goodsUnit = goodsUnit == null ? null : goodsUnit.trim();
    }

    public BigDecimal getGoodsCostPrice() {
        return goodsCostPrice;
    }

    public void setGoodsCostPrice(BigDecimal goodsCostPrice) {
        this.goodsCostPrice = goodsCostPrice;
    }

    public BigDecimal getGoodsOldPrice() {
        return goodsOldPrice;
    }

    public void setGoodsOldPrice(BigDecimal goodsOldPrice) {
        this.goodsOldPrice = goodsOldPrice;
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsAmount() {
        return goodsAmount;
    }

    public void setGoodsAmount(Integer goodsAmount) {
        this.goodsAmount = goodsAmount;
    }

    public Integer getGiftAmount() {
        return giftAmount;
    }

    public void setGiftAmount(Integer giftAmount) {
        this.giftAmount = giftAmount;
    }

    public BigDecimal getCanReturnAmount() {
        return canReturnAmount;
    }

    public void setCanReturnAmount(BigDecimal canReturnAmount) {
        this.canReturnAmount = canReturnAmount;
    }

    public BigDecimal getSubsidy() {
        return subsidy;
    }

    public void setSubsidy(BigDecimal subsidy) {
        this.subsidy = subsidy;
    }

    public Long getPoints() {
        return points;
    }

    public void setPoints(Long points) {
        this.points = points;
    }

    public BigDecimal getAwardMoney() {
        return awardMoney;
    }

    public void setAwardMoney(BigDecimal awardMoney) {
        this.awardMoney = awardMoney;
    }

    public BigDecimal getGoodsSumFee() {
        return goodsSumFee;
    }

    public void setGoodsSumFee(BigDecimal goodsSumFee) {
        this.goodsSumFee = goodsSumFee;
    }

    public Integer getProductCombinationId() {
        return productCombinationId;
    }

    public void setProductCombinationId(Integer productCombinationId) {
        this.productCombinationId = productCombinationId;
    }

    public BigDecimal getExecutePrice() {
        return executePrice;
    }

    public void setExecutePrice(BigDecimal executePrice) {
        this.executePrice = executePrice;
    }

    public String getIsGift() {
        return isGift;
    }

    public void setIsGift(String isGift) {
        this.isGift = isGift == null ? null : isGift.trim();
    }

    public Integer getMainGoodsId() {
        return mainGoodsId;
    }

    public void setMainGoodsId(Integer mainGoodsId) {
        this.mainGoodsId = mainGoodsId;
    }

    public Integer getPcgGiftId() {
        return pcgGiftId;
    }

    public void setPcgGiftId(Integer pcgGiftId) {
        this.pcgGiftId = pcgGiftId;
    }

    public String getOrderRuleId() {
        return orderRuleId;
    }

    public void setOrderRuleId(String orderRuleId) {
        this.orderRuleId = orderRuleId == null ? null : orderRuleId.trim();
    }

    public String getProductRuleId() {
        return productRuleId;
    }

    public void setProductRuleId(String productRuleId) {
        this.productRuleId = productRuleId == null ? null : productRuleId.trim();
    }

    public BigDecimal getProductDown() {
        return productDown;
    }

    public void setProductDown(BigDecimal productDown) {
        this.productDown = productDown;
    }

    public BigDecimal getCartDown() {
        return cartDown;
    }

    public void setCartDown(BigDecimal cartDown) {
        this.cartDown = cartDown;
    }

    public BigDecimal getCartPrice() {
        return cartPrice;
    }

    public void setCartPrice(BigDecimal cartPrice) {
        this.cartPrice = cartPrice;
    }

    public String getProductCouponIds() {
        return productCouponIds;
    }

    public void setProductCouponIds(String productCouponIds) {
        this.productCouponIds = productCouponIds == null ? null : productCouponIds.trim();
    }

    public String getProductCouponNums() {
        return productCouponNums;
    }

    public void setProductCouponNums(String productCouponNums) {
        this.productCouponNums = productCouponNums == null ? null : productCouponNums.trim();
    }

    public String getOrderCouponIds() {
        return orderCouponIds;
    }

    public void setOrderCouponIds(String orderCouponIds) {
        this.orderCouponIds = orderCouponIds == null ? null : orderCouponIds.trim();
    }

    public String getOrderCouponNums() {
        return orderCouponNums;
    }

    public void setOrderCouponNums(String orderCouponNums) {
        this.orderCouponNums = orderCouponNums == null ? null : orderCouponNums.trim();
    }

    public String getRepairState() {
        return repairState;
    }

    public void setRepairState(String repairState) {
        this.repairState = repairState == null ? null : repairState.trim();
    }

    public String getIsComment() {
        return isComment;
    }

    public void setIsComment(String isComment) {
        this.isComment = isComment == null ? null : isComment.trim();
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow == null ? null : isShow.trim();
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

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderItemId=").append(orderItemId);
        sb.append(", orderId=").append(orderId);
        sb.append(", orderGroupId=").append(orderGroupId);
        sb.append(", orderDeliveryId=").append(orderDeliveryId);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsUnit=").append(goodsUnit);
        sb.append(", goodsCostPrice=").append(goodsCostPrice);
        sb.append(", goodsOldPrice=").append(goodsOldPrice);
        sb.append(", goodsPrice=").append(goodsPrice);
        sb.append(", goodsAmount=").append(goodsAmount);
        sb.append(", giftAmount=").append(giftAmount);
        sb.append(", canReturnAmount=").append(canReturnAmount);
        sb.append(", subsidy=").append(subsidy);
        sb.append(", points=").append(points);
        sb.append(", awardMoney=").append(awardMoney);
        sb.append(", goodsSumFee=").append(goodsSumFee);
        sb.append(", productCombinationId=").append(productCombinationId);
        sb.append(", executePrice=").append(executePrice);
        sb.append(", isGift=").append(isGift);
        sb.append(", mainGoodsId=").append(mainGoodsId);
        sb.append(", pcgGiftId=").append(pcgGiftId);
        sb.append(", orderRuleId=").append(orderRuleId);
        sb.append(", productRuleId=").append(productRuleId);
        sb.append(", productDown=").append(productDown);
        sb.append(", cartDown=").append(cartDown);
        sb.append(", cartPrice=").append(cartPrice);
        sb.append(", productCouponIds=").append(productCouponIds);
        sb.append(", productCouponNums=").append(productCouponNums);
        sb.append(", orderCouponIds=").append(orderCouponIds);
        sb.append(", orderCouponNums=").append(orderCouponNums);
        sb.append(", repairState=").append(repairState);
        sb.append(", isComment=").append(isComment);
        sb.append(", isShow=").append(isShow);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", addUserId=").append(addUserId);
        sb.append(", addTime=").append(addTime);
        sb.append(", editUserId=").append(editUserId);
        sb.append(", editTime=").append(editTime);
        sb.append(", comments=").append(comments);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}