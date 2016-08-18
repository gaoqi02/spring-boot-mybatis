package com.ecbusiness.model;

import java.util.ArrayList;
import java.util.List;

public class ProductImgCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductImgCriteria() {
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

        public Criteria andProImageIdIsNull() {
            addCriterion("PRO_IMAGE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProImageIdIsNotNull() {
            addCriterion("PRO_IMAGE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProImageIdEqualTo(Integer value) {
            addCriterion("PRO_IMAGE_ID =", value, "proImageId");
            return (Criteria) this;
        }

        public Criteria andProImageIdNotEqualTo(Integer value) {
            addCriterion("PRO_IMAGE_ID <>", value, "proImageId");
            return (Criteria) this;
        }

        public Criteria andProImageIdGreaterThan(Integer value) {
            addCriterion("PRO_IMAGE_ID >", value, "proImageId");
            return (Criteria) this;
        }

        public Criteria andProImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_IMAGE_ID >=", value, "proImageId");
            return (Criteria) this;
        }

        public Criteria andProImageIdLessThan(Integer value) {
            addCriterion("PRO_IMAGE_ID <", value, "proImageId");
            return (Criteria) this;
        }

        public Criteria andProImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_IMAGE_ID <=", value, "proImageId");
            return (Criteria) this;
        }

        public Criteria andProImageIdIn(List<Integer> values) {
            addCriterion("PRO_IMAGE_ID in", values, "proImageId");
            return (Criteria) this;
        }

        public Criteria andProImageIdNotIn(List<Integer> values) {
            addCriterion("PRO_IMAGE_ID not in", values, "proImageId");
            return (Criteria) this;
        }

        public Criteria andProImageIdBetween(Integer value1, Integer value2) {
            addCriterion("PRO_IMAGE_ID between", value1, value2, "proImageId");
            return (Criteria) this;
        }

        public Criteria andProImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_IMAGE_ID not between", value1, value2, "proImageId");
            return (Criteria) this;
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

