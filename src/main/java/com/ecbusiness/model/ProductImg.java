package com.ecbusiness.model;

import java.io.Serializable;

public class ProductImg implements Serializable {
    private Integer proImageId;

    private Integer productId;

    private String imageType;

    private String proImageUrl;

    private String imageOrign;

    private Integer imageOrder;

    private String masterPlan;

    private static final long serialVersionUID = 1L;

    public Integer getProImageId() {
        return proImageId;
    }

    public void setProImageId(Integer proImageId) {
        this.proImageId = proImageId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType == null ? null : imageType.trim();
    }

    public String getProImageUrl() {
        return proImageUrl;
    }

    public void setProImageUrl(String proImageUrl) {
        this.proImageUrl = proImageUrl == null ? null : proImageUrl.trim();
    }

    public String getImageOrign() {
        return imageOrign;
    }

    public void setImageOrign(String imageOrign) {
        this.imageOrign = imageOrign == null ? null : imageOrign.trim();
    }

    public Integer getImageOrder() {
        return imageOrder;
    }

    public void setImageOrder(Integer imageOrder) {
        this.imageOrder = imageOrder;
    }

    public String getMasterPlan() {
        return masterPlan;
    }

    public void setMasterPlan(String masterPlan) {
        this.masterPlan = masterPlan == null ? null : masterPlan.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", proImageId=").append(proImageId);
        sb.append(", productId=").append(productId);
        sb.append(", imageType=").append(imageType);
        sb.append(", proImageUrl=").append(proImageUrl);
        sb.append(", imageOrign=").append(imageOrign);
        sb.append(", imageOrder=").append(imageOrder);
        sb.append(", masterPlan=").append(masterPlan);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}