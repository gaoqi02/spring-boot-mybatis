package com.ecbusiness.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderInfoCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderInfoCriteria() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(String value) {
            addCriterion("ORDER_ID =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(String value) {
            addCriterion("ORDER_ID <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(String value) {
            addCriterion("ORDER_ID >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_ID >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(String value) {
            addCriterion("ORDER_ID <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_ID <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLike(String value) {
            addCriterion("ORDER_ID like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotLike(String value) {
            addCriterion("ORDER_ID not like", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<String> values) {
            addCriterion("ORDER_ID in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<String> values) {
            addCriterion("ORDER_ID not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(String value1, String value2) {
            addCriterion("ORDER_ID between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_ID not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdIsNull() {
            addCriterion("ERP_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdIsNotNull() {
            addCriterion("ERP_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdEqualTo(Integer value) {
            addCriterion("ERP_ORDER_ID =", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdNotEqualTo(Integer value) {
            addCriterion("ERP_ORDER_ID <>", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdGreaterThan(Integer value) {
            addCriterion("ERP_ORDER_ID >", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERP_ORDER_ID >=", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdLessThan(Integer value) {
            addCriterion("ERP_ORDER_ID <", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("ERP_ORDER_ID <=", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdIn(List<Integer> values) {
            addCriterion("ERP_ORDER_ID in", values, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdNotIn(List<Integer> values) {
            addCriterion("ERP_ORDER_ID not in", values, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("ERP_ORDER_ID between", value1, value2, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ERP_ORDER_ID not between", value1, value2, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoIsNull() {
            addCriterion("URL_FROM_NO is null");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoIsNotNull() {
            addCriterion("URL_FROM_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoEqualTo(String value) {
            addCriterion("URL_FROM_NO =", value, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoNotEqualTo(String value) {
            addCriterion("URL_FROM_NO <>", value, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoGreaterThan(String value) {
            addCriterion("URL_FROM_NO >", value, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoGreaterThanOrEqualTo(String value) {
            addCriterion("URL_FROM_NO >=", value, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoLessThan(String value) {
            addCriterion("URL_FROM_NO <", value, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoLessThanOrEqualTo(String value) {
            addCriterion("URL_FROM_NO <=", value, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoLike(String value) {
            addCriterion("URL_FROM_NO like", value, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoNotLike(String value) {
            addCriterion("URL_FROM_NO not like", value, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoIn(List<String> values) {
            addCriterion("URL_FROM_NO in", values, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoNotIn(List<String> values) {
            addCriterion("URL_FROM_NO not in", values, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoBetween(String value1, String value2) {
            addCriterion("URL_FROM_NO between", value1, value2, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoNotBetween(String value1, String value2) {
            addCriterion("URL_FROM_NO not between", value1, value2, "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdIsNull() {
            addCriterion("MULTI_CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdIsNotNull() {
            addCriterion("MULTI_CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdEqualTo(Integer value) {
            addCriterion("MULTI_CHANNEL_ID =", value, "multiChannelId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdNotEqualTo(Integer value) {
            addCriterion("MULTI_CHANNEL_ID <>", value, "multiChannelId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdGreaterThan(Integer value) {
            addCriterion("MULTI_CHANNEL_ID >", value, "multiChannelId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MULTI_CHANNEL_ID >=", value, "multiChannelId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdLessThan(Integer value) {
            addCriterion("MULTI_CHANNEL_ID <", value, "multiChannelId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("MULTI_CHANNEL_ID <=", value, "multiChannelId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdIn(List<Integer> values) {
            addCriterion("MULTI_CHANNEL_ID in", values, "multiChannelId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdNotIn(List<Integer> values) {
            addCriterion("MULTI_CHANNEL_ID not in", values, "multiChannelId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("MULTI_CHANNEL_ID between", value1, value2, "multiChannelId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MULTI_CHANNEL_ID not between", value1, value2, "multiChannelId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdIsNull() {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdIsNotNull() {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdEqualTo(Integer value) {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID =", value, "multiChannelOrderBatchId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdNotEqualTo(Integer value) {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID <>", value, "multiChannelOrderBatchId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdGreaterThan(Integer value) {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID >", value, "multiChannelOrderBatchId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID >=", value, "multiChannelOrderBatchId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdLessThan(Integer value) {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID <", value, "multiChannelOrderBatchId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdLessThanOrEqualTo(Integer value) {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID <=", value, "multiChannelOrderBatchId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdIn(List<Integer> values) {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID in", values, "multiChannelOrderBatchId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdNotIn(List<Integer> values) {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID not in", values, "multiChannelOrderBatchId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdBetween(Integer value1, Integer value2) {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID between", value1, value2, "multiChannelOrderBatchId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderBatchIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MULTI_CHANNEL_ORDER_BATCH_ID not between", value1, value2, "multiChannelOrderBatchId");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoIsNull() {
            addCriterion("GOODS_BATCH_NO is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoIsNotNull() {
            addCriterion("GOODS_BATCH_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoEqualTo(String value) {
            addCriterion("GOODS_BATCH_NO =", value, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoNotEqualTo(String value) {
            addCriterion("GOODS_BATCH_NO <>", value, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoGreaterThan(String value) {
            addCriterion("GOODS_BATCH_NO >", value, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_BATCH_NO >=", value, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoLessThan(String value) {
            addCriterion("GOODS_BATCH_NO <", value, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoLessThanOrEqualTo(String value) {
            addCriterion("GOODS_BATCH_NO <=", value, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoLike(String value) {
            addCriterion("GOODS_BATCH_NO like", value, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoNotLike(String value) {
            addCriterion("GOODS_BATCH_NO not like", value, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoIn(List<String> values) {
            addCriterion("GOODS_BATCH_NO in", values, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoNotIn(List<String> values) {
            addCriterion("GOODS_BATCH_NO not in", values, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoBetween(String value1, String value2) {
            addCriterion("GOODS_BATCH_NO between", value1, value2, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoNotBetween(String value1, String value2) {
            addCriterion("GOODS_BATCH_NO not between", value1, value2, "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdIsNull() {
            addCriterion("MULTI_CHANNEL_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdIsNotNull() {
            addCriterion("MULTI_CHANNEL_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdEqualTo(String value) {
            addCriterion("MULTI_CHANNEL_ORDER_ID =", value, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdNotEqualTo(String value) {
            addCriterion("MULTI_CHANNEL_ORDER_ID <>", value, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdGreaterThan(String value) {
            addCriterion("MULTI_CHANNEL_ORDER_ID >", value, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("MULTI_CHANNEL_ORDER_ID >=", value, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdLessThan(String value) {
            addCriterion("MULTI_CHANNEL_ORDER_ID <", value, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdLessThanOrEqualTo(String value) {
            addCriterion("MULTI_CHANNEL_ORDER_ID <=", value, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdLike(String value) {
            addCriterion("MULTI_CHANNEL_ORDER_ID like", value, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdNotLike(String value) {
            addCriterion("MULTI_CHANNEL_ORDER_ID not like", value, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdIn(List<String> values) {
            addCriterion("MULTI_CHANNEL_ORDER_ID in", values, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdNotIn(List<String> values) {
            addCriterion("MULTI_CHANNEL_ORDER_ID not in", values, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdBetween(String value1, String value2) {
            addCriterion("MULTI_CHANNEL_ORDER_ID between", value1, value2, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdNotBetween(String value1, String value2) {
            addCriterion("MULTI_CHANNEL_ORDER_ID not between", value1, value2, "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andIsUploadIsNull() {
            addCriterion("IS_UPLOAD is null");
            return (Criteria) this;
        }

        public Criteria andIsUploadIsNotNull() {
            addCriterion("IS_UPLOAD is not null");
            return (Criteria) this;
        }

        public Criteria andIsUploadEqualTo(String value) {
            addCriterion("IS_UPLOAD =", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadNotEqualTo(String value) {
            addCriterion("IS_UPLOAD <>", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadGreaterThan(String value) {
            addCriterion("IS_UPLOAD >", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadGreaterThanOrEqualTo(String value) {
            addCriterion("IS_UPLOAD >=", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadLessThan(String value) {
            addCriterion("IS_UPLOAD <", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadLessThanOrEqualTo(String value) {
            addCriterion("IS_UPLOAD <=", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadLike(String value) {
            addCriterion("IS_UPLOAD like", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadNotLike(String value) {
            addCriterion("IS_UPLOAD not like", value, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadIn(List<String> values) {
            addCriterion("IS_UPLOAD in", values, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadNotIn(List<String> values) {
            addCriterion("IS_UPLOAD not in", values, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadBetween(String value1, String value2) {
            addCriterion("IS_UPLOAD between", value1, value2, "isUpload");
            return (Criteria) this;
        }

        public Criteria andIsUploadNotBetween(String value1, String value2) {
            addCriterion("IS_UPLOAD not between", value1, value2, "isUpload");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNull() {
            addCriterion("UPLOAD_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIsNotNull() {
            addCriterion("UPLOAD_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdEqualTo(Integer value) {
            addCriterion("UPLOAD_USER_ID =", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotEqualTo(Integer value) {
            addCriterion("UPLOAD_USER_ID <>", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThan(Integer value) {
            addCriterion("UPLOAD_USER_ID >", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("UPLOAD_USER_ID >=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThan(Integer value) {
            addCriterion("UPLOAD_USER_ID <", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("UPLOAD_USER_ID <=", value, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdIn(List<Integer> values) {
            addCriterion("UPLOAD_USER_ID in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotIn(List<Integer> values) {
            addCriterion("UPLOAD_USER_ID not in", values, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdBetween(Integer value1, Integer value2) {
            addCriterion("UPLOAD_USER_ID between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("UPLOAD_USER_ID not between", value1, value2, "uploadUserId");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNull() {
            addCriterion("UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIsNotNull() {
            addCriterion("UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUploadTimeEqualTo(String value) {
            addCriterion("UPLOAD_TIME =", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotEqualTo(String value) {
            addCriterion("UPLOAD_TIME <>", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThan(String value) {
            addCriterion("UPLOAD_TIME >", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPLOAD_TIME >=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThan(String value) {
            addCriterion("UPLOAD_TIME <", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLessThanOrEqualTo(String value) {
            addCriterion("UPLOAD_TIME <=", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLike(String value) {
            addCriterion("UPLOAD_TIME like", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotLike(String value) {
            addCriterion("UPLOAD_TIME not like", value, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeIn(List<String> values) {
            addCriterion("UPLOAD_TIME in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotIn(List<String> values) {
            addCriterion("UPLOAD_TIME not in", values, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeBetween(String value1, String value2) {
            addCriterion("UPLOAD_TIME between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andUploadTimeNotBetween(String value1, String value2) {
            addCriterion("UPLOAD_TIME not between", value1, value2, "uploadTime");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNull() {
            addCriterion("IS_PAID is null");
            return (Criteria) this;
        }

        public Criteria andIsPaidIsNotNull() {
            addCriterion("IS_PAID is not null");
            return (Criteria) this;
        }

        public Criteria andIsPaidEqualTo(String value) {
            addCriterion("IS_PAID =", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotEqualTo(String value) {
            addCriterion("IS_PAID <>", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThan(String value) {
            addCriterion("IS_PAID >", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PAID >=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThan(String value) {
            addCriterion("IS_PAID <", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLessThanOrEqualTo(String value) {
            addCriterion("IS_PAID <=", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidLike(String value) {
            addCriterion("IS_PAID like", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotLike(String value) {
            addCriterion("IS_PAID not like", value, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidIn(List<String> values) {
            addCriterion("IS_PAID in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotIn(List<String> values) {
            addCriterion("IS_PAID not in", values, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidBetween(String value1, String value2) {
            addCriterion("IS_PAID between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andIsPaidNotBetween(String value1, String value2) {
            addCriterion("IS_PAID not between", value1, value2, "isPaid");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIsNull() {
            addCriterion("PAYMENT_MODE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIsNotNull() {
            addCriterion("PAYMENT_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentModeEqualTo(String value) {
            addCriterion("PAYMENT_MODE =", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotEqualTo(String value) {
            addCriterion("PAYMENT_MODE <>", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeGreaterThan(String value) {
            addCriterion("PAYMENT_MODE >", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_MODE >=", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLessThan(String value) {
            addCriterion("PAYMENT_MODE <", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_MODE <=", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLike(String value) {
            addCriterion("PAYMENT_MODE like", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotLike(String value) {
            addCriterion("PAYMENT_MODE not like", value, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeIn(List<String> values) {
            addCriterion("PAYMENT_MODE in", values, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotIn(List<String> values) {
            addCriterion("PAYMENT_MODE not in", values, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeBetween(String value1, String value2) {
            addCriterion("PAYMENT_MODE between", value1, value2, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentModeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_MODE not between", value1, value2, "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNull() {
            addCriterion("PAYMENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIsNotNull() {
            addCriterion("PAYMENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentNoEqualTo(String value) {
            addCriterion("PAYMENT_NO =", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotEqualTo(String value) {
            addCriterion("PAYMENT_NO <>", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThan(String value) {
            addCriterion("PAYMENT_NO >", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_NO >=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThan(String value) {
            addCriterion("PAYMENT_NO <", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_NO <=", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLike(String value) {
            addCriterion("PAYMENT_NO like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotLike(String value) {
            addCriterion("PAYMENT_NO not like", value, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoIn(List<String> values) {
            addCriterion("PAYMENT_NO in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotIn(List<String> values) {
            addCriterion("PAYMENT_NO not in", values, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoBetween(String value1, String value2) {
            addCriterion("PAYMENT_NO between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaymentNoNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_NO not between", value1, value2, "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNull() {
            addCriterion("PAID_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNotNull() {
            addCriterion("PAID_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeEqualTo(String value) {
            addCriterion("PAID_TIME =", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotEqualTo(String value) {
            addCriterion("PAID_TIME <>", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThan(String value) {
            addCriterion("PAID_TIME >", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PAID_TIME >=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThan(String value) {
            addCriterion("PAID_TIME <", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThanOrEqualTo(String value) {
            addCriterion("PAID_TIME <=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLike(String value) {
            addCriterion("PAID_TIME like", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotLike(String value) {
            addCriterion("PAID_TIME not like", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIn(List<String> values) {
            addCriterion("PAID_TIME in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotIn(List<String> values) {
            addCriterion("PAID_TIME not in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeBetween(String value1, String value2) {
            addCriterion("PAID_TIME between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotBetween(String value1, String value2) {
            addCriterion("PAID_TIME not between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdIsNull() {
            addCriterion("OFFLINE_PAID_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdIsNotNull() {
            addCriterion("OFFLINE_PAID_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdEqualTo(Integer value) {
            addCriterion("OFFLINE_PAID_USER_ID =", value, "offlinePaidUserId");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdNotEqualTo(Integer value) {
            addCriterion("OFFLINE_PAID_USER_ID <>", value, "offlinePaidUserId");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdGreaterThan(Integer value) {
            addCriterion("OFFLINE_PAID_USER_ID >", value, "offlinePaidUserId");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("OFFLINE_PAID_USER_ID >=", value, "offlinePaidUserId");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdLessThan(Integer value) {
            addCriterion("OFFLINE_PAID_USER_ID <", value, "offlinePaidUserId");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("OFFLINE_PAID_USER_ID <=", value, "offlinePaidUserId");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdIn(List<Integer> values) {
            addCriterion("OFFLINE_PAID_USER_ID in", values, "offlinePaidUserId");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdNotIn(List<Integer> values) {
            addCriterion("OFFLINE_PAID_USER_ID not in", values, "offlinePaidUserId");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdBetween(Integer value1, Integer value2) {
            addCriterion("OFFLINE_PAID_USER_ID between", value1, value2, "offlinePaidUserId");
            return (Criteria) this;
        }

        public Criteria andOfflinePaidUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("OFFLINE_PAID_USER_ID not between", value1, value2, "offlinePaidUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdIsNull() {
            addCriterion("LOGISTIC_COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdIsNotNull() {
            addCriterion("LOGISTIC_COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdEqualTo(Integer value) {
            addCriterion("LOGISTIC_COMPANY_ID =", value, "logisticCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdNotEqualTo(Integer value) {
            addCriterion("LOGISTIC_COMPANY_ID <>", value, "logisticCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdGreaterThan(Integer value) {
            addCriterion("LOGISTIC_COMPANY_ID >", value, "logisticCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGISTIC_COMPANY_ID >=", value, "logisticCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdLessThan(Integer value) {
            addCriterion("LOGISTIC_COMPANY_ID <", value, "logisticCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("LOGISTIC_COMPANY_ID <=", value, "logisticCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdIn(List<Integer> values) {
            addCriterion("LOGISTIC_COMPANY_ID in", values, "logisticCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdNotIn(List<Integer> values) {
            addCriterion("LOGISTIC_COMPANY_ID not in", values, "logisticCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("LOGISTIC_COMPANY_ID between", value1, value2, "logisticCompanyId");
            return (Criteria) this;
        }

        public Criteria andLogisticCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LOGISTIC_COMPANY_ID not between", value1, value2, "logisticCompanyId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("MEMBER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("MEMBER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("MEMBER_ID =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("MEMBER_ID <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("MEMBER_ID >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_ID >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("MEMBER_ID <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("MEMBER_ID <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("MEMBER_ID in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("MEMBER_ID not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_ID between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MEMBER_ID not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIsNull() {
            addCriterion("PAYMENT_TYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIsNotNull() {
            addCriterion("PAYMENT_TYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdEqualTo(Integer value) {
            addCriterion("PAYMENT_TYPE_ID =", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotEqualTo(Integer value) {
            addCriterion("PAYMENT_TYPE_ID <>", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdGreaterThan(Integer value) {
            addCriterion("PAYMENT_TYPE_ID >", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_TYPE_ID >=", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLessThan(Integer value) {
            addCriterion("PAYMENT_TYPE_ID <", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("PAYMENT_TYPE_ID <=", value, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdIn(List<Integer> values) {
            addCriterion("PAYMENT_TYPE_ID in", values, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotIn(List<Integer> values) {
            addCriterion("PAYMENT_TYPE_ID not in", values, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_TYPE_ID between", value1, value2, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PAYMENT_TYPE_ID not between", value1, value2, "paymentTypeId");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNull() {
            addCriterion("ORDER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderStateIsNotNull() {
            addCriterion("ORDER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStateEqualTo(Integer value) {
            addCriterion("ORDER_STATE =", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotEqualTo(Integer value) {
            addCriterion("ORDER_STATE <>", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThan(Integer value) {
            addCriterion("ORDER_STATE >", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_STATE >=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThan(Integer value) {
            addCriterion("ORDER_STATE <", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_STATE <=", value, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateIn(List<Integer> values) {
            addCriterion("ORDER_STATE in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotIn(List<Integer> values) {
            addCriterion("ORDER_STATE not in", values, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_STATE between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_STATE not between", value1, value2, "orderState");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateIsNull() {
            addCriterion("ORDER_OUT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateIsNotNull() {
            addCriterion("ORDER_OUT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateEqualTo(Integer value) {
            addCriterion("ORDER_OUT_STATE =", value, "orderOutState");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateNotEqualTo(Integer value) {
            addCriterion("ORDER_OUT_STATE <>", value, "orderOutState");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateGreaterThan(Integer value) {
            addCriterion("ORDER_OUT_STATE >", value, "orderOutState");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_OUT_STATE >=", value, "orderOutState");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateLessThan(Integer value) {
            addCriterion("ORDER_OUT_STATE <", value, "orderOutState");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_OUT_STATE <=", value, "orderOutState");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateIn(List<Integer> values) {
            addCriterion("ORDER_OUT_STATE in", values, "orderOutState");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateNotIn(List<Integer> values) {
            addCriterion("ORDER_OUT_STATE not in", values, "orderOutState");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_OUT_STATE between", value1, value2, "orderOutState");
            return (Criteria) this;
        }

        public Criteria andOrderOutStateNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_OUT_STATE not between", value1, value2, "orderOutState");
            return (Criteria) this;
        }

        public Criteria andLimitDateIsNull() {
            addCriterion("LIMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andLimitDateIsNotNull() {
            addCriterion("LIMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andLimitDateEqualTo(String value) {
            addCriterion("LIMIT_DATE =", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotEqualTo(String value) {
            addCriterion("LIMIT_DATE <>", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThan(String value) {
            addCriterion("LIMIT_DATE >", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThanOrEqualTo(String value) {
            addCriterion("LIMIT_DATE >=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThan(String value) {
            addCriterion("LIMIT_DATE <", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThanOrEqualTo(String value) {
            addCriterion("LIMIT_DATE <=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLike(String value) {
            addCriterion("LIMIT_DATE like", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotLike(String value) {
            addCriterion("LIMIT_DATE not like", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateIn(List<String> values) {
            addCriterion("LIMIT_DATE in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotIn(List<String> values) {
            addCriterion("LIMIT_DATE not in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateBetween(String value1, String value2) {
            addCriterion("LIMIT_DATE between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotBetween(String value1, String value2) {
            addCriterion("LIMIT_DATE not between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andSkuFeeIsNull() {
            addCriterion("SKU_FEE is null");
            return (Criteria) this;
        }

        public Criteria andSkuFeeIsNotNull() {
            addCriterion("SKU_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andSkuFeeEqualTo(BigDecimal value) {
            addCriterion("SKU_FEE =", value, "skuFee");
            return (Criteria) this;
        }

        public Criteria andSkuFeeNotEqualTo(BigDecimal value) {
            addCriterion("SKU_FEE <>", value, "skuFee");
            return (Criteria) this;
        }

        public Criteria andSkuFeeGreaterThan(BigDecimal value) {
            addCriterion("SKU_FEE >", value, "skuFee");
            return (Criteria) this;
        }

        public Criteria andSkuFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SKU_FEE >=", value, "skuFee");
            return (Criteria) this;
        }

        public Criteria andSkuFeeLessThan(BigDecimal value) {
            addCriterion("SKU_FEE <", value, "skuFee");
            return (Criteria) this;
        }

        public Criteria andSkuFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SKU_FEE <=", value, "skuFee");
            return (Criteria) this;
        }

        public Criteria andSkuFeeIn(List<BigDecimal> values) {
            addCriterion("SKU_FEE in", values, "skuFee");
            return (Criteria) this;
        }

        public Criteria andSkuFeeNotIn(List<BigDecimal> values) {
            addCriterion("SKU_FEE not in", values, "skuFee");
            return (Criteria) this;
        }

        public Criteria andSkuFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKU_FEE between", value1, value2, "skuFee");
            return (Criteria) this;
        }

        public Criteria andSkuFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKU_FEE not between", value1, value2, "skuFee");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsIsNull() {
            addCriterion("OTHER_DISCOUNTS is null");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsIsNotNull() {
            addCriterion("OTHER_DISCOUNTS is not null");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsEqualTo(BigDecimal value) {
            addCriterion("OTHER_DISCOUNTS =", value, "otherDiscounts");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsNotEqualTo(BigDecimal value) {
            addCriterion("OTHER_DISCOUNTS <>", value, "otherDiscounts");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsGreaterThan(BigDecimal value) {
            addCriterion("OTHER_DISCOUNTS >", value, "otherDiscounts");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_DISCOUNTS >=", value, "otherDiscounts");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsLessThan(BigDecimal value) {
            addCriterion("OTHER_DISCOUNTS <", value, "otherDiscounts");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTHER_DISCOUNTS <=", value, "otherDiscounts");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsIn(List<BigDecimal> values) {
            addCriterion("OTHER_DISCOUNTS in", values, "otherDiscounts");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsNotIn(List<BigDecimal> values) {
            addCriterion("OTHER_DISCOUNTS not in", values, "otherDiscounts");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_DISCOUNTS between", value1, value2, "otherDiscounts");
            return (Criteria) this;
        }

        public Criteria andOtherDiscountsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTHER_DISCOUNTS not between", value1, value2, "otherDiscounts");
            return (Criteria) this;
        }

        public Criteria andOrderPointsIsNull() {
            addCriterion("ORDER_POINTS is null");
            return (Criteria) this;
        }

        public Criteria andOrderPointsIsNotNull() {
            addCriterion("ORDER_POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPointsEqualTo(Integer value) {
            addCriterion("ORDER_POINTS =", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsNotEqualTo(Integer value) {
            addCriterion("ORDER_POINTS <>", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGreaterThan(Integer value) {
            addCriterion("ORDER_POINTS >", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_POINTS >=", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsLessThan(Integer value) {
            addCriterion("ORDER_POINTS <", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_POINTS <=", value, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsIn(List<Integer> values) {
            addCriterion("ORDER_POINTS in", values, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsNotIn(List<Integer> values) {
            addCriterion("ORDER_POINTS not in", values, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_POINTS between", value1, value2, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andOrderPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_POINTS not between", value1, value2, "orderPoints");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeIsNull() {
            addCriterion("DELIVERY_FEE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeIsNotNull() {
            addCriterion("DELIVERY_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeEqualTo(BigDecimal value) {
            addCriterion("DELIVERY_FEE =", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeNotEqualTo(BigDecimal value) {
            addCriterion("DELIVERY_FEE <>", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeGreaterThan(BigDecimal value) {
            addCriterion("DELIVERY_FEE >", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERY_FEE >=", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeLessThan(BigDecimal value) {
            addCriterion("DELIVERY_FEE <", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DELIVERY_FEE <=", value, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeIn(List<BigDecimal> values) {
            addCriterion("DELIVERY_FEE in", values, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeNotIn(List<BigDecimal> values) {
            addCriterion("DELIVERY_FEE not in", values, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERY_FEE between", value1, value2, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDeliveryFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DELIVERY_FEE not between", value1, value2, "deliveryFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNull() {
            addCriterion("DISCOUNT_FEE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIsNotNull() {
            addCriterion("DISCOUNT_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_FEE =", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_FEE <>", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT_FEE >", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_FEE >=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThan(BigDecimal value) {
            addCriterion("DISCOUNT_FEE <", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT_FEE <=", value, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_FEE in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT_FEE not in", values, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_FEE between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andDiscountFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT_FEE not between", value1, value2, "discountFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeIsNull() {
            addCriterion("ORDER_FEE is null");
            return (Criteria) this;
        }

        public Criteria andOrderFeeIsNotNull() {
            addCriterion("ORDER_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderFeeEqualTo(BigDecimal value) {
            addCriterion("ORDER_FEE =", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_FEE <>", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeGreaterThan(BigDecimal value) {
            addCriterion("ORDER_FEE >", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_FEE >=", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeLessThan(BigDecimal value) {
            addCriterion("ORDER_FEE <", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_FEE <=", value, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeIn(List<BigDecimal> values) {
            addCriterion("ORDER_FEE in", values, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_FEE not in", values, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_FEE between", value1, value2, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_FEE not between", value1, value2, "orderFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeIsNull() {
            addCriterion("ORDER_PAY_FEE is null");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeIsNotNull() {
            addCriterion("ORDER_PAY_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeEqualTo(BigDecimal value) {
            addCriterion("ORDER_PAY_FEE =", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeNotEqualTo(BigDecimal value) {
            addCriterion("ORDER_PAY_FEE <>", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeGreaterThan(BigDecimal value) {
            addCriterion("ORDER_PAY_FEE >", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_PAY_FEE >=", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeLessThan(BigDecimal value) {
            addCriterion("ORDER_PAY_FEE <", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDER_PAY_FEE <=", value, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeIn(List<BigDecimal> values) {
            addCriterion("ORDER_PAY_FEE in", values, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeNotIn(List<BigDecimal> values) {
            addCriterion("ORDER_PAY_FEE not in", values, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_PAY_FEE between", value1, value2, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderPayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDER_PAY_FEE not between", value1, value2, "orderPayFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeIsNull() {
            addCriterion("PAID_FEE is null");
            return (Criteria) this;
        }

        public Criteria andPaidFeeIsNotNull() {
            addCriterion("PAID_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andPaidFeeEqualTo(BigDecimal value) {
            addCriterion("PAID_FEE =", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeNotEqualTo(BigDecimal value) {
            addCriterion("PAID_FEE <>", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeGreaterThan(BigDecimal value) {
            addCriterion("PAID_FEE >", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PAID_FEE >=", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeLessThan(BigDecimal value) {
            addCriterion("PAID_FEE <", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PAID_FEE <=", value, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeIn(List<BigDecimal> values) {
            addCriterion("PAID_FEE in", values, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeNotIn(List<BigDecimal> values) {
            addCriterion("PAID_FEE not in", values, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAID_FEE between", value1, value2, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPaidFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PAID_FEE not between", value1, value2, "paidFee");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsIsNull() {
            addCriterion("PROMOTE_RULE_IDS is null");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsIsNotNull() {
            addCriterion("PROMOTE_RULE_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsEqualTo(String value) {
            addCriterion("PROMOTE_RULE_IDS =", value, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsNotEqualTo(String value) {
            addCriterion("PROMOTE_RULE_IDS <>", value, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsGreaterThan(String value) {
            addCriterion("PROMOTE_RULE_IDS >", value, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsGreaterThanOrEqualTo(String value) {
            addCriterion("PROMOTE_RULE_IDS >=", value, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsLessThan(String value) {
            addCriterion("PROMOTE_RULE_IDS <", value, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsLessThanOrEqualTo(String value) {
            addCriterion("PROMOTE_RULE_IDS <=", value, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsLike(String value) {
            addCriterion("PROMOTE_RULE_IDS like", value, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsNotLike(String value) {
            addCriterion("PROMOTE_RULE_IDS not like", value, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsIn(List<String> values) {
            addCriterion("PROMOTE_RULE_IDS in", values, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsNotIn(List<String> values) {
            addCriterion("PROMOTE_RULE_IDS not in", values, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsBetween(String value1, String value2) {
            addCriterion("PROMOTE_RULE_IDS between", value1, value2, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsNotBetween(String value1, String value2) {
            addCriterion("PROMOTE_RULE_IDS not between", value1, value2, "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsIsNull() {
            addCriterion("PRODUCT_COMBINATION_IDS is null");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsIsNotNull() {
            addCriterion("PRODUCT_COMBINATION_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsEqualTo(String value) {
            addCriterion("PRODUCT_COMBINATION_IDS =", value, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsNotEqualTo(String value) {
            addCriterion("PRODUCT_COMBINATION_IDS <>", value, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsGreaterThan(String value) {
            addCriterion("PRODUCT_COMBINATION_IDS >", value, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_COMBINATION_IDS >=", value, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsLessThan(String value) {
            addCriterion("PRODUCT_COMBINATION_IDS <", value, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_COMBINATION_IDS <=", value, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsLike(String value) {
            addCriterion("PRODUCT_COMBINATION_IDS like", value, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsNotLike(String value) {
            addCriterion("PRODUCT_COMBINATION_IDS not like", value, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsIn(List<String> values) {
            addCriterion("PRODUCT_COMBINATION_IDS in", values, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsNotIn(List<String> values) {
            addCriterion("PRODUCT_COMBINATION_IDS not in", values, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsBetween(String value1, String value2) {
            addCriterion("PRODUCT_COMBINATION_IDS between", value1, value2, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_COMBINATION_IDS not between", value1, value2, "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNull() {
            addCriterion("RETURN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIsNotNull() {
            addCriterion("RETURN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTypeEqualTo(String value) {
            addCriterion("RETURN_TYPE =", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotEqualTo(String value) {
            addCriterion("RETURN_TYPE <>", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThan(String value) {
            addCriterion("RETURN_TYPE >", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_TYPE >=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThan(String value) {
            addCriterion("RETURN_TYPE <", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLessThanOrEqualTo(String value) {
            addCriterion("RETURN_TYPE <=", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLike(String value) {
            addCriterion("RETURN_TYPE like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotLike(String value) {
            addCriterion("RETURN_TYPE not like", value, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeIn(List<String> values) {
            addCriterion("RETURN_TYPE in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotIn(List<String> values) {
            addCriterion("RETURN_TYPE not in", values, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeBetween(String value1, String value2) {
            addCriterion("RETURN_TYPE between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnTypeNotBetween(String value1, String value2) {
            addCriterion("RETURN_TYPE not between", value1, value2, "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnValueIsNull() {
            addCriterion("RETURN_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andReturnValueIsNotNull() {
            addCriterion("RETURN_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnValueEqualTo(String value) {
            addCriterion("RETURN_VALUE =", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueNotEqualTo(String value) {
            addCriterion("RETURN_VALUE <>", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueGreaterThan(String value) {
            addCriterion("RETURN_VALUE >", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueGreaterThanOrEqualTo(String value) {
            addCriterion("RETURN_VALUE >=", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueLessThan(String value) {
            addCriterion("RETURN_VALUE <", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueLessThanOrEqualTo(String value) {
            addCriterion("RETURN_VALUE <=", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueLike(String value) {
            addCriterion("RETURN_VALUE like", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueNotLike(String value) {
            addCriterion("RETURN_VALUE not like", value, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueIn(List<String> values) {
            addCriterion("RETURN_VALUE in", values, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueNotIn(List<String> values) {
            addCriterion("RETURN_VALUE not in", values, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueBetween(String value1, String value2) {
            addCriterion("RETURN_VALUE between", value1, value2, "returnValue");
            return (Criteria) this;
        }

        public Criteria andReturnValueNotBetween(String value1, String value2) {
            addCriterion("RETURN_VALUE not between", value1, value2, "returnValue");
            return (Criteria) this;
        }

        public Criteria andOrderMsgIsNull() {
            addCriterion("ORDER_MSG is null");
            return (Criteria) this;
        }

        public Criteria andOrderMsgIsNotNull() {
            addCriterion("ORDER_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMsgEqualTo(String value) {
            addCriterion("ORDER_MSG =", value, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderMsgNotEqualTo(String value) {
            addCriterion("ORDER_MSG <>", value, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderMsgGreaterThan(String value) {
            addCriterion("ORDER_MSG >", value, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderMsgGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_MSG >=", value, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderMsgLessThan(String value) {
            addCriterion("ORDER_MSG <", value, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderMsgLessThanOrEqualTo(String value) {
            addCriterion("ORDER_MSG <=", value, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderMsgLike(String value) {
            addCriterion("ORDER_MSG like", value, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderMsgNotLike(String value) {
            addCriterion("ORDER_MSG not like", value, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderMsgIn(List<String> values) {
            addCriterion("ORDER_MSG in", values, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderMsgNotIn(List<String> values) {
            addCriterion("ORDER_MSG not in", values, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderMsgBetween(String value1, String value2) {
            addCriterion("ORDER_MSG between", value1, value2, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderMsgNotBetween(String value1, String value2) {
            addCriterion("ORDER_MSG not between", value1, value2, "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderNotesIsNull() {
            addCriterion("ORDER_NOTES is null");
            return (Criteria) this;
        }

        public Criteria andOrderNotesIsNotNull() {
            addCriterion("ORDER_NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andOrderNotesEqualTo(String value) {
            addCriterion("ORDER_NOTES =", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesNotEqualTo(String value) {
            addCriterion("ORDER_NOTES <>", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesGreaterThan(String value) {
            addCriterion("ORDER_NOTES >", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_NOTES >=", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesLessThan(String value) {
            addCriterion("ORDER_NOTES <", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesLessThanOrEqualTo(String value) {
            addCriterion("ORDER_NOTES <=", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesLike(String value) {
            addCriterion("ORDER_NOTES like", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesNotLike(String value) {
            addCriterion("ORDER_NOTES not like", value, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesIn(List<String> values) {
            addCriterion("ORDER_NOTES in", values, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesNotIn(List<String> values) {
            addCriterion("ORDER_NOTES not in", values, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesBetween(String value1, String value2) {
            addCriterion("ORDER_NOTES between", value1, value2, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andOrderNotesNotBetween(String value1, String value2) {
            addCriterion("ORDER_NOTES not between", value1, value2, "orderNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesIsNull() {
            addCriterion("AUDIT_NOTES is null");
            return (Criteria) this;
        }

        public Criteria andAuditNotesIsNotNull() {
            addCriterion("AUDIT_NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andAuditNotesEqualTo(String value) {
            addCriterion("AUDIT_NOTES =", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesNotEqualTo(String value) {
            addCriterion("AUDIT_NOTES <>", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesGreaterThan(String value) {
            addCriterion("AUDIT_NOTES >", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_NOTES >=", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesLessThan(String value) {
            addCriterion("AUDIT_NOTES <", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_NOTES <=", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesLike(String value) {
            addCriterion("AUDIT_NOTES like", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesNotLike(String value) {
            addCriterion("AUDIT_NOTES not like", value, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesIn(List<String> values) {
            addCriterion("AUDIT_NOTES in", values, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesNotIn(List<String> values) {
            addCriterion("AUDIT_NOTES not in", values, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesBetween(String value1, String value2) {
            addCriterion("AUDIT_NOTES between", value1, value2, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesNotBetween(String value1, String value2) {
            addCriterion("AUDIT_NOTES not between", value1, value2, "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNull() {
            addCriterion("AUDIT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIsNotNull() {
            addCriterion("AUDIT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdEqualTo(Integer value) {
            addCriterion("AUDIT_USER_ID =", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotEqualTo(Integer value) {
            addCriterion("AUDIT_USER_ID <>", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThan(Integer value) {
            addCriterion("AUDIT_USER_ID >", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_USER_ID >=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThan(Integer value) {
            addCriterion("AUDIT_USER_ID <", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("AUDIT_USER_ID <=", value, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdIn(List<Integer> values) {
            addCriterion("AUDIT_USER_ID in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotIn(List<Integer> values) {
            addCriterion("AUDIT_USER_ID not in", values, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_USER_ID between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AUDIT_USER_ID not between", value1, value2, "auditUserId");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("AUDIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("AUDIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(String value) {
            addCriterion("AUDIT_TIME =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(String value) {
            addCriterion("AUDIT_TIME <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(String value) {
            addCriterion("AUDIT_TIME >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(String value) {
            addCriterion("AUDIT_TIME >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(String value) {
            addCriterion("AUDIT_TIME <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(String value) {
            addCriterion("AUDIT_TIME <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLike(String value) {
            addCriterion("AUDIT_TIME like", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotLike(String value) {
            addCriterion("AUDIT_TIME not like", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<String> values) {
            addCriterion("AUDIT_TIME in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<String> values) {
            addCriterion("AUDIT_TIME not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(String value1, String value2) {
            addCriterion("AUDIT_TIME between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(String value1, String value2) {
            addCriterion("AUDIT_TIME not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNull() {
            addCriterion("IS_LOCK is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("IS_LOCK is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(String value) {
            addCriterion("IS_LOCK =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(String value) {
            addCriterion("IS_LOCK <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(String value) {
            addCriterion("IS_LOCK >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(String value) {
            addCriterion("IS_LOCK >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(String value) {
            addCriterion("IS_LOCK <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(String value) {
            addCriterion("IS_LOCK <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLike(String value) {
            addCriterion("IS_LOCK like", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotLike(String value) {
            addCriterion("IS_LOCK not like", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<String> values) {
            addCriterion("IS_LOCK in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<String> values) {
            addCriterion("IS_LOCK not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(String value1, String value2) {
            addCriterion("IS_LOCK between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(String value1, String value2) {
            addCriterion("IS_LOCK not between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNull() {
            addCriterion("LOCK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLockTimeIsNotNull() {
            addCriterion("LOCK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLockTimeEqualTo(String value) {
            addCriterion("LOCK_TIME =", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotEqualTo(String value) {
            addCriterion("LOCK_TIME <>", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThan(String value) {
            addCriterion("LOCK_TIME >", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LOCK_TIME >=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThan(String value) {
            addCriterion("LOCK_TIME <", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLessThanOrEqualTo(String value) {
            addCriterion("LOCK_TIME <=", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeLike(String value) {
            addCriterion("LOCK_TIME like", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotLike(String value) {
            addCriterion("LOCK_TIME not like", value, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeIn(List<String> values) {
            addCriterion("LOCK_TIME in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotIn(List<String> values) {
            addCriterion("LOCK_TIME not in", values, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeBetween(String value1, String value2) {
            addCriterion("LOCK_TIME between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockTimeNotBetween(String value1, String value2) {
            addCriterion("LOCK_TIME not between", value1, value2, "lockTime");
            return (Criteria) this;
        }

        public Criteria andLockUserIdIsNull() {
            addCriterion("LOCK_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLockUserIdIsNotNull() {
            addCriterion("LOCK_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLockUserIdEqualTo(Integer value) {
            addCriterion("LOCK_USER_ID =", value, "lockUserId");
            return (Criteria) this;
        }

        public Criteria andLockUserIdNotEqualTo(Integer value) {
            addCriterion("LOCK_USER_ID <>", value, "lockUserId");
            return (Criteria) this;
        }

        public Criteria andLockUserIdGreaterThan(Integer value) {
            addCriterion("LOCK_USER_ID >", value, "lockUserId");
            return (Criteria) this;
        }

        public Criteria andLockUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOCK_USER_ID >=", value, "lockUserId");
            return (Criteria) this;
        }

        public Criteria andLockUserIdLessThan(Integer value) {
            addCriterion("LOCK_USER_ID <", value, "lockUserId");
            return (Criteria) this;
        }

        public Criteria andLockUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("LOCK_USER_ID <=", value, "lockUserId");
            return (Criteria) this;
        }

        public Criteria andLockUserIdIn(List<Integer> values) {
            addCriterion("LOCK_USER_ID in", values, "lockUserId");
            return (Criteria) this;
        }

        public Criteria andLockUserIdNotIn(List<Integer> values) {
            addCriterion("LOCK_USER_ID not in", values, "lockUserId");
            return (Criteria) this;
        }

        public Criteria andLockUserIdBetween(Integer value1, Integer value2) {
            addCriterion("LOCK_USER_ID between", value1, value2, "lockUserId");
            return (Criteria) this;
        }

        public Criteria andLockUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LOCK_USER_ID not between", value1, value2, "lockUserId");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNull() {
            addCriterion("COMMIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIsNotNull() {
            addCriterion("COMMIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCommitTimeEqualTo(String value) {
            addCriterion("COMMIT_TIME =", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotEqualTo(String value) {
            addCriterion("COMMIT_TIME <>", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThan(String value) {
            addCriterion("COMMIT_TIME >", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("COMMIT_TIME >=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThan(String value) {
            addCriterion("COMMIT_TIME <", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLessThanOrEqualTo(String value) {
            addCriterion("COMMIT_TIME <=", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLike(String value) {
            addCriterion("COMMIT_TIME like", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotLike(String value) {
            addCriterion("COMMIT_TIME not like", value, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeIn(List<String> values) {
            addCriterion("COMMIT_TIME in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotIn(List<String> values) {
            addCriterion("COMMIT_TIME not in", values, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeBetween(String value1, String value2) {
            addCriterion("COMMIT_TIME between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeNotBetween(String value1, String value2) {
            addCriterion("COMMIT_TIME not between", value1, value2, "commitTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("FINISH_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("FINISH_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(String value) {
            addCriterion("FINISH_TIME =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(String value) {
            addCriterion("FINISH_TIME <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(String value) {
            addCriterion("FINISH_TIME >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(String value) {
            addCriterion("FINISH_TIME >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(String value) {
            addCriterion("FINISH_TIME <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(String value) {
            addCriterion("FINISH_TIME <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLike(String value) {
            addCriterion("FINISH_TIME like", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotLike(String value) {
            addCriterion("FINISH_TIME not like", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<String> values) {
            addCriterion("FINISH_TIME in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<String> values) {
            addCriterion("FINISH_TIME not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(String value1, String value2) {
            addCriterion("FINISH_TIME between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(String value1, String value2) {
            addCriterion("FINISH_TIME not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("CANCEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("CANCEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(String value) {
            addCriterion("CANCEL_TIME =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(String value) {
            addCriterion("CANCEL_TIME <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(String value) {
            addCriterion("CANCEL_TIME >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_TIME >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(String value) {
            addCriterion("CANCEL_TIME <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_TIME <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLike(String value) {
            addCriterion("CANCEL_TIME like", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotLike(String value) {
            addCriterion("CANCEL_TIME not like", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<String> values) {
            addCriterion("CANCEL_TIME in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<String> values) {
            addCriterion("CANCEL_TIME not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(String value1, String value2) {
            addCriterion("CANCEL_TIME between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(String value1, String value2) {
            addCriterion("CANCEL_TIME not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdIsNull() {
            addCriterion("CANCEL_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdIsNotNull() {
            addCriterion("CANCEL_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdEqualTo(Integer value) {
            addCriterion("CANCEL_USER_ID =", value, "cancelUserId");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdNotEqualTo(Integer value) {
            addCriterion("CANCEL_USER_ID <>", value, "cancelUserId");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdGreaterThan(Integer value) {
            addCriterion("CANCEL_USER_ID >", value, "cancelUserId");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CANCEL_USER_ID >=", value, "cancelUserId");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdLessThan(Integer value) {
            addCriterion("CANCEL_USER_ID <", value, "cancelUserId");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("CANCEL_USER_ID <=", value, "cancelUserId");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdIn(List<Integer> values) {
            addCriterion("CANCEL_USER_ID in", values, "cancelUserId");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdNotIn(List<Integer> values) {
            addCriterion("CANCEL_USER_ID not in", values, "cancelUserId");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdBetween(Integer value1, Integer value2) {
            addCriterion("CANCEL_USER_ID between", value1, value2, "cancelUserId");
            return (Criteria) this;
        }

        public Criteria andCancelUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CANCEL_USER_ID not between", value1, value2, "cancelUserId");
            return (Criteria) this;
        }

        public Criteria andCancelNotesIsNull() {
            addCriterion("CANCEL_NOTES is null");
            return (Criteria) this;
        }

        public Criteria andCancelNotesIsNotNull() {
            addCriterion("CANCEL_NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andCancelNotesEqualTo(String value) {
            addCriterion("CANCEL_NOTES =", value, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andCancelNotesNotEqualTo(String value) {
            addCriterion("CANCEL_NOTES <>", value, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andCancelNotesGreaterThan(String value) {
            addCriterion("CANCEL_NOTES >", value, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andCancelNotesGreaterThanOrEqualTo(String value) {
            addCriterion("CANCEL_NOTES >=", value, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andCancelNotesLessThan(String value) {
            addCriterion("CANCEL_NOTES <", value, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andCancelNotesLessThanOrEqualTo(String value) {
            addCriterion("CANCEL_NOTES <=", value, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andCancelNotesLike(String value) {
            addCriterion("CANCEL_NOTES like", value, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andCancelNotesNotLike(String value) {
            addCriterion("CANCEL_NOTES not like", value, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andCancelNotesIn(List<String> values) {
            addCriterion("CANCEL_NOTES in", values, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andCancelNotesNotIn(List<String> values) {
            addCriterion("CANCEL_NOTES not in", values, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andCancelNotesBetween(String value1, String value2) {
            addCriterion("CANCEL_NOTES between", value1, value2, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andCancelNotesNotBetween(String value1, String value2) {
            addCriterion("CANCEL_NOTES not between", value1, value2, "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsIsNull() {
            addCriterion("IS_CHECK_BILLS is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsIsNotNull() {
            addCriterion("IS_CHECK_BILLS is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsEqualTo(String value) {
            addCriterion("IS_CHECK_BILLS =", value, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsNotEqualTo(String value) {
            addCriterion("IS_CHECK_BILLS <>", value, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsGreaterThan(String value) {
            addCriterion("IS_CHECK_BILLS >", value, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHECK_BILLS >=", value, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsLessThan(String value) {
            addCriterion("IS_CHECK_BILLS <", value, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsLessThanOrEqualTo(String value) {
            addCriterion("IS_CHECK_BILLS <=", value, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsLike(String value) {
            addCriterion("IS_CHECK_BILLS like", value, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsNotLike(String value) {
            addCriterion("IS_CHECK_BILLS not like", value, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsIn(List<String> values) {
            addCriterion("IS_CHECK_BILLS in", values, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsNotIn(List<String> values) {
            addCriterion("IS_CHECK_BILLS not in", values, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsBetween(String value1, String value2) {
            addCriterion("IS_CHECK_BILLS between", value1, value2, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsNotBetween(String value1, String value2) {
            addCriterion("IS_CHECK_BILLS not between", value1, value2, "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdIsNull() {
            addCriterion("CHECK_BILL_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdIsNotNull() {
            addCriterion("CHECK_BILL_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdEqualTo(Integer value) {
            addCriterion("CHECK_BILL_USER_ID =", value, "checkBillUserId");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdNotEqualTo(Integer value) {
            addCriterion("CHECK_BILL_USER_ID <>", value, "checkBillUserId");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdGreaterThan(Integer value) {
            addCriterion("CHECK_BILL_USER_ID >", value, "checkBillUserId");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_BILL_USER_ID >=", value, "checkBillUserId");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdLessThan(Integer value) {
            addCriterion("CHECK_BILL_USER_ID <", value, "checkBillUserId");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_BILL_USER_ID <=", value, "checkBillUserId");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdIn(List<Integer> values) {
            addCriterion("CHECK_BILL_USER_ID in", values, "checkBillUserId");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdNotIn(List<Integer> values) {
            addCriterion("CHECK_BILL_USER_ID not in", values, "checkBillUserId");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_BILL_USER_ID between", value1, value2, "checkBillUserId");
            return (Criteria) this;
        }

        public Criteria andCheckBillUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_BILL_USER_ID not between", value1, value2, "checkBillUserId");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeIsNull() {
            addCriterion("CHECK_BILL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeIsNotNull() {
            addCriterion("CHECK_BILL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeEqualTo(String value) {
            addCriterion("CHECK_BILL_TIME =", value, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeNotEqualTo(String value) {
            addCriterion("CHECK_BILL_TIME <>", value, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeGreaterThan(String value) {
            addCriterion("CHECK_BILL_TIME >", value, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_BILL_TIME >=", value, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeLessThan(String value) {
            addCriterion("CHECK_BILL_TIME <", value, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeLessThanOrEqualTo(String value) {
            addCriterion("CHECK_BILL_TIME <=", value, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeLike(String value) {
            addCriterion("CHECK_BILL_TIME like", value, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeNotLike(String value) {
            addCriterion("CHECK_BILL_TIME not like", value, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeIn(List<String> values) {
            addCriterion("CHECK_BILL_TIME in", values, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeNotIn(List<String> values) {
            addCriterion("CHECK_BILL_TIME not in", values, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeBetween(String value1, String value2) {
            addCriterion("CHECK_BILL_TIME between", value1, value2, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeNotBetween(String value1, String value2) {
            addCriterion("CHECK_BILL_TIME not between", value1, value2, "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsIsNull() {
            addCriterion("SKU_WEIGHTS is null");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsIsNotNull() {
            addCriterion("SKU_WEIGHTS is not null");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsEqualTo(BigDecimal value) {
            addCriterion("SKU_WEIGHTS =", value, "skuWeights");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsNotEqualTo(BigDecimal value) {
            addCriterion("SKU_WEIGHTS <>", value, "skuWeights");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsGreaterThan(BigDecimal value) {
            addCriterion("SKU_WEIGHTS >", value, "skuWeights");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SKU_WEIGHTS >=", value, "skuWeights");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsLessThan(BigDecimal value) {
            addCriterion("SKU_WEIGHTS <", value, "skuWeights");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SKU_WEIGHTS <=", value, "skuWeights");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsIn(List<BigDecimal> values) {
            addCriterion("SKU_WEIGHTS in", values, "skuWeights");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsNotIn(List<BigDecimal> values) {
            addCriterion("SKU_WEIGHTS not in", values, "skuWeights");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKU_WEIGHTS between", value1, value2, "skuWeights");
            return (Criteria) this;
        }

        public Criteria andSkuWeightsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SKU_WEIGHTS not between", value1, value2, "skuWeights");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpIsNull() {
            addCriterion("IS_INTO_ERP is null");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpIsNotNull() {
            addCriterion("IS_INTO_ERP is not null");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpEqualTo(String value) {
            addCriterion("IS_INTO_ERP =", value, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpNotEqualTo(String value) {
            addCriterion("IS_INTO_ERP <>", value, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpGreaterThan(String value) {
            addCriterion("IS_INTO_ERP >", value, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INTO_ERP >=", value, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpLessThan(String value) {
            addCriterion("IS_INTO_ERP <", value, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpLessThanOrEqualTo(String value) {
            addCriterion("IS_INTO_ERP <=", value, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpLike(String value) {
            addCriterion("IS_INTO_ERP like", value, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpNotLike(String value) {
            addCriterion("IS_INTO_ERP not like", value, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpIn(List<String> values) {
            addCriterion("IS_INTO_ERP in", values, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpNotIn(List<String> values) {
            addCriterion("IS_INTO_ERP not in", values, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpBetween(String value1, String value2) {
            addCriterion("IS_INTO_ERP between", value1, value2, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpNotBetween(String value1, String value2) {
            addCriterion("IS_INTO_ERP not between", value1, value2, "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIsNull() {
            addCriterion("INTO_TIME is null");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIsNotNull() {
            addCriterion("INTO_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andIntoTimeEqualTo(String value) {
            addCriterion("INTO_TIME =", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotEqualTo(String value) {
            addCriterion("INTO_TIME <>", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeGreaterThan(String value) {
            addCriterion("INTO_TIME >", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeGreaterThanOrEqualTo(String value) {
            addCriterion("INTO_TIME >=", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeLessThan(String value) {
            addCriterion("INTO_TIME <", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeLessThanOrEqualTo(String value) {
            addCriterion("INTO_TIME <=", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeLike(String value) {
            addCriterion("INTO_TIME like", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotLike(String value) {
            addCriterion("INTO_TIME not like", value, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeIn(List<String> values) {
            addCriterion("INTO_TIME in", values, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotIn(List<String> values) {
            addCriterion("INTO_TIME not in", values, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeBetween(String value1, String value2) {
            addCriterion("INTO_TIME between", value1, value2, "intoTime");
            return (Criteria) this;
        }

        public Criteria andIntoTimeNotBetween(String value1, String value2) {
            addCriterion("INTO_TIME not between", value1, value2, "intoTime");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNull() {
            addCriterion("RECEIVE_USER is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIsNotNull() {
            addCriterion("RECEIVE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUserEqualTo(String value) {
            addCriterion("RECEIVE_USER =", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotEqualTo(String value) {
            addCriterion("RECEIVE_USER <>", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThan(String value) {
            addCriterion("RECEIVE_USER >", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_USER >=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThan(String value) {
            addCriterion("RECEIVE_USER <", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_USER <=", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLike(String value) {
            addCriterion("RECEIVE_USER like", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotLike(String value) {
            addCriterion("RECEIVE_USER not like", value, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserIn(List<String> values) {
            addCriterion("RECEIVE_USER in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotIn(List<String> values) {
            addCriterion("RECEIVE_USER not in", values, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserBetween(String value1, String value2) {
            addCriterion("RECEIVE_USER between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveUserNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_USER not between", value1, value2, "receiveUser");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("PROVINCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("PROVINCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("PROVINCE_ID =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("PROVINCE_ID <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("PROVINCE_ID >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROVINCE_ID >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("PROVINCE_ID <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("PROVINCE_ID <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("PROVINCE_ID in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("PROVINCE_ID not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("PROVINCE_ID between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PROVINCE_ID not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("CITY_ID =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("CITY_ID <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("CITY_ID >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CITY_ID >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("CITY_ID <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("CITY_ID <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("CITY_ID in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("CITY_ID not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("CITY_ID between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CITY_ID not between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNull() {
            addCriterion("AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreaIdIsNotNull() {
            addCriterion("AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreaIdEqualTo(Integer value) {
            addCriterion("AREA_ID =", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotEqualTo(Integer value) {
            addCriterion("AREA_ID <>", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThan(Integer value) {
            addCriterion("AREA_ID >", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("AREA_ID >=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThan(Integer value) {
            addCriterion("AREA_ID <", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("AREA_ID <=", value, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdIn(List<Integer> values) {
            addCriterion("AREA_ID in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotIn(List<Integer> values) {
            addCriterion("AREA_ID not in", values, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("AREA_ID between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("AREA_ID not between", value1, value2, "areaId");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNull() {
            addCriterion("RECEIVE_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIsNotNull() {
            addCriterion("RECEIVE_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressEqualTo(String value) {
            addCriterion("RECEIVE_ADDRESS =", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotEqualTo(String value) {
            addCriterion("RECEIVE_ADDRESS <>", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThan(String value) {
            addCriterion("RECEIVE_ADDRESS >", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ADDRESS >=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThan(String value) {
            addCriterion("RECEIVE_ADDRESS <", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_ADDRESS <=", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLike(String value) {
            addCriterion("RECEIVE_ADDRESS like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotLike(String value) {
            addCriterion("RECEIVE_ADDRESS not like", value, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressIn(List<String> values) {
            addCriterion("RECEIVE_ADDRESS in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotIn(List<String> values) {
            addCriterion("RECEIVE_ADDRESS not in", values, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressBetween(String value1, String value2) {
            addCriterion("RECEIVE_ADDRESS between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_ADDRESS not between", value1, value2, "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressIsNull() {
            addCriterion("RECEIVE_FULL_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressIsNotNull() {
            addCriterion("RECEIVE_FULL_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressEqualTo(String value) {
            addCriterion("RECEIVE_FULL_ADDRESS =", value, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressNotEqualTo(String value) {
            addCriterion("RECEIVE_FULL_ADDRESS <>", value, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressGreaterThan(String value) {
            addCriterion("RECEIVE_FULL_ADDRESS >", value, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_FULL_ADDRESS >=", value, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressLessThan(String value) {
            addCriterion("RECEIVE_FULL_ADDRESS <", value, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_FULL_ADDRESS <=", value, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressLike(String value) {
            addCriterion("RECEIVE_FULL_ADDRESS like", value, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressNotLike(String value) {
            addCriterion("RECEIVE_FULL_ADDRESS not like", value, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressIn(List<String> values) {
            addCriterion("RECEIVE_FULL_ADDRESS in", values, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressNotIn(List<String> values) {
            addCriterion("RECEIVE_FULL_ADDRESS not in", values, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressBetween(String value1, String value2) {
            addCriterion("RECEIVE_FULL_ADDRESS between", value1, value2, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_FULL_ADDRESS not between", value1, value2, "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceivePostIsNull() {
            addCriterion("RECEIVE_POST is null");
            return (Criteria) this;
        }

        public Criteria andReceivePostIsNotNull() {
            addCriterion("RECEIVE_POST is not null");
            return (Criteria) this;
        }

        public Criteria andReceivePostEqualTo(String value) {
            addCriterion("RECEIVE_POST =", value, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceivePostNotEqualTo(String value) {
            addCriterion("RECEIVE_POST <>", value, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceivePostGreaterThan(String value) {
            addCriterion("RECEIVE_POST >", value, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceivePostGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_POST >=", value, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceivePostLessThan(String value) {
            addCriterion("RECEIVE_POST <", value, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceivePostLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_POST <=", value, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceivePostLike(String value) {
            addCriterion("RECEIVE_POST like", value, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceivePostNotLike(String value) {
            addCriterion("RECEIVE_POST not like", value, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceivePostIn(List<String> values) {
            addCriterion("RECEIVE_POST in", values, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceivePostNotIn(List<String> values) {
            addCriterion("RECEIVE_POST not in", values, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceivePostBetween(String value1, String value2) {
            addCriterion("RECEIVE_POST between", value1, value2, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceivePostNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_POST not between", value1, value2, "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIsNull() {
            addCriterion("RECEIVE_TEL is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIsNotNull() {
            addCriterion("RECEIVE_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTelEqualTo(String value) {
            addCriterion("RECEIVE_TEL =", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotEqualTo(String value) {
            addCriterion("RECEIVE_TEL <>", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelGreaterThan(String value) {
            addCriterion("RECEIVE_TEL >", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_TEL >=", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLessThan(String value) {
            addCriterion("RECEIVE_TEL <", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_TEL <=", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLike(String value) {
            addCriterion("RECEIVE_TEL like", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotLike(String value) {
            addCriterion("RECEIVE_TEL not like", value, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelIn(List<String> values) {
            addCriterion("RECEIVE_TEL in", values, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotIn(List<String> values) {
            addCriterion("RECEIVE_TEL not in", values, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelBetween(String value1, String value2) {
            addCriterion("RECEIVE_TEL between", value1, value2, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveTelNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_TEL not between", value1, value2, "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileIsNull() {
            addCriterion("RECEIVE_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileIsNotNull() {
            addCriterion("RECEIVE_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileEqualTo(String value) {
            addCriterion("RECEIVE_MOBILE =", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileNotEqualTo(String value) {
            addCriterion("RECEIVE_MOBILE <>", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileGreaterThan(String value) {
            addCriterion("RECEIVE_MOBILE >", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_MOBILE >=", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileLessThan(String value) {
            addCriterion("RECEIVE_MOBILE <", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_MOBILE <=", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileLike(String value) {
            addCriterion("RECEIVE_MOBILE like", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileNotLike(String value) {
            addCriterion("RECEIVE_MOBILE not like", value, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileIn(List<String> values) {
            addCriterion("RECEIVE_MOBILE in", values, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileNotIn(List<String> values) {
            addCriterion("RECEIVE_MOBILE not in", values, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileBetween(String value1, String value2) {
            addCriterion("RECEIVE_MOBILE between", value1, value2, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_MOBILE not between", value1, value2, "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIsNull() {
            addCriterion("RECEIVE_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIsNotNull() {
            addCriterion("RECEIVE_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailEqualTo(String value) {
            addCriterion("RECEIVE_EMAIL =", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotEqualTo(String value) {
            addCriterion("RECEIVE_EMAIL <>", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailGreaterThan(String value) {
            addCriterion("RECEIVE_EMAIL >", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_EMAIL >=", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLessThan(String value) {
            addCriterion("RECEIVE_EMAIL <", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_EMAIL <=", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLike(String value) {
            addCriterion("RECEIVE_EMAIL like", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotLike(String value) {
            addCriterion("RECEIVE_EMAIL not like", value, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailIn(List<String> values) {
            addCriterion("RECEIVE_EMAIL in", values, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotIn(List<String> values) {
            addCriterion("RECEIVE_EMAIL not in", values, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailBetween(String value1, String value2) {
            addCriterion("RECEIVE_EMAIL between", value1, value2, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_EMAIL not between", value1, value2, "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeIsNull() {
            addCriterion("RECEIVE_DATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeIsNotNull() {
            addCriterion("RECEIVE_DATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeEqualTo(String value) {
            addCriterion("RECEIVE_DATE_TYPE =", value, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeNotEqualTo(String value) {
            addCriterion("RECEIVE_DATE_TYPE <>", value, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeGreaterThan(String value) {
            addCriterion("RECEIVE_DATE_TYPE >", value, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_DATE_TYPE >=", value, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeLessThan(String value) {
            addCriterion("RECEIVE_DATE_TYPE <", value, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_DATE_TYPE <=", value, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeLike(String value) {
            addCriterion("RECEIVE_DATE_TYPE like", value, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeNotLike(String value) {
            addCriterion("RECEIVE_DATE_TYPE not like", value, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeIn(List<String> values) {
            addCriterion("RECEIVE_DATE_TYPE in", values, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeNotIn(List<String> values) {
            addCriterion("RECEIVE_DATE_TYPE not in", values, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeBetween(String value1, String value2) {
            addCriterion("RECEIVE_DATE_TYPE between", value1, value2, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_DATE_TYPE not between", value1, value2, "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeIsNull() {
            addCriterion("RECEIVE_TIME_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeIsNotNull() {
            addCriterion("RECEIVE_TIME_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeEqualTo(String value) {
            addCriterion("RECEIVE_TIME_TYPE =", value, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeNotEqualTo(String value) {
            addCriterion("RECEIVE_TIME_TYPE <>", value, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeGreaterThan(String value) {
            addCriterion("RECEIVE_TIME_TYPE >", value, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_TIME_TYPE >=", value, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeLessThan(String value) {
            addCriterion("RECEIVE_TIME_TYPE <", value, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_TIME_TYPE <=", value, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeLike(String value) {
            addCriterion("RECEIVE_TIME_TYPE like", value, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeNotLike(String value) {
            addCriterion("RECEIVE_TIME_TYPE not like", value, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeIn(List<String> values) {
            addCriterion("RECEIVE_TIME_TYPE in", values, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeNotIn(List<String> values) {
            addCriterion("RECEIVE_TIME_TYPE not in", values, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeBetween(String value1, String value2) {
            addCriterion("RECEIVE_TIME_TYPE between", value1, value2, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_TIME_TYPE not between", value1, value2, "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("INVOICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("INVOICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(String value) {
            addCriterion("INVOICE_TYPE =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(String value) {
            addCriterion("INVOICE_TYPE <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(String value) {
            addCriterion("INVOICE_TYPE >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(String value) {
            addCriterion("INVOICE_TYPE <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TYPE <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLike(String value) {
            addCriterion("INVOICE_TYPE like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotLike(String value) {
            addCriterion("INVOICE_TYPE not like", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<String> values) {
            addCriterion("INVOICE_TYPE in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<String> values) {
            addCriterion("INVOICE_TYPE not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(String value1, String value2) {
            addCriterion("INVOICE_TYPE between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TYPE not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeIsNull() {
            addCriterion("INVOICE_CONTENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeIsNotNull() {
            addCriterion("INVOICE_CONTENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeEqualTo(String value) {
            addCriterion("INVOICE_CONTENT_TYPE =", value, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeNotEqualTo(String value) {
            addCriterion("INVOICE_CONTENT_TYPE <>", value, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeGreaterThan(String value) {
            addCriterion("INVOICE_CONTENT_TYPE >", value, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTENT_TYPE >=", value, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeLessThan(String value) {
            addCriterion("INVOICE_CONTENT_TYPE <", value, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTENT_TYPE <=", value, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeLike(String value) {
            addCriterion("INVOICE_CONTENT_TYPE like", value, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeNotLike(String value) {
            addCriterion("INVOICE_CONTENT_TYPE not like", value, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeIn(List<String> values) {
            addCriterion("INVOICE_CONTENT_TYPE in", values, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeNotIn(List<String> values) {
            addCriterion("INVOICE_CONTENT_TYPE not in", values, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTENT_TYPE between", value1, value2, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeNotBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTENT_TYPE not between", value1, value2, "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNull() {
            addCriterion("INVOICE_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIsNotNull() {
            addCriterion("INVOICE_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleEqualTo(String value) {
            addCriterion("INVOICE_TITLE =", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotEqualTo(String value) {
            addCriterion("INVOICE_TITLE <>", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThan(String value) {
            addCriterion("INVOICE_TITLE >", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TITLE >=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThan(String value) {
            addCriterion("INVOICE_TITLE <", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TITLE <=", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLike(String value) {
            addCriterion("INVOICE_TITLE like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotLike(String value) {
            addCriterion("INVOICE_TITLE not like", value, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleIn(List<String> values) {
            addCriterion("INVOICE_TITLE in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotIn(List<String> values) {
            addCriterion("INVOICE_TITLE not in", values, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleBetween(String value1, String value2) {
            addCriterion("INVOICE_TITLE between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TITLE not between", value1, value2, "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNull() {
            addCriterion("INVOICE_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIsNotNull() {
            addCriterion("INVOICE_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentEqualTo(String value) {
            addCriterion("INVOICE_CONTENT =", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotEqualTo(String value) {
            addCriterion("INVOICE_CONTENT <>", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThan(String value) {
            addCriterion("INVOICE_CONTENT >", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTENT >=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThan(String value) {
            addCriterion("INVOICE_CONTENT <", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_CONTENT <=", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLike(String value) {
            addCriterion("INVOICE_CONTENT like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotLike(String value) {
            addCriterion("INVOICE_CONTENT not like", value, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentIn(List<String> values) {
            addCriterion("INVOICE_CONTENT in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotIn(List<String> values) {
            addCriterion("INVOICE_CONTENT not in", values, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTENT between", value1, value2, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentNotBetween(String value1, String value2) {
            addCriterion("INVOICE_CONTENT not between", value1, value2, "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoIsNull() {
            addCriterion("INVOICE_TAX_NO is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoIsNotNull() {
            addCriterion("INVOICE_TAX_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoEqualTo(String value) {
            addCriterion("INVOICE_TAX_NO =", value, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoNotEqualTo(String value) {
            addCriterion("INVOICE_TAX_NO <>", value, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoGreaterThan(String value) {
            addCriterion("INVOICE_TAX_NO >", value, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_NO >=", value, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoLessThan(String value) {
            addCriterion("INVOICE_TAX_NO <", value, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_NO <=", value, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoLike(String value) {
            addCriterion("INVOICE_TAX_NO like", value, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoNotLike(String value) {
            addCriterion("INVOICE_TAX_NO not like", value, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoIn(List<String> values) {
            addCriterion("INVOICE_TAX_NO in", values, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoNotIn(List<String> values) {
            addCriterion("INVOICE_TAX_NO not in", values, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_NO between", value1, value2, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_NO not between", value1, value2, "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andIsDrawIsNull() {
            addCriterion("IS_DRAW is null");
            return (Criteria) this;
        }

        public Criteria andIsDrawIsNotNull() {
            addCriterion("IS_DRAW is not null");
            return (Criteria) this;
        }

        public Criteria andIsDrawEqualTo(String value) {
            addCriterion("IS_DRAW =", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawNotEqualTo(String value) {
            addCriterion("IS_DRAW <>", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawGreaterThan(String value) {
            addCriterion("IS_DRAW >", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DRAW >=", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawLessThan(String value) {
            addCriterion("IS_DRAW <", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawLessThanOrEqualTo(String value) {
            addCriterion("IS_DRAW <=", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawLike(String value) {
            addCriterion("IS_DRAW like", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawNotLike(String value) {
            addCriterion("IS_DRAW not like", value, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawIn(List<String> values) {
            addCriterion("IS_DRAW in", values, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawNotIn(List<String> values) {
            addCriterion("IS_DRAW not in", values, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawBetween(String value1, String value2) {
            addCriterion("IS_DRAW between", value1, value2, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsDrawNotBetween(String value1, String value2) {
            addCriterion("IS_DRAW not between", value1, value2, "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNull() {
            addCriterion("IS_INVOICE is null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIsNotNull() {
            addCriterion("IS_INVOICE is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceEqualTo(String value) {
            addCriterion("IS_INVOICE =", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotEqualTo(String value) {
            addCriterion("IS_INVOICE <>", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThan(String value) {
            addCriterion("IS_INVOICE >", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INVOICE >=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThan(String value) {
            addCriterion("IS_INVOICE <", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLessThanOrEqualTo(String value) {
            addCriterion("IS_INVOICE <=", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLike(String value) {
            addCriterion("IS_INVOICE like", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotLike(String value) {
            addCriterion("IS_INVOICE not like", value, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceIn(List<String> values) {
            addCriterion("IS_INVOICE in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotIn(List<String> values) {
            addCriterion("IS_INVOICE not in", values, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceBetween(String value1, String value2) {
            addCriterion("IS_INVOICE between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceNotBetween(String value1, String value2) {
            addCriterion("IS_INVOICE not between", value1, value2, "isInvoice");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("BRAND_ID is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("BRAND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Integer value) {
            addCriterion("BRAND_ID =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Integer value) {
            addCriterion("BRAND_ID <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Integer value) {
            addCriterion("BRAND_ID >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("BRAND_ID >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Integer value) {
            addCriterion("BRAND_ID <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Integer value) {
            addCriterion("BRAND_ID <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Integer> values) {
            addCriterion("BRAND_ID in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Integer> values) {
            addCriterion("BRAND_ID not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Integer value1, Integer value2) {
            addCriterion("BRAND_ID between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Integer value1, Integer value2) {
            addCriterion("BRAND_ID not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNull() {
            addCriterion("BRAND_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBrandNameIsNotNull() {
            addCriterion("BRAND_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBrandNameEqualTo(String value) {
            addCriterion("BRAND_NAME =", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotEqualTo(String value) {
            addCriterion("BRAND_NAME <>", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThan(String value) {
            addCriterion("BRAND_NAME >", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameGreaterThanOrEqualTo(String value) {
            addCriterion("BRAND_NAME >=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThan(String value) {
            addCriterion("BRAND_NAME <", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLessThanOrEqualTo(String value) {
            addCriterion("BRAND_NAME <=", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameLike(String value) {
            addCriterion("BRAND_NAME like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotLike(String value) {
            addCriterion("BRAND_NAME not like", value, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameIn(List<String> values) {
            addCriterion("BRAND_NAME in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotIn(List<String> values) {
            addCriterion("BRAND_NAME not in", values, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameBetween(String value1, String value2) {
            addCriterion("BRAND_NAME between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andBrandNameNotBetween(String value1, String value2) {
            addCriterion("BRAND_NAME not between", value1, value2, "brandName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressIsNull() {
            addCriterion("INVOICE_TAX_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressIsNotNull() {
            addCriterion("INVOICE_TAX_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressEqualTo(String value) {
            addCriterion("INVOICE_TAX_ADDRESS =", value, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressNotEqualTo(String value) {
            addCriterion("INVOICE_TAX_ADDRESS <>", value, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressGreaterThan(String value) {
            addCriterion("INVOICE_TAX_ADDRESS >", value, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_ADDRESS >=", value, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressLessThan(String value) {
            addCriterion("INVOICE_TAX_ADDRESS <", value, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_ADDRESS <=", value, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressLike(String value) {
            addCriterion("INVOICE_TAX_ADDRESS like", value, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressNotLike(String value) {
            addCriterion("INVOICE_TAX_ADDRESS not like", value, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressIn(List<String> values) {
            addCriterion("INVOICE_TAX_ADDRESS in", values, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressNotIn(List<String> values) {
            addCriterion("INVOICE_TAX_ADDRESS not in", values, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_ADDRESS between", value1, value2, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_ADDRESS not between", value1, value2, "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelIsNull() {
            addCriterion("INVOICE_TAX_TEL is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelIsNotNull() {
            addCriterion("INVOICE_TAX_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelEqualTo(String value) {
            addCriterion("INVOICE_TAX_TEL =", value, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelNotEqualTo(String value) {
            addCriterion("INVOICE_TAX_TEL <>", value, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelGreaterThan(String value) {
            addCriterion("INVOICE_TAX_TEL >", value, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_TEL >=", value, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelLessThan(String value) {
            addCriterion("INVOICE_TAX_TEL <", value, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_TEL <=", value, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelLike(String value) {
            addCriterion("INVOICE_TAX_TEL like", value, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelNotLike(String value) {
            addCriterion("INVOICE_TAX_TEL not like", value, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelIn(List<String> values) {
            addCriterion("INVOICE_TAX_TEL in", values, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelNotIn(List<String> values) {
            addCriterion("INVOICE_TAX_TEL not in", values, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_TEL between", value1, value2, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_TEL not between", value1, value2, "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankIsNull() {
            addCriterion("INVOICE_TAX_BANK is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankIsNotNull() {
            addCriterion("INVOICE_TAX_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankEqualTo(String value) {
            addCriterion("INVOICE_TAX_BANK =", value, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankNotEqualTo(String value) {
            addCriterion("INVOICE_TAX_BANK <>", value, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankGreaterThan(String value) {
            addCriterion("INVOICE_TAX_BANK >", value, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_BANK >=", value, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankLessThan(String value) {
            addCriterion("INVOICE_TAX_BANK <", value, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_BANK <=", value, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankLike(String value) {
            addCriterion("INVOICE_TAX_BANK like", value, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankNotLike(String value) {
            addCriterion("INVOICE_TAX_BANK not like", value, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankIn(List<String> values) {
            addCriterion("INVOICE_TAX_BANK in", values, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankNotIn(List<String> values) {
            addCriterion("INVOICE_TAX_BANK not in", values, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_BANK between", value1, value2, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_BANK not between", value1, value2, "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountIsNull() {
            addCriterion("INVOICE_TAX_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountIsNotNull() {
            addCriterion("INVOICE_TAX_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountEqualTo(String value) {
            addCriterion("INVOICE_TAX_ACCOUNT =", value, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountNotEqualTo(String value) {
            addCriterion("INVOICE_TAX_ACCOUNT <>", value, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountGreaterThan(String value) {
            addCriterion("INVOICE_TAX_ACCOUNT >", value, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountGreaterThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_ACCOUNT >=", value, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountLessThan(String value) {
            addCriterion("INVOICE_TAX_ACCOUNT <", value, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountLessThanOrEqualTo(String value) {
            addCriterion("INVOICE_TAX_ACCOUNT <=", value, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountLike(String value) {
            addCriterion("INVOICE_TAX_ACCOUNT like", value, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountNotLike(String value) {
            addCriterion("INVOICE_TAX_ACCOUNT not like", value, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountIn(List<String> values) {
            addCriterion("INVOICE_TAX_ACCOUNT in", values, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountNotIn(List<String> values) {
            addCriterion("INVOICE_TAX_ACCOUNT not in", values, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_ACCOUNT between", value1, value2, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountNotBetween(String value1, String value2) {
            addCriterion("INVOICE_TAX_ACCOUNT not between", value1, value2, "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIsNull() {
            addCriterion("COUPON_FEE is null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIsNotNull() {
            addCriterion("COUPON_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andCouponFeeEqualTo(BigDecimal value) {
            addCriterion("COUPON_FEE =", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotEqualTo(BigDecimal value) {
            addCriterion("COUPON_FEE <>", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeGreaterThan(BigDecimal value) {
            addCriterion("COUPON_FEE >", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_FEE >=", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeLessThan(BigDecimal value) {
            addCriterion("COUPON_FEE <", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COUPON_FEE <=", value, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeIn(List<BigDecimal> values) {
            addCriterion("COUPON_FEE in", values, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotIn(List<BigDecimal> values) {
            addCriterion("COUPON_FEE not in", values, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_FEE between", value1, value2, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COUPON_FEE not between", value1, value2, "couponFee");
            return (Criteria) this;
        }

        public Criteria andCouponNosIsNull() {
            addCriterion("COUPON_NOS is null");
            return (Criteria) this;
        }

        public Criteria andCouponNosIsNotNull() {
            addCriterion("COUPON_NOS is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNosEqualTo(String value) {
            addCriterion("COUPON_NOS =", value, "couponNos");
            return (Criteria) this;
        }

        public Criteria andCouponNosNotEqualTo(String value) {
            addCriterion("COUPON_NOS <>", value, "couponNos");
            return (Criteria) this;
        }

        public Criteria andCouponNosGreaterThan(String value) {
            addCriterion("COUPON_NOS >", value, "couponNos");
            return (Criteria) this;
        }

        public Criteria andCouponNosGreaterThanOrEqualTo(String value) {
            addCriterion("COUPON_NOS >=", value, "couponNos");
            return (Criteria) this;
        }

        public Criteria andCouponNosLessThan(String value) {
            addCriterion("COUPON_NOS <", value, "couponNos");
            return (Criteria) this;
        }

        public Criteria andCouponNosLessThanOrEqualTo(String value) {
            addCriterion("COUPON_NOS <=", value, "couponNos");
            return (Criteria) this;
        }

        public Criteria andCouponNosLike(String value) {
            addCriterion("COUPON_NOS like", value, "couponNos");
            return (Criteria) this;
        }

        public Criteria andCouponNosNotLike(String value) {
            addCriterion("COUPON_NOS not like", value, "couponNos");
            return (Criteria) this;
        }

        public Criteria andCouponNosIn(List<String> values) {
            addCriterion("COUPON_NOS in", values, "couponNos");
            return (Criteria) this;
        }

        public Criteria andCouponNosNotIn(List<String> values) {
            addCriterion("COUPON_NOS not in", values, "couponNos");
            return (Criteria) this;
        }

        public Criteria andCouponNosBetween(String value1, String value2) {
            addCriterion("COUPON_NOS between", value1, value2, "couponNos");
            return (Criteria) this;
        }

        public Criteria andCouponNosNotBetween(String value1, String value2) {
            addCriterion("COUPON_NOS not between", value1, value2, "couponNos");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeIsNull() {
            addCriterion("BALANCE_PAY_FEE is null");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeIsNotNull() {
            addCriterion("BALANCE_PAY_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeEqualTo(BigDecimal value) {
            addCriterion("BALANCE_PAY_FEE =", value, "balancePayFee");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeNotEqualTo(BigDecimal value) {
            addCriterion("BALANCE_PAY_FEE <>", value, "balancePayFee");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeGreaterThan(BigDecimal value) {
            addCriterion("BALANCE_PAY_FEE >", value, "balancePayFee");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE_PAY_FEE >=", value, "balancePayFee");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeLessThan(BigDecimal value) {
            addCriterion("BALANCE_PAY_FEE <", value, "balancePayFee");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BALANCE_PAY_FEE <=", value, "balancePayFee");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeIn(List<BigDecimal> values) {
            addCriterion("BALANCE_PAY_FEE in", values, "balancePayFee");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeNotIn(List<BigDecimal> values) {
            addCriterion("BALANCE_PAY_FEE not in", values, "balancePayFee");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE_PAY_FEE between", value1, value2, "balancePayFee");
            return (Criteria) this;
        }

        public Criteria andBalancePayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BALANCE_PAY_FEE not between", value1, value2, "balancePayFee");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeIsNull() {
            addCriterion("BBGOLD_PAY_FEE is null");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeIsNotNull() {
            addCriterion("BBGOLD_PAY_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeEqualTo(BigDecimal value) {
            addCriterion("BBGOLD_PAY_FEE =", value, "bbgoldPayFee");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeNotEqualTo(BigDecimal value) {
            addCriterion("BBGOLD_PAY_FEE <>", value, "bbgoldPayFee");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeGreaterThan(BigDecimal value) {
            addCriterion("BBGOLD_PAY_FEE >", value, "bbgoldPayFee");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BBGOLD_PAY_FEE >=", value, "bbgoldPayFee");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeLessThan(BigDecimal value) {
            addCriterion("BBGOLD_PAY_FEE <", value, "bbgoldPayFee");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BBGOLD_PAY_FEE <=", value, "bbgoldPayFee");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeIn(List<BigDecimal> values) {
            addCriterion("BBGOLD_PAY_FEE in", values, "bbgoldPayFee");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeNotIn(List<BigDecimal> values) {
            addCriterion("BBGOLD_PAY_FEE not in", values, "bbgoldPayFee");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BBGOLD_PAY_FEE between", value1, value2, "bbgoldPayFee");
            return (Criteria) this;
        }

        public Criteria andBbgoldPayFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BBGOLD_PAY_FEE not between", value1, value2, "bbgoldPayFee");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("ORDER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("ORDER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("ORDER_TYPE =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("ORDER_TYPE <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("ORDER_TYPE >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("ORDER_TYPE <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("ORDER_TYPE <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("ORDER_TYPE like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("ORDER_TYPE not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("ORDER_TYPE in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("ORDER_TYPE not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("ORDER_TYPE not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGIsNull() {
            addCriterion("ORDER_POINTS_G is null");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGIsNotNull() {
            addCriterion("ORDER_POINTS_G is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGEqualTo(Integer value) {
            addCriterion("ORDER_POINTS_G =", value, "orderPointsG");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGNotEqualTo(Integer value) {
            addCriterion("ORDER_POINTS_G <>", value, "orderPointsG");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGGreaterThan(Integer value) {
            addCriterion("ORDER_POINTS_G >", value, "orderPointsG");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_POINTS_G >=", value, "orderPointsG");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGLessThan(Integer value) {
            addCriterion("ORDER_POINTS_G <", value, "orderPointsG");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_POINTS_G <=", value, "orderPointsG");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGIn(List<Integer> values) {
            addCriterion("ORDER_POINTS_G in", values, "orderPointsG");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGNotIn(List<Integer> values) {
            addCriterion("ORDER_POINTS_G not in", values, "orderPointsG");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_POINTS_G between", value1, value2, "orderPointsG");
            return (Criteria) this;
        }

        public Criteria andOrderPointsGNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_POINTS_G not between", value1, value2, "orderPointsG");
            return (Criteria) this;
        }

        public Criteria andSelfPickupIsNull() {
            addCriterion("SELF_PICKUP is null");
            return (Criteria) this;
        }

        public Criteria andSelfPickupIsNotNull() {
            addCriterion("SELF_PICKUP is not null");
            return (Criteria) this;
        }

        public Criteria andSelfPickupEqualTo(String value) {
            addCriterion("SELF_PICKUP =", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupNotEqualTo(String value) {
            addCriterion("SELF_PICKUP <>", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupGreaterThan(String value) {
            addCriterion("SELF_PICKUP >", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_PICKUP >=", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupLessThan(String value) {
            addCriterion("SELF_PICKUP <", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupLessThanOrEqualTo(String value) {
            addCriterion("SELF_PICKUP <=", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupLike(String value) {
            addCriterion("SELF_PICKUP like", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupNotLike(String value) {
            addCriterion("SELF_PICKUP not like", value, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupIn(List<String> values) {
            addCriterion("SELF_PICKUP in", values, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupNotIn(List<String> values) {
            addCriterion("SELF_PICKUP not in", values, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupBetween(String value1, String value2) {
            addCriterion("SELF_PICKUP between", value1, value2, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andSelfPickupNotBetween(String value1, String value2) {
            addCriterion("SELF_PICKUP not between", value1, value2, "selfPickup");
            return (Criteria) this;
        }

        public Criteria andTransportsNoIsNull() {
            addCriterion("TRANSPORTS_NO is null");
            return (Criteria) this;
        }

        public Criteria andTransportsNoIsNotNull() {
            addCriterion("TRANSPORTS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTransportsNoEqualTo(String value) {
            addCriterion("TRANSPORTS_NO =", value, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andTransportsNoNotEqualTo(String value) {
            addCriterion("TRANSPORTS_NO <>", value, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andTransportsNoGreaterThan(String value) {
            addCriterion("TRANSPORTS_NO >", value, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andTransportsNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSPORTS_NO >=", value, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andTransportsNoLessThan(String value) {
            addCriterion("TRANSPORTS_NO <", value, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andTransportsNoLessThanOrEqualTo(String value) {
            addCriterion("TRANSPORTS_NO <=", value, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andTransportsNoLike(String value) {
            addCriterion("TRANSPORTS_NO like", value, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andTransportsNoNotLike(String value) {
            addCriterion("TRANSPORTS_NO not like", value, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andTransportsNoIn(List<String> values) {
            addCriterion("TRANSPORTS_NO in", values, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andTransportsNoNotIn(List<String> values) {
            addCriterion("TRANSPORTS_NO not in", values, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andTransportsNoBetween(String value1, String value2) {
            addCriterion("TRANSPORTS_NO between", value1, value2, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andTransportsNoNotBetween(String value1, String value2) {
            addCriterion("TRANSPORTS_NO not between", value1, value2, "transportsNo");
            return (Criteria) this;
        }

        public Criteria andOriginCodeIsNull() {
            addCriterion("ORIGIN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andOriginCodeIsNotNull() {
            addCriterion("ORIGIN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andOriginCodeEqualTo(String value) {
            addCriterion("ORIGIN_CODE =", value, "originCode");
            return (Criteria) this;
        }

        public Criteria andOriginCodeNotEqualTo(String value) {
            addCriterion("ORIGIN_CODE <>", value, "originCode");
            return (Criteria) this;
        }

        public Criteria andOriginCodeGreaterThan(String value) {
            addCriterion("ORIGIN_CODE >", value, "originCode");
            return (Criteria) this;
        }

        public Criteria andOriginCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ORIGIN_CODE >=", value, "originCode");
            return (Criteria) this;
        }

        public Criteria andOriginCodeLessThan(String value) {
            addCriterion("ORIGIN_CODE <", value, "originCode");
            return (Criteria) this;
        }

        public Criteria andOriginCodeLessThanOrEqualTo(String value) {
            addCriterion("ORIGIN_CODE <=", value, "originCode");
            return (Criteria) this;
        }

        public Criteria andOriginCodeLike(String value) {
            addCriterion("ORIGIN_CODE like", value, "originCode");
            return (Criteria) this;
        }

        public Criteria andOriginCodeNotLike(String value) {
            addCriterion("ORIGIN_CODE not like", value, "originCode");
            return (Criteria) this;
        }

        public Criteria andOriginCodeIn(List<String> values) {
            addCriterion("ORIGIN_CODE in", values, "originCode");
            return (Criteria) this;
        }

        public Criteria andOriginCodeNotIn(List<String> values) {
            addCriterion("ORIGIN_CODE not in", values, "originCode");
            return (Criteria) this;
        }

        public Criteria andOriginCodeBetween(String value1, String value2) {
            addCriterion("ORIGIN_CODE between", value1, value2, "originCode");
            return (Criteria) this;
        }

        public Criteria andOriginCodeNotBetween(String value1, String value2) {
            addCriterion("ORIGIN_CODE not between", value1, value2, "originCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeIsNull() {
            addCriterion("DEST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDestCodeIsNotNull() {
            addCriterion("DEST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDestCodeEqualTo(String value) {
            addCriterion("DEST_CODE =", value, "destCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeNotEqualTo(String value) {
            addCriterion("DEST_CODE <>", value, "destCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeGreaterThan(String value) {
            addCriterion("DEST_CODE >", value, "destCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEST_CODE >=", value, "destCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeLessThan(String value) {
            addCriterion("DEST_CODE <", value, "destCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeLessThanOrEqualTo(String value) {
            addCriterion("DEST_CODE <=", value, "destCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeLike(String value) {
            addCriterion("DEST_CODE like", value, "destCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeNotLike(String value) {
            addCriterion("DEST_CODE not like", value, "destCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeIn(List<String> values) {
            addCriterion("DEST_CODE in", values, "destCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeNotIn(List<String> values) {
            addCriterion("DEST_CODE not in", values, "destCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeBetween(String value1, String value2) {
            addCriterion("DEST_CODE between", value1, value2, "destCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeNotBetween(String value1, String value2) {
            addCriterion("DEST_CODE not between", value1, value2, "destCode");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNull() {
            addCriterion("INSURANCE is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("INSURANCE is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(BigDecimal value) {
            addCriterion("INSURANCE =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(BigDecimal value) {
            addCriterion("INSURANCE <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(BigDecimal value) {
            addCriterion("INSURANCE >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCE >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(BigDecimal value) {
            addCriterion("INSURANCE <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCE <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<BigDecimal> values) {
            addCriterion("INSURANCE in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<BigDecimal> values) {
            addCriterion("INSURANCE not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCE between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCE not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceIsNull() {
            addCriterion("SF_INTERFACE is null");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceIsNotNull() {
            addCriterion("SF_INTERFACE is not null");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceEqualTo(String value) {
            addCriterion("SF_INTERFACE =", value, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceNotEqualTo(String value) {
            addCriterion("SF_INTERFACE <>", value, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceGreaterThan(String value) {
            addCriterion("SF_INTERFACE >", value, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("SF_INTERFACE >=", value, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceLessThan(String value) {
            addCriterion("SF_INTERFACE <", value, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceLessThanOrEqualTo(String value) {
            addCriterion("SF_INTERFACE <=", value, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceLike(String value) {
            addCriterion("SF_INTERFACE like", value, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceNotLike(String value) {
            addCriterion("SF_INTERFACE not like", value, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceIn(List<String> values) {
            addCriterion("SF_INTERFACE in", values, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceNotIn(List<String> values) {
            addCriterion("SF_INTERFACE not in", values, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceBetween(String value1, String value2) {
            addCriterion("SF_INTERFACE between", value1, value2, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceNotBetween(String value1, String value2) {
            addCriterion("SF_INTERFACE not between", value1, value2, "sfInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceIsNull() {
            addCriterion("ERP_INTERFACE is null");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceIsNotNull() {
            addCriterion("ERP_INTERFACE is not null");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceEqualTo(String value) {
            addCriterion("ERP_INTERFACE =", value, "erpInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceNotEqualTo(String value) {
            addCriterion("ERP_INTERFACE <>", value, "erpInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceGreaterThan(String value) {
            addCriterion("ERP_INTERFACE >", value, "erpInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceGreaterThanOrEqualTo(String value) {
            addCriterion("ERP_INTERFACE >=", value, "erpInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceLessThan(String value) {
            addCriterion("ERP_INTERFACE <", value, "erpInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceLessThanOrEqualTo(String value) {
            addCriterion("ERP_INTERFACE <=", value, "erpInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceLike(String value) {
            addCriterion("ERP_INTERFACE like", value, "erpInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceNotLike(String value) {
            addCriterion("ERP_INTERFACE not like", value, "erpInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceIn(List<String> values) {
            addCriterion("ERP_INTERFACE in", values, "erpInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceNotIn(List<String> values) {
            addCriterion("ERP_INTERFACE not in", values, "erpInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceBetween(String value1, String value2) {
            addCriterion("ERP_INTERFACE between", value1, value2, "erpInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceNotBetween(String value1, String value2) {
            addCriterion("ERP_INTERFACE not between", value1, value2, "erpInterface");
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

        public Criteria andStoreIdIsNull() {
            addCriterion("STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Integer value) {
            addCriterion("STORE_ID =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Integer value) {
            addCriterion("STORE_ID <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Integer value) {
            addCriterion("STORE_ID >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("STORE_ID >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Integer value) {
            addCriterion("STORE_ID <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Integer value) {
            addCriterion("STORE_ID <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Integer> values) {
            addCriterion("STORE_ID in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Integer> values) {
            addCriterion("STORE_ID not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Integer value1, Integer value2) {
            addCriterion("STORE_ID between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Integer value1, Integer value2) {
            addCriterion("STORE_ID not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNull() {
            addCriterion("VERIFY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIsNotNull() {
            addCriterion("VERIFY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeEqualTo(String value) {
            addCriterion("VERIFY_CODE =", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotEqualTo(String value) {
            addCriterion("VERIFY_CODE <>", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThan(String value) {
            addCriterion("VERIFY_CODE >", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VERIFY_CODE >=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThan(String value) {
            addCriterion("VERIFY_CODE <", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLessThanOrEqualTo(String value) {
            addCriterion("VERIFY_CODE <=", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeLike(String value) {
            addCriterion("VERIFY_CODE like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotLike(String value) {
            addCriterion("VERIFY_CODE not like", value, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeIn(List<String> values) {
            addCriterion("VERIFY_CODE in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotIn(List<String> values) {
            addCriterion("VERIFY_CODE not in", values, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeBetween(String value1, String value2) {
            addCriterion("VERIFY_CODE between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andVerifyCodeNotBetween(String value1, String value2) {
            addCriterion("VERIFY_CODE not between", value1, value2, "verifyCode");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("IS_CHECK is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("IS_CHECK is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(String value) {
            addCriterion("IS_CHECK =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(String value) {
            addCriterion("IS_CHECK <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(String value) {
            addCriterion("IS_CHECK >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHECK >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(String value) {
            addCriterion("IS_CHECK <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(String value) {
            addCriterion("IS_CHECK <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLike(String value) {
            addCriterion("IS_CHECK like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotLike(String value) {
            addCriterion("IS_CHECK not like", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<String> values) {
            addCriterion("IS_CHECK in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<String> values) {
            addCriterion("IS_CHECK not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(String value1, String value2) {
            addCriterion("IS_CHECK between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(String value1, String value2) {
            addCriterion("IS_CHECK not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdIsNull() {
            addCriterion("GROUP_BUY_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdIsNotNull() {
            addCriterion("GROUP_BUY_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdEqualTo(Integer value) {
            addCriterion("GROUP_BUY_RULE_ID =", value, "groupBuyRuleId");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdNotEqualTo(Integer value) {
            addCriterion("GROUP_BUY_RULE_ID <>", value, "groupBuyRuleId");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdGreaterThan(Integer value) {
            addCriterion("GROUP_BUY_RULE_ID >", value, "groupBuyRuleId");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GROUP_BUY_RULE_ID >=", value, "groupBuyRuleId");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdLessThan(Integer value) {
            addCriterion("GROUP_BUY_RULE_ID <", value, "groupBuyRuleId");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdLessThanOrEqualTo(Integer value) {
            addCriterion("GROUP_BUY_RULE_ID <=", value, "groupBuyRuleId");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdIn(List<Integer> values) {
            addCriterion("GROUP_BUY_RULE_ID in", values, "groupBuyRuleId");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdNotIn(List<Integer> values) {
            addCriterion("GROUP_BUY_RULE_ID not in", values, "groupBuyRuleId");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdBetween(Integer value1, Integer value2) {
            addCriterion("GROUP_BUY_RULE_ID between", value1, value2, "groupBuyRuleId");
            return (Criteria) this;
        }

        public Criteria andGroupBuyRuleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GROUP_BUY_RULE_ID not between", value1, value2, "groupBuyRuleId");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeIsNull() {
            addCriterion("RETURN_DELIVERY_FEE is null");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeIsNotNull() {
            addCriterion("RETURN_DELIVERY_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeEqualTo(BigDecimal value) {
            addCriterion("RETURN_DELIVERY_FEE =", value, "returnDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeNotEqualTo(BigDecimal value) {
            addCriterion("RETURN_DELIVERY_FEE <>", value, "returnDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeGreaterThan(BigDecimal value) {
            addCriterion("RETURN_DELIVERY_FEE >", value, "returnDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_DELIVERY_FEE >=", value, "returnDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeLessThan(BigDecimal value) {
            addCriterion("RETURN_DELIVERY_FEE <", value, "returnDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETURN_DELIVERY_FEE <=", value, "returnDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeIn(List<BigDecimal> values) {
            addCriterion("RETURN_DELIVERY_FEE in", values, "returnDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeNotIn(List<BigDecimal> values) {
            addCriterion("RETURN_DELIVERY_FEE not in", values, "returnDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_DELIVERY_FEE between", value1, value2, "returnDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andReturnDeliveryFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETURN_DELIVERY_FEE not between", value1, value2, "returnDeliveryFee");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsIsNull() {
            addCriterion("IS_GIVE_POINTS is null");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsIsNotNull() {
            addCriterion("IS_GIVE_POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsEqualTo(String value) {
            addCriterion("IS_GIVE_POINTS =", value, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsNotEqualTo(String value) {
            addCriterion("IS_GIVE_POINTS <>", value, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsGreaterThan(String value) {
            addCriterion("IS_GIVE_POINTS >", value, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GIVE_POINTS >=", value, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsLessThan(String value) {
            addCriterion("IS_GIVE_POINTS <", value, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsLessThanOrEqualTo(String value) {
            addCriterion("IS_GIVE_POINTS <=", value, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsLike(String value) {
            addCriterion("IS_GIVE_POINTS like", value, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsNotLike(String value) {
            addCriterion("IS_GIVE_POINTS not like", value, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsIn(List<String> values) {
            addCriterion("IS_GIVE_POINTS in", values, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsNotIn(List<String> values) {
            addCriterion("IS_GIVE_POINTS not in", values, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsBetween(String value1, String value2) {
            addCriterion("IS_GIVE_POINTS between", value1, value2, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsNotBetween(String value1, String value2) {
            addCriterion("IS_GIVE_POINTS not between", value1, value2, "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("SOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("SOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(String value) {
            addCriterion("SOURCE_TYPE =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(String value) {
            addCriterion("SOURCE_TYPE <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(String value) {
            addCriterion("SOURCE_TYPE >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE_TYPE >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(String value) {
            addCriterion("SOURCE_TYPE <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(String value) {
            addCriterion("SOURCE_TYPE <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLike(String value) {
            addCriterion("SOURCE_TYPE like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotLike(String value) {
            addCriterion("SOURCE_TYPE not like", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<String> values) {
            addCriterion("SOURCE_TYPE in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<String> values) {
            addCriterion("SOURCE_TYPE not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(String value1, String value2) {
            addCriterion("SOURCE_TYPE between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(String value1, String value2) {
            addCriterion("SOURCE_TYPE not between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyIsNull() {
            addCriterion("AWARD_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyIsNotNull() {
            addCriterion("AWARD_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyEqualTo(BigDecimal value) {
            addCriterion("AWARD_MONEY =", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyNotEqualTo(BigDecimal value) {
            addCriterion("AWARD_MONEY <>", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyGreaterThan(BigDecimal value) {
            addCriterion("AWARD_MONEY >", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AWARD_MONEY >=", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyLessThan(BigDecimal value) {
            addCriterion("AWARD_MONEY <", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AWARD_MONEY <=", value, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyIn(List<BigDecimal> values) {
            addCriterion("AWARD_MONEY in", values, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyNotIn(List<BigDecimal> values) {
            addCriterion("AWARD_MONEY not in", values, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AWARD_MONEY between", value1, value2, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andAwardMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AWARD_MONEY not between", value1, value2, "awardMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidIsNull() {
            addCriterion("business_paid is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidIsNotNull() {
            addCriterion("business_paid is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidEqualTo(String value) {
            addCriterion("business_paid =", value, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidNotEqualTo(String value) {
            addCriterion("business_paid <>", value, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidGreaterThan(String value) {
            addCriterion("business_paid >", value, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidGreaterThanOrEqualTo(String value) {
            addCriterion("business_paid >=", value, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidLessThan(String value) {
            addCriterion("business_paid <", value, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidLessThanOrEqualTo(String value) {
            addCriterion("business_paid <=", value, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidLike(String value) {
            addCriterion("business_paid like", value, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidNotLike(String value) {
            addCriterion("business_paid not like", value, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidIn(List<String> values) {
            addCriterion("business_paid in", values, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidNotIn(List<String> values) {
            addCriterion("business_paid not in", values, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidBetween(String value1, String value2) {
            addCriterion("business_paid between", value1, value2, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidNotBetween(String value1, String value2) {
            addCriterion("business_paid not between", value1, value2, "businessPaid");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesIsNull() {
            addCriterion("delivery_notes is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesIsNotNull() {
            addCriterion("delivery_notes is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesEqualTo(String value) {
            addCriterion("delivery_notes =", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesNotEqualTo(String value) {
            addCriterion("delivery_notes <>", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesGreaterThan(String value) {
            addCriterion("delivery_notes >", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_notes >=", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesLessThan(String value) {
            addCriterion("delivery_notes <", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesLessThanOrEqualTo(String value) {
            addCriterion("delivery_notes <=", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesLike(String value) {
            addCriterion("delivery_notes like", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesNotLike(String value) {
            addCriterion("delivery_notes not like", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesIn(List<String> values) {
            addCriterion("delivery_notes in", values, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesNotIn(List<String> values) {
            addCriterion("delivery_notes not in", values, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesBetween(String value1, String value2) {
            addCriterion("delivery_notes between", value1, value2, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesNotBetween(String value1, String value2) {
            addCriterion("delivery_notes not between", value1, value2, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andOrderIdLikeInsensitive(String value) {
            addCriterion("upper(ORDER_ID) like", value.toUpperCase(), "orderId");
            return (Criteria) this;
        }

        public Criteria andUrlFromNoLikeInsensitive(String value) {
            addCriterion("upper(URL_FROM_NO) like", value.toUpperCase(), "urlFromNo");
            return (Criteria) this;
        }

        public Criteria andGoodsBatchNoLikeInsensitive(String value) {
            addCriterion("upper(GOODS_BATCH_NO) like", value.toUpperCase(), "goodsBatchNo");
            return (Criteria) this;
        }

        public Criteria andMultiChannelOrderIdLikeInsensitive(String value) {
            addCriterion("upper(MULTI_CHANNEL_ORDER_ID) like", value.toUpperCase(), "multiChannelOrderId");
            return (Criteria) this;
        }

        public Criteria andIsUploadLikeInsensitive(String value) {
            addCriterion("upper(IS_UPLOAD) like", value.toUpperCase(), "isUpload");
            return (Criteria) this;
        }

        public Criteria andUploadTimeLikeInsensitive(String value) {
            addCriterion("upper(UPLOAD_TIME) like", value.toUpperCase(), "uploadTime");
            return (Criteria) this;
        }

        public Criteria andIsPaidLikeInsensitive(String value) {
            addCriterion("upper(IS_PAID) like", value.toUpperCase(), "isPaid");
            return (Criteria) this;
        }

        public Criteria andPaymentModeLikeInsensitive(String value) {
            addCriterion("upper(PAYMENT_MODE) like", value.toUpperCase(), "paymentMode");
            return (Criteria) this;
        }

        public Criteria andPaymentNoLikeInsensitive(String value) {
            addCriterion("upper(PAYMENT_NO) like", value.toUpperCase(), "paymentNo");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLikeInsensitive(String value) {
            addCriterion("upper(PAID_TIME) like", value.toUpperCase(), "paidTime");
            return (Criteria) this;
        }

        public Criteria andLimitDateLikeInsensitive(String value) {
            addCriterion("upper(LIMIT_DATE) like", value.toUpperCase(), "limitDate");
            return (Criteria) this;
        }

        public Criteria andPromoteRuleIdsLikeInsensitive(String value) {
            addCriterion("upper(PROMOTE_RULE_IDS) like", value.toUpperCase(), "promoteRuleIds");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdsLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_COMBINATION_IDS) like", value.toUpperCase(), "productCombinationIds");
            return (Criteria) this;
        }

        public Criteria andReturnTypeLikeInsensitive(String value) {
            addCriterion("upper(RETURN_TYPE) like", value.toUpperCase(), "returnType");
            return (Criteria) this;
        }

        public Criteria andReturnValueLikeInsensitive(String value) {
            addCriterion("upper(RETURN_VALUE) like", value.toUpperCase(), "returnValue");
            return (Criteria) this;
        }

        public Criteria andOrderMsgLikeInsensitive(String value) {
            addCriterion("upper(ORDER_MSG) like", value.toUpperCase(), "orderMsg");
            return (Criteria) this;
        }

        public Criteria andOrderNotesLikeInsensitive(String value) {
            addCriterion("upper(ORDER_NOTES) like", value.toUpperCase(), "orderNotes");
            return (Criteria) this;
        }

        public Criteria andAuditNotesLikeInsensitive(String value) {
            addCriterion("upper(AUDIT_NOTES) like", value.toUpperCase(), "auditNotes");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLikeInsensitive(String value) {
            addCriterion("upper(AUDIT_TIME) like", value.toUpperCase(), "auditTime");
            return (Criteria) this;
        }

        public Criteria andIsLockLikeInsensitive(String value) {
            addCriterion("upper(IS_LOCK) like", value.toUpperCase(), "isLock");
            return (Criteria) this;
        }

        public Criteria andLockTimeLikeInsensitive(String value) {
            addCriterion("upper(LOCK_TIME) like", value.toUpperCase(), "lockTime");
            return (Criteria) this;
        }

        public Criteria andCommitTimeLikeInsensitive(String value) {
            addCriterion("upper(COMMIT_TIME) like", value.toUpperCase(), "commitTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLikeInsensitive(String value) {
            addCriterion("upper(FINISH_TIME) like", value.toUpperCase(), "finishTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLikeInsensitive(String value) {
            addCriterion("upper(CANCEL_TIME) like", value.toUpperCase(), "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelNotesLikeInsensitive(String value) {
            addCriterion("upper(CANCEL_NOTES) like", value.toUpperCase(), "cancelNotes");
            return (Criteria) this;
        }

        public Criteria andIsCheckBillsLikeInsensitive(String value) {
            addCriterion("upper(IS_CHECK_BILLS) like", value.toUpperCase(), "isCheckBills");
            return (Criteria) this;
        }

        public Criteria andCheckBillTimeLikeInsensitive(String value) {
            addCriterion("upper(CHECK_BILL_TIME) like", value.toUpperCase(), "checkBillTime");
            return (Criteria) this;
        }

        public Criteria andIsIntoErpLikeInsensitive(String value) {
            addCriterion("upper(IS_INTO_ERP) like", value.toUpperCase(), "isIntoErp");
            return (Criteria) this;
        }

        public Criteria andIntoTimeLikeInsensitive(String value) {
            addCriterion("upper(INTO_TIME) like", value.toUpperCase(), "intoTime");
            return (Criteria) this;
        }

        public Criteria andReceiveUserLikeInsensitive(String value) {
            addCriterion("upper(RECEIVE_USER) like", value.toUpperCase(), "receiveUser");
            return (Criteria) this;
        }

        public Criteria andReceiveAddressLikeInsensitive(String value) {
            addCriterion("upper(RECEIVE_ADDRESS) like", value.toUpperCase(), "receiveAddress");
            return (Criteria) this;
        }

        public Criteria andReceiveFullAddressLikeInsensitive(String value) {
            addCriterion("upper(RECEIVE_FULL_ADDRESS) like", value.toUpperCase(), "receiveFullAddress");
            return (Criteria) this;
        }

        public Criteria andReceivePostLikeInsensitive(String value) {
            addCriterion("upper(RECEIVE_POST) like", value.toUpperCase(), "receivePost");
            return (Criteria) this;
        }

        public Criteria andReceiveTelLikeInsensitive(String value) {
            addCriterion("upper(RECEIVE_TEL) like", value.toUpperCase(), "receiveTel");
            return (Criteria) this;
        }

        public Criteria andReceiveMobileLikeInsensitive(String value) {
            addCriterion("upper(RECEIVE_MOBILE) like", value.toUpperCase(), "receiveMobile");
            return (Criteria) this;
        }

        public Criteria andReceiveEmailLikeInsensitive(String value) {
            addCriterion("upper(RECEIVE_EMAIL) like", value.toUpperCase(), "receiveEmail");
            return (Criteria) this;
        }

        public Criteria andReceiveDateTypeLikeInsensitive(String value) {
            addCriterion("upper(RECEIVE_DATE_TYPE) like", value.toUpperCase(), "receiveDateType");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeTypeLikeInsensitive(String value) {
            addCriterion("upper(RECEIVE_TIME_TYPE) like", value.toUpperCase(), "receiveTimeType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLikeInsensitive(String value) {
            addCriterion("upper(INVOICE_TYPE) like", value.toUpperCase(), "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentTypeLikeInsensitive(String value) {
            addCriterion("upper(INVOICE_CONTENT_TYPE) like", value.toUpperCase(), "invoiceContentType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTitleLikeInsensitive(String value) {
            addCriterion("upper(INVOICE_TITLE) like", value.toUpperCase(), "invoiceTitle");
            return (Criteria) this;
        }

        public Criteria andInvoiceContentLikeInsensitive(String value) {
            addCriterion("upper(INVOICE_CONTENT) like", value.toUpperCase(), "invoiceContent");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxNoLikeInsensitive(String value) {
            addCriterion("upper(INVOICE_TAX_NO) like", value.toUpperCase(), "invoiceTaxNo");
            return (Criteria) this;
        }

        public Criteria andIsDrawLikeInsensitive(String value) {
            addCriterion("upper(IS_DRAW) like", value.toUpperCase(), "isDraw");
            return (Criteria) this;
        }

        public Criteria andIsInvoiceLikeInsensitive(String value) {
            addCriterion("upper(IS_INVOICE) like", value.toUpperCase(), "isInvoice");
            return (Criteria) this;
        }

        public Criteria andBrandNameLikeInsensitive(String value) {
            addCriterion("upper(BRAND_NAME) like", value.toUpperCase(), "brandName");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAddressLikeInsensitive(String value) {
            addCriterion("upper(INVOICE_TAX_ADDRESS) like", value.toUpperCase(), "invoiceTaxAddress");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxTelLikeInsensitive(String value) {
            addCriterion("upper(INVOICE_TAX_TEL) like", value.toUpperCase(), "invoiceTaxTel");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxBankLikeInsensitive(String value) {
            addCriterion("upper(INVOICE_TAX_BANK) like", value.toUpperCase(), "invoiceTaxBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxAccountLikeInsensitive(String value) {
            addCriterion("upper(INVOICE_TAX_ACCOUNT) like", value.toUpperCase(), "invoiceTaxAccount");
            return (Criteria) this;
        }

        public Criteria andCouponNosLikeInsensitive(String value) {
            addCriterion("upper(COUPON_NOS) like", value.toUpperCase(), "couponNos");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLikeInsensitive(String value) {
            addCriterion("upper(ORDER_TYPE) like", value.toUpperCase(), "orderType");
            return (Criteria) this;
        }

        public Criteria andSelfPickupLikeInsensitive(String value) {
            addCriterion("upper(SELF_PICKUP) like", value.toUpperCase(), "selfPickup");
            return (Criteria) this;
        }

        public Criteria andTransportsNoLikeInsensitive(String value) {
            addCriterion("upper(TRANSPORTS_NO) like", value.toUpperCase(), "transportsNo");
            return (Criteria) this;
        }

        public Criteria andOriginCodeLikeInsensitive(String value) {
            addCriterion("upper(ORIGIN_CODE) like", value.toUpperCase(), "originCode");
            return (Criteria) this;
        }

        public Criteria andDestCodeLikeInsensitive(String value) {
            addCriterion("upper(DEST_CODE) like", value.toUpperCase(), "destCode");
            return (Criteria) this;
        }

        public Criteria andSfInterfaceLikeInsensitive(String value) {
            addCriterion("upper(SF_INTERFACE) like", value.toUpperCase(), "sfInterface");
            return (Criteria) this;
        }

        public Criteria andErpInterfaceLikeInsensitive(String value) {
            addCriterion("upper(ERP_INTERFACE) like", value.toUpperCase(), "erpInterface");
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

        public Criteria andVerifyCodeLikeInsensitive(String value) {
            addCriterion("upper(VERIFY_CODE) like", value.toUpperCase(), "verifyCode");
            return (Criteria) this;
        }

        public Criteria andIsCheckLikeInsensitive(String value) {
            addCriterion("upper(IS_CHECK) like", value.toUpperCase(), "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsGivePointsLikeInsensitive(String value) {
            addCriterion("upper(IS_GIVE_POINTS) like", value.toUpperCase(), "isGivePoints");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLikeInsensitive(String value) {
            addCriterion("upper(SOURCE_TYPE) like", value.toUpperCase(), "sourceType");
            return (Criteria) this;
        }

        public Criteria andBusinessPaidLikeInsensitive(String value) {
            addCriterion("upper(business_paid) like", value.toUpperCase(), "businessPaid");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesLikeInsensitive(String value) {
            addCriterion("upper(delivery_notes) like", value.toUpperCase(), "deliveryNotes");
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