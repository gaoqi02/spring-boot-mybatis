package com.ecbusiness.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class OrderInfo implements Serializable {
    private String orderId;

    private Integer erpOrderId;

    private String urlFromNo;

    private Integer multiChannelId;

    private Integer multiChannelOrderBatchId;

    private String goodsBatchNo;

    private String multiChannelOrderId;

    private String isUpload;

    private Integer uploadUserId;

    private String uploadTime;

    private String isPaid;

    private String paymentMode;

    private String paymentNo;

    private String paidTime;

    private Integer offlinePaidUserId;

    private Integer logisticCompanyId;

    private Integer memberId;

    private Integer paymentTypeId;

    private Integer orderState;

    private Integer orderOutState;

    private String limitDate;

    private BigDecimal skuFee;

    private BigDecimal otherDiscounts;

    private Integer orderPoints;

    private BigDecimal deliveryFee;

    private BigDecimal discountFee;

    private BigDecimal orderFee;

    private BigDecimal orderPayFee;

    private BigDecimal paidFee;

    private String promoteRuleIds;

    private String productCombinationIds;

    private String returnType;

    private String returnValue;

    private String orderMsg;

    private String orderNotes;

    private String auditNotes;

    private Integer auditUserId;

    private String auditTime;

    private String isLock;

    private String lockTime;

    private Integer lockUserId;

    private String commitTime;

    private String finishTime;

    private String cancelTime;

    private Integer cancelUserId;

    private String cancelNotes;

    private String isCheckBills;

    private Integer checkBillUserId;

    private String checkBillTime;

    private BigDecimal skuWeights;

    private String isIntoErp;

    private String intoTime;

    private String receiveUser;

    private Integer provinceId;

    private Integer cityId;

    private Integer areaId;

    private String receiveAddress;

    private String receiveFullAddress;

    private String receivePost;

    private String receiveTel;

    private String receiveMobile;

    private String receiveEmail;

    private String receiveDateType;

    private String receiveTimeType;

    private String invoiceType;

    private String invoiceContentType;

    private String invoiceTitle;

    private String invoiceContent;

    private String invoiceTaxNo;

    private String isDraw;

    private String isInvoice;

    private Integer brandId;

    private String brandName;

    private String invoiceTaxAddress;

    private String invoiceTaxTel;

    private String invoiceTaxBank;

    private String invoiceTaxAccount;

    private BigDecimal couponFee;

    private String couponNos;

    private BigDecimal balancePayFee;

    private BigDecimal bbgoldPayFee;

    private String orderType;

    private Integer orderPointsG;

    private String selfPickup;

    private String transportsNo;

    private String originCode;

    private String destCode;

    private BigDecimal insurance;

    private String sfInterface;

    private String erpInterface;

    private String isDelete;

    private Integer addUserId;

    private String addTime;

    private Integer editUserId;

    private String editTime;

    private Integer storeId;

    private String verifyCode;

    private String isCheck;

    private Integer groupBuyRuleId;

    private BigDecimal returnDeliveryFee;

    private String isGivePoints;

    private String sourceType;

    private BigDecimal awardMoney;

    private String businessPaid;

    private String deliveryNotes;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Integer getErpOrderId() {
        return erpOrderId;
    }

    public void setErpOrderId(Integer erpOrderId) {
        this.erpOrderId = erpOrderId;
    }

    public String getUrlFromNo() {
        return urlFromNo;
    }

    public void setUrlFromNo(String urlFromNo) {
        this.urlFromNo = urlFromNo == null ? null : urlFromNo.trim();
    }

    public Integer getMultiChannelId() {
        return multiChannelId;
    }

    public void setMultiChannelId(Integer multiChannelId) {
        this.multiChannelId = multiChannelId;
    }

    public Integer getMultiChannelOrderBatchId() {
        return multiChannelOrderBatchId;
    }

    public void setMultiChannelOrderBatchId(Integer multiChannelOrderBatchId) {
        this.multiChannelOrderBatchId = multiChannelOrderBatchId;
    }

    public String getGoodsBatchNo() {
        return goodsBatchNo;
    }

    public void setGoodsBatchNo(String goodsBatchNo) {
        this.goodsBatchNo = goodsBatchNo == null ? null : goodsBatchNo.trim();
    }

    public String getMultiChannelOrderId() {
        return multiChannelOrderId;
    }

    public void setMultiChannelOrderId(String multiChannelOrderId) {
        this.multiChannelOrderId = multiChannelOrderId == null ? null : multiChannelOrderId.trim();
    }

    public String getIsUpload() {
        return isUpload;
    }

    public void setIsUpload(String isUpload) {
        this.isUpload = isUpload == null ? null : isUpload.trim();
    }

    public Integer getUploadUserId() {
        return uploadUserId;
    }

    public void setUploadUserId(Integer uploadUserId) {
        this.uploadUserId = uploadUserId;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime == null ? null : uploadTime.trim();
    }

    public String getIsPaid() {
        return isPaid;
    }

    public void setIsPaid(String isPaid) {
        this.isPaid = isPaid == null ? null : isPaid.trim();
    }

    public String getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(String paymentMode) {
        this.paymentMode = paymentMode == null ? null : paymentMode.trim();
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo == null ? null : paymentNo.trim();
    }

    public String getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(String paidTime) {
        this.paidTime = paidTime == null ? null : paidTime.trim();
    }

    public Integer getOfflinePaidUserId() {
        return offlinePaidUserId;
    }

    public void setOfflinePaidUserId(Integer offlinePaidUserId) {
        this.offlinePaidUserId = offlinePaidUserId;
    }

    public Integer getLogisticCompanyId() {
        return logisticCompanyId;
    }

    public void setLogisticCompanyId(Integer logisticCompanyId) {
        this.logisticCompanyId = logisticCompanyId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(Integer paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Integer getOrderOutState() {
        return orderOutState;
    }

    public void setOrderOutState(Integer orderOutState) {
        this.orderOutState = orderOutState;
    }

    public String getLimitDate() {
        return limitDate;
    }

    public void setLimitDate(String limitDate) {
        this.limitDate = limitDate == null ? null : limitDate.trim();
    }

    public BigDecimal getSkuFee() {
        return skuFee;
    }

    public void setSkuFee(BigDecimal skuFee) {
        this.skuFee = skuFee;
    }

    public BigDecimal getOtherDiscounts() {
        return otherDiscounts;
    }

    public void setOtherDiscounts(BigDecimal otherDiscounts) {
        this.otherDiscounts = otherDiscounts;
    }

    public Integer getOrderPoints() {
        return orderPoints;
    }

    public void setOrderPoints(Integer orderPoints) {
        this.orderPoints = orderPoints;
    }

    public BigDecimal getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(BigDecimal deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public BigDecimal getDiscountFee() {
        return discountFee;
    }

    public void setDiscountFee(BigDecimal discountFee) {
        this.discountFee = discountFee;
    }

    public BigDecimal getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(BigDecimal orderFee) {
        this.orderFee = orderFee;
    }

    public BigDecimal getOrderPayFee() {
        return orderPayFee;
    }

    public void setOrderPayFee(BigDecimal orderPayFee) {
        this.orderPayFee = orderPayFee;
    }

    public BigDecimal getPaidFee() {
        return paidFee;
    }

    public void setPaidFee(BigDecimal paidFee) {
        this.paidFee = paidFee;
    }

    public String getPromoteRuleIds() {
        return promoteRuleIds;
    }

    public void setPromoteRuleIds(String promoteRuleIds) {
        this.promoteRuleIds = promoteRuleIds == null ? null : promoteRuleIds.trim();
    }

    public String getProductCombinationIds() {
        return productCombinationIds;
    }

    public void setProductCombinationIds(String productCombinationIds) {
        this.productCombinationIds = productCombinationIds == null ? null : productCombinationIds.trim();
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType == null ? null : returnType.trim();
    }

    public String getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(String returnValue) {
        this.returnValue = returnValue == null ? null : returnValue.trim();
    }

    public String getOrderMsg() {
        return orderMsg;
    }

    public void setOrderMsg(String orderMsg) {
        this.orderMsg = orderMsg == null ? null : orderMsg.trim();
    }

    public String getOrderNotes() {
        return orderNotes;
    }

    public void setOrderNotes(String orderNotes) {
        this.orderNotes = orderNotes == null ? null : orderNotes.trim();
    }

    public String getAuditNotes() {
        return auditNotes;
    }

    public void setAuditNotes(String auditNotes) {
        this.auditNotes = auditNotes == null ? null : auditNotes.trim();
    }

    public Integer getAuditUserId() {
        return auditUserId;
    }

    public void setAuditUserId(Integer auditUserId) {
        this.auditUserId = auditUserId;
    }

    public String getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(String auditTime) {
        this.auditTime = auditTime == null ? null : auditTime.trim();
    }

    public String getIsLock() {
        return isLock;
    }

    public void setIsLock(String isLock) {
        this.isLock = isLock == null ? null : isLock.trim();
    }

    public String getLockTime() {
        return lockTime;
    }

    public void setLockTime(String lockTime) {
        this.lockTime = lockTime == null ? null : lockTime.trim();
    }

    public Integer getLockUserId() {
        return lockUserId;
    }

    public void setLockUserId(Integer lockUserId) {
        this.lockUserId = lockUserId;
    }

    public String getCommitTime() {
        return commitTime;
    }

    public void setCommitTime(String commitTime) {
        this.commitTime = commitTime == null ? null : commitTime.trim();
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime == null ? null : finishTime.trim();
    }

    public String getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(String cancelTime) {
        this.cancelTime = cancelTime == null ? null : cancelTime.trim();
    }

    public Integer getCancelUserId() {
        return cancelUserId;
    }

    public void setCancelUserId(Integer cancelUserId) {
        this.cancelUserId = cancelUserId;
    }

    public String getCancelNotes() {
        return cancelNotes;
    }

    public void setCancelNotes(String cancelNotes) {
        this.cancelNotes = cancelNotes == null ? null : cancelNotes.trim();
    }

    public String getIsCheckBills() {
        return isCheckBills;
    }

    public void setIsCheckBills(String isCheckBills) {
        this.isCheckBills = isCheckBills == null ? null : isCheckBills.trim();
    }

    public Integer getCheckBillUserId() {
        return checkBillUserId;
    }

    public void setCheckBillUserId(Integer checkBillUserId) {
        this.checkBillUserId = checkBillUserId;
    }

    public String getCheckBillTime() {
        return checkBillTime;
    }

    public void setCheckBillTime(String checkBillTime) {
        this.checkBillTime = checkBillTime == null ? null : checkBillTime.trim();
    }

    public BigDecimal getSkuWeights() {
        return skuWeights;
    }

    public void setSkuWeights(BigDecimal skuWeights) {
        this.skuWeights = skuWeights;
    }

    public String getIsIntoErp() {
        return isIntoErp;
    }

    public void setIsIntoErp(String isIntoErp) {
        this.isIntoErp = isIntoErp == null ? null : isIntoErp.trim();
    }

    public String getIntoTime() {
        return intoTime;
    }

    public void setIntoTime(String intoTime) {
        this.intoTime = intoTime == null ? null : intoTime.trim();
    }

    public String getReceiveUser() {
        return receiveUser;
    }

    public void setReceiveUser(String receiveUser) {
        this.receiveUser = receiveUser == null ? null : receiveUser.trim();
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getReceiveAddress() {
        return receiveAddress;
    }

    public void setReceiveAddress(String receiveAddress) {
        this.receiveAddress = receiveAddress == null ? null : receiveAddress.trim();
    }

    public String getReceiveFullAddress() {
        return receiveFullAddress;
    }

    public void setReceiveFullAddress(String receiveFullAddress) {
        this.receiveFullAddress = receiveFullAddress == null ? null : receiveFullAddress.trim();
    }

    public String getReceivePost() {
        return receivePost;
    }

    public void setReceivePost(String receivePost) {
        this.receivePost = receivePost == null ? null : receivePost.trim();
    }

    public String getReceiveTel() {
        return receiveTel;
    }

    public void setReceiveTel(String receiveTel) {
        this.receiveTel = receiveTel == null ? null : receiveTel.trim();
    }

    public String getReceiveMobile() {
        return receiveMobile;
    }

    public void setReceiveMobile(String receiveMobile) {
        this.receiveMobile = receiveMobile == null ? null : receiveMobile.trim();
    }

    public String getReceiveEmail() {
        return receiveEmail;
    }

    public void setReceiveEmail(String receiveEmail) {
        this.receiveEmail = receiveEmail == null ? null : receiveEmail.trim();
    }

    public String getReceiveDateType() {
        return receiveDateType;
    }

    public void setReceiveDateType(String receiveDateType) {
        this.receiveDateType = receiveDateType == null ? null : receiveDateType.trim();
    }

    public String getReceiveTimeType() {
        return receiveTimeType;
    }

    public void setReceiveTimeType(String receiveTimeType) {
        this.receiveTimeType = receiveTimeType == null ? null : receiveTimeType.trim();
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType == null ? null : invoiceType.trim();
    }

    public String getInvoiceContentType() {
        return invoiceContentType;
    }

    public void setInvoiceContentType(String invoiceContentType) {
        this.invoiceContentType = invoiceContentType == null ? null : invoiceContentType.trim();
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent == null ? null : invoiceContent.trim();
    }

    public String getInvoiceTaxNo() {
        return invoiceTaxNo;
    }

    public void setInvoiceTaxNo(String invoiceTaxNo) {
        this.invoiceTaxNo = invoiceTaxNo == null ? null : invoiceTaxNo.trim();
    }

    public String getIsDraw() {
        return isDraw;
    }

    public void setIsDraw(String isDraw) {
        this.isDraw = isDraw == null ? null : isDraw.trim();
    }

    public String getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(String isInvoice) {
        this.isInvoice = isInvoice == null ? null : isInvoice.trim();
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getInvoiceTaxAddress() {
        return invoiceTaxAddress;
    }

    public void setInvoiceTaxAddress(String invoiceTaxAddress) {
        this.invoiceTaxAddress = invoiceTaxAddress == null ? null : invoiceTaxAddress.trim();
    }

    public String getInvoiceTaxTel() {
        return invoiceTaxTel;
    }

    public void setInvoiceTaxTel(String invoiceTaxTel) {
        this.invoiceTaxTel = invoiceTaxTel == null ? null : invoiceTaxTel.trim();
    }

    public String getInvoiceTaxBank() {
        return invoiceTaxBank;
    }

    public void setInvoiceTaxBank(String invoiceTaxBank) {
        this.invoiceTaxBank = invoiceTaxBank == null ? null : invoiceTaxBank.trim();
    }

    public String getInvoiceTaxAccount() {
        return invoiceTaxAccount;
    }

    public void setInvoiceTaxAccount(String invoiceTaxAccount) {
        this.invoiceTaxAccount = invoiceTaxAccount == null ? null : invoiceTaxAccount.trim();
    }

    public BigDecimal getCouponFee() {
        return couponFee;
    }

    public void setCouponFee(BigDecimal couponFee) {
        this.couponFee = couponFee;
    }

    public String getCouponNos() {
        return couponNos;
    }

    public void setCouponNos(String couponNos) {
        this.couponNos = couponNos == null ? null : couponNos.trim();
    }

    public BigDecimal getBalancePayFee() {
        return balancePayFee;
    }

    public void setBalancePayFee(BigDecimal balancePayFee) {
        this.balancePayFee = balancePayFee;
    }

    public BigDecimal getBbgoldPayFee() {
        return bbgoldPayFee;
    }

    public void setBbgoldPayFee(BigDecimal bbgoldPayFee) {
        this.bbgoldPayFee = bbgoldPayFee;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Integer getOrderPointsG() {
        return orderPointsG;
    }

    public void setOrderPointsG(Integer orderPointsG) {
        this.orderPointsG = orderPointsG;
    }

    public String getSelfPickup() {
        return selfPickup;
    }

    public void setSelfPickup(String selfPickup) {
        this.selfPickup = selfPickup == null ? null : selfPickup.trim();
    }

    public String getTransportsNo() {
        return transportsNo;
    }

    public void setTransportsNo(String transportsNo) {
        this.transportsNo = transportsNo == null ? null : transportsNo.trim();
    }

    public String getOriginCode() {
        return originCode;
    }

    public void setOriginCode(String originCode) {
        this.originCode = originCode == null ? null : originCode.trim();
    }

    public String getDestCode() {
        return destCode;
    }

    public void setDestCode(String destCode) {
        this.destCode = destCode == null ? null : destCode.trim();
    }

    public BigDecimal getInsurance() {
        return insurance;
    }

    public void setInsurance(BigDecimal insurance) {
        this.insurance = insurance;
    }

    public String getSfInterface() {
        return sfInterface;
    }

    public void setSfInterface(String sfInterface) {
        this.sfInterface = sfInterface == null ? null : sfInterface.trim();
    }

    public String getErpInterface() {
        return erpInterface;
    }

    public void setErpInterface(String erpInterface) {
        this.erpInterface = erpInterface == null ? null : erpInterface.trim();
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

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode == null ? null : verifyCode.trim();
    }

    public String getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck == null ? null : isCheck.trim();
    }

    public Integer getGroupBuyRuleId() {
        return groupBuyRuleId;
    }

    public void setGroupBuyRuleId(Integer groupBuyRuleId) {
        this.groupBuyRuleId = groupBuyRuleId;
    }

    public BigDecimal getReturnDeliveryFee() {
        return returnDeliveryFee;
    }

    public void setReturnDeliveryFee(BigDecimal returnDeliveryFee) {
        this.returnDeliveryFee = returnDeliveryFee;
    }

    public String getIsGivePoints() {
        return isGivePoints;
    }

    public void setIsGivePoints(String isGivePoints) {
        this.isGivePoints = isGivePoints == null ? null : isGivePoints.trim();
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType == null ? null : sourceType.trim();
    }

    public BigDecimal getAwardMoney() {
        return awardMoney;
    }

    public void setAwardMoney(BigDecimal awardMoney) {
        this.awardMoney = awardMoney;
    }

    public String getBusinessPaid() {
        return businessPaid;
    }

    public void setBusinessPaid(String businessPaid) {
        this.businessPaid = businessPaid == null ? null : businessPaid.trim();
    }

    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    public void setDeliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes == null ? null : deliveryNotes.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orderId=").append(orderId);
        sb.append(", erpOrderId=").append(erpOrderId);
        sb.append(", urlFromNo=").append(urlFromNo);
        sb.append(", multiChannelId=").append(multiChannelId);
        sb.append(", multiChannelOrderBatchId=").append(multiChannelOrderBatchId);
        sb.append(", goodsBatchNo=").append(goodsBatchNo);
        sb.append(", multiChannelOrderId=").append(multiChannelOrderId);
        sb.append(", isUpload=").append(isUpload);
        sb.append(", uploadUserId=").append(uploadUserId);
        sb.append(", uploadTime=").append(uploadTime);
        sb.append(", isPaid=").append(isPaid);
        sb.append(", paymentMode=").append(paymentMode);
        sb.append(", paymentNo=").append(paymentNo);
        sb.append(", paidTime=").append(paidTime);
        sb.append(", offlinePaidUserId=").append(offlinePaidUserId);
        sb.append(", logisticCompanyId=").append(logisticCompanyId);
        sb.append(", memberId=").append(memberId);
        sb.append(", paymentTypeId=").append(paymentTypeId);
        sb.append(", orderState=").append(orderState);
        sb.append(", orderOutState=").append(orderOutState);
        sb.append(", limitDate=").append(limitDate);
        sb.append(", skuFee=").append(skuFee);
        sb.append(", otherDiscounts=").append(otherDiscounts);
        sb.append(", orderPoints=").append(orderPoints);
        sb.append(", deliveryFee=").append(deliveryFee);
        sb.append(", discountFee=").append(discountFee);
        sb.append(", orderFee=").append(orderFee);
        sb.append(", orderPayFee=").append(orderPayFee);
        sb.append(", paidFee=").append(paidFee);
        sb.append(", promoteRuleIds=").append(promoteRuleIds);
        sb.append(", productCombinationIds=").append(productCombinationIds);
        sb.append(", returnType=").append(returnType);
        sb.append(", returnValue=").append(returnValue);
        sb.append(", orderMsg=").append(orderMsg);
        sb.append(", orderNotes=").append(orderNotes);
        sb.append(", auditNotes=").append(auditNotes);
        sb.append(", auditUserId=").append(auditUserId);
        sb.append(", auditTime=").append(auditTime);
        sb.append(", isLock=").append(isLock);
        sb.append(", lockTime=").append(lockTime);
        sb.append(", lockUserId=").append(lockUserId);
        sb.append(", commitTime=").append(commitTime);
        sb.append(", finishTime=").append(finishTime);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", cancelUserId=").append(cancelUserId);
        sb.append(", cancelNotes=").append(cancelNotes);
        sb.append(", isCheckBills=").append(isCheckBills);
        sb.append(", checkBillUserId=").append(checkBillUserId);
        sb.append(", checkBillTime=").append(checkBillTime);
        sb.append(", skuWeights=").append(skuWeights);
        sb.append(", isIntoErp=").append(isIntoErp);
        sb.append(", intoTime=").append(intoTime);
        sb.append(", receiveUser=").append(receiveUser);
        sb.append(", provinceId=").append(provinceId);
        sb.append(", cityId=").append(cityId);
        sb.append(", areaId=").append(areaId);
        sb.append(", receiveAddress=").append(receiveAddress);
        sb.append(", receiveFullAddress=").append(receiveFullAddress);
        sb.append(", receivePost=").append(receivePost);
        sb.append(", receiveTel=").append(receiveTel);
        sb.append(", receiveMobile=").append(receiveMobile);
        sb.append(", receiveEmail=").append(receiveEmail);
        sb.append(", receiveDateType=").append(receiveDateType);
        sb.append(", receiveTimeType=").append(receiveTimeType);
        sb.append(", invoiceType=").append(invoiceType);
        sb.append(", invoiceContentType=").append(invoiceContentType);
        sb.append(", invoiceTitle=").append(invoiceTitle);
        sb.append(", invoiceContent=").append(invoiceContent);
        sb.append(", invoiceTaxNo=").append(invoiceTaxNo);
        sb.append(", isDraw=").append(isDraw);
        sb.append(", isInvoice=").append(isInvoice);
        sb.append(", brandId=").append(brandId);
        sb.append(", brandName=").append(brandName);
        sb.append(", invoiceTaxAddress=").append(invoiceTaxAddress);
        sb.append(", invoiceTaxTel=").append(invoiceTaxTel);
        sb.append(", invoiceTaxBank=").append(invoiceTaxBank);
        sb.append(", invoiceTaxAccount=").append(invoiceTaxAccount);
        sb.append(", couponFee=").append(couponFee);
        sb.append(", couponNos=").append(couponNos);
        sb.append(", balancePayFee=").append(balancePayFee);
        sb.append(", bbgoldPayFee=").append(bbgoldPayFee);
        sb.append(", orderType=").append(orderType);
        sb.append(", orderPointsG=").append(orderPointsG);
        sb.append(", selfPickup=").append(selfPickup);
        sb.append(", transportsNo=").append(transportsNo);
        sb.append(", originCode=").append(originCode);
        sb.append(", destCode=").append(destCode);
        sb.append(", insurance=").append(insurance);
        sb.append(", sfInterface=").append(sfInterface);
        sb.append(", erpInterface=").append(erpInterface);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", addUserId=").append(addUserId);
        sb.append(", addTime=").append(addTime);
        sb.append(", editUserId=").append(editUserId);
        sb.append(", editTime=").append(editTime);
        sb.append(", storeId=").append(storeId);
        sb.append(", verifyCode=").append(verifyCode);
        sb.append(", isCheck=").append(isCheck);
        sb.append(", groupBuyRuleId=").append(groupBuyRuleId);
        sb.append(", returnDeliveryFee=").append(returnDeliveryFee);
        sb.append(", isGivePoints=").append(isGivePoints);
        sb.append(", sourceType=").append(sourceType);
        sb.append(", awardMoney=").append(awardMoney);
        sb.append(", businessPaid=").append(businessPaid);
        sb.append(", deliveryNotes=").append(deliveryNotes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}