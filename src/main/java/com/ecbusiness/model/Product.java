package com.ecbusiness.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {
    private Integer productId;

    private String productCode;

    private String productName;

    private String productCommonName;

    private String productAliasName;

    private String productChnNo;

    private Integer productOrder;

    private Integer proCatalogId;

    private Integer productBrandId;

    private Integer productTypeId;

    private String productMarketDate;

    private BigDecimal lowestPrice;

    private String productKeyword;

    private String productDesc;

    private Integer proProCatalogId;

    private Integer proProductBrandId;

    private String isOnsale;

    private String onsaleTime;

    private BigDecimal productLeastOrder;

    private BigDecimal orderLimitAmount;

    private BigDecimal buyAmountBase;

    private String isStockWarn;

    private Integer productPoint;

    private String isSupportPoint;

    private Integer productWarnNumber;

    private String promoteDescription;

    private String useMarker;

    private String catalogCode;

    private String seoTitle;

    private String seoMetaKeyWord;

    private String seoMetaDesc;

    private String isAudit;

    private String isDelete;

    private Integer addUserId;

    private String addTime;

    private Integer editUserId;

    private String editTime;

    private String productSimpleDesc;

    private Integer clickAmount;

    private Integer saleAmount;

    private String street;

    private String styles;

    private Integer commentNumber;

    private static final long serialVersionUID = 1L;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode == null ? null : productCode.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getProductCommonName() {
        return productCommonName;
    }

    public void setProductCommonName(String productCommonName) {
        this.productCommonName = productCommonName == null ? null : productCommonName.trim();
    }

    public String getProductAliasName() {
        return productAliasName;
    }

    public void setProductAliasName(String productAliasName) {
        this.productAliasName = productAliasName == null ? null : productAliasName.trim();
    }

    public String getProductChnNo() {
        return productChnNo;
    }

    public void setProductChnNo(String productChnNo) {
        this.productChnNo = productChnNo == null ? null : productChnNo.trim();
    }

    public Integer getProductOrder() {
        return productOrder;
    }

    public void setProductOrder(Integer productOrder) {
        this.productOrder = productOrder;
    }

    public Integer getProCatalogId() {
        return proCatalogId;
    }

    public void setProCatalogId(Integer proCatalogId) {
        this.proCatalogId = proCatalogId;
    }

    public Integer getProductBrandId() {
        return productBrandId;
    }

    public void setProductBrandId(Integer productBrandId) {
        this.productBrandId = productBrandId;
    }

    public Integer getProductTypeId() {
        return productTypeId;
    }

    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    public String getProductMarketDate() {
        return productMarketDate;
    }

    public void setProductMarketDate(String productMarketDate) {
        this.productMarketDate = productMarketDate == null ? null : productMarketDate.trim();
    }

    public BigDecimal getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(BigDecimal lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public String getProductKeyword() {
        return productKeyword;
    }

    public void setProductKeyword(String productKeyword) {
        this.productKeyword = productKeyword == null ? null : productKeyword.trim();
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc == null ? null : productDesc.trim();
    }

    public Integer getProProCatalogId() {
        return proProCatalogId;
    }

    public void setProProCatalogId(Integer proProCatalogId) {
        this.proProCatalogId = proProCatalogId;
    }

    public Integer getProProductBrandId() {
        return proProductBrandId;
    }

    public void setProProductBrandId(Integer proProductBrandId) {
        this.proProductBrandId = proProductBrandId;
    }

    public String getIsOnsale() {
        return isOnsale;
    }

    public void setIsOnsale(String isOnsale) {
        this.isOnsale = isOnsale == null ? null : isOnsale.trim();
    }

    public String getOnsaleTime() {
        return onsaleTime;
    }

    public void setOnsaleTime(String onsaleTime) {
        this.onsaleTime = onsaleTime == null ? null : onsaleTime.trim();
    }

    public BigDecimal getProductLeastOrder() {
        return productLeastOrder;
    }

    public void setProductLeastOrder(BigDecimal productLeastOrder) {
        this.productLeastOrder = productLeastOrder;
    }

    public BigDecimal getOrderLimitAmount() {
        return orderLimitAmount;
    }

    public void setOrderLimitAmount(BigDecimal orderLimitAmount) {
        this.orderLimitAmount = orderLimitAmount;
    }

    public BigDecimal getBuyAmountBase() {
        return buyAmountBase;
    }

    public void setBuyAmountBase(BigDecimal buyAmountBase) {
        this.buyAmountBase = buyAmountBase;
    }

    public String getIsStockWarn() {
        return isStockWarn;
    }

    public void setIsStockWarn(String isStockWarn) {
        this.isStockWarn = isStockWarn == null ? null : isStockWarn.trim();
    }

    public Integer getProductPoint() {
        return productPoint;
    }

    public void setProductPoint(Integer productPoint) {
        this.productPoint = productPoint;
    }

    public String getIsSupportPoint() {
        return isSupportPoint;
    }

    public void setIsSupportPoint(String isSupportPoint) {
        this.isSupportPoint = isSupportPoint == null ? null : isSupportPoint.trim();
    }

    public Integer getProductWarnNumber() {
        return productWarnNumber;
    }

    public void setProductWarnNumber(Integer productWarnNumber) {
        this.productWarnNumber = productWarnNumber;
    }

    public String getPromoteDescription() {
        return promoteDescription;
    }

    public void setPromoteDescription(String promoteDescription) {
        this.promoteDescription = promoteDescription == null ? null : promoteDescription.trim();
    }

    public String getUseMarker() {
        return useMarker;
    }

    public void setUseMarker(String useMarker) {
        this.useMarker = useMarker == null ? null : useMarker.trim();
    }

    public String getCatalogCode() {
        return catalogCode;
    }

    public void setCatalogCode(String catalogCode) {
        this.catalogCode = catalogCode == null ? null : catalogCode.trim();
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

    public String getIsAudit() {
        return isAudit;
    }

    public void setIsAudit(String isAudit) {
        this.isAudit = isAudit == null ? null : isAudit.trim();
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

    public String getProductSimpleDesc() {
        return productSimpleDesc;
    }

    public void setProductSimpleDesc(String productSimpleDesc) {
        this.productSimpleDesc = productSimpleDesc == null ? null : productSimpleDesc.trim();
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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    public String getStyles() {
        return styles;
    }

    public void setStyles(String styles) {
        this.styles = styles == null ? null : styles.trim();
    }

    public Integer getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        this.commentNumber = commentNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", productCode=").append(productCode);
        sb.append(", productName=").append(productName);
        sb.append(", productCommonName=").append(productCommonName);
        sb.append(", productAliasName=").append(productAliasName);
        sb.append(", productChnNo=").append(productChnNo);
        sb.append(", productOrder=").append(productOrder);
        sb.append(", proCatalogId=").append(proCatalogId);
        sb.append(", productBrandId=").append(productBrandId);
        sb.append(", productTypeId=").append(productTypeId);
        sb.append(", productMarketDate=").append(productMarketDate);
        sb.append(", lowestPrice=").append(lowestPrice);
        sb.append(", productKeyword=").append(productKeyword);
        sb.append(", productDesc=").append(productDesc);
        sb.append(", proProCatalogId=").append(proProCatalogId);
        sb.append(", proProductBrandId=").append(proProductBrandId);
        sb.append(", isOnsale=").append(isOnsale);
        sb.append(", onsaleTime=").append(onsaleTime);
        sb.append(", productLeastOrder=").append(productLeastOrder);
        sb.append(", orderLimitAmount=").append(orderLimitAmount);
        sb.append(", buyAmountBase=").append(buyAmountBase);
        sb.append(", isStockWarn=").append(isStockWarn);
        sb.append(", productPoint=").append(productPoint);
        sb.append(", isSupportPoint=").append(isSupportPoint);
        sb.append(", productWarnNumber=").append(productWarnNumber);
        sb.append(", promoteDescription=").append(promoteDescription);
        sb.append(", useMarker=").append(useMarker);
        sb.append(", catalogCode=").append(catalogCode);
        sb.append(", seoTitle=").append(seoTitle);
        sb.append(", seoMetaKeyWord=").append(seoMetaKeyWord);
        sb.append(", seoMetaDesc=").append(seoMetaDesc);
        sb.append(", isAudit=").append(isAudit);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", addUserId=").append(addUserId);
        sb.append(", addTime=").append(addTime);
        sb.append(", editUserId=").append(editUserId);
        sb.append(", editTime=").append(editTime);
        sb.append(", productSimpleDesc=").append(productSimpleDesc);
        sb.append(", clickAmount=").append(clickAmount);
        sb.append(", saleAmount=").append(saleAmount);
        sb.append(", street=").append(street);
        sb.append(", styles=").append(styles);
        sb.append(", commentNumber=").append(commentNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}