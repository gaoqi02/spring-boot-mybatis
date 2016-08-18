package com.ecbusiness.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProductCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProductIdIsNull() {
            addCriterion("PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("PRODUCT_ID =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_ID >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("PRODUCT_ID <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ID <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("PRODUCT_ID in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_ID not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ID not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("PRODUCT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("PRODUCT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("PRODUCT_CODE =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("PRODUCT_CODE <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("PRODUCT_CODE >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("PRODUCT_CODE <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CODE <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("PRODUCT_CODE like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("PRODUCT_CODE not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("PRODUCT_CODE in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("PRODUCT_CODE not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CODE not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("PRODUCT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("PRODUCT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("PRODUCT_NAME =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("PRODUCT_NAME <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("PRODUCT_NAME >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("PRODUCT_NAME <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_NAME <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("PRODUCT_NAME like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("PRODUCT_NAME not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("PRODUCT_NAME in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("PRODUCT_NAME not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_NAME not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameIsNull() {
            addCriterion("PRODUCT_COMMON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameIsNotNull() {
            addCriterion("PRODUCT_COMMON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameEqualTo(String value) {
            addCriterion("PRODUCT_COMMON_NAME =", value, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameNotEqualTo(String value) {
            addCriterion("PRODUCT_COMMON_NAME <>", value, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameGreaterThan(String value) {
            addCriterion("PRODUCT_COMMON_NAME >", value, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_COMMON_NAME >=", value, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameLessThan(String value) {
            addCriterion("PRODUCT_COMMON_NAME <", value, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_COMMON_NAME <=", value, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameLike(String value) {
            addCriterion("PRODUCT_COMMON_NAME like", value, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameNotLike(String value) {
            addCriterion("PRODUCT_COMMON_NAME not like", value, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameIn(List<String> values) {
            addCriterion("PRODUCT_COMMON_NAME in", values, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameNotIn(List<String> values) {
            addCriterion("PRODUCT_COMMON_NAME not in", values, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_COMMON_NAME between", value1, value2, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_COMMON_NAME not between", value1, value2, "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameIsNull() {
            addCriterion("PRODUCT_ALIAS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameIsNotNull() {
            addCriterion("PRODUCT_ALIAS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameEqualTo(String value) {
            addCriterion("PRODUCT_ALIAS_NAME =", value, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameNotEqualTo(String value) {
            addCriterion("PRODUCT_ALIAS_NAME <>", value, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameGreaterThan(String value) {
            addCriterion("PRODUCT_ALIAS_NAME >", value, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ALIAS_NAME >=", value, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameLessThan(String value) {
            addCriterion("PRODUCT_ALIAS_NAME <", value, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_ALIAS_NAME <=", value, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameLike(String value) {
            addCriterion("PRODUCT_ALIAS_NAME like", value, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameNotLike(String value) {
            addCriterion("PRODUCT_ALIAS_NAME not like", value, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameIn(List<String> values) {
            addCriterion("PRODUCT_ALIAS_NAME in", values, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameNotIn(List<String> values) {
            addCriterion("PRODUCT_ALIAS_NAME not in", values, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_ALIAS_NAME between", value1, value2, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_ALIAS_NAME not between", value1, value2, "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductChnNoIsNull() {
            addCriterion("PRODUCT_CHN_NO is null");
            return (Criteria) this;
        }

        public Criteria andProductChnNoIsNotNull() {
            addCriterion("PRODUCT_CHN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andProductChnNoEqualTo(String value) {
            addCriterion("PRODUCT_CHN_NO =", value, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductChnNoNotEqualTo(String value) {
            addCriterion("PRODUCT_CHN_NO <>", value, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductChnNoGreaterThan(String value) {
            addCriterion("PRODUCT_CHN_NO >", value, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductChnNoGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CHN_NO >=", value, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductChnNoLessThan(String value) {
            addCriterion("PRODUCT_CHN_NO <", value, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductChnNoLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_CHN_NO <=", value, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductChnNoLike(String value) {
            addCriterion("PRODUCT_CHN_NO like", value, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductChnNoNotLike(String value) {
            addCriterion("PRODUCT_CHN_NO not like", value, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductChnNoIn(List<String> values) {
            addCriterion("PRODUCT_CHN_NO in", values, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductChnNoNotIn(List<String> values) {
            addCriterion("PRODUCT_CHN_NO not in", values, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductChnNoBetween(String value1, String value2) {
            addCriterion("PRODUCT_CHN_NO between", value1, value2, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductChnNoNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_CHN_NO not between", value1, value2, "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductOrderIsNull() {
            addCriterion("PRODUCT_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andProductOrderIsNotNull() {
            addCriterion("PRODUCT_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andProductOrderEqualTo(Integer value) {
            addCriterion("PRODUCT_ORDER =", value, "productOrder");
            return (Criteria) this;
        }

        public Criteria andProductOrderNotEqualTo(Integer value) {
            addCriterion("PRODUCT_ORDER <>", value, "productOrder");
            return (Criteria) this;
        }

        public Criteria andProductOrderGreaterThan(Integer value) {
            addCriterion("PRODUCT_ORDER >", value, "productOrder");
            return (Criteria) this;
        }

        public Criteria andProductOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ORDER >=", value, "productOrder");
            return (Criteria) this;
        }

        public Criteria andProductOrderLessThan(Integer value) {
            addCriterion("PRODUCT_ORDER <", value, "productOrder");
            return (Criteria) this;
        }

        public Criteria andProductOrderLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_ORDER <=", value, "productOrder");
            return (Criteria) this;
        }

        public Criteria andProductOrderIn(List<Integer> values) {
            addCriterion("PRODUCT_ORDER in", values, "productOrder");
            return (Criteria) this;
        }

        public Criteria andProductOrderNotIn(List<Integer> values) {
            addCriterion("PRODUCT_ORDER not in", values, "productOrder");
            return (Criteria) this;
        }

        public Criteria andProductOrderBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ORDER between", value1, value2, "productOrder");
            return (Criteria) this;
        }

        public Criteria andProductOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_ORDER not between", value1, value2, "productOrder");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdIsNull() {
            addCriterion("PRO_CATALOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdIsNotNull() {
            addCriterion("PRO_CATALOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdEqualTo(Integer value) {
            addCriterion("PRO_CATALOG_ID =", value, "proCatalogId");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdNotEqualTo(Integer value) {
            addCriterion("PRO_CATALOG_ID <>", value, "proCatalogId");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdGreaterThan(Integer value) {
            addCriterion("PRO_CATALOG_ID >", value, "proCatalogId");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_CATALOG_ID >=", value, "proCatalogId");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdLessThan(Integer value) {
            addCriterion("PRO_CATALOG_ID <", value, "proCatalogId");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_CATALOG_ID <=", value, "proCatalogId");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdIn(List<Integer> values) {
            addCriterion("PRO_CATALOG_ID in", values, "proCatalogId");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdNotIn(List<Integer> values) {
            addCriterion("PRO_CATALOG_ID not in", values, "proCatalogId");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdBetween(Integer value1, Integer value2) {
            addCriterion("PRO_CATALOG_ID between", value1, value2, "proCatalogId");
            return (Criteria) this;
        }

        public Criteria andProCatalogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_CATALOG_ID not between", value1, value2, "proCatalogId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdIsNull() {
            addCriterion("PRODUCT_BRAND_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdIsNotNull() {
            addCriterion("PRODUCT_BRAND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdEqualTo(Integer value) {
            addCriterion("PRODUCT_BRAND_ID =", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_BRAND_ID <>", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_BRAND_ID >", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_BRAND_ID >=", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdLessThan(Integer value) {
            addCriterion("PRODUCT_BRAND_ID <", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_BRAND_ID <=", value, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdIn(List<Integer> values) {
            addCriterion("PRODUCT_BRAND_ID in", values, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_BRAND_ID not in", values, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_BRAND_ID between", value1, value2, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_BRAND_ID not between", value1, value2, "productBrandId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNull() {
            addCriterion("PRODUCT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIsNotNull() {
            addCriterion("PRODUCT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdEqualTo(Integer value) {
            addCriterion("PRODUCT_TYPE_ID =", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_TYPE_ID <>", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_TYPE_ID >", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_TYPE_ID >=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThan(Integer value) {
            addCriterion("PRODUCT_TYPE_ID <", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_TYPE_ID <=", value, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdIn(List<Integer> values) {
            addCriterion("PRODUCT_TYPE_ID in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_TYPE_ID not in", values, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_TYPE_ID between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_TYPE_ID not between", value1, value2, "productTypeId");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateIsNull() {
            addCriterion("PRODUCT_MARKET_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateIsNotNull() {
            addCriterion("PRODUCT_MARKET_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateEqualTo(String value) {
            addCriterion("PRODUCT_MARKET_DATE =", value, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateNotEqualTo(String value) {
            addCriterion("PRODUCT_MARKET_DATE <>", value, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateGreaterThan(String value) {
            addCriterion("PRODUCT_MARKET_DATE >", value, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MARKET_DATE >=", value, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateLessThan(String value) {
            addCriterion("PRODUCT_MARKET_DATE <", value, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_MARKET_DATE <=", value, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateLike(String value) {
            addCriterion("PRODUCT_MARKET_DATE like", value, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateNotLike(String value) {
            addCriterion("PRODUCT_MARKET_DATE not like", value, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateIn(List<String> values) {
            addCriterion("PRODUCT_MARKET_DATE in", values, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateNotIn(List<String> values) {
            addCriterion("PRODUCT_MARKET_DATE not in", values, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateBetween(String value1, String value2) {
            addCriterion("PRODUCT_MARKET_DATE between", value1, value2, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_MARKET_DATE not between", value1, value2, "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andLowestPriceIsNull() {
            addCriterion("LOWEST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceIsNotNull() {
            addCriterion("LOWEST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andLowestPriceEqualTo(BigDecimal value) {
            addCriterion("LOWEST_PRICE =", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceNotEqualTo(BigDecimal value) {
            addCriterion("LOWEST_PRICE <>", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceGreaterThan(BigDecimal value) {
            addCriterion("LOWEST_PRICE >", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOWEST_PRICE >=", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLessThan(BigDecimal value) {
            addCriterion("LOWEST_PRICE <", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOWEST_PRICE <=", value, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceIn(List<BigDecimal> values) {
            addCriterion("LOWEST_PRICE in", values, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceNotIn(List<BigDecimal> values) {
            addCriterion("LOWEST_PRICE not in", values, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOWEST_PRICE between", value1, value2, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andLowestPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOWEST_PRICE not between", value1, value2, "lowestPrice");
            return (Criteria) this;
        }

        public Criteria andProductKeywordIsNull() {
            addCriterion("PRODUCT_KEYWORD is null");
            return (Criteria) this;
        }

        public Criteria andProductKeywordIsNotNull() {
            addCriterion("PRODUCT_KEYWORD is not null");
            return (Criteria) this;
        }

        public Criteria andProductKeywordEqualTo(String value) {
            addCriterion("PRODUCT_KEYWORD =", value, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductKeywordNotEqualTo(String value) {
            addCriterion("PRODUCT_KEYWORD <>", value, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductKeywordGreaterThan(String value) {
            addCriterion("PRODUCT_KEYWORD >", value, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_KEYWORD >=", value, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductKeywordLessThan(String value) {
            addCriterion("PRODUCT_KEYWORD <", value, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductKeywordLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_KEYWORD <=", value, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductKeywordLike(String value) {
            addCriterion("PRODUCT_KEYWORD like", value, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductKeywordNotLike(String value) {
            addCriterion("PRODUCT_KEYWORD not like", value, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductKeywordIn(List<String> values) {
            addCriterion("PRODUCT_KEYWORD in", values, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductKeywordNotIn(List<String> values) {
            addCriterion("PRODUCT_KEYWORD not in", values, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductKeywordBetween(String value1, String value2) {
            addCriterion("PRODUCT_KEYWORD between", value1, value2, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductKeywordNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_KEYWORD not between", value1, value2, "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNull() {
            addCriterion("PRODUCT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProductDescIsNotNull() {
            addCriterion("PRODUCT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProductDescEqualTo(String value) {
            addCriterion("PRODUCT_DESC =", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotEqualTo(String value) {
            addCriterion("PRODUCT_DESC <>", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThan(String value) {
            addCriterion("PRODUCT_DESC >", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESC >=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThan(String value) {
            addCriterion("PRODUCT_DESC <", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_DESC <=", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescLike(String value) {
            addCriterion("PRODUCT_DESC like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotLike(String value) {
            addCriterion("PRODUCT_DESC not like", value, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescIn(List<String> values) {
            addCriterion("PRODUCT_DESC in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotIn(List<String> values) {
            addCriterion("PRODUCT_DESC not in", values, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESC between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProductDescNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_DESC not between", value1, value2, "productDesc");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdIsNull() {
            addCriterion("PRO_PRO_CATALOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdIsNotNull() {
            addCriterion("PRO_PRO_CATALOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdEqualTo(Integer value) {
            addCriterion("PRO_PRO_CATALOG_ID =", value, "proProCatalogId");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdNotEqualTo(Integer value) {
            addCriterion("PRO_PRO_CATALOG_ID <>", value, "proProCatalogId");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdGreaterThan(Integer value) {
            addCriterion("PRO_PRO_CATALOG_ID >", value, "proProCatalogId");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_PRO_CATALOG_ID >=", value, "proProCatalogId");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdLessThan(Integer value) {
            addCriterion("PRO_PRO_CATALOG_ID <", value, "proProCatalogId");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_PRO_CATALOG_ID <=", value, "proProCatalogId");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdIn(List<Integer> values) {
            addCriterion("PRO_PRO_CATALOG_ID in", values, "proProCatalogId");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdNotIn(List<Integer> values) {
            addCriterion("PRO_PRO_CATALOG_ID not in", values, "proProCatalogId");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdBetween(Integer value1, Integer value2) {
            addCriterion("PRO_PRO_CATALOG_ID between", value1, value2, "proProCatalogId");
            return (Criteria) this;
        }

        public Criteria andProProCatalogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_PRO_CATALOG_ID not between", value1, value2, "proProCatalogId");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdIsNull() {
            addCriterion("PRO_PRODUCT_BRAND_ID is null");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdIsNotNull() {
            addCriterion("PRO_PRODUCT_BRAND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdEqualTo(Integer value) {
            addCriterion("PRO_PRODUCT_BRAND_ID =", value, "proProductBrandId");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdNotEqualTo(Integer value) {
            addCriterion("PRO_PRODUCT_BRAND_ID <>", value, "proProductBrandId");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdGreaterThan(Integer value) {
            addCriterion("PRO_PRODUCT_BRAND_ID >", value, "proProductBrandId");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_PRODUCT_BRAND_ID >=", value, "proProductBrandId");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdLessThan(Integer value) {
            addCriterion("PRO_PRODUCT_BRAND_ID <", value, "proProductBrandId");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_PRODUCT_BRAND_ID <=", value, "proProductBrandId");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdIn(List<Integer> values) {
            addCriterion("PRO_PRODUCT_BRAND_ID in", values, "proProductBrandId");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdNotIn(List<Integer> values) {
            addCriterion("PRO_PRODUCT_BRAND_ID not in", values, "proProductBrandId");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("PRO_PRODUCT_BRAND_ID between", value1, value2, "proProductBrandId");
            return (Criteria) this;
        }

        public Criteria andProProductBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_PRODUCT_BRAND_ID not between", value1, value2, "proProductBrandId");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleIsNull() {
            addCriterion("IS_ONSALE is null");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleIsNotNull() {
            addCriterion("IS_ONSALE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleEqualTo(String value) {
            addCriterion("IS_ONSALE =", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleNotEqualTo(String value) {
            addCriterion("IS_ONSALE <>", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleGreaterThan(String value) {
            addCriterion("IS_ONSALE >", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ONSALE >=", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleLessThan(String value) {
            addCriterion("IS_ONSALE <", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleLessThanOrEqualTo(String value) {
            addCriterion("IS_ONSALE <=", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleLike(String value) {
            addCriterion("IS_ONSALE like", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleNotLike(String value) {
            addCriterion("IS_ONSALE not like", value, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleIn(List<String> values) {
            addCriterion("IS_ONSALE in", values, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleNotIn(List<String> values) {
            addCriterion("IS_ONSALE not in", values, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleBetween(String value1, String value2) {
            addCriterion("IS_ONSALE between", value1, value2, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleNotBetween(String value1, String value2) {
            addCriterion("IS_ONSALE not between", value1, value2, "isOnsale");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeIsNull() {
            addCriterion("ONSALE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeIsNotNull() {
            addCriterion("ONSALE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeEqualTo(String value) {
            addCriterion("ONSALE_TIME =", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeNotEqualTo(String value) {
            addCriterion("ONSALE_TIME <>", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeGreaterThan(String value) {
            addCriterion("ONSALE_TIME >", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ONSALE_TIME >=", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeLessThan(String value) {
            addCriterion("ONSALE_TIME <", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeLessThanOrEqualTo(String value) {
            addCriterion("ONSALE_TIME <=", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeLike(String value) {
            addCriterion("ONSALE_TIME like", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeNotLike(String value) {
            addCriterion("ONSALE_TIME not like", value, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeIn(List<String> values) {
            addCriterion("ONSALE_TIME in", values, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeNotIn(List<String> values) {
            addCriterion("ONSALE_TIME not in", values, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeBetween(String value1, String value2) {
            addCriterion("ONSALE_TIME between", value1, value2, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeNotBetween(String value1, String value2) {
            addCriterion("ONSALE_TIME not between", value1, value2, "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderIsNull() {
            addCriterion("PRODUCT_LEAST_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderIsNotNull() {
            addCriterion("PRODUCT_LEAST_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_LEAST_ORDER =", value, "productLeastOrder");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_LEAST_ORDER <>", value, "productLeastOrder");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_LEAST_ORDER >", value, "productLeastOrder");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_LEAST_ORDER >=", value, "productLeastOrder");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderLessThan(BigDecimal value) {
            addCriterion("PRODUCT_LEAST_ORDER <", value, "productLeastOrder");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_LEAST_ORDER <=", value, "productLeastOrder");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_LEAST_ORDER in", values, "productLeastOrder");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_LEAST_ORDER not in", values, "productLeastOrder");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_LEAST_ORDER between", value1, value2, "productLeastOrder");
            return (Criteria) this;
        }

        public Criteria andProductLeastOrderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_LEAST_ORDER not between", value1, value2, "productLeastOrder");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountIsNull() {
            addCriterion("ORDER_LIMIT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountIsNotNull() {
            addCriterion("ORDER_LIMIT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountEqualTo(BigDecimal value) {
            addCriterion("ORDER_LIMIT_AMOUNT =", value, "orderLimitAmount");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_LIMIT_AMOUNT <>", value, "orderLimitAmount");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountGreaterThan(BigDecimal value) {
            addCriterion("ORDER_LIMIT_AMOUNT >", value, "orderLimitAmount");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_LIMIT_AMOUNT >=", value, "orderLimitAmount");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountLessThan(BigDecimal value) {
            addCriterion("ORDER_LIMIT_AMOUNT <", value, "orderLimitAmount");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_LIMIT_AMOUNT <=", value, "orderLimitAmount");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountIn(List<BigDecimal> values) {
            addCriterion("ORDER_LIMIT_AMOUNT in", values, "orderLimitAmount");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_LIMIT_AMOUNT not in", values, "orderLimitAmount");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_LIMIT_AMOUNT between", value1, value2, "orderLimitAmount");
            return (Criteria) this;
        }

        public Criteria andOrderLimitAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_LIMIT_AMOUNT not between", value1, value2, "orderLimitAmount");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseIsNull() {
            addCriterion("BUY_AMOUNT_BASE is null");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseIsNotNull() {
            addCriterion("BUY_AMOUNT_BASE is not null");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseEqualTo(BigDecimal value) {
            addCriterion("BUY_AMOUNT_BASE =", value, "buyAmountBase");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseNotEqualTo(BigDecimal value) {
            addCriterion("BUY_AMOUNT_BASE <>", value, "buyAmountBase");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseGreaterThan(BigDecimal value) {
            addCriterion("BUY_AMOUNT_BASE >", value, "buyAmountBase");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_AMOUNT_BASE >=", value, "buyAmountBase");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseLessThan(BigDecimal value) {
            addCriterion("BUY_AMOUNT_BASE <", value, "buyAmountBase");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUY_AMOUNT_BASE <=", value, "buyAmountBase");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseIn(List<BigDecimal> values) {
            addCriterion("BUY_AMOUNT_BASE in", values, "buyAmountBase");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseNotIn(List<BigDecimal> values) {
            addCriterion("BUY_AMOUNT_BASE not in", values, "buyAmountBase");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_AMOUNT_BASE between", value1, value2, "buyAmountBase");
            return (Criteria) this;
        }

        public Criteria andBuyAmountBaseNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUY_AMOUNT_BASE not between", value1, value2, "buyAmountBase");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnIsNull() {
            addCriterion("IS_STOCK_WARN is null");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnIsNotNull() {
            addCriterion("IS_STOCK_WARN is not null");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnEqualTo(String value) {
            addCriterion("IS_STOCK_WARN =", value, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnNotEqualTo(String value) {
            addCriterion("IS_STOCK_WARN <>", value, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnGreaterThan(String value) {
            addCriterion("IS_STOCK_WARN >", value, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnGreaterThanOrEqualTo(String value) {
            addCriterion("IS_STOCK_WARN >=", value, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnLessThan(String value) {
            addCriterion("IS_STOCK_WARN <", value, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnLessThanOrEqualTo(String value) {
            addCriterion("IS_STOCK_WARN <=", value, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnLike(String value) {
            addCriterion("IS_STOCK_WARN like", value, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnNotLike(String value) {
            addCriterion("IS_STOCK_WARN not like", value, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnIn(List<String> values) {
            addCriterion("IS_STOCK_WARN in", values, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnNotIn(List<String> values) {
            addCriterion("IS_STOCK_WARN not in", values, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnBetween(String value1, String value2) {
            addCriterion("IS_STOCK_WARN between", value1, value2, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnNotBetween(String value1, String value2) {
            addCriterion("IS_STOCK_WARN not between", value1, value2, "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andProductPointIsNull() {
            addCriterion("PRODUCT_POINT is null");
            return (Criteria) this;
        }

        public Criteria andProductPointIsNotNull() {
            addCriterion("PRODUCT_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andProductPointEqualTo(Integer value) {
            addCriterion("PRODUCT_POINT =", value, "productPoint");
            return (Criteria) this;
        }

        public Criteria andProductPointNotEqualTo(Integer value) {
            addCriterion("PRODUCT_POINT <>", value, "productPoint");
            return (Criteria) this;
        }

        public Criteria andProductPointGreaterThan(Integer value) {
            addCriterion("PRODUCT_POINT >", value, "productPoint");
            return (Criteria) this;
        }

        public Criteria andProductPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_POINT >=", value, "productPoint");
            return (Criteria) this;
        }

        public Criteria andProductPointLessThan(Integer value) {
            addCriterion("PRODUCT_POINT <", value, "productPoint");
            return (Criteria) this;
        }

        public Criteria andProductPointLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_POINT <=", value, "productPoint");
            return (Criteria) this;
        }

        public Criteria andProductPointIn(List<Integer> values) {
            addCriterion("PRODUCT_POINT in", values, "productPoint");
            return (Criteria) this;
        }

        public Criteria andProductPointNotIn(List<Integer> values) {
            addCriterion("PRODUCT_POINT not in", values, "productPoint");
            return (Criteria) this;
        }

        public Criteria andProductPointBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_POINT between", value1, value2, "productPoint");
            return (Criteria) this;
        }

        public Criteria andProductPointNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_POINT not between", value1, value2, "productPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointIsNull() {
            addCriterion("IS_SUPPORT_POINT is null");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointIsNotNull() {
            addCriterion("IS_SUPPORT_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointEqualTo(String value) {
            addCriterion("IS_SUPPORT_POINT =", value, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointNotEqualTo(String value) {
            addCriterion("IS_SUPPORT_POINT <>", value, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointGreaterThan(String value) {
            addCriterion("IS_SUPPORT_POINT >", value, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SUPPORT_POINT >=", value, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointLessThan(String value) {
            addCriterion("IS_SUPPORT_POINT <", value, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointLessThanOrEqualTo(String value) {
            addCriterion("IS_SUPPORT_POINT <=", value, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointLike(String value) {
            addCriterion("IS_SUPPORT_POINT like", value, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointNotLike(String value) {
            addCriterion("IS_SUPPORT_POINT not like", value, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointIn(List<String> values) {
            addCriterion("IS_SUPPORT_POINT in", values, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointNotIn(List<String> values) {
            addCriterion("IS_SUPPORT_POINT not in", values, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointBetween(String value1, String value2) {
            addCriterion("IS_SUPPORT_POINT between", value1, value2, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointNotBetween(String value1, String value2) {
            addCriterion("IS_SUPPORT_POINT not between", value1, value2, "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberIsNull() {
            addCriterion("PRODUCT_WARN_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberIsNotNull() {
            addCriterion("PRODUCT_WARN_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberEqualTo(Integer value) {
            addCriterion("PRODUCT_WARN_NUMBER =", value, "productWarnNumber");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberNotEqualTo(Integer value) {
            addCriterion("PRODUCT_WARN_NUMBER <>", value, "productWarnNumber");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberGreaterThan(Integer value) {
            addCriterion("PRODUCT_WARN_NUMBER >", value, "productWarnNumber");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_WARN_NUMBER >=", value, "productWarnNumber");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberLessThan(Integer value) {
            addCriterion("PRODUCT_WARN_NUMBER <", value, "productWarnNumber");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_WARN_NUMBER <=", value, "productWarnNumber");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberIn(List<Integer> values) {
            addCriterion("PRODUCT_WARN_NUMBER in", values, "productWarnNumber");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberNotIn(List<Integer> values) {
            addCriterion("PRODUCT_WARN_NUMBER not in", values, "productWarnNumber");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_WARN_NUMBER between", value1, value2, "productWarnNumber");
            return (Criteria) this;
        }

        public Criteria andProductWarnNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_WARN_NUMBER not between", value1, value2, "productWarnNumber");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionIsNull() {
            addCriterion("PROMOTE_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionIsNotNull() {
            addCriterion("PROMOTE_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionEqualTo(String value) {
            addCriterion("PROMOTE_DESCRIPTION =", value, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionNotEqualTo(String value) {
            addCriterion("PROMOTE_DESCRIPTION <>", value, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionGreaterThan(String value) {
            addCriterion("PROMOTE_DESCRIPTION >", value, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("PROMOTE_DESCRIPTION >=", value, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionLessThan(String value) {
            addCriterion("PROMOTE_DESCRIPTION <", value, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionLessThanOrEqualTo(String value) {
            addCriterion("PROMOTE_DESCRIPTION <=", value, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionLike(String value) {
            addCriterion("PROMOTE_DESCRIPTION like", value, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionNotLike(String value) {
            addCriterion("PROMOTE_DESCRIPTION not like", value, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionIn(List<String> values) {
            addCriterion("PROMOTE_DESCRIPTION in", values, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionNotIn(List<String> values) {
            addCriterion("PROMOTE_DESCRIPTION not in", values, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionBetween(String value1, String value2) {
            addCriterion("PROMOTE_DESCRIPTION between", value1, value2, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionNotBetween(String value1, String value2) {
            addCriterion("PROMOTE_DESCRIPTION not between", value1, value2, "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andUseMarkerIsNull() {
            addCriterion("USE_MARKER is null");
            return (Criteria) this;
        }

        public Criteria andUseMarkerIsNotNull() {
            addCriterion("USE_MARKER is not null");
            return (Criteria) this;
        }

        public Criteria andUseMarkerEqualTo(String value) {
            addCriterion("USE_MARKER =", value, "useMarker");
            return (Criteria) this;
        }

        public Criteria andUseMarkerNotEqualTo(String value) {
            addCriterion("USE_MARKER <>", value, "useMarker");
            return (Criteria) this;
        }

        public Criteria andUseMarkerGreaterThan(String value) {
            addCriterion("USE_MARKER >", value, "useMarker");
            return (Criteria) this;
        }

        public Criteria andUseMarkerGreaterThanOrEqualTo(String value) {
            addCriterion("USE_MARKER >=", value, "useMarker");
            return (Criteria) this;
        }

        public Criteria andUseMarkerLessThan(String value) {
            addCriterion("USE_MARKER <", value, "useMarker");
            return (Criteria) this;
        }

        public Criteria andUseMarkerLessThanOrEqualTo(String value) {
            addCriterion("USE_MARKER <=", value, "useMarker");
            return (Criteria) this;
        }

        public Criteria andUseMarkerLike(String value) {
            addCriterion("USE_MARKER like", value, "useMarker");
            return (Criteria) this;
        }

        public Criteria andUseMarkerNotLike(String value) {
            addCriterion("USE_MARKER not like", value, "useMarker");
            return (Criteria) this;
        }

        public Criteria andUseMarkerIn(List<String> values) {
            addCriterion("USE_MARKER in", values, "useMarker");
            return (Criteria) this;
        }

        public Criteria andUseMarkerNotIn(List<String> values) {
            addCriterion("USE_MARKER not in", values, "useMarker");
            return (Criteria) this;
        }

        public Criteria andUseMarkerBetween(String value1, String value2) {
            addCriterion("USE_MARKER between", value1, value2, "useMarker");
            return (Criteria) this;
        }

        public Criteria andUseMarkerNotBetween(String value1, String value2) {
            addCriterion("USE_MARKER not between", value1, value2, "useMarker");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeIsNull() {
            addCriterion("CATALOG_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeIsNotNull() {
            addCriterion("CATALOG_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeEqualTo(String value) {
            addCriterion("CATALOG_CODE =", value, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeNotEqualTo(String value) {
            addCriterion("CATALOG_CODE <>", value, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeGreaterThan(String value) {
            addCriterion("CATALOG_CODE >", value, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CATALOG_CODE >=", value, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeLessThan(String value) {
            addCriterion("CATALOG_CODE <", value, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeLessThanOrEqualTo(String value) {
            addCriterion("CATALOG_CODE <=", value, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeLike(String value) {
            addCriterion("CATALOG_CODE like", value, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeNotLike(String value) {
            addCriterion("CATALOG_CODE not like", value, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeIn(List<String> values) {
            addCriterion("CATALOG_CODE in", values, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeNotIn(List<String> values) {
            addCriterion("CATALOG_CODE not in", values, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeBetween(String value1, String value2) {
            addCriterion("CATALOG_CODE between", value1, value2, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeNotBetween(String value1, String value2) {
            addCriterion("CATALOG_CODE not between", value1, value2, "catalogCode");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNull() {
            addCriterion("SEO_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIsNotNull() {
            addCriterion("SEO_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andSeoTitleEqualTo(String value) {
            addCriterion("SEO_TITLE =", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotEqualTo(String value) {
            addCriterion("SEO_TITLE <>", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThan(String value) {
            addCriterion("SEO_TITLE >", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("SEO_TITLE >=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThan(String value) {
            addCriterion("SEO_TITLE <", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLessThanOrEqualTo(String value) {
            addCriterion("SEO_TITLE <=", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLike(String value) {
            addCriterion("SEO_TITLE like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotLike(String value) {
            addCriterion("SEO_TITLE not like", value, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleIn(List<String> values) {
            addCriterion("SEO_TITLE in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotIn(List<String> values) {
            addCriterion("SEO_TITLE not in", values, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleBetween(String value1, String value2) {
            addCriterion("SEO_TITLE between", value1, value2, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoTitleNotBetween(String value1, String value2) {
            addCriterion("SEO_TITLE not between", value1, value2, "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordIsNull() {
            addCriterion("SEO_META_KEY_WORD is null");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordIsNotNull() {
            addCriterion("SEO_META_KEY_WORD is not null");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordEqualTo(String value) {
            addCriterion("SEO_META_KEY_WORD =", value, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordNotEqualTo(String value) {
            addCriterion("SEO_META_KEY_WORD <>", value, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordGreaterThan(String value) {
            addCriterion("SEO_META_KEY_WORD >", value, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordGreaterThanOrEqualTo(String value) {
            addCriterion("SEO_META_KEY_WORD >=", value, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordLessThan(String value) {
            addCriterion("SEO_META_KEY_WORD <", value, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordLessThanOrEqualTo(String value) {
            addCriterion("SEO_META_KEY_WORD <=", value, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordLike(String value) {
            addCriterion("SEO_META_KEY_WORD like", value, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordNotLike(String value) {
            addCriterion("SEO_META_KEY_WORD not like", value, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordIn(List<String> values) {
            addCriterion("SEO_META_KEY_WORD in", values, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordNotIn(List<String> values) {
            addCriterion("SEO_META_KEY_WORD not in", values, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordBetween(String value1, String value2) {
            addCriterion("SEO_META_KEY_WORD between", value1, value2, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordNotBetween(String value1, String value2) {
            addCriterion("SEO_META_KEY_WORD not between", value1, value2, "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescIsNull() {
            addCriterion("SEO_META_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescIsNotNull() {
            addCriterion("SEO_META_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescEqualTo(String value) {
            addCriterion("SEO_META_DESC =", value, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescNotEqualTo(String value) {
            addCriterion("SEO_META_DESC <>", value, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescGreaterThan(String value) {
            addCriterion("SEO_META_DESC >", value, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescGreaterThanOrEqualTo(String value) {
            addCriterion("SEO_META_DESC >=", value, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescLessThan(String value) {
            addCriterion("SEO_META_DESC <", value, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescLessThanOrEqualTo(String value) {
            addCriterion("SEO_META_DESC <=", value, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescLike(String value) {
            addCriterion("SEO_META_DESC like", value, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescNotLike(String value) {
            addCriterion("SEO_META_DESC not like", value, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescIn(List<String> values) {
            addCriterion("SEO_META_DESC in", values, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescNotIn(List<String> values) {
            addCriterion("SEO_META_DESC not in", values, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescBetween(String value1, String value2) {
            addCriterion("SEO_META_DESC between", value1, value2, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescNotBetween(String value1, String value2) {
            addCriterion("SEO_META_DESC not between", value1, value2, "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andIsAuditIsNull() {
            addCriterion("IS_AUDIT is null");
            return (Criteria) this;
        }

        public Criteria andIsAuditIsNotNull() {
            addCriterion("IS_AUDIT is not null");
            return (Criteria) this;
        }

        public Criteria andIsAuditEqualTo(String value) {
            addCriterion("IS_AUDIT =", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotEqualTo(String value) {
            addCriterion("IS_AUDIT <>", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditGreaterThan(String value) {
            addCriterion("IS_AUDIT >", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditGreaterThanOrEqualTo(String value) {
            addCriterion("IS_AUDIT >=", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLessThan(String value) {
            addCriterion("IS_AUDIT <", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLessThanOrEqualTo(String value) {
            addCriterion("IS_AUDIT <=", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditLike(String value) {
            addCriterion("IS_AUDIT like", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotLike(String value) {
            addCriterion("IS_AUDIT not like", value, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditIn(List<String> values) {
            addCriterion("IS_AUDIT in", values, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotIn(List<String> values) {
            addCriterion("IS_AUDIT not in", values, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditBetween(String value1, String value2) {
            addCriterion("IS_AUDIT between", value1, value2, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsAuditNotBetween(String value1, String value2) {
            addCriterion("IS_AUDIT not between", value1, value2, "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(String value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(String value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(String value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(String value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(String value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLike(String value) {
            addCriterion("IS_DELETE like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotLike(String value) {
            addCriterion("IS_DELETE not like", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<String> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<String> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(String value1, String value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(String value1, String value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNull() {
            addCriterion("ADD_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIsNotNull() {
            addCriterion("ADD_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAddUserIdEqualTo(Integer value) {
            addCriterion("ADD_USER_ID =", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotEqualTo(Integer value) {
            addCriterion("ADD_USER_ID <>", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThan(Integer value) {
            addCriterion("ADD_USER_ID >", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ADD_USER_ID >=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThan(Integer value) {
            addCriterion("ADD_USER_ID <", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("ADD_USER_ID <=", value, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdIn(List<Integer> values) {
            addCriterion("ADD_USER_ID in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotIn(List<Integer> values) {
            addCriterion("ADD_USER_ID not in", values, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdBetween(Integer value1, Integer value2) {
            addCriterion("ADD_USER_ID between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ADD_USER_ID not between", value1, value2, "addUserId");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("ADD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("ADD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(String value) {
            addCriterion("ADD_TIME =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(String value) {
            addCriterion("ADD_TIME <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(String value) {
            addCriterion("ADD_TIME >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ADD_TIME >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(String value) {
            addCriterion("ADD_TIME <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(String value) {
            addCriterion("ADD_TIME <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLike(String value) {
            addCriterion("ADD_TIME like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotLike(String value) {
            addCriterion("ADD_TIME not like", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<String> values) {
            addCriterion("ADD_TIME in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<String> values) {
            addCriterion("ADD_TIME not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(String value1, String value2) {
            addCriterion("ADD_TIME between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(String value1, String value2) {
            addCriterion("ADD_TIME not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andEditUserIdIsNull() {
            addCriterion("EDIT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andEditUserIdIsNotNull() {
            addCriterion("EDIT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andEditUserIdEqualTo(Integer value) {
            addCriterion("EDIT_USER_ID =", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdNotEqualTo(Integer value) {
            addCriterion("EDIT_USER_ID <>", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdGreaterThan(Integer value) {
            addCriterion("EDIT_USER_ID >", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("EDIT_USER_ID >=", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdLessThan(Integer value) {
            addCriterion("EDIT_USER_ID <", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("EDIT_USER_ID <=", value, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdIn(List<Integer> values) {
            addCriterion("EDIT_USER_ID in", values, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdNotIn(List<Integer> values) {
            addCriterion("EDIT_USER_ID not in", values, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdBetween(Integer value1, Integer value2) {
            addCriterion("EDIT_USER_ID between", value1, value2, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("EDIT_USER_ID not between", value1, value2, "editUserId");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNull() {
            addCriterion("EDIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEditTimeIsNotNull() {
            addCriterion("EDIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEditTimeEqualTo(String value) {
            addCriterion("EDIT_TIME =", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotEqualTo(String value) {
            addCriterion("EDIT_TIME <>", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThan(String value) {
            addCriterion("EDIT_TIME >", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeGreaterThanOrEqualTo(String value) {
            addCriterion("EDIT_TIME >=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThan(String value) {
            addCriterion("EDIT_TIME <", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLessThanOrEqualTo(String value) {
            addCriterion("EDIT_TIME <=", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLike(String value) {
            addCriterion("EDIT_TIME like", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotLike(String value) {
            addCriterion("EDIT_TIME not like", value, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeIn(List<String> values) {
            addCriterion("EDIT_TIME in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotIn(List<String> values) {
            addCriterion("EDIT_TIME not in", values, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeBetween(String value1, String value2) {
            addCriterion("EDIT_TIME between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeNotBetween(String value1, String value2) {
            addCriterion("EDIT_TIME not between", value1, value2, "editTime");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescIsNull() {
            addCriterion("PRODUCT_SIMPLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescIsNotNull() {
            addCriterion("PRODUCT_SIMPLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescEqualTo(String value) {
            addCriterion("PRODUCT_SIMPLE_DESC =", value, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescNotEqualTo(String value) {
            addCriterion("PRODUCT_SIMPLE_DESC <>", value, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescGreaterThan(String value) {
            addCriterion("PRODUCT_SIMPLE_DESC >", value, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SIMPLE_DESC >=", value, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescLessThan(String value) {
            addCriterion("PRODUCT_SIMPLE_DESC <", value, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_SIMPLE_DESC <=", value, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescLike(String value) {
            addCriterion("PRODUCT_SIMPLE_DESC like", value, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescNotLike(String value) {
            addCriterion("PRODUCT_SIMPLE_DESC not like", value, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescIn(List<String> values) {
            addCriterion("PRODUCT_SIMPLE_DESC in", values, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescNotIn(List<String> values) {
            addCriterion("PRODUCT_SIMPLE_DESC not in", values, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescBetween(String value1, String value2) {
            addCriterion("PRODUCT_SIMPLE_DESC between", value1, value2, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_SIMPLE_DESC not between", value1, value2, "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andClickAmountIsNull() {
            addCriterion("CLICK_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andClickAmountIsNotNull() {
            addCriterion("CLICK_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andClickAmountEqualTo(Integer value) {
            addCriterion("CLICK_AMOUNT =", value, "clickAmount");
            return (Criteria) this;
        }

        public Criteria andClickAmountNotEqualTo(Integer value) {
            addCriterion("CLICK_AMOUNT <>", value, "clickAmount");
            return (Criteria) this;
        }

        public Criteria andClickAmountGreaterThan(Integer value) {
            addCriterion("CLICK_AMOUNT >", value, "clickAmount");
            return (Criteria) this;
        }

        public Criteria andClickAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLICK_AMOUNT >=", value, "clickAmount");
            return (Criteria) this;
        }

        public Criteria andClickAmountLessThan(Integer value) {
            addCriterion("CLICK_AMOUNT <", value, "clickAmount");
            return (Criteria) this;
        }

        public Criteria andClickAmountLessThanOrEqualTo(Integer value) {
            addCriterion("CLICK_AMOUNT <=", value, "clickAmount");
            return (Criteria) this;
        }

        public Criteria andClickAmountIn(List<Integer> values) {
            addCriterion("CLICK_AMOUNT in", values, "clickAmount");
            return (Criteria) this;
        }

        public Criteria andClickAmountNotIn(List<Integer> values) {
            addCriterion("CLICK_AMOUNT not in", values, "clickAmount");
            return (Criteria) this;
        }

        public Criteria andClickAmountBetween(Integer value1, Integer value2) {
            addCriterion("CLICK_AMOUNT between", value1, value2, "clickAmount");
            return (Criteria) this;
        }

        public Criteria andClickAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("CLICK_AMOUNT not between", value1, value2, "clickAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNull() {
            addCriterion("SALE_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIsNotNull() {
            addCriterion("SALE_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSaleAmountEqualTo(Integer value) {
            addCriterion("SALE_AMOUNT =", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotEqualTo(Integer value) {
            addCriterion("SALE_AMOUNT <>", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThan(Integer value) {
            addCriterion("SALE_AMOUNT >", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("SALE_AMOUNT >=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThan(Integer value) {
            addCriterion("SALE_AMOUNT <", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountLessThanOrEqualTo(Integer value) {
            addCriterion("SALE_AMOUNT <=", value, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountIn(List<Integer> values) {
            addCriterion("SALE_AMOUNT in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotIn(List<Integer> values) {
            addCriterion("SALE_AMOUNT not in", values, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountBetween(Integer value1, Integer value2) {
            addCriterion("SALE_AMOUNT between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andSaleAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("SALE_AMOUNT not between", value1, value2, "saleAmount");
            return (Criteria) this;
        }

        public Criteria andStreetIsNull() {
            addCriterion("STREET is null");
            return (Criteria) this;
        }

        public Criteria andStreetIsNotNull() {
            addCriterion("STREET is not null");
            return (Criteria) this;
        }

        public Criteria andStreetEqualTo(String value) {
            addCriterion("STREET =", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotEqualTo(String value) {
            addCriterion("STREET <>", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThan(String value) {
            addCriterion("STREET >", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetGreaterThanOrEqualTo(String value) {
            addCriterion("STREET >=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThan(String value) {
            addCriterion("STREET <", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLessThanOrEqualTo(String value) {
            addCriterion("STREET <=", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetLike(String value) {
            addCriterion("STREET like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotLike(String value) {
            addCriterion("STREET not like", value, "street");
            return (Criteria) this;
        }

        public Criteria andStreetIn(List<String> values) {
            addCriterion("STREET in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotIn(List<String> values) {
            addCriterion("STREET not in", values, "street");
            return (Criteria) this;
        }

        public Criteria andStreetBetween(String value1, String value2) {
            addCriterion("STREET between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStreetNotBetween(String value1, String value2) {
            addCriterion("STREET not between", value1, value2, "street");
            return (Criteria) this;
        }

        public Criteria andStylesIsNull() {
            addCriterion("STYLES is null");
            return (Criteria) this;
        }

        public Criteria andStylesIsNotNull() {
            addCriterion("STYLES is not null");
            return (Criteria) this;
        }

        public Criteria andStylesEqualTo(String value) {
            addCriterion("STYLES =", value, "styles");
            return (Criteria) this;
        }

        public Criteria andStylesNotEqualTo(String value) {
            addCriterion("STYLES <>", value, "styles");
            return (Criteria) this;
        }

        public Criteria andStylesGreaterThan(String value) {
            addCriterion("STYLES >", value, "styles");
            return (Criteria) this;
        }

        public Criteria andStylesGreaterThanOrEqualTo(String value) {
            addCriterion("STYLES >=", value, "styles");
            return (Criteria) this;
        }

        public Criteria andStylesLessThan(String value) {
            addCriterion("STYLES <", value, "styles");
            return (Criteria) this;
        }

        public Criteria andStylesLessThanOrEqualTo(String value) {
            addCriterion("STYLES <=", value, "styles");
            return (Criteria) this;
        }

        public Criteria andStylesLike(String value) {
            addCriterion("STYLES like", value, "styles");
            return (Criteria) this;
        }

        public Criteria andStylesNotLike(String value) {
            addCriterion("STYLES not like", value, "styles");
            return (Criteria) this;
        }

        public Criteria andStylesIn(List<String> values) {
            addCriterion("STYLES in", values, "styles");
            return (Criteria) this;
        }

        public Criteria andStylesNotIn(List<String> values) {
            addCriterion("STYLES not in", values, "styles");
            return (Criteria) this;
        }

        public Criteria andStylesBetween(String value1, String value2) {
            addCriterion("STYLES between", value1, value2, "styles");
            return (Criteria) this;
        }

        public Criteria andStylesNotBetween(String value1, String value2) {
            addCriterion("STYLES not between", value1, value2, "styles");
            return (Criteria) this;
        }

        public Criteria andCommentNumberIsNull() {
            addCriterion("COMMENT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCommentNumberIsNotNull() {
            addCriterion("COMMENT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCommentNumberEqualTo(Integer value) {
            addCriterion("COMMENT_NUMBER =", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberNotEqualTo(Integer value) {
            addCriterion("COMMENT_NUMBER <>", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberGreaterThan(Integer value) {
            addCriterion("COMMENT_NUMBER >", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_NUMBER >=", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberLessThan(Integer value) {
            addCriterion("COMMENT_NUMBER <", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_NUMBER <=", value, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberIn(List<Integer> values) {
            addCriterion("COMMENT_NUMBER in", values, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberNotIn(List<Integer> values) {
            addCriterion("COMMENT_NUMBER not in", values, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_NUMBER between", value1, value2, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andCommentNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_NUMBER not between", value1, value2, "commentNumber");
            return (Criteria) this;
        }

        public Criteria andProductCodeLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_CODE) like", value.toUpperCase(), "productCode");
            return (Criteria) this;
        }

        public Criteria andProductNameLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_NAME) like", value.toUpperCase(), "productName");
            return (Criteria) this;
        }

        public Criteria andProductCommonNameLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_COMMON_NAME) like", value.toUpperCase(), "productCommonName");
            return (Criteria) this;
        }

        public Criteria andProductAliasNameLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_ALIAS_NAME) like", value.toUpperCase(), "productAliasName");
            return (Criteria) this;
        }

        public Criteria andProductChnNoLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_CHN_NO) like", value.toUpperCase(), "productChnNo");
            return (Criteria) this;
        }

        public Criteria andProductMarketDateLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_MARKET_DATE) like", value.toUpperCase(), "productMarketDate");
            return (Criteria) this;
        }

        public Criteria andProductKeywordLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_KEYWORD) like", value.toUpperCase(), "productKeyword");
            return (Criteria) this;
        }

        public Criteria andProductDescLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_DESC) like", value.toUpperCase(), "productDesc");
            return (Criteria) this;
        }

        public Criteria andIsOnsaleLikeInsensitive(String value) {
            addCriterion("upper(IS_ONSALE) like", value.toUpperCase(), "isOnsale");
            return (Criteria) this;
        }

        public Criteria andOnsaleTimeLikeInsensitive(String value) {
            addCriterion("upper(ONSALE_TIME) like", value.toUpperCase(), "onsaleTime");
            return (Criteria) this;
        }

        public Criteria andIsStockWarnLikeInsensitive(String value) {
            addCriterion("upper(IS_STOCK_WARN) like", value.toUpperCase(), "isStockWarn");
            return (Criteria) this;
        }

        public Criteria andIsSupportPointLikeInsensitive(String value) {
            addCriterion("upper(IS_SUPPORT_POINT) like", value.toUpperCase(), "isSupportPoint");
            return (Criteria) this;
        }

        public Criteria andPromoteDescriptionLikeInsensitive(String value) {
            addCriterion("upper(PROMOTE_DESCRIPTION) like", value.toUpperCase(), "promoteDescription");
            return (Criteria) this;
        }

        public Criteria andUseMarkerLikeInsensitive(String value) {
            addCriterion("upper(USE_MARKER) like", value.toUpperCase(), "useMarker");
            return (Criteria) this;
        }

        public Criteria andCatalogCodeLikeInsensitive(String value) {
            addCriterion("upper(CATALOG_CODE) like", value.toUpperCase(), "catalogCode");
            return (Criteria) this;
        }

        public Criteria andSeoTitleLikeInsensitive(String value) {
            addCriterion("upper(SEO_TITLE) like", value.toUpperCase(), "seoTitle");
            return (Criteria) this;
        }

        public Criteria andSeoMetaKeyWordLikeInsensitive(String value) {
            addCriterion("upper(SEO_META_KEY_WORD) like", value.toUpperCase(), "seoMetaKeyWord");
            return (Criteria) this;
        }

        public Criteria andSeoMetaDescLikeInsensitive(String value) {
            addCriterion("upper(SEO_META_DESC) like", value.toUpperCase(), "seoMetaDesc");
            return (Criteria) this;
        }

        public Criteria andIsAuditLikeInsensitive(String value) {
            addCriterion("upper(IS_AUDIT) like", value.toUpperCase(), "isAudit");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLikeInsensitive(String value) {
            addCriterion("upper(IS_DELETE) like", value.toUpperCase(), "isDelete");
            return (Criteria) this;
        }

        public Criteria andAddTimeLikeInsensitive(String value) {
            addCriterion("upper(ADD_TIME) like", value.toUpperCase(), "addTime");
            return (Criteria) this;
        }

        public Criteria andEditTimeLikeInsensitive(String value) {
            addCriterion("upper(EDIT_TIME) like", value.toUpperCase(), "editTime");
            return (Criteria) this;
        }

        public Criteria andProductSimpleDescLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_SIMPLE_DESC) like", value.toUpperCase(), "productSimpleDesc");
            return (Criteria) this;
        }

        public Criteria andStreetLikeInsensitive(String value) {
            addCriterion("upper(STREET) like", value.toUpperCase(), "street");
            return (Criteria) this;
        }

        public Criteria andStylesLikeInsensitive(String value) {
            addCriterion("upper(STYLES) like", value.toUpperCase(), "styles");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}