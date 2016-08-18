package com.ecbusiness.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable {
    private Integer goodsId;

    private Integer productId;

    private String goodsNo;

    private String factoryNo;

    private String trademark;

    private Integer goodsType;

    private String useMarker;

    private BigDecimal weight;

    private BigDecimal ecPrice;

    private String barCode;

    private String materialGoods;

    private String materialType;

    private BigDecimal goldWeight;

    private BigDecimal gramsGoldPrice;

    private BigDecimal goldSellingPrice;

    private BigDecimal processingFee;

    private BigDecimal costPrice;

    private BigDecimal priceFactor;

    private String certificateNo;

    private String fingerRing;

    private String commodityTechnology;

    private String commodityColor;

    private String mainStone;

    private String mainRockType;

    private BigDecimal mainOreWeight;

    private String mainOreQuantity;

    private String mainOreGrade;

    private String mainOreColor;

    private BigDecimal mainOrePrice;

    private String besideStone;

    private String besideStoneType;

    private BigDecimal besideStoneWeight;

    private String besideStoneQuantity;

    private String besideStoneCleanliness;

    private String besideStoneColor;

    private BigDecimal besideStonePrice;

    private String besideStoneType2;

    private BigDecimal besideStoneWeight2;

    private String besideStoneQuantity2;

    private String besideStoneGrade2;

    private String besideStoneColor2;

    private BigDecimal besideStonePrice2;

    private String isGroup;

    private String isDefault;

    private String goodsName;

    private String goodsDesc;

    private BigDecimal goodStock;

    private BigDecimal prepareStock;

    private BigDecimal lockStock;

    private BigDecimal availableStock;

    private Integer returnPoints;

    private String receiveTime;

    private String isChange;

    private String goodsEdition;

    private Integer clickAmount;

    private Integer saleAmount;

    private String isOnSale;

    private String isDelete;

    private Integer addUserId;

    private String addTime;

    private Integer editUserId;

    private String editTime;

    private String erpCategory1;

    private String erpCategory2;

    private String erpCategory3;

    private Integer commentNumber;

    private String modelCode;

    private BigDecimal promotePrice;

    private static final long serialVersionUID = 1L;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getGoodsNo() {
        return goodsNo;
    }

    public void setGoodsNo(String goodsNo) {
        this.goodsNo = goodsNo == null ? null : goodsNo.trim();
    }

    public String getFactoryNo() {
        return factoryNo;
    }

    public void setFactoryNo(String factoryNo) {
        this.factoryNo = factoryNo == null ? null : factoryNo.trim();
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark == null ? null : trademark.trim();
    }

    public Integer getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Integer goodsType) {
        this.goodsType = goodsType;
    }

    public String getUseMarker() {
        return useMarker;
    }

    public void setUseMarker(String useMarker) {
        this.useMarker = useMarker == null ? null : useMarker.trim();
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getEcPrice() {
        return ecPrice;
    }

    public void setEcPrice(BigDecimal ecPrice) {
        this.ecPrice = ecPrice;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public String getMaterialGoods() {
        return materialGoods;
    }

    public void setMaterialGoods(String materialGoods) {
        this.materialGoods = materialGoods == null ? null : materialGoods.trim();
    }

    public String getMaterialType() {
        return materialType;
    }

    public void setMaterialType(String materialType) {
        this.materialType = materialType == null ? null : materialType.trim();
    }

    public BigDecimal getGoldWeight() {
        return goldWeight;
    }

    public void setGoldWeight(BigDecimal goldWeight) {
        this.goldWeight = goldWeight;
    }

    public BigDecimal getGramsGoldPrice() {
        return gramsGoldPrice;
    }

    public void setGramsGoldPrice(BigDecimal gramsGoldPrice) {
        this.gramsGoldPrice = gramsGoldPrice;
    }

    public BigDecimal getGoldSellingPrice() {
        return goldSellingPrice;
    }

    public void setGoldSellingPrice(BigDecimal goldSellingPrice) {
        this.goldSellingPrice = goldSellingPrice;
    }

    public BigDecimal getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(BigDecimal processingFee) {
        this.processingFee = processingFee;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getPriceFactor() {
        return priceFactor;
    }

    public void setPriceFactor(BigDecimal priceFactor) {
        this.priceFactor = priceFactor;
    }

    public String getCertificateNo() {
        return certificateNo;
    }

    public void setCertificateNo(String certificateNo) {
        this.certificateNo = certificateNo == null ? null : certificateNo.trim();
    }

    public String getFingerRing() {
        return fingerRing;
    }

    public void setFingerRing(String fingerRing) {
        this.fingerRing = fingerRing == null ? null : fingerRing.trim();
    }

    public String getCommodityTechnology() {
        return commodityTechnology;
    }

    public void setCommodityTechnology(String commodityTechnology) {
        this.commodityTechnology = commodityTechnology == null ? null : commodityTechnology.trim();
    }

    public String getCommodityColor() {
        return commodityColor;
    }

    public void setCommodityColor(String commodityColor) {
        this.commodityColor = commodityColor == null ? null : commodityColor.trim();
    }

    public String getMainStone() {
        return mainStone;
    }

    public void setMainStone(String mainStone) {
        this.mainStone = mainStone == null ? null : mainStone.trim();
    }

    public String getMainRockType() {
        return mainRockType;
    }

    public void setMainRockType(String mainRockType) {
        this.mainRockType = mainRockType == null ? null : mainRockType.trim();
    }

    public BigDecimal getMainOreWeight() {
        return mainOreWeight;
    }

    public void setMainOreWeight(BigDecimal mainOreWeight) {
        this.mainOreWeight = mainOreWeight;
    }

    public String getMainOreQuantity() {
        return mainOreQuantity;
    }

    public void setMainOreQuantity(String mainOreQuantity) {
        this.mainOreQuantity = mainOreQuantity == null ? null : mainOreQuantity.trim();
    }

    public String getMainOreGrade() {
        return mainOreGrade;
    }

    public void setMainOreGrade(String mainOreGrade) {
        this.mainOreGrade = mainOreGrade == null ? null : mainOreGrade.trim();
    }

    public String getMainOreColor() {
        return mainOreColor;
    }

    public void setMainOreColor(String mainOreColor) {
        this.mainOreColor = mainOreColor == null ? null : mainOreColor.trim();
    }

    public BigDecimal getMainOrePrice() {
        return mainOrePrice;
    }

    public void setMainOrePrice(BigDecimal mainOrePrice) {
        this.mainOrePrice = mainOrePrice;
    }

    public String getBesideStone() {
        return besideStone;
    }

    public void setBesideStone(String besideStone) {
        this.besideStone = besideStone == null ? null : besideStone.trim();
    }

    public String getBesideStoneType() {
        return besideStoneType;
    }

    public void setBesideStoneType(String besideStoneType) {
        this.besideStoneType = besideStoneType == null ? null : besideStoneType.trim();
    }

    public BigDecimal getBesideStoneWeight() {
        return besideStoneWeight;
    }

    public void setBesideStoneWeight(BigDecimal besideStoneWeight) {
        this.besideStoneWeight = besideStoneWeight;
    }

    public String getBesideStoneQuantity() {
        return besideStoneQuantity;
    }

    public void setBesideStoneQuantity(String besideStoneQuantity) {
        this.besideStoneQuantity = besideStoneQuantity == null ? null : besideStoneQuantity.trim();
    }

    public String getBesideStoneCleanliness() {
        return besideStoneCleanliness;
    }

    public void setBesideStoneCleanliness(String besideStoneCleanliness) {
        this.besideStoneCleanliness = besideStoneCleanliness == null ? null : besideStoneCleanliness.trim();
    }

    public String getBesideStoneColor() {
        return besideStoneColor;
    }

    public void setBesideStoneColor(String besideStoneColor) {
        this.besideStoneColor = besideStoneColor == null ? null : besideStoneColor.trim();
    }

    public BigDecimal getBesideStonePrice() {
        return besideStonePrice;
    }

    public void setBesideStonePrice(BigDecimal besideStonePrice) {
        this.besideStonePrice = besideStonePrice;
    }

    public String getBesideStoneType2() {
        return besideStoneType2;
    }

    public void setBesideStoneType2(String besideStoneType2) {
        this.besideStoneType2 = besideStoneType2 == null ? null : besideStoneType2.trim();
    }

    public BigDecimal getBesideStoneWeight2() {
        return besideStoneWeight2;
    }

    public void setBesideStoneWeight2(BigDecimal besideStoneWeight2) {
        this.besideStoneWeight2 = besideStoneWeight2;
    }

    public String getBesideStoneQuantity2() {
        return besideStoneQuantity2;
    }

    public void setBesideStoneQuantity2(String besideStoneQuantity2) {
        this.besideStoneQuantity2 = besideStoneQuantity2 == null ? null : besideStoneQuantity2.trim();
    }

    public String getBesideStoneGrade2() {
        return besideStoneGrade2;
    }

    public void setBesideStoneGrade2(String besideStoneGrade2) {
        this.besideStoneGrade2 = besideStoneGrade2 == null ? null : besideStoneGrade2.trim();
    }

    public String getBesideStoneColor2() {
        return besideStoneColor2;
    }

    public void setBesideStoneColor2(String besideStoneColor2) {
        this.besideStoneColor2 = besideStoneColor2 == null ? null : besideStoneColor2.trim();
    }

    public BigDecimal getBesideStonePrice2() {
        return besideStonePrice2;
    }

    public void setBesideStonePrice2(BigDecimal besideStonePrice2) {
        this.besideStonePrice2 = besideStonePrice2;
    }

    public String getIsGroup() {
        return isGroup;
    }

    public void setIsGroup(String isGroup) {
        this.isGroup = isGroup == null ? null : isGroup.trim();
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsDesc() {
        return goodsDesc;
    }

    public void setGoodsDesc(String goodsDesc) {
        this.goodsDesc = goodsDesc == null ? null : goodsDesc.trim();
    }

    public BigDecimal getGoodStock() {
        return goodStock;
    }

    public void setGoodStock(BigDecimal goodStock) {
        this.goodStock = goodStock;
    }

    public BigDecimal getPrepareStock() {
        return prepareStock;
    }

    public void setPrepareStock(BigDecimal prepareStock) {
        this.prepareStock = prepareStock;
    }

    public BigDecimal getLockStock() {
        return lockStock;
    }

    public void setLockStock(BigDecimal lockStock) {
        this.lockStock = lockStock;
    }

    public BigDecimal getAvailableStock() {
        return availableStock;
    }

    public void setAvailableStock(BigDecimal availableStock) {
        this.availableStock = availableStock;
    }

    public Integer getReturnPoints() {
        return returnPoints;
    }

    public void setReturnPoints(Integer returnPoints) {
        this.returnPoints = returnPoints;
    }

    public String getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(String receiveTime) {
        this.receiveTime = receiveTime == null ? null : receiveTime.trim();
    }

    public String getIsChange() {
        return isChange;
    }

    public void setIsChange(String isChange) {
        this.isChange = isChange == null ? null : isChange.trim();
    }

    public String getGoodsEdition() {
        return goodsEdition;
    }

    public void setGoodsEdition(String goodsEdition) {
        this.goodsEdition = goodsEdition == null ? null : goodsEdition.trim();
    }

    public Integer getClickAmount() {
        return clickAmount;
    }

    public void setClickAmount(Integer clickAmount) {
        this.clickAmount = clickAmount;
    }

    public Integer getSaleAmount() {
        return saleAmount;
    }

    public void setSaleAmount(Integer saleAmount) {
        this.saleAmount = saleAmount;
    }

    public String getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(String isOnSale) {
        this.isOnSale = isOnSale == null ? null : isOnSale.trim();
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

    public String getErpCategory1() {
        return erpCategory1;
    }

    public void setErpCategory1(String erpCategory1) {
        this.erpCategory1 = erpCategory1 == null ? null : erpCategory1.trim();
    }

    public String getErpCategory2() {
        return erpCategory2;
    }

    public void setErpCategory2(String erpCategory2) {
        this.erpCategory2 = erpCategory2 == null ? null : erpCategory2.trim();
    }

    public String getErpCategory3() {
        return erpCategory3;
    }

    public void setErpCategory3(String erpCategory3) {
        this.erpCategory3 = erpCategory3 == null ? null : erpCategory3.trim();
    }

    public Integer getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode == null ? null : modelCode.trim();
    }

    public BigDecimal getPromotePrice() {
        return promotePrice;
    }

    public void setPromotePrice(BigDecimal promotePrice) {
        this.promotePrice = promotePrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", goodsId=").append(goodsId);
        sb.append(", productId=").append(productId);
        sb.append(", goodsNo=").append(goodsNo);
        sb.append(", factoryNo=").append(factoryNo);
        sb.append(", trademark=").append(trademark);
        sb.append(", goodsType=").append(goodsType);
        sb.append(", useMarker=").append(useMarker);
        sb.append(", weight=").append(weight);
        sb.append(", ecPrice=").append(ecPrice);
        sb.append(", barCode=").append(barCode);
        sb.append(", materialGoods=").append(materialGoods);
        sb.append(", materialType=").append(materialType);
        sb.append(", goldWeight=").append(goldWeight);
        sb.append(", gramsGoldPrice=").append(gramsGoldPrice);
        sb.append(", goldSellingPrice=").append(goldSellingPrice);
        sb.append(", processingFee=").append(processingFee);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", priceFactor=").append(priceFactor);
        sb.append(", certificateNo=").append(certificateNo);
        sb.append(", fingerRing=").append(fingerRing);
        sb.append(", commodityTechnology=").append(commodityTechnology);
        sb.append(", commodityColor=").append(commodityColor);
        sb.append(", mainStone=").append(mainStone);
        sb.append(", mainRockType=").append(mainRockType);
        sb.append(", mainOreWeight=").append(mainOreWeight);
        sb.append(", mainOreQuantity=").append(mainOreQuantity);
        sb.append(", mainOreGrade=").append(mainOreGrade);
        sb.append(", mainOreColor=").append(mainOreColor);
        sb.append(", mainOrePrice=").append(mainOrePrice);
        sb.append(", besideStone=").append(besideStone);
        sb.append(", besideStoneType=").append(besideStoneType);
        sb.append(", besideStoneWeight=").append(besideStoneWeight);
        sb.append(", besideStoneQuantity=").append(besideStoneQuantity);
        sb.append(", besideStoneCleanliness=").append(besideStoneCleanliness);
        sb.append(", besideStoneColor=").append(besideStoneColor);
        sb.append(", besideStonePrice=").append(besideStonePrice);
        sb.append(", besideStoneType2=").append(besideStoneType2);
        sb.append(", besideStoneWeight2=").append(besideStoneWeight2);
        sb.append(", besideStoneQuantity2=").append(besideStoneQuantity2);
        sb.append(", besideStoneGrade2=").append(besideStoneGrade2);
        sb.append(", besideStoneColor2=").append(besideStoneColor2);
        sb.append(", besideStonePrice2=").append(besideStonePrice2);
        sb.append(", isGroup=").append(isGroup);
        sb.append(", isDefault=").append(isDefault);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsDesc=").append(goodsDesc);
        sb.append(", goodStock=").append(goodStock);
        sb.append(", prepareStock=").append(prepareStock);
        sb.append(", lockStock=").append(lockStock);
        sb.append(", availableStock=").append(availableStock);
        sb.append(", returnPoints=").append(returnPoints);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", isChange=").append(isChange);
        sb.append(", goodsEdition=").append(goodsEdition);
        sb.append(", clickAmount=").append(clickAmount);
        sb.append(", saleAmount=").append(saleAmount);
        sb.append(", isOnSale=").append(isOnSale);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", addUserId=").append(addUserId);
        sb.append(", addTime=").append(addTime);
        sb.append(", editUserId=").append(editUserId);
        sb.append(", editTime=").append(editTime);
        sb.append(", erpCategory1=").append(erpCategory1);
        sb.append(", erpCategory2=").append(erpCategory2);
        sb.append(", erpCategory3=").append(erpCategory3);
        sb.append(", commentNumber=").append(commentNumber);
        sb.append(", modelCode=").append(modelCode);
        sb.append(", promotePrice=").append(promotePrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}