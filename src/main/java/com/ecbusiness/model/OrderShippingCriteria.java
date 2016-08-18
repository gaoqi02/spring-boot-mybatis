package com.ecbusiness.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderShippingCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderShippingCriteria() {
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

        public Criteria andOrderShippingIdIsNull() {
            addCriterion("ORDER_SHIPPING_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderShippingIdIsNotNull() {
            addCriterion("ORDER_SHIPPING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShippingIdEqualTo(Integer value) {
            addCriterion("ORDER_SHIPPING_ID =", value, "orderShippingId");
            return (Criteria) this;
        }

        public Criteria andOrderShippingIdNotEqualTo(Integer value) {
            addCriterion("ORDER_SHIPPING_ID <>", value, "orderShippingId");
            return (Criteria) this;
        }

        public Criteria andOrderShippingIdGreaterThan(Integer value) {
            addCriterion("ORDER_SHIPPING_ID >", value, "orderShippingId");
            return (Criteria) this;
        }

        public Criteria andOrderShippingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_SHIPPING_ID >=", value, "orderShippingId");
            return (Criteria) this;
        }

        public Criteria andOrderShippingIdLessThan(Integer value) {
            addCriterion("ORDER_SHIPPING_ID <", value, "orderShippingId");
            return (Criteria) this;
        }

        public Criteria andOrderShippingIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_SHIPPING_ID <=", value, "orderShippingId");
            return (Criteria) this;
        }

        public Criteria andOrderShippingIdIn(List<Integer> values) {
            addCriterion("ORDER_SHIPPING_ID in", values, "orderShippingId");
            return (Criteria) this;
        }

        public Criteria andOrderShippingIdNotIn(List<Integer> values) {
            addCriterion("ORDER_SHIPPING_ID not in", values, "orderShippingId");
            return (Criteria) this;
        }

        public Criteria andOrderShippingIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_SHIPPING_ID between", value1, value2, "orderShippingId");
            return (Criteria) this;
        }

        public Criteria andOrderShippingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_SHIPPING_ID not between", value1, value2, "orderShippingId");
            return (Criteria) this;
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

        public Criteria andOrderShippingNoIsNull() {
            addCriterion("ORDER_SHIPPING_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoIsNotNull() {
            addCriterion("ORDER_SHIPPING_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoEqualTo(String value) {
            addCriterion("ORDER_SHIPPING_NO =", value, "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoNotEqualTo(String value) {
            addCriterion("ORDER_SHIPPING_NO <>", value, "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoGreaterThan(String value) {
            addCriterion("ORDER_SHIPPING_NO >", value, "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_SHIPPING_NO >=", value, "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoLessThan(String value) {
            addCriterion("ORDER_SHIPPING_NO <", value, "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoLessThanOrEqualTo(String value) {
            addCriterion("ORDER_SHIPPING_NO <=", value, "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoLike(String value) {
            addCriterion("ORDER_SHIPPING_NO like", value, "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoNotLike(String value) {
            addCriterion("ORDER_SHIPPING_NO not like", value, "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoIn(List<String> values) {
            addCriterion("ORDER_SHIPPING_NO in", values, "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoNotIn(List<String> values) {
            addCriterion("ORDER_SHIPPING_NO not in", values, "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoBetween(String value1, String value2) {
            addCriterion("ORDER_SHIPPING_NO between", value1, value2, "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoNotBetween(String value1, String value2) {
            addCriterion("ORDER_SHIPPING_NO not between", value1, value2, "orderShippingNo");
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

        public Criteria andPrintStateIsNull() {
            addCriterion("PRINT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andPrintStateIsNotNull() {
            addCriterion("PRINT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andPrintStateEqualTo(String value) {
            addCriterion("PRINT_STATE =", value, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintStateNotEqualTo(String value) {
            addCriterion("PRINT_STATE <>", value, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintStateGreaterThan(String value) {
            addCriterion("PRINT_STATE >", value, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintStateGreaterThanOrEqualTo(String value) {
            addCriterion("PRINT_STATE >=", value, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintStateLessThan(String value) {
            addCriterion("PRINT_STATE <", value, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintStateLessThanOrEqualTo(String value) {
            addCriterion("PRINT_STATE <=", value, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintStateLike(String value) {
            addCriterion("PRINT_STATE like", value, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintStateNotLike(String value) {
            addCriterion("PRINT_STATE not like", value, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintStateIn(List<String> values) {
            addCriterion("PRINT_STATE in", values, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintStateNotIn(List<String> values) {
            addCriterion("PRINT_STATE not in", values, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintStateBetween(String value1, String value2) {
            addCriterion("PRINT_STATE between", value1, value2, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintStateNotBetween(String value1, String value2) {
            addCriterion("PRINT_STATE not between", value1, value2, "printState");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIsNull() {
            addCriterion("PRINT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIsNotNull() {
            addCriterion("PRINT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andPrintTimeEqualTo(String value) {
            addCriterion("PRINT_TIME =", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotEqualTo(String value) {
            addCriterion("PRINT_TIME <>", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeGreaterThan(String value) {
            addCriterion("PRINT_TIME >", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeGreaterThanOrEqualTo(String value) {
            addCriterion("PRINT_TIME >=", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLessThan(String value) {
            addCriterion("PRINT_TIME <", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLessThanOrEqualTo(String value) {
            addCriterion("PRINT_TIME <=", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLike(String value) {
            addCriterion("PRINT_TIME like", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotLike(String value) {
            addCriterion("PRINT_TIME not like", value, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeIn(List<String> values) {
            addCriterion("PRINT_TIME in", values, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotIn(List<String> values) {
            addCriterion("PRINT_TIME not in", values, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeBetween(String value1, String value2) {
            addCriterion("PRINT_TIME between", value1, value2, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintTimeNotBetween(String value1, String value2) {
            addCriterion("PRINT_TIME not between", value1, value2, "printTime");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdIsNull() {
            addCriterion("PRINT_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdIsNotNull() {
            addCriterion("PRINT_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdEqualTo(Integer value) {
            addCriterion("PRINT_USER_ID =", value, "printUserId");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdNotEqualTo(Integer value) {
            addCriterion("PRINT_USER_ID <>", value, "printUserId");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdGreaterThan(Integer value) {
            addCriterion("PRINT_USER_ID >", value, "printUserId");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRINT_USER_ID >=", value, "printUserId");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdLessThan(Integer value) {
            addCriterion("PRINT_USER_ID <", value, "printUserId");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRINT_USER_ID <=", value, "printUserId");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdIn(List<Integer> values) {
            addCriterion("PRINT_USER_ID in", values, "printUserId");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdNotIn(List<Integer> values) {
            addCriterion("PRINT_USER_ID not in", values, "printUserId");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdBetween(Integer value1, Integer value2) {
            addCriterion("PRINT_USER_ID between", value1, value2, "printUserId");
            return (Criteria) this;
        }

        public Criteria andPrintUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRINT_USER_ID not between", value1, value2, "printUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualIsNull() {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL is null");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualIsNotNull() {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualEqualTo(BigDecimal value) {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL =", value, "logisticWeightsActual");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualNotEqualTo(BigDecimal value) {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL <>", value, "logisticWeightsActual");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualGreaterThan(BigDecimal value) {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL >", value, "logisticWeightsActual");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL >=", value, "logisticWeightsActual");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualLessThan(BigDecimal value) {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL <", value, "logisticWeightsActual");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL <=", value, "logisticWeightsActual");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualIn(List<BigDecimal> values) {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL in", values, "logisticWeightsActual");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualNotIn(List<BigDecimal> values) {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL not in", values, "logisticWeightsActual");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL between", value1, value2, "logisticWeightsActual");
            return (Criteria) this;
        }

        public Criteria andLogisticWeightsActualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGISTIC_WEIGHTS_ACTUAL not between", value1, value2, "logisticWeightsActual");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualIsNull() {
            addCriterion("LOGISTIC_FEE_ACTUAL is null");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualIsNotNull() {
            addCriterion("LOGISTIC_FEE_ACTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualEqualTo(BigDecimal value) {
            addCriterion("LOGISTIC_FEE_ACTUAL =", value, "logisticFeeActual");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualNotEqualTo(BigDecimal value) {
            addCriterion("LOGISTIC_FEE_ACTUAL <>", value, "logisticFeeActual");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualGreaterThan(BigDecimal value) {
            addCriterion("LOGISTIC_FEE_ACTUAL >", value, "logisticFeeActual");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGISTIC_FEE_ACTUAL >=", value, "logisticFeeActual");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualLessThan(BigDecimal value) {
            addCriterion("LOGISTIC_FEE_ACTUAL <", value, "logisticFeeActual");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOGISTIC_FEE_ACTUAL <=", value, "logisticFeeActual");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualIn(List<BigDecimal> values) {
            addCriterion("LOGISTIC_FEE_ACTUAL in", values, "logisticFeeActual");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualNotIn(List<BigDecimal> values) {
            addCriterion("LOGISTIC_FEE_ACTUAL not in", values, "logisticFeeActual");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGISTIC_FEE_ACTUAL between", value1, value2, "logisticFeeActual");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeActualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOGISTIC_FEE_ACTUAL not between", value1, value2, "logisticFeeActual");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdIsNull() {
            addCriterion("LOGISTIC_FEE_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdIsNotNull() {
            addCriterion("LOGISTIC_FEE_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdEqualTo(Integer value) {
            addCriterion("LOGISTIC_FEE_USER_ID =", value, "logisticFeeUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdNotEqualTo(Integer value) {
            addCriterion("LOGISTIC_FEE_USER_ID <>", value, "logisticFeeUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdGreaterThan(Integer value) {
            addCriterion("LOGISTIC_FEE_USER_ID >", value, "logisticFeeUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGISTIC_FEE_USER_ID >=", value, "logisticFeeUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdLessThan(Integer value) {
            addCriterion("LOGISTIC_FEE_USER_ID <", value, "logisticFeeUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("LOGISTIC_FEE_USER_ID <=", value, "logisticFeeUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdIn(List<Integer> values) {
            addCriterion("LOGISTIC_FEE_USER_ID in", values, "logisticFeeUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdNotIn(List<Integer> values) {
            addCriterion("LOGISTIC_FEE_USER_ID not in", values, "logisticFeeUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdBetween(Integer value1, Integer value2) {
            addCriterion("LOGISTIC_FEE_USER_ID between", value1, value2, "logisticFeeUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("LOGISTIC_FEE_USER_ID not between", value1, value2, "logisticFeeUserId");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeIsNull() {
            addCriterion("LOGISTIC_FEE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeIsNotNull() {
            addCriterion("LOGISTIC_FEE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeEqualTo(String value) {
            addCriterion("LOGISTIC_FEE_TIME =", value, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeNotEqualTo(String value) {
            addCriterion("LOGISTIC_FEE_TIME <>", value, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeGreaterThan(String value) {
            addCriterion("LOGISTIC_FEE_TIME >", value, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LOGISTIC_FEE_TIME >=", value, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeLessThan(String value) {
            addCriterion("LOGISTIC_FEE_TIME <", value, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeLessThanOrEqualTo(String value) {
            addCriterion("LOGISTIC_FEE_TIME <=", value, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeLike(String value) {
            addCriterion("LOGISTIC_FEE_TIME like", value, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeNotLike(String value) {
            addCriterion("LOGISTIC_FEE_TIME not like", value, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeIn(List<String> values) {
            addCriterion("LOGISTIC_FEE_TIME in", values, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeNotIn(List<String> values) {
            addCriterion("LOGISTIC_FEE_TIME not in", values, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeBetween(String value1, String value2) {
            addCriterion("LOGISTIC_FEE_TIME between", value1, value2, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeNotBetween(String value1, String value2) {
            addCriterion("LOGISTIC_FEE_TIME not between", value1, value2, "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andIsShippingIsNull() {
            addCriterion("IS_SHIPPING is null");
            return (Criteria) this;
        }

        public Criteria andIsShippingIsNotNull() {
            addCriterion("IS_SHIPPING is not null");
            return (Criteria) this;
        }

        public Criteria andIsShippingEqualTo(String value) {
            addCriterion("IS_SHIPPING =", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingNotEqualTo(String value) {
            addCriterion("IS_SHIPPING <>", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingGreaterThan(String value) {
            addCriterion("IS_SHIPPING >", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHIPPING >=", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingLessThan(String value) {
            addCriterion("IS_SHIPPING <", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingLessThanOrEqualTo(String value) {
            addCriterion("IS_SHIPPING <=", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingLike(String value) {
            addCriterion("IS_SHIPPING like", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingNotLike(String value) {
            addCriterion("IS_SHIPPING not like", value, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingIn(List<String> values) {
            addCriterion("IS_SHIPPING in", values, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingNotIn(List<String> values) {
            addCriterion("IS_SHIPPING not in", values, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingBetween(String value1, String value2) {
            addCriterion("IS_SHIPPING between", value1, value2, "isShipping");
            return (Criteria) this;
        }

        public Criteria andIsShippingNotBetween(String value1, String value2) {
            addCriterion("IS_SHIPPING not between", value1, value2, "isShipping");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNull() {
            addCriterion("SHIPPING_TIME is null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIsNotNull() {
            addCriterion("SHIPPING_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andShippingTimeEqualTo(String value) {
            addCriterion("SHIPPING_TIME =", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotEqualTo(String value) {
            addCriterion("SHIPPING_TIME <>", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThan(String value) {
            addCriterion("SHIPPING_TIME >", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeGreaterThanOrEqualTo(String value) {
            addCriterion("SHIPPING_TIME >=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThan(String value) {
            addCriterion("SHIPPING_TIME <", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLessThanOrEqualTo(String value) {
            addCriterion("SHIPPING_TIME <=", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLike(String value) {
            addCriterion("SHIPPING_TIME like", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotLike(String value) {
            addCriterion("SHIPPING_TIME not like", value, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeIn(List<String> values) {
            addCriterion("SHIPPING_TIME in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotIn(List<String> values) {
            addCriterion("SHIPPING_TIME not in", values, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeBetween(String value1, String value2) {
            addCriterion("SHIPPING_TIME between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andShippingTimeNotBetween(String value1, String value2) {
            addCriterion("SHIPPING_TIME not between", value1, value2, "shippingTime");
            return (Criteria) this;
        }

        public Criteria andFromCompanyIsNull() {
            addCriterion("FROM_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andFromCompanyIsNotNull() {
            addCriterion("FROM_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andFromCompanyEqualTo(String value) {
            addCriterion("FROM_COMPANY =", value, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromCompanyNotEqualTo(String value) {
            addCriterion("FROM_COMPANY <>", value, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromCompanyGreaterThan(String value) {
            addCriterion("FROM_COMPANY >", value, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_COMPANY >=", value, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromCompanyLessThan(String value) {
            addCriterion("FROM_COMPANY <", value, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromCompanyLessThanOrEqualTo(String value) {
            addCriterion("FROM_COMPANY <=", value, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromCompanyLike(String value) {
            addCriterion("FROM_COMPANY like", value, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromCompanyNotLike(String value) {
            addCriterion("FROM_COMPANY not like", value, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromCompanyIn(List<String> values) {
            addCriterion("FROM_COMPANY in", values, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromCompanyNotIn(List<String> values) {
            addCriterion("FROM_COMPANY not in", values, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromCompanyBetween(String value1, String value2) {
            addCriterion("FROM_COMPANY between", value1, value2, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromCompanyNotBetween(String value1, String value2) {
            addCriterion("FROM_COMPANY not between", value1, value2, "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNull() {
            addCriterion("FROM_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNotNull() {
            addCriterion("FROM_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andFromAddressEqualTo(String value) {
            addCriterion("FROM_ADDRESS =", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotEqualTo(String value) {
            addCriterion("FROM_ADDRESS <>", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThan(String value) {
            addCriterion("FROM_ADDRESS >", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_ADDRESS >=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThan(String value) {
            addCriterion("FROM_ADDRESS <", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThanOrEqualTo(String value) {
            addCriterion("FROM_ADDRESS <=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLike(String value) {
            addCriterion("FROM_ADDRESS like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotLike(String value) {
            addCriterion("FROM_ADDRESS not like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressIn(List<String> values) {
            addCriterion("FROM_ADDRESS in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotIn(List<String> values) {
            addCriterion("FROM_ADDRESS not in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressBetween(String value1, String value2) {
            addCriterion("FROM_ADDRESS between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotBetween(String value1, String value2) {
            addCriterion("FROM_ADDRESS not between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromTelIsNull() {
            addCriterion("FROM_TEL is null");
            return (Criteria) this;
        }

        public Criteria andFromTelIsNotNull() {
            addCriterion("FROM_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andFromTelEqualTo(String value) {
            addCriterion("FROM_TEL =", value, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromTelNotEqualTo(String value) {
            addCriterion("FROM_TEL <>", value, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromTelGreaterThan(String value) {
            addCriterion("FROM_TEL >", value, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromTelGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_TEL >=", value, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromTelLessThan(String value) {
            addCriterion("FROM_TEL <", value, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromTelLessThanOrEqualTo(String value) {
            addCriterion("FROM_TEL <=", value, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromTelLike(String value) {
            addCriterion("FROM_TEL like", value, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromTelNotLike(String value) {
            addCriterion("FROM_TEL not like", value, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromTelIn(List<String> values) {
            addCriterion("FROM_TEL in", values, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromTelNotIn(List<String> values) {
            addCriterion("FROM_TEL not in", values, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromTelBetween(String value1, String value2) {
            addCriterion("FROM_TEL between", value1, value2, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromTelNotBetween(String value1, String value2) {
            addCriterion("FROM_TEL not between", value1, value2, "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromUserIsNull() {
            addCriterion("FROM_USER is null");
            return (Criteria) this;
        }

        public Criteria andFromUserIsNotNull() {
            addCriterion("FROM_USER is not null");
            return (Criteria) this;
        }

        public Criteria andFromUserEqualTo(String value) {
            addCriterion("FROM_USER =", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserNotEqualTo(String value) {
            addCriterion("FROM_USER <>", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserGreaterThan(String value) {
            addCriterion("FROM_USER >", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserGreaterThanOrEqualTo(String value) {
            addCriterion("FROM_USER >=", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserLessThan(String value) {
            addCriterion("FROM_USER <", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserLessThanOrEqualTo(String value) {
            addCriterion("FROM_USER <=", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserLike(String value) {
            addCriterion("FROM_USER like", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserNotLike(String value) {
            addCriterion("FROM_USER not like", value, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserIn(List<String> values) {
            addCriterion("FROM_USER in", values, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserNotIn(List<String> values) {
            addCriterion("FROM_USER not in", values, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserBetween(String value1, String value2) {
            addCriterion("FROM_USER between", value1, value2, "fromUser");
            return (Criteria) this;
        }

        public Criteria andFromUserNotBetween(String value1, String value2) {
            addCriterion("FROM_USER not between", value1, value2, "fromUser");
            return (Criteria) this;
        }

        public Criteria andToUserIsNull() {
            addCriterion("TO_USER is null");
            return (Criteria) this;
        }

        public Criteria andToUserIsNotNull() {
            addCriterion("TO_USER is not null");
            return (Criteria) this;
        }

        public Criteria andToUserEqualTo(String value) {
            addCriterion("TO_USER =", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserNotEqualTo(String value) {
            addCriterion("TO_USER <>", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserGreaterThan(String value) {
            addCriterion("TO_USER >", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserGreaterThanOrEqualTo(String value) {
            addCriterion("TO_USER >=", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserLessThan(String value) {
            addCriterion("TO_USER <", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserLessThanOrEqualTo(String value) {
            addCriterion("TO_USER <=", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserLike(String value) {
            addCriterion("TO_USER like", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserNotLike(String value) {
            addCriterion("TO_USER not like", value, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserIn(List<String> values) {
            addCriterion("TO_USER in", values, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserNotIn(List<String> values) {
            addCriterion("TO_USER not in", values, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserBetween(String value1, String value2) {
            addCriterion("TO_USER between", value1, value2, "toUser");
            return (Criteria) this;
        }

        public Criteria andToUserNotBetween(String value1, String value2) {
            addCriterion("TO_USER not between", value1, value2, "toUser");
            return (Criteria) this;
        }

        public Criteria andToAddressIsNull() {
            addCriterion("TO_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andToAddressIsNotNull() {
            addCriterion("TO_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andToAddressEqualTo(String value) {
            addCriterion("TO_ADDRESS =", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotEqualTo(String value) {
            addCriterion("TO_ADDRESS <>", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressGreaterThan(String value) {
            addCriterion("TO_ADDRESS >", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressGreaterThanOrEqualTo(String value) {
            addCriterion("TO_ADDRESS >=", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLessThan(String value) {
            addCriterion("TO_ADDRESS <", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLessThanOrEqualTo(String value) {
            addCriterion("TO_ADDRESS <=", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLike(String value) {
            addCriterion("TO_ADDRESS like", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotLike(String value) {
            addCriterion("TO_ADDRESS not like", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressIn(List<String> values) {
            addCriterion("TO_ADDRESS in", values, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotIn(List<String> values) {
            addCriterion("TO_ADDRESS not in", values, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressBetween(String value1, String value2) {
            addCriterion("TO_ADDRESS between", value1, value2, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotBetween(String value1, String value2) {
            addCriterion("TO_ADDRESS not between", value1, value2, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToTelIsNull() {
            addCriterion("TO_TEL is null");
            return (Criteria) this;
        }

        public Criteria andToTelIsNotNull() {
            addCriterion("TO_TEL is not null");
            return (Criteria) this;
        }

        public Criteria andToTelEqualTo(String value) {
            addCriterion("TO_TEL =", value, "toTel");
            return (Criteria) this;
        }

        public Criteria andToTelNotEqualTo(String value) {
            addCriterion("TO_TEL <>", value, "toTel");
            return (Criteria) this;
        }

        public Criteria andToTelGreaterThan(String value) {
            addCriterion("TO_TEL >", value, "toTel");
            return (Criteria) this;
        }

        public Criteria andToTelGreaterThanOrEqualTo(String value) {
            addCriterion("TO_TEL >=", value, "toTel");
            return (Criteria) this;
        }

        public Criteria andToTelLessThan(String value) {
            addCriterion("TO_TEL <", value, "toTel");
            return (Criteria) this;
        }

        public Criteria andToTelLessThanOrEqualTo(String value) {
            addCriterion("TO_TEL <=", value, "toTel");
            return (Criteria) this;
        }

        public Criteria andToTelLike(String value) {
            addCriterion("TO_TEL like", value, "toTel");
            return (Criteria) this;
        }

        public Criteria andToTelNotLike(String value) {
            addCriterion("TO_TEL not like", value, "toTel");
            return (Criteria) this;
        }

        public Criteria andToTelIn(List<String> values) {
            addCriterion("TO_TEL in", values, "toTel");
            return (Criteria) this;
        }

        public Criteria andToTelNotIn(List<String> values) {
            addCriterion("TO_TEL not in", values, "toTel");
            return (Criteria) this;
        }

        public Criteria andToTelBetween(String value1, String value2) {
            addCriterion("TO_TEL between", value1, value2, "toTel");
            return (Criteria) this;
        }

        public Criteria andToTelNotBetween(String value1, String value2) {
            addCriterion("TO_TEL not between", value1, value2, "toTel");
            return (Criteria) this;
        }

        public Criteria andToMobileIsNull() {
            addCriterion("TO_MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andToMobileIsNotNull() {
            addCriterion("TO_MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andToMobileEqualTo(String value) {
            addCriterion("TO_MOBILE =", value, "toMobile");
            return (Criteria) this;
        }

        public Criteria andToMobileNotEqualTo(String value) {
            addCriterion("TO_MOBILE <>", value, "toMobile");
            return (Criteria) this;
        }

        public Criteria andToMobileGreaterThan(String value) {
            addCriterion("TO_MOBILE >", value, "toMobile");
            return (Criteria) this;
        }

        public Criteria andToMobileGreaterThanOrEqualTo(String value) {
            addCriterion("TO_MOBILE >=", value, "toMobile");
            return (Criteria) this;
        }

        public Criteria andToMobileLessThan(String value) {
            addCriterion("TO_MOBILE <", value, "toMobile");
            return (Criteria) this;
        }

        public Criteria andToMobileLessThanOrEqualTo(String value) {
            addCriterion("TO_MOBILE <=", value, "toMobile");
            return (Criteria) this;
        }

        public Criteria andToMobileLike(String value) {
            addCriterion("TO_MOBILE like", value, "toMobile");
            return (Criteria) this;
        }

        public Criteria andToMobileNotLike(String value) {
            addCriterion("TO_MOBILE not like", value, "toMobile");
            return (Criteria) this;
        }

        public Criteria andToMobileIn(List<String> values) {
            addCriterion("TO_MOBILE in", values, "toMobile");
            return (Criteria) this;
        }

        public Criteria andToMobileNotIn(List<String> values) {
            addCriterion("TO_MOBILE not in", values, "toMobile");
            return (Criteria) this;
        }

        public Criteria andToMobileBetween(String value1, String value2) {
            addCriterion("TO_MOBILE between", value1, value2, "toMobile");
            return (Criteria) this;
        }

        public Criteria andToMobileNotBetween(String value1, String value2) {
            addCriterion("TO_MOBILE not between", value1, value2, "toMobile");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceIsNull() {
            addCriterion("IS_INSURANCE is null");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceIsNotNull() {
            addCriterion("IS_INSURANCE is not null");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceEqualTo(String value) {
            addCriterion("IS_INSURANCE =", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceNotEqualTo(String value) {
            addCriterion("IS_INSURANCE <>", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceGreaterThan(String value) {
            addCriterion("IS_INSURANCE >", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceGreaterThanOrEqualTo(String value) {
            addCriterion("IS_INSURANCE >=", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceLessThan(String value) {
            addCriterion("IS_INSURANCE <", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceLessThanOrEqualTo(String value) {
            addCriterion("IS_INSURANCE <=", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceLike(String value) {
            addCriterion("IS_INSURANCE like", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceNotLike(String value) {
            addCriterion("IS_INSURANCE not like", value, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceIn(List<String> values) {
            addCriterion("IS_INSURANCE in", values, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceNotIn(List<String> values) {
            addCriterion("IS_INSURANCE not in", values, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceBetween(String value1, String value2) {
            addCriterion("IS_INSURANCE between", value1, value2, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceNotBetween(String value1, String value2) {
            addCriterion("IS_INSURANCE not between", value1, value2, "isInsurance");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeIsNull() {
            addCriterion("GOODS_FEE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeIsNotNull() {
            addCriterion("GOODS_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeEqualTo(BigDecimal value) {
            addCriterion("GOODS_FEE =", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeNotEqualTo(BigDecimal value) {
            addCriterion("GOODS_FEE <>", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeGreaterThan(BigDecimal value) {
            addCriterion("GOODS_FEE >", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_FEE >=", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeLessThan(BigDecimal value) {
            addCriterion("GOODS_FEE <", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_FEE <=", value, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeIn(List<BigDecimal> values) {
            addCriterion("GOODS_FEE in", values, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeNotIn(List<BigDecimal> values) {
            addCriterion("GOODS_FEE not in", values, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_FEE between", value1, value2, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andGoodsFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_FEE not between", value1, value2, "goodsFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIsNull() {
            addCriterion("INSURANCE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIsNotNull() {
            addCriterion("INSURANCE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeEqualTo(BigDecimal value) {
            addCriterion("INSURANCE_FEE =", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotEqualTo(BigDecimal value) {
            addCriterion("INSURANCE_FEE <>", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeGreaterThan(BigDecimal value) {
            addCriterion("INSURANCE_FEE >", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCE_FEE >=", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeLessThan(BigDecimal value) {
            addCriterion("INSURANCE_FEE <", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("INSURANCE_FEE <=", value, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeIn(List<BigDecimal> values) {
            addCriterion("INSURANCE_FEE in", values, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotIn(List<BigDecimal> values) {
            addCriterion("INSURANCE_FEE not in", values, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCE_FEE between", value1, value2, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andInsuranceFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("INSURANCE_FEE not between", value1, value2, "insuranceFee");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("PAYMENT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("PAYMENT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(String value) {
            addCriterion("PAYMENT_TYPE =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(String value) {
            addCriterion("PAYMENT_TYPE <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(String value) {
            addCriterion("PAYMENT_TYPE >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TYPE >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(String value) {
            addCriterion("PAYMENT_TYPE <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(String value) {
            addCriterion("PAYMENT_TYPE <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLike(String value) {
            addCriterion("PAYMENT_TYPE like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotLike(String value) {
            addCriterion("PAYMENT_TYPE not like", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<String> values) {
            addCriterion("PAYMENT_TYPE in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<String> values) {
            addCriterion("PAYMENT_TYPE not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(String value1, String value2) {
            addCriterion("PAYMENT_TYPE between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(String value1, String value2) {
            addCriterion("PAYMENT_TYPE not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeIsNull() {
            addCriterion("DELIVERY_DATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeIsNotNull() {
            addCriterion("DELIVERY_DATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeEqualTo(String value) {
            addCriterion("DELIVERY_DATE_TYPE =", value, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeNotEqualTo(String value) {
            addCriterion("DELIVERY_DATE_TYPE <>", value, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeGreaterThan(String value) {
            addCriterion("DELIVERY_DATE_TYPE >", value, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_DATE_TYPE >=", value, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeLessThan(String value) {
            addCriterion("DELIVERY_DATE_TYPE <", value, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_DATE_TYPE <=", value, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeLike(String value) {
            addCriterion("DELIVERY_DATE_TYPE like", value, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeNotLike(String value) {
            addCriterion("DELIVERY_DATE_TYPE not like", value, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeIn(List<String> values) {
            addCriterion("DELIVERY_DATE_TYPE in", values, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeNotIn(List<String> values) {
            addCriterion("DELIVERY_DATE_TYPE not in", values, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeBetween(String value1, String value2) {
            addCriterion("DELIVERY_DATE_TYPE between", value1, value2, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_DATE_TYPE not between", value1, value2, "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeIsNull() {
            addCriterion("DELIVERY_TIME_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeIsNotNull() {
            addCriterion("DELIVERY_TIME_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeEqualTo(String value) {
            addCriterion("DELIVERY_TIME_TYPE =", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeNotEqualTo(String value) {
            addCriterion("DELIVERY_TIME_TYPE <>", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeGreaterThan(String value) {
            addCriterion("DELIVERY_TIME_TYPE >", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_TIME_TYPE >=", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeLessThan(String value) {
            addCriterion("DELIVERY_TIME_TYPE <", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_TIME_TYPE <=", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeLike(String value) {
            addCriterion("DELIVERY_TIME_TYPE like", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeNotLike(String value) {
            addCriterion("DELIVERY_TIME_TYPE not like", value, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeIn(List<String> values) {
            addCriterion("DELIVERY_TIME_TYPE in", values, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeNotIn(List<String> values) {
            addCriterion("DELIVERY_TIME_TYPE not in", values, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeBetween(String value1, String value2) {
            addCriterion("DELIVERY_TIME_TYPE between", value1, value2, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_TIME_TYPE not between", value1, value2, "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNull() {
            addCriterion("GOODS_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIsNotNull() {
            addCriterion("GOODS_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountEqualTo(Integer value) {
            addCriterion("GOODS_AMOUNT =", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotEqualTo(Integer value) {
            addCriterion("GOODS_AMOUNT <>", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThan(Integer value) {
            addCriterion("GOODS_AMOUNT >", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_AMOUNT >=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThan(Integer value) {
            addCriterion("GOODS_AMOUNT <", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_AMOUNT <=", value, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountIn(List<Integer> values) {
            addCriterion("GOODS_AMOUNT in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotIn(List<Integer> values) {
            addCriterion("GOODS_AMOUNT not in", values, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_AMOUNT between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andGoodsAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_AMOUNT not between", value1, value2, "goodsAmount");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesIsNull() {
            addCriterion("DELIVERY_NOTES is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesIsNotNull() {
            addCriterion("DELIVERY_NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesEqualTo(String value) {
            addCriterion("DELIVERY_NOTES =", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesNotEqualTo(String value) {
            addCriterion("DELIVERY_NOTES <>", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesGreaterThan(String value) {
            addCriterion("DELIVERY_NOTES >", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesGreaterThanOrEqualTo(String value) {
            addCriterion("DELIVERY_NOTES >=", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesLessThan(String value) {
            addCriterion("DELIVERY_NOTES <", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesLessThanOrEqualTo(String value) {
            addCriterion("DELIVERY_NOTES <=", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesLike(String value) {
            addCriterion("DELIVERY_NOTES like", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesNotLike(String value) {
            addCriterion("DELIVERY_NOTES not like", value, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesIn(List<String> values) {
            addCriterion("DELIVERY_NOTES in", values, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesNotIn(List<String> values) {
            addCriterion("DELIVERY_NOTES not in", values, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesBetween(String value1, String value2) {
            addCriterion("DELIVERY_NOTES between", value1, value2, "deliveryNotes");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesNotBetween(String value1, String value2) {
            addCriterion("DELIVERY_NOTES not between", value1, value2, "deliveryNotes");
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

        public Criteria andOrderDeliveryIdIsNull() {
            addCriterion("ORDER_DELIVERY_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryIdIsNotNull() {
            addCriterion("ORDER_DELIVERY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryIdEqualTo(Integer value) {
            addCriterion("ORDER_DELIVERY_ID =", value, "orderDeliveryId");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryIdNotEqualTo(Integer value) {
            addCriterion("ORDER_DELIVERY_ID <>", value, "orderDeliveryId");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryIdGreaterThan(Integer value) {
            addCriterion("ORDER_DELIVERY_ID >", value, "orderDeliveryId");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_DELIVERY_ID >=", value, "orderDeliveryId");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryIdLessThan(Integer value) {
            addCriterion("ORDER_DELIVERY_ID <", value, "orderDeliveryId");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_DELIVERY_ID <=", value, "orderDeliveryId");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryIdIn(List<Integer> values) {
            addCriterion("ORDER_DELIVERY_ID in", values, "orderDeliveryId");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryIdNotIn(List<Integer> values) {
            addCriterion("ORDER_DELIVERY_ID not in", values, "orderDeliveryId");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_DELIVERY_ID between", value1, value2, "orderDeliveryId");
            return (Criteria) this;
        }

        public Criteria andOrderDeliveryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_DELIVERY_ID not between", value1, value2, "orderDeliveryId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLikeInsensitive(String value) {
            addCriterion("upper(ORDER_ID) like", value.toUpperCase(), "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderShippingNoLikeInsensitive(String value) {
            addCriterion("upper(ORDER_SHIPPING_NO) like", value.toUpperCase(), "orderShippingNo");
            return (Criteria) this;
        }

        public Criteria andPrintStateLikeInsensitive(String value) {
            addCriterion("upper(PRINT_STATE) like", value.toUpperCase(), "printState");
            return (Criteria) this;
        }

        public Criteria andPrintTimeLikeInsensitive(String value) {
            addCriterion("upper(PRINT_TIME) like", value.toUpperCase(), "printTime");
            return (Criteria) this;
        }

        public Criteria andLogisticFeeTimeLikeInsensitive(String value) {
            addCriterion("upper(LOGISTIC_FEE_TIME) like", value.toUpperCase(), "logisticFeeTime");
            return (Criteria) this;
        }

        public Criteria andIsShippingLikeInsensitive(String value) {
            addCriterion("upper(IS_SHIPPING) like", value.toUpperCase(), "isShipping");
            return (Criteria) this;
        }

        public Criteria andShippingTimeLikeInsensitive(String value) {
            addCriterion("upper(SHIPPING_TIME) like", value.toUpperCase(), "shippingTime");
            return (Criteria) this;
        }

        public Criteria andFromCompanyLikeInsensitive(String value) {
            addCriterion("upper(FROM_COMPANY) like", value.toUpperCase(), "fromCompany");
            return (Criteria) this;
        }

        public Criteria andFromAddressLikeInsensitive(String value) {
            addCriterion("upper(FROM_ADDRESS) like", value.toUpperCase(), "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromTelLikeInsensitive(String value) {
            addCriterion("upper(FROM_TEL) like", value.toUpperCase(), "fromTel");
            return (Criteria) this;
        }

        public Criteria andFromUserLikeInsensitive(String value) {
            addCriterion("upper(FROM_USER) like", value.toUpperCase(), "fromUser");
            return (Criteria) this;
        }

        public Criteria andToUserLikeInsensitive(String value) {
            addCriterion("upper(TO_USER) like", value.toUpperCase(), "toUser");
            return (Criteria) this;
        }

        public Criteria andToAddressLikeInsensitive(String value) {
            addCriterion("upper(TO_ADDRESS) like", value.toUpperCase(), "toAddress");
            return (Criteria) this;
        }

        public Criteria andToTelLikeInsensitive(String value) {
            addCriterion("upper(TO_TEL) like", value.toUpperCase(), "toTel");
            return (Criteria) this;
        }

        public Criteria andToMobileLikeInsensitive(String value) {
            addCriterion("upper(TO_MOBILE) like", value.toUpperCase(), "toMobile");
            return (Criteria) this;
        }

        public Criteria andIsInsuranceLikeInsensitive(String value) {
            addCriterion("upper(IS_INSURANCE) like", value.toUpperCase(), "isInsurance");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLikeInsensitive(String value) {
            addCriterion("upper(PAYMENT_TYPE) like", value.toUpperCase(), "paymentType");
            return (Criteria) this;
        }

        public Criteria andDeliveryDateTypeLikeInsensitive(String value) {
            addCriterion("upper(DELIVERY_DATE_TYPE) like", value.toUpperCase(), "deliveryDateType");
            return (Criteria) this;
        }

        public Criteria andDeliveryTimeTypeLikeInsensitive(String value) {
            addCriterion("upper(DELIVERY_TIME_TYPE) like", value.toUpperCase(), "deliveryTimeType");
            return (Criteria) this;
        }

        public Criteria andDeliveryNotesLikeInsensitive(String value) {
            addCriterion("upper(DELIVERY_NOTES) like", value.toUpperCase(), "deliveryNotes");
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