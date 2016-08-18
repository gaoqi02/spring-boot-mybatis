package com.ecbusiness.model;

import java.io.Serializable;

public class ProductWithBLOBs extends Product implements Serializable {
    private String detailInfo;

    private String deliveryNotes;

    private String privateSecurity;

    private String saleService;

    private String honors;

    private static final long serialVersionUID = 1L;

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo == null ? null : detailInfo.trim();
    }

    public String getDeliveryNotes() {
        return deliveryNotes;
    }

    public void setDeliveryNotes(String deliveryNotes) {
        this.deliveryNotes = deliveryNotes == null ? null : deliveryNotes.trim();
    }

    public String getPrivateSecurity() {
        return privateSecurity;
    }

    public void setPrivateSecurity(String privateSecurity) {
        this.privateSecurity = privateSecurity == null ? null : privateSecurity.trim();
    }

    public String getSaleService() {
        return saleService;
    }

    public void setSaleService(String saleService) {
        this.saleService = saleService == null ? null : saleService.trim();
    }

    public String getHonors() {
        return honors;
    }

    public void setHonors(String honors) {
        this.honors = honors == null ? null : honors.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", detailInfo=").append(detailInfo);
        sb.append(", deliveryNotes=").append(deliveryNotes);
        sb.append(", privateSecurity=").append(privateSecurity);
        sb.append(", saleService=").append(saleService);
        sb.append(", honors=").append(honors);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}