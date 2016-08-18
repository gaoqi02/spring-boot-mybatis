package com.ecbusiness.model;

import java.io.Serializable;

public class ProductBrand implements Serializable {
    private Integer productBrandId;

    private String productBrandName;

    private String productBrandUrl;

    private String productBrandImg;

    private String productBrandDesc1;

    private String productBrandDesc2;

    private Integer productBrandOrder;

    private String seoTitle;

    private String seoMetaKeyWord;

    private String seoMetaDesc;

    private String isDelete;

    private Integer addUserId;

    private String addTime;

    private Integer editUserId;

    private String editTime;

    private static final long serialVersionUID = 1L;

    public Integer getProductBrandId() {
        return productBrandId;
    }

    public void setProductBrandId(Integer productBrandId) {
        this.productBrandId = productBrandId;
    }

    public String getProductBrandName() {
        return productBrandName;
    }

    public void setProductBrandName(String productBrandName) {
        this.productBrandName = productBrandName == null ? null : productBrandName.trim();
    }

    public String getProductBrandUrl() {
        return productBrandUrl;
    }

    public void setProductBrandUrl(String productBrandUrl) {
        this.productBrandUrl = productBrandUrl == null ? null : productBrandUrl.trim();
    }

    public String getProductBrandImg() {
        return productBrandImg;
    }

    public void setProductBrandImg(String productBrandImg) {
        this.productBrandImg = productBrandImg == null ? null : productBrandImg.trim();
    }

    public String getProductBrandDesc1() {
        return productBrandDesc1;
    }

    public void setProductBrandDesc1(String productBrandDesc1) {
        this.productBrandDesc1 = productBrandDesc1 == null ? null : productBrandDesc1.trim();
    }

    public String getProductBrandDesc2() {
        return productBrandDesc2;
    }

    public void setProductBrandDesc2(String productBrandDesc2) {
        this.productBrandDesc2 = productBrandDesc2 == null ? null : productBrandDesc2.trim();
    }

    public Integer getProductBrandOrder() {
        return productBrandOrder;
    }

    public void setProductBrandOrder(Integer productBrandOrder) {
        this.productBrandOrder = productBrandOrder;
    }

    public String getSeoTitle() {
        return seoTitle;
    }

    public void setSeoTitle(String seoTitle) {
        this.seoTitle = seoTitle == null ? null : seoTitle.trim();
    }

    public String getSeoMetaKeyWord() {
        return seoMetaKeyWord;
    }

    public void setSeoMetaKeyWord(String seoMetaKeyWord) {
        this.seoMetaKeyWord = seoMetaKeyWord == null ? null : seoMetaKeyWord.trim();
    }

    public String getSeoMetaDesc() {
        return seoMetaDesc;
    }

    public void setSeoMetaDesc(String seoMetaDesc) {
        this.seoMetaDesc = seoMetaDesc == null ? null : seoMetaDesc.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productBrandId=").append(productBrandId);
        sb.append(", productBrandName=").append(productBrandName);
        sb.append(", productBrandUrl=").append(productBrandUrl);
        sb.append(", productBrandImg=").append(productBrandImg);
        sb.append(", productBrandDesc1=").append(productBrandDesc1);
        sb.append(", productBrandDesc2=").append(productBrandDesc2);
        sb.append(", productBrandOrder=").append(productBrandOrder);
        sb.append(", seoTitle=").append(seoTitle);
        sb.append(", seoMetaKeyWord=").append(seoMetaKeyWord);
        sb.append(", seoMetaDesc=").append(seoMetaDesc);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", addUserId=").append(addUserId);
        sb.append(", addTime=").append(addTime);
        sb.append(", editUserId=").append(editUserId);
        sb.append(", editTime=").append(editTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}