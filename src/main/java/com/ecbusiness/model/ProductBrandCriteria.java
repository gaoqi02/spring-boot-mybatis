package com.ecbusiness.model;

import java.util.ArrayList;
import java.util.List;

public class ProductBrandCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductBrandCriteria() {
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

        public Criteria andProductBrandNameIsNull() {
            addCriterion("PRODUCT_BRAND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameIsNotNull() {
            addCriterion("PRODUCT_BRAND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_NAME =", value, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameNotEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_NAME <>", value, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameGreaterThan(String value) {
            addCriterion("PRODUCT_BRAND_NAME >", value, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_NAME >=", value, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameLessThan(String value) {
            addCriterion("PRODUCT_BRAND_NAME <", value, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_NAME <=", value, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameLike(String value) {
            addCriterion("PRODUCT_BRAND_NAME like", value, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameNotLike(String value) {
            addCriterion("PRODUCT_BRAND_NAME not like", value, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameIn(List<String> values) {
            addCriterion("PRODUCT_BRAND_NAME in", values, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameNotIn(List<String> values) {
            addCriterion("PRODUCT_BRAND_NAME not in", values, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameBetween(String value1, String value2) {
            addCriterion("PRODUCT_BRAND_NAME between", value1, value2, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandNameNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_BRAND_NAME not between", value1, value2, "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlIsNull() {
            addCriterion("PRODUCT_BRAND_URL is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlIsNotNull() {
            addCriterion("PRODUCT_BRAND_URL is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_URL =", value, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlNotEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_URL <>", value, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlGreaterThan(String value) {
            addCriterion("PRODUCT_BRAND_URL >", value, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_URL >=", value, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlLessThan(String value) {
            addCriterion("PRODUCT_BRAND_URL <", value, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_URL <=", value, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlLike(String value) {
            addCriterion("PRODUCT_BRAND_URL like", value, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlNotLike(String value) {
            addCriterion("PRODUCT_BRAND_URL not like", value, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlIn(List<String> values) {
            addCriterion("PRODUCT_BRAND_URL in", values, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlNotIn(List<String> values) {
            addCriterion("PRODUCT_BRAND_URL not in", values, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlBetween(String value1, String value2) {
            addCriterion("PRODUCT_BRAND_URL between", value1, value2, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_BRAND_URL not between", value1, value2, "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgIsNull() {
            addCriterion("PRODUCT_BRAND_IMG is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgIsNotNull() {
            addCriterion("PRODUCT_BRAND_IMG is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_IMG =", value, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgNotEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_IMG <>", value, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgGreaterThan(String value) {
            addCriterion("PRODUCT_BRAND_IMG >", value, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_IMG >=", value, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgLessThan(String value) {
            addCriterion("PRODUCT_BRAND_IMG <", value, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_IMG <=", value, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgLike(String value) {
            addCriterion("PRODUCT_BRAND_IMG like", value, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgNotLike(String value) {
            addCriterion("PRODUCT_BRAND_IMG not like", value, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgIn(List<String> values) {
            addCriterion("PRODUCT_BRAND_IMG in", values, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgNotIn(List<String> values) {
            addCriterion("PRODUCT_BRAND_IMG not in", values, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgBetween(String value1, String value2) {
            addCriterion("PRODUCT_BRAND_IMG between", value1, value2, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_BRAND_IMG not between", value1, value2, "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1IsNull() {
            addCriterion("PRODUCT_BRAND_DESC_1 is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1IsNotNull() {
            addCriterion("PRODUCT_BRAND_DESC_1 is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1EqualTo(String value) {
            addCriterion("PRODUCT_BRAND_DESC_1 =", value, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1NotEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_DESC_1 <>", value, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1GreaterThan(String value) {
            addCriterion("PRODUCT_BRAND_DESC_1 >", value, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1GreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_DESC_1 >=", value, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1LessThan(String value) {
            addCriterion("PRODUCT_BRAND_DESC_1 <", value, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1LessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_DESC_1 <=", value, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1Like(String value) {
            addCriterion("PRODUCT_BRAND_DESC_1 like", value, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1NotLike(String value) {
            addCriterion("PRODUCT_BRAND_DESC_1 not like", value, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1In(List<String> values) {
            addCriterion("PRODUCT_BRAND_DESC_1 in", values, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1NotIn(List<String> values) {
            addCriterion("PRODUCT_BRAND_DESC_1 not in", values, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1Between(String value1, String value2) {
            addCriterion("PRODUCT_BRAND_DESC_1 between", value1, value2, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1NotBetween(String value1, String value2) {
            addCriterion("PRODUCT_BRAND_DESC_1 not between", value1, value2, "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2IsNull() {
            addCriterion("PRODUCT_BRAND_DESC_2 is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2IsNotNull() {
            addCriterion("PRODUCT_BRAND_DESC_2 is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2EqualTo(String value) {
            addCriterion("PRODUCT_BRAND_DESC_2 =", value, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2NotEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_DESC_2 <>", value, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2GreaterThan(String value) {
            addCriterion("PRODUCT_BRAND_DESC_2 >", value, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2GreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_DESC_2 >=", value, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2LessThan(String value) {
            addCriterion("PRODUCT_BRAND_DESC_2 <", value, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2LessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_BRAND_DESC_2 <=", value, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2Like(String value) {
            addCriterion("PRODUCT_BRAND_DESC_2 like", value, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2NotLike(String value) {
            addCriterion("PRODUCT_BRAND_DESC_2 not like", value, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2In(List<String> values) {
            addCriterion("PRODUCT_BRAND_DESC_2 in", values, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2NotIn(List<String> values) {
            addCriterion("PRODUCT_BRAND_DESC_2 not in", values, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2Between(String value1, String value2) {
            addCriterion("PRODUCT_BRAND_DESC_2 between", value1, value2, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2NotBetween(String value1, String value2) {
            addCriterion("PRODUCT_BRAND_DESC_2 not between", value1, value2, "productBrandDesc2");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderIsNull() {
            addCriterion("PRODUCT_BRAND_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderIsNotNull() {
            addCriterion("PRODUCT_BRAND_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderEqualTo(Integer value) {
            addCriterion("PRODUCT_BRAND_ORDER =", value, "productBrandOrder");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderNotEqualTo(Integer value) {
            addCriterion("PRODUCT_BRAND_ORDER <>", value, "productBrandOrder");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderGreaterThan(Integer value) {
            addCriterion("PRODUCT_BRAND_ORDER >", value, "productBrandOrder");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_BRAND_ORDER >=", value, "productBrandOrder");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderLessThan(Integer value) {
            addCriterion("PRODUCT_BRAND_ORDER <", value, "productBrandOrder");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_BRAND_ORDER <=", value, "productBrandOrder");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderIn(List<Integer> values) {
            addCriterion("PRODUCT_BRAND_ORDER in", values, "productBrandOrder");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderNotIn(List<Integer> values) {
            addCriterion("PRODUCT_BRAND_ORDER not in", values, "productBrandOrder");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_BRAND_ORDER between", value1, value2, "productBrandOrder");
            return (Criteria) this;
        }

        public Criteria andProductBrandOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_BRAND_ORDER not between", value1, value2, "productBrandOrder");
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

        public Criteria andProductBrandNameLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_BRAND_NAME) like", value.toUpperCase(), "productBrandName");
            return (Criteria) this;
        }

        public Criteria andProductBrandUrlLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_BRAND_URL) like", value.toUpperCase(), "productBrandUrl");
            return (Criteria) this;
        }

        public Criteria andProductBrandImgLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_BRAND_IMG) like", value.toUpperCase(), "productBrandImg");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc1LikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_BRAND_DESC_1) like", value.toUpperCase(), "productBrandDesc1");
            return (Criteria) this;
        }

        public Criteria andProductBrandDesc2LikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_BRAND_DESC_2) like", value.toUpperCase(), "productBrandDesc2");
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