        public Criteria andImageTypeIsNull() {
            addCriterion("IMAGE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andImageTypeIsNotNull() {
            addCriterion("IMAGE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andImageTypeEqualTo(String value) {
            addCriterion("IMAGE_TYPE =", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotEqualTo(String value) {
            addCriterion("IMAGE_TYPE <>", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeGreaterThan(String value) {
            addCriterion("IMAGE_TYPE >", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_TYPE >=", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLessThan(String value) {
            addCriterion("IMAGE_TYPE <", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_TYPE <=", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLike(String value) {
            addCriterion("IMAGE_TYPE like", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotLike(String value) {
            addCriterion("IMAGE_TYPE not like", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeIn(List<String> values) {
            addCriterion("IMAGE_TYPE in", values, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotIn(List<String> values) {
            addCriterion("IMAGE_TYPE not in", values, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeBetween(String value1, String value2) {
            addCriterion("IMAGE_TYPE between", value1, value2, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotBetween(String value1, String value2) {
            addCriterion("IMAGE_TYPE not between", value1, value2, "imageType");
            return (Criteria) this;
        }

        public Criteria andProImageUrlIsNull() {
            addCriterion("PRO_IMAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andProImageUrlIsNotNull() {
            addCriterion("PRO_IMAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andProImageUrlEqualTo(String value) {
            addCriterion("PRO_IMAGE_URL =", value, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andProImageUrlNotEqualTo(String value) {
            addCriterion("PRO_IMAGE_URL <>", value, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andProImageUrlGreaterThan(String value) {
            addCriterion("PRO_IMAGE_URL >", value, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andProImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PRO_IMAGE_URL >=", value, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andProImageUrlLessThan(String value) {
            addCriterion("PRO_IMAGE_URL <", value, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andProImageUrlLessThanOrEqualTo(String value) {
            addCriterion("PRO_IMAGE_URL <=", value, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andProImageUrlLike(String value) {
            addCriterion("PRO_IMAGE_URL like", value, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andProImageUrlNotLike(String value) {
            addCriterion("PRO_IMAGE_URL not like", value, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andProImageUrlIn(List<String> values) {
            addCriterion("PRO_IMAGE_URL in", values, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andProImageUrlNotIn(List<String> values) {
            addCriterion("PRO_IMAGE_URL not in", values, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andProImageUrlBetween(String value1, String value2) {
            addCriterion("PRO_IMAGE_URL between", value1, value2, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andProImageUrlNotBetween(String value1, String value2) {
            addCriterion("PRO_IMAGE_URL not between", value1, value2, "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andImageOrignIsNull() {
            addCriterion("IMAGE_ORIGN is null");
            return (Criteria) this;
        }

        public Criteria andImageOrignIsNotNull() {
            addCriterion("IMAGE_ORIGN is not null");
            return (Criteria) this;
        }

        public Criteria andImageOrignEqualTo(String value) {
            addCriterion("IMAGE_ORIGN =", value, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrignNotEqualTo(String value) {
            addCriterion("IMAGE_ORIGN <>", value, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrignGreaterThan(String value) {
            addCriterion("IMAGE_ORIGN >", value, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrignGreaterThanOrEqualTo(String value) {
            addCriterion("IMAGE_ORIGN >=", value, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrignLessThan(String value) {
            addCriterion("IMAGE_ORIGN <", value, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrignLessThanOrEqualTo(String value) {
            addCriterion("IMAGE_ORIGN <=", value, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrignLike(String value) {
            addCriterion("IMAGE_ORIGN like", value, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrignNotLike(String value) {
            addCriterion("IMAGE_ORIGN not like", value, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrignIn(List<String> values) {
            addCriterion("IMAGE_ORIGN in", values, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrignNotIn(List<String> values) {
            addCriterion("IMAGE_ORIGN not in", values, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrignBetween(String value1, String value2) {
            addCriterion("IMAGE_ORIGN between", value1, value2, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrignNotBetween(String value1, String value2) {
            addCriterion("IMAGE_ORIGN not between", value1, value2, "imageOrign");
            return (Criteria) this;
        }

        public Criteria andImageOrderIsNull() {
            addCriterion("IMAGE_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andImageOrderIsNotNull() {
            addCriterion("IMAGE_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andImageOrderEqualTo(Integer value) {
            addCriterion("IMAGE_ORDER =", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderNotEqualTo(Integer value) {
            addCriterion("IMAGE_ORDER <>", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderGreaterThan(Integer value) {
            addCriterion("IMAGE_ORDER >", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("IMAGE_ORDER >=", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderLessThan(Integer value) {
            addCriterion("IMAGE_ORDER <", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderLessThanOrEqualTo(Integer value) {
            addCriterion("IMAGE_ORDER <=", value, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderIn(List<Integer> values) {
            addCriterion("IMAGE_ORDER in", values, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderNotIn(List<Integer> values) {
            addCriterion("IMAGE_ORDER not in", values, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderBetween(Integer value1, Integer value2) {
            addCriterion("IMAGE_ORDER between", value1, value2, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andImageOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("IMAGE_ORDER not between", value1, value2, "imageOrder");
            return (Criteria) this;
        }

        public Criteria andMasterPlanIsNull() {
            addCriterion("MASTER_PLAN is null");
            return (Criteria) this;
        }

        public Criteria andMasterPlanIsNotNull() {
            addCriterion("MASTER_PLAN is not null");
            return (Criteria) this;
        }

        public Criteria andMasterPlanEqualTo(String value) {
            addCriterion("MASTER_PLAN =", value, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andMasterPlanNotEqualTo(String value) {
            addCriterion("MASTER_PLAN <>", value, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andMasterPlanGreaterThan(String value) {
            addCriterion("MASTER_PLAN >", value, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andMasterPlanGreaterThanOrEqualTo(String value) {
            addCriterion("MASTER_PLAN >=", value, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andMasterPlanLessThan(String value) {
            addCriterion("MASTER_PLAN <", value, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andMasterPlanLessThanOrEqualTo(String value) {
            addCriterion("MASTER_PLAN <=", value, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andMasterPlanLike(String value) {
            addCriterion("MASTER_PLAN like", value, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andMasterPlanNotLike(String value) {
            addCriterion("MASTER_PLAN not like", value, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andMasterPlanIn(List<String> values) {
            addCriterion("MASTER_PLAN in", values, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andMasterPlanNotIn(List<String> values) {
            addCriterion("MASTER_PLAN not in", values, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andMasterPlanBetween(String value1, String value2) {
            addCriterion("MASTER_PLAN between", value1, value2, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andMasterPlanNotBetween(String value1, String value2) {
            addCriterion("MASTER_PLAN not between", value1, value2, "masterPlan");
            return (Criteria) this;
        }

        public Criteria andImageTypeLikeInsensitive(String value) {
            addCriterion("upper(IMAGE_TYPE) like", value.toUpperCase(), "imageType");
            return (Criteria) this;
        }

        public Criteria andProImageUrlLikeInsensitive(String value) {
            addCriterion("upper(PRO_IMAGE_URL) like", value.toUpperCase(), "proImageUrl");
            return (Criteria) this;
        }

        public Criteria andImageOrignLikeInsensitive(String value) {
            addCriterion("upper(IMAGE_ORIGN) like", value.toUpperCase(), "imageOrign");
            return (Criteria) this;
        }

        public Criteria andMasterPlanLikeInsensitive(String value) {
            addCriterion("upper(MASTER_PLAN) like", value.toUpperCase(), "masterPlan");
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