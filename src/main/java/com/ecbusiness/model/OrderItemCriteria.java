package com.ecbusiness.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrderItemCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderItemCriteria() {
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

        public Criteria andOrderItemIdIsNull() {
            addCriterion("ORDER_ITEM_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIsNotNull() {
            addCriterion("ORDER_ITEM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdEqualTo(Integer value) {
            addCriterion("ORDER_ITEM_ID =", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotEqualTo(Integer value) {
            addCriterion("ORDER_ITEM_ID <>", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThan(Integer value) {
            addCriterion("ORDER_ITEM_ID >", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ITEM_ID >=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThan(Integer value) {
            addCriterion("ORDER_ITEM_ID <", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("ORDER_ITEM_ID <=", value, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdIn(List<Integer> values) {
            addCriterion("ORDER_ITEM_ID in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotIn(List<Integer> values) {
            addCriterion("ORDER_ITEM_ID not in", values, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ITEM_ID between", value1, value2, "orderItemId");
            return (Criteria) this;
        }

        public Criteria andOrderItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ORDER_ITEM_ID not between", value1, value2, "orderItemId");
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

        public Criteria andOrderGroupIdIsNull() {
            addCriterion("ORDER_GROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdIsNotNull() {
            addCriterion("ORDER_GROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdEqualTo(String value) {
            addCriterion("ORDER_GROUP_ID =", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdNotEqualTo(String value) {
            addCriterion("ORDER_GROUP_ID <>", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdGreaterThan(String value) {
            addCriterion("ORDER_GROUP_ID >", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_GROUP_ID >=", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdLessThan(String value) {
            addCriterion("ORDER_GROUP_ID <", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_GROUP_ID <=", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdLike(String value) {
            addCriterion("ORDER_GROUP_ID like", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdNotLike(String value) {
            addCriterion("ORDER_GROUP_ID not like", value, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdIn(List<String> values) {
            addCriterion("ORDER_GROUP_ID in", values, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdNotIn(List<String> values) {
            addCriterion("ORDER_GROUP_ID not in", values, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdBetween(String value1, String value2) {
            addCriterion("ORDER_GROUP_ID between", value1, value2, "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_GROUP_ID not between", value1, value2, "orderGroupId");
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

        public Criteria andGoodsTypeIsNull() {
            addCriterion("GOODS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIsNotNull() {
            addCriterion("GOODS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeEqualTo(String value) {
            addCriterion("GOODS_TYPE =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(String value) {
            addCriterion("GOODS_TYPE <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(String value) {
            addCriterion("GOODS_TYPE >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(String value) {
            addCriterion("GOODS_TYPE <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(String value) {
            addCriterion("GOODS_TYPE <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLike(String value) {
            addCriterion("GOODS_TYPE like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotLike(String value) {
            addCriterion("GOODS_TYPE not like", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<String> values) {
            addCriterion("GOODS_TYPE in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<String> values) {
            addCriterion("GOODS_TYPE not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(String value1, String value2) {
            addCriterion("GOODS_TYPE not between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Integer value) {
            addCriterion("GOODS_ID =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Integer value) {
            addCriterion("GOODS_ID <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Integer value) {
            addCriterion("GOODS_ID >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_ID >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Integer value) {
            addCriterion("GOODS_ID <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_ID <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Integer> values) {
            addCriterion("GOODS_ID in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Integer> values) {
            addCriterion("GOODS_ID not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_ID between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_ID not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIsNull() {
            addCriterion("GOODS_NO is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIsNotNull() {
            addCriterion("GOODS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNoEqualTo(String value) {
            addCriterion("GOODS_NO =", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotEqualTo(String value) {
            addCriterion("GOODS_NO <>", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThan(String value) {
            addCriterion("GOODS_NO >", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NO >=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThan(String value) {
            addCriterion("GOODS_NO <", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NO <=", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLike(String value) {
            addCriterion("GOODS_NO like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotLike(String value) {
            addCriterion("GOODS_NO not like", value, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoIn(List<String> values) {
            addCriterion("GOODS_NO in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotIn(List<String> values) {
            addCriterion("GOODS_NO not in", values, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoBetween(String value1, String value2) {
            addCriterion("GOODS_NO between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNoNotBetween(String value1, String value2) {
            addCriterion("GOODS_NO not between", value1, value2, "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("GOODS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("GOODS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("GOODS_NAME =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("GOODS_NAME <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("GOODS_NAME >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("GOODS_NAME <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("GOODS_NAME <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("GOODS_NAME like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("GOODS_NAME not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("GOODS_NAME in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("GOODS_NAME not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("GOODS_NAME between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("GOODS_NAME not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNull() {
            addCriterion("GOODS_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIsNotNull() {
            addCriterion("GOODS_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitEqualTo(String value) {
            addCriterion("GOODS_UNIT =", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotEqualTo(String value) {
            addCriterion("GOODS_UNIT <>", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThan(String value) {
            addCriterion("GOODS_UNIT >", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_UNIT >=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThan(String value) {
            addCriterion("GOODS_UNIT <", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLessThanOrEqualTo(String value) {
            addCriterion("GOODS_UNIT <=", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLike(String value) {
            addCriterion("GOODS_UNIT like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotLike(String value) {
            addCriterion("GOODS_UNIT not like", value, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitIn(List<String> values) {
            addCriterion("GOODS_UNIT in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotIn(List<String> values) {
            addCriterion("GOODS_UNIT not in", values, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitBetween(String value1, String value2) {
            addCriterion("GOODS_UNIT between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitNotBetween(String value1, String value2) {
            addCriterion("GOODS_UNIT not between", value1, value2, "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceIsNull() {
            addCriterion("GOODS_COST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceIsNotNull() {
            addCriterion("GOODS_COST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceEqualTo(BigDecimal value) {
            addCriterion("GOODS_COST_PRICE =", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("GOODS_COST_PRICE <>", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceGreaterThan(BigDecimal value) {
            addCriterion("GOODS_COST_PRICE >", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_COST_PRICE >=", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceLessThan(BigDecimal value) {
            addCriterion("GOODS_COST_PRICE <", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_COST_PRICE <=", value, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceIn(List<BigDecimal> values) {
            addCriterion("GOODS_COST_PRICE in", values, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("GOODS_COST_PRICE not in", values, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_COST_PRICE between", value1, value2, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_COST_PRICE not between", value1, value2, "goodsCostPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceIsNull() {
            addCriterion("GOODS_OLD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceIsNotNull() {
            addCriterion("GOODS_OLD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceEqualTo(BigDecimal value) {
            addCriterion("GOODS_OLD_PRICE =", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceNotEqualTo(BigDecimal value) {
            addCriterion("GOODS_OLD_PRICE <>", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceGreaterThan(BigDecimal value) {
            addCriterion("GOODS_OLD_PRICE >", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_OLD_PRICE >=", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceLessThan(BigDecimal value) {
            addCriterion("GOODS_OLD_PRICE <", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_OLD_PRICE <=", value, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceIn(List<BigDecimal> values) {
            addCriterion("GOODS_OLD_PRICE in", values, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceNotIn(List<BigDecimal> values) {
            addCriterion("GOODS_OLD_PRICE not in", values, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_OLD_PRICE between", value1, value2, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsOldPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_OLD_PRICE not between", value1, value2, "goodsOldPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNull() {
            addCriterion("GOODS_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIsNotNull() {
            addCriterion("GOODS_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE =", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE <>", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThan(BigDecimal value) {
            addCriterion("GOODS_PRICE >", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE >=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThan(BigDecimal value) {
            addCriterion("GOODS_PRICE <", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_PRICE <=", value, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceIn(List<BigDecimal> values) {
            addCriterion("GOODS_PRICE in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotIn(List<BigDecimal> values) {
            addCriterion("GOODS_PRICE not in", values, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_PRICE between", value1, value2, "goodsPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_PRICE not between", value1, value2, "goodsPrice");
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

        public Criteria andGiftAmountIsNull() {
            addCriterion("GIFT_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andGiftAmountIsNotNull() {
            addCriterion("GIFT_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andGiftAmountEqualTo(Integer value) {
            addCriterion("GIFT_AMOUNT =", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotEqualTo(Integer value) {
            addCriterion("GIFT_AMOUNT <>", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountGreaterThan(Integer value) {
            addCriterion("GIFT_AMOUNT >", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("GIFT_AMOUNT >=", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountLessThan(Integer value) {
            addCriterion("GIFT_AMOUNT <", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountLessThanOrEqualTo(Integer value) {
            addCriterion("GIFT_AMOUNT <=", value, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountIn(List<Integer> values) {
            addCriterion("GIFT_AMOUNT in", values, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotIn(List<Integer> values) {
            addCriterion("GIFT_AMOUNT not in", values, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountBetween(Integer value1, Integer value2) {
            addCriterion("GIFT_AMOUNT between", value1, value2, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andGiftAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("GIFT_AMOUNT not between", value1, value2, "giftAmount");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountIsNull() {
            addCriterion("CAN_RETURN_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountIsNotNull() {
            addCriterion("CAN_RETURN_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountEqualTo(BigDecimal value) {
            addCriterion("CAN_RETURN_AMOUNT =", value, "canReturnAmount");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountNotEqualTo(BigDecimal value) {
            addCriterion("CAN_RETURN_AMOUNT <>", value, "canReturnAmount");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountGreaterThan(BigDecimal value) {
            addCriterion("CAN_RETURN_AMOUNT >", value, "canReturnAmount");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAN_RETURN_AMOUNT >=", value, "canReturnAmount");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountLessThan(BigDecimal value) {
            addCriterion("CAN_RETURN_AMOUNT <", value, "canReturnAmount");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAN_RETURN_AMOUNT <=", value, "canReturnAmount");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountIn(List<BigDecimal> values) {
            addCriterion("CAN_RETURN_AMOUNT in", values, "canReturnAmount");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountNotIn(List<BigDecimal> values) {
            addCriterion("CAN_RETURN_AMOUNT not in", values, "canReturnAmount");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAN_RETURN_AMOUNT between", value1, value2, "canReturnAmount");
            return (Criteria) this;
        }

        public Criteria andCanReturnAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAN_RETURN_AMOUNT not between", value1, value2, "canReturnAmount");
            return (Criteria) this;
        }

        public Criteria andSubsidyIsNull() {
            addCriterion("SUBSIDY is null");
            return (Criteria) this;
        }

        public Criteria andSubsidyIsNotNull() {
            addCriterion("SUBSIDY is not null");
            return (Criteria) this;
        }

        public Criteria andSubsidyEqualTo(BigDecimal value) {
            addCriterion("SUBSIDY =", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyNotEqualTo(BigDecimal value) {
            addCriterion("SUBSIDY <>", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyGreaterThan(BigDecimal value) {
            addCriterion("SUBSIDY >", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBSIDY >=", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyLessThan(BigDecimal value) {
            addCriterion("SUBSIDY <", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SUBSIDY <=", value, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyIn(List<BigDecimal> values) {
            addCriterion("SUBSIDY in", values, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyNotIn(List<BigDecimal> values) {
            addCriterion("SUBSIDY not in", values, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBSIDY between", value1, value2, "subsidy");
            return (Criteria) this;
        }

        public Criteria andSubsidyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SUBSIDY not between", value1, value2, "subsidy");
            return (Criteria) this;
        }

        public Criteria andPointsIsNull() {
            addCriterion("POINTS is null");
            return (Criteria) this;
        }

        public Criteria andPointsIsNotNull() {
            addCriterion("POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andPointsEqualTo(Long value) {
            addCriterion("POINTS =", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotEqualTo(Long value) {
            addCriterion("POINTS <>", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThan(Long value) {
            addCriterion("POINTS >", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsGreaterThanOrEqualTo(Long value) {
            addCriterion("POINTS >=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThan(Long value) {
            addCriterion("POINTS <", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsLessThanOrEqualTo(Long value) {
            addCriterion("POINTS <=", value, "points");
            return (Criteria) this;
        }

        public Criteria andPointsIn(List<Long> values) {
            addCriterion("POINTS in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotIn(List<Long> values) {
            addCriterion("POINTS not in", values, "points");
            return (Criteria) this;
        }

        public Criteria andPointsBetween(Long value1, Long value2) {
            addCriterion("POINTS between", value1, value2, "points");
            return (Criteria) this;
        }

        public Criteria andPointsNotBetween(Long value1, Long value2) {
            addCriterion("POINTS not between", value1, value2, "points");
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

        public Criteria andGoodsSumFeeIsNull() {
            addCriterion("GOODS_SUM_FEE is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSumFeeIsNotNull() {
            addCriterion("GOODS_SUM_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSumFeeEqualTo(BigDecimal value) {
            addCriterion("GOODS_SUM_FEE =", value, "goodsSumFee");
            return (Criteria) this;
        }

        public Criteria andGoodsSumFeeNotEqualTo(BigDecimal value) {
            addCriterion("GOODS_SUM_FEE <>", value, "goodsSumFee");
            return (Criteria) this;
        }

        public Criteria andGoodsSumFeeGreaterThan(BigDecimal value) {
            addCriterion("GOODS_SUM_FEE >", value, "goodsSumFee");
            return (Criteria) this;
        }

        public Criteria andGoodsSumFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_SUM_FEE >=", value, "goodsSumFee");
            return (Criteria) this;
        }

        public Criteria andGoodsSumFeeLessThan(BigDecimal value) {
            addCriterion("GOODS_SUM_FEE <", value, "goodsSumFee");
            return (Criteria) this;
        }

        public Criteria andGoodsSumFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOODS_SUM_FEE <=", value, "goodsSumFee");
            return (Criteria) this;
        }

        public Criteria andGoodsSumFeeIn(List<BigDecimal> values) {
            addCriterion("GOODS_SUM_FEE in", values, "goodsSumFee");
            return (Criteria) this;
        }

        public Criteria andGoodsSumFeeNotIn(List<BigDecimal> values) {
            addCriterion("GOODS_SUM_FEE not in", values, "goodsSumFee");
            return (Criteria) this;
        }

        public Criteria andGoodsSumFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_SUM_FEE between", value1, value2, "goodsSumFee");
            return (Criteria) this;
        }

        public Criteria andGoodsSumFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOODS_SUM_FEE not between", value1, value2, "goodsSumFee");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdIsNull() {
            addCriterion("PRODUCT_COMBINATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdIsNotNull() {
            addCriterion("PRODUCT_COMBINATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdEqualTo(Integer value) {
            addCriterion("PRODUCT_COMBINATION_ID =", value, "productCombinationId");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdNotEqualTo(Integer value) {
            addCriterion("PRODUCT_COMBINATION_ID <>", value, "productCombinationId");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdGreaterThan(Integer value) {
            addCriterion("PRODUCT_COMBINATION_ID >", value, "productCombinationId");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_COMBINATION_ID >=", value, "productCombinationId");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdLessThan(Integer value) {
            addCriterion("PRODUCT_COMBINATION_ID <", value, "productCombinationId");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdLessThanOrEqualTo(Integer value) {
            addCriterion("PRODUCT_COMBINATION_ID <=", value, "productCombinationId");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdIn(List<Integer> values) {
            addCriterion("PRODUCT_COMBINATION_ID in", values, "productCombinationId");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdNotIn(List<Integer> values) {
            addCriterion("PRODUCT_COMBINATION_ID not in", values, "productCombinationId");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_COMBINATION_ID between", value1, value2, "productCombinationId");
            return (Criteria) this;
        }

        public Criteria andProductCombinationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PRODUCT_COMBINATION_ID not between", value1, value2, "productCombinationId");
            return (Criteria) this;
        }

        public Criteria andExecutePriceIsNull() {
            addCriterion("EXECUTE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andExecutePriceIsNotNull() {
            addCriterion("EXECUTE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andExecutePriceEqualTo(BigDecimal value) {
            addCriterion("EXECUTE_PRICE =", value, "executePrice");
            return (Criteria) this;
        }

        public Criteria andExecutePriceNotEqualTo(BigDecimal value) {
            addCriterion("EXECUTE_PRICE <>", value, "executePrice");
            return (Criteria) this;
        }

        public Criteria andExecutePriceGreaterThan(BigDecimal value) {
            addCriterion("EXECUTE_PRICE >", value, "executePrice");
            return (Criteria) this;
        }

        public Criteria andExecutePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EXECUTE_PRICE >=", value, "executePrice");
            return (Criteria) this;
        }

        public Criteria andExecutePriceLessThan(BigDecimal value) {
            addCriterion("EXECUTE_PRICE <", value, "executePrice");
            return (Criteria) this;
        }

        public Criteria andExecutePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EXECUTE_PRICE <=", value, "executePrice");
            return (Criteria) this;
        }

        public Criteria andExecutePriceIn(List<BigDecimal> values) {
            addCriterion("EXECUTE_PRICE in", values, "executePrice");
            return (Criteria) this;
        }

        public Criteria andExecutePriceNotIn(List<BigDecimal> values) {
            addCriterion("EXECUTE_PRICE not in", values, "executePrice");
            return (Criteria) this;
        }

        public Criteria andExecutePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXECUTE_PRICE between", value1, value2, "executePrice");
            return (Criteria) this;
        }

        public Criteria andExecutePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EXECUTE_PRICE not between", value1, value2, "executePrice");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNull() {
            addCriterion("IS_GIFT is null");
            return (Criteria) this;
        }

        public Criteria andIsGiftIsNotNull() {
            addCriterion("IS_GIFT is not null");
            return (Criteria) this;
        }

        public Criteria andIsGiftEqualTo(String value) {
            addCriterion("IS_GIFT =", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotEqualTo(String value) {
            addCriterion("IS_GIFT <>", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThan(String value) {
            addCriterion("IS_GIFT >", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GIFT >=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThan(String value) {
            addCriterion("IS_GIFT <", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLessThanOrEqualTo(String value) {
            addCriterion("IS_GIFT <=", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftLike(String value) {
            addCriterion("IS_GIFT like", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotLike(String value) {
            addCriterion("IS_GIFT not like", value, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftIn(List<String> values) {
            addCriterion("IS_GIFT in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotIn(List<String> values) {
            addCriterion("IS_GIFT not in", values, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftBetween(String value1, String value2) {
            addCriterion("IS_GIFT between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andIsGiftNotBetween(String value1, String value2) {
            addCriterion("IS_GIFT not between", value1, value2, "isGift");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdIsNull() {
            addCriterion("MAIN_GOODS_ID is null");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdIsNotNull() {
            addCriterion("MAIN_GOODS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdEqualTo(Integer value) {
            addCriterion("MAIN_GOODS_ID =", value, "mainGoodsId");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdNotEqualTo(Integer value) {
            addCriterion("MAIN_GOODS_ID <>", value, "mainGoodsId");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdGreaterThan(Integer value) {
            addCriterion("MAIN_GOODS_ID >", value, "mainGoodsId");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAIN_GOODS_ID >=", value, "mainGoodsId");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdLessThan(Integer value) {
            addCriterion("MAIN_GOODS_ID <", value, "mainGoodsId");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("MAIN_GOODS_ID <=", value, "mainGoodsId");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdIn(List<Integer> values) {
            addCriterion("MAIN_GOODS_ID in", values, "mainGoodsId");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdNotIn(List<Integer> values) {
            addCriterion("MAIN_GOODS_ID not in", values, "mainGoodsId");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("MAIN_GOODS_ID between", value1, value2, "mainGoodsId");
            return (Criteria) this;
        }

        public Criteria andMainGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("MAIN_GOODS_ID not between", value1, value2, "mainGoodsId");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdIsNull() {
            addCriterion("PCG_GIFT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdIsNotNull() {
            addCriterion("PCG_GIFT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdEqualTo(Integer value) {
            addCriterion("PCG_GIFT_ID =", value, "pcgGiftId");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdNotEqualTo(Integer value) {
            addCriterion("PCG_GIFT_ID <>", value, "pcgGiftId");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdGreaterThan(Integer value) {
            addCriterion("PCG_GIFT_ID >", value, "pcgGiftId");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("PCG_GIFT_ID >=", value, "pcgGiftId");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdLessThan(Integer value) {
            addCriterion("PCG_GIFT_ID <", value, "pcgGiftId");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdLessThanOrEqualTo(Integer value) {
            addCriterion("PCG_GIFT_ID <=", value, "pcgGiftId");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdIn(List<Integer> values) {
            addCriterion("PCG_GIFT_ID in", values, "pcgGiftId");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdNotIn(List<Integer> values) {
            addCriterion("PCG_GIFT_ID not in", values, "pcgGiftId");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdBetween(Integer value1, Integer value2) {
            addCriterion("PCG_GIFT_ID between", value1, value2, "pcgGiftId");
            return (Criteria) this;
        }

        public Criteria andPcgGiftIdNotBetween(Integer value1, Integer value2) {
            addCriterion("PCG_GIFT_ID not between", value1, value2, "pcgGiftId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdIsNull() {
            addCriterion("ORDER_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdIsNotNull() {
            addCriterion("ORDER_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdEqualTo(String value) {
            addCriterion("ORDER_RULE_ID =", value, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdNotEqualTo(String value) {
            addCriterion("ORDER_RULE_ID <>", value, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdGreaterThan(String value) {
            addCriterion("ORDER_RULE_ID >", value, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_RULE_ID >=", value, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdLessThan(String value) {
            addCriterion("ORDER_RULE_ID <", value, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdLessThanOrEqualTo(String value) {
            addCriterion("ORDER_RULE_ID <=", value, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdLike(String value) {
            addCriterion("ORDER_RULE_ID like", value, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdNotLike(String value) {
            addCriterion("ORDER_RULE_ID not like", value, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdIn(List<String> values) {
            addCriterion("ORDER_RULE_ID in", values, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdNotIn(List<String> values) {
            addCriterion("ORDER_RULE_ID not in", values, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdBetween(String value1, String value2) {
            addCriterion("ORDER_RULE_ID between", value1, value2, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdNotBetween(String value1, String value2) {
            addCriterion("ORDER_RULE_ID not between", value1, value2, "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdIsNull() {
            addCriterion("PRODUCT_RULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdIsNotNull() {
            addCriterion("PRODUCT_RULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdEqualTo(String value) {
            addCriterion("PRODUCT_RULE_ID =", value, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdNotEqualTo(String value) {
            addCriterion("PRODUCT_RULE_ID <>", value, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdGreaterThan(String value) {
            addCriterion("PRODUCT_RULE_ID >", value, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_RULE_ID >=", value, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdLessThan(String value) {
            addCriterion("PRODUCT_RULE_ID <", value, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_RULE_ID <=", value, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdLike(String value) {
            addCriterion("PRODUCT_RULE_ID like", value, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdNotLike(String value) {
            addCriterion("PRODUCT_RULE_ID not like", value, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdIn(List<String> values) {
            addCriterion("PRODUCT_RULE_ID in", values, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdNotIn(List<String> values) {
            addCriterion("PRODUCT_RULE_ID not in", values, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdBetween(String value1, String value2) {
            addCriterion("PRODUCT_RULE_ID between", value1, value2, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_RULE_ID not between", value1, value2, "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductDownIsNull() {
            addCriterion("PRODUCT_DOWN is null");
            return (Criteria) this;
        }

        public Criteria andProductDownIsNotNull() {
            addCriterion("PRODUCT_DOWN is not null");
            return (Criteria) this;
        }

        public Criteria andProductDownEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DOWN =", value, "productDown");
            return (Criteria) this;
        }

        public Criteria andProductDownNotEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DOWN <>", value, "productDown");
            return (Criteria) this;
        }

        public Criteria andProductDownGreaterThan(BigDecimal value) {
            addCriterion("PRODUCT_DOWN >", value, "productDown");
            return (Criteria) this;
        }

        public Criteria andProductDownGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DOWN >=", value, "productDown");
            return (Criteria) this;
        }

        public Criteria andProductDownLessThan(BigDecimal value) {
            addCriterion("PRODUCT_DOWN <", value, "productDown");
            return (Criteria) this;
        }

        public Criteria andProductDownLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRODUCT_DOWN <=", value, "productDown");
            return (Criteria) this;
        }

        public Criteria andProductDownIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_DOWN in", values, "productDown");
            return (Criteria) this;
        }

        public Criteria andProductDownNotIn(List<BigDecimal> values) {
            addCriterion("PRODUCT_DOWN not in", values, "productDown");
            return (Criteria) this;
        }

        public Criteria andProductDownBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_DOWN between", value1, value2, "productDown");
            return (Criteria) this;
        }

        public Criteria andProductDownNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRODUCT_DOWN not between", value1, value2, "productDown");
            return (Criteria) this;
        }

        public Criteria andCartDownIsNull() {
            addCriterion("CART_DOWN is null");
            return (Criteria) this;
        }

        public Criteria andCartDownIsNotNull() {
            addCriterion("CART_DOWN is not null");
            return (Criteria) this;
        }

        public Criteria andCartDownEqualTo(BigDecimal value) {
            addCriterion("CART_DOWN =", value, "cartDown");
            return (Criteria) this;
        }

        public Criteria andCartDownNotEqualTo(BigDecimal value) {
            addCriterion("CART_DOWN <>", value, "cartDown");
            return (Criteria) this;
        }

        public Criteria andCartDownGreaterThan(BigDecimal value) {
            addCriterion("CART_DOWN >", value, "cartDown");
            return (Criteria) this;
        }

        public Criteria andCartDownGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CART_DOWN >=", value, "cartDown");
            return (Criteria) this;
        }

        public Criteria andCartDownLessThan(BigDecimal value) {
            addCriterion("CART_DOWN <", value, "cartDown");
            return (Criteria) this;
        }

        public Criteria andCartDownLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CART_DOWN <=", value, "cartDown");
            return (Criteria) this;
        }

        public Criteria andCartDownIn(List<BigDecimal> values) {
            addCriterion("CART_DOWN in", values, "cartDown");
            return (Criteria) this;
        }

        public Criteria andCartDownNotIn(List<BigDecimal> values) {
            addCriterion("CART_DOWN not in", values, "cartDown");
            return (Criteria) this;
        }

        public Criteria andCartDownBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CART_DOWN between", value1, value2, "cartDown");
            return (Criteria) this;
        }

        public Criteria andCartDownNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CART_DOWN not between", value1, value2, "cartDown");
            return (Criteria) this;
        }

        public Criteria andCartPriceIsNull() {
            addCriterion("CART_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCartPriceIsNotNull() {
            addCriterion("CART_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCartPriceEqualTo(BigDecimal value) {
            addCriterion("CART_PRICE =", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceNotEqualTo(BigDecimal value) {
            addCriterion("CART_PRICE <>", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceGreaterThan(BigDecimal value) {
            addCriterion("CART_PRICE >", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CART_PRICE >=", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceLessThan(BigDecimal value) {
            addCriterion("CART_PRICE <", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CART_PRICE <=", value, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceIn(List<BigDecimal> values) {
            addCriterion("CART_PRICE in", values, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceNotIn(List<BigDecimal> values) {
            addCriterion("CART_PRICE not in", values, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CART_PRICE between", value1, value2, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andCartPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CART_PRICE not between", value1, value2, "cartPrice");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsIsNull() {
            addCriterion("PRODUCT_COUPON_IDS is null");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsIsNotNull() {
            addCriterion("PRODUCT_COUPON_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsEqualTo(String value) {
            addCriterion("PRODUCT_COUPON_IDS =", value, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsNotEqualTo(String value) {
            addCriterion("PRODUCT_COUPON_IDS <>", value, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsGreaterThan(String value) {
            addCriterion("PRODUCT_COUPON_IDS >", value, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_COUPON_IDS >=", value, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsLessThan(String value) {
            addCriterion("PRODUCT_COUPON_IDS <", value, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_COUPON_IDS <=", value, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsLike(String value) {
            addCriterion("PRODUCT_COUPON_IDS like", value, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsNotLike(String value) {
            addCriterion("PRODUCT_COUPON_IDS not like", value, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsIn(List<String> values) {
            addCriterion("PRODUCT_COUPON_IDS in", values, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsNotIn(List<String> values) {
            addCriterion("PRODUCT_COUPON_IDS not in", values, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsBetween(String value1, String value2) {
            addCriterion("PRODUCT_COUPON_IDS between", value1, value2, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_COUPON_IDS not between", value1, value2, "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsIsNull() {
            addCriterion("PRODUCT_COUPON_NUMS is null");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsIsNotNull() {
            addCriterion("PRODUCT_COUPON_NUMS is not null");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsEqualTo(String value) {
            addCriterion("PRODUCT_COUPON_NUMS =", value, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsNotEqualTo(String value) {
            addCriterion("PRODUCT_COUPON_NUMS <>", value, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsGreaterThan(String value) {
            addCriterion("PRODUCT_COUPON_NUMS >", value, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsGreaterThanOrEqualTo(String value) {
            addCriterion("PRODUCT_COUPON_NUMS >=", value, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsLessThan(String value) {
            addCriterion("PRODUCT_COUPON_NUMS <", value, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsLessThanOrEqualTo(String value) {
            addCriterion("PRODUCT_COUPON_NUMS <=", value, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsLike(String value) {
            addCriterion("PRODUCT_COUPON_NUMS like", value, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsNotLike(String value) {
            addCriterion("PRODUCT_COUPON_NUMS not like", value, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsIn(List<String> values) {
            addCriterion("PRODUCT_COUPON_NUMS in", values, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsNotIn(List<String> values) {
            addCriterion("PRODUCT_COUPON_NUMS not in", values, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsBetween(String value1, String value2) {
            addCriterion("PRODUCT_COUPON_NUMS between", value1, value2, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsNotBetween(String value1, String value2) {
            addCriterion("PRODUCT_COUPON_NUMS not between", value1, value2, "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsIsNull() {
            addCriterion("ORDER_COUPON_IDS is null");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsIsNotNull() {
            addCriterion("ORDER_COUPON_IDS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsEqualTo(String value) {
            addCriterion("ORDER_COUPON_IDS =", value, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsNotEqualTo(String value) {
            addCriterion("ORDER_COUPON_IDS <>", value, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsGreaterThan(String value) {
            addCriterion("ORDER_COUPON_IDS >", value, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_COUPON_IDS >=", value, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsLessThan(String value) {
            addCriterion("ORDER_COUPON_IDS <", value, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsLessThanOrEqualTo(String value) {
            addCriterion("ORDER_COUPON_IDS <=", value, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsLike(String value) {
            addCriterion("ORDER_COUPON_IDS like", value, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsNotLike(String value) {
            addCriterion("ORDER_COUPON_IDS not like", value, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsIn(List<String> values) {
            addCriterion("ORDER_COUPON_IDS in", values, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsNotIn(List<String> values) {
            addCriterion("ORDER_COUPON_IDS not in", values, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsBetween(String value1, String value2) {
            addCriterion("ORDER_COUPON_IDS between", value1, value2, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsNotBetween(String value1, String value2) {
            addCriterion("ORDER_COUPON_IDS not between", value1, value2, "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsIsNull() {
            addCriterion("ORDER_COUPON_NUMS is null");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsIsNotNull() {
            addCriterion("ORDER_COUPON_NUMS is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsEqualTo(String value) {
            addCriterion("ORDER_COUPON_NUMS =", value, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsNotEqualTo(String value) {
            addCriterion("ORDER_COUPON_NUMS <>", value, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsGreaterThan(String value) {
            addCriterion("ORDER_COUPON_NUMS >", value, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsGreaterThanOrEqualTo(String value) {
            addCriterion("ORDER_COUPON_NUMS >=", value, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsLessThan(String value) {
            addCriterion("ORDER_COUPON_NUMS <", value, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsLessThanOrEqualTo(String value) {
            addCriterion("ORDER_COUPON_NUMS <=", value, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsLike(String value) {
            addCriterion("ORDER_COUPON_NUMS like", value, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsNotLike(String value) {
            addCriterion("ORDER_COUPON_NUMS not like", value, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsIn(List<String> values) {
            addCriterion("ORDER_COUPON_NUMS in", values, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsNotIn(List<String> values) {
            addCriterion("ORDER_COUPON_NUMS not in", values, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsBetween(String value1, String value2) {
            addCriterion("ORDER_COUPON_NUMS between", value1, value2, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsNotBetween(String value1, String value2) {
            addCriterion("ORDER_COUPON_NUMS not between", value1, value2, "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andRepairStateIsNull() {
            addCriterion("REPAIR_STATE is null");
            return (Criteria) this;
        }

        public Criteria andRepairStateIsNotNull() {
            addCriterion("REPAIR_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andRepairStateEqualTo(String value) {
            addCriterion("REPAIR_STATE =", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateNotEqualTo(String value) {
            addCriterion("REPAIR_STATE <>", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateGreaterThan(String value) {
            addCriterion("REPAIR_STATE >", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateGreaterThanOrEqualTo(String value) {
            addCriterion("REPAIR_STATE >=", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateLessThan(String value) {
            addCriterion("REPAIR_STATE <", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateLessThanOrEqualTo(String value) {
            addCriterion("REPAIR_STATE <=", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateLike(String value) {
            addCriterion("REPAIR_STATE like", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateNotLike(String value) {
            addCriterion("REPAIR_STATE not like", value, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateIn(List<String> values) {
            addCriterion("REPAIR_STATE in", values, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateNotIn(List<String> values) {
            addCriterion("REPAIR_STATE not in", values, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateBetween(String value1, String value2) {
            addCriterion("REPAIR_STATE between", value1, value2, "repairState");
            return (Criteria) this;
        }

        public Criteria andRepairStateNotBetween(String value1, String value2) {
            addCriterion("REPAIR_STATE not between", value1, value2, "repairState");
            return (Criteria) this;
        }

        public Criteria andIsCommentIsNull() {
            addCriterion("IS_COMMENT is null");
            return (Criteria) this;
        }

        public Criteria andIsCommentIsNotNull() {
            addCriterion("IS_COMMENT is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommentEqualTo(String value) {
            addCriterion("IS_COMMENT =", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotEqualTo(String value) {
            addCriterion("IS_COMMENT <>", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThan(String value) {
            addCriterion("IS_COMMENT >", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentGreaterThanOrEqualTo(String value) {
            addCriterion("IS_COMMENT >=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThan(String value) {
            addCriterion("IS_COMMENT <", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLessThanOrEqualTo(String value) {
            addCriterion("IS_COMMENT <=", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentLike(String value) {
            addCriterion("IS_COMMENT like", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotLike(String value) {
            addCriterion("IS_COMMENT not like", value, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentIn(List<String> values) {
            addCriterion("IS_COMMENT in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotIn(List<String> values) {
            addCriterion("IS_COMMENT not in", values, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentBetween(String value1, String value2) {
            addCriterion("IS_COMMENT between", value1, value2, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsCommentNotBetween(String value1, String value2) {
            addCriterion("IS_COMMENT not between", value1, value2, "isComment");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNull() {
            addCriterion("IS_SHOW is null");
            return (Criteria) this;
        }

        public Criteria andIsShowIsNotNull() {
            addCriterion("IS_SHOW is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowEqualTo(String value) {
            addCriterion("IS_SHOW =", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotEqualTo(String value) {
            addCriterion("IS_SHOW <>", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThan(String value) {
            addCriterion("IS_SHOW >", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SHOW >=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThan(String value) {
            addCriterion("IS_SHOW <", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLessThanOrEqualTo(String value) {
            addCriterion("IS_SHOW <=", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowLike(String value) {
            addCriterion("IS_SHOW like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotLike(String value) {
            addCriterion("IS_SHOW not like", value, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowIn(List<String> values) {
            addCriterion("IS_SHOW in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotIn(List<String> values) {
            addCriterion("IS_SHOW not in", values, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowBetween(String value1, String value2) {
            addCriterion("IS_SHOW between", value1, value2, "isShow");
            return (Criteria) this;
        }

        public Criteria andIsShowNotBetween(String value1, String value2) {
            addCriterion("IS_SHOW not between", value1, value2, "isShow");
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

        public Criteria andCommentsIsNull() {
            addCriterion("comments is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("comments is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("comments =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("comments <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("comments >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("comments >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("comments <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("comments <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("comments like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("comments not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("comments in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("comments not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("comments between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("comments not between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andOrderIdLikeInsensitive(String value) {
            addCriterion("upper(ORDER_ID) like", value.toUpperCase(), "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderGroupIdLikeInsensitive(String value) {
            addCriterion("upper(ORDER_GROUP_ID) like", value.toUpperCase(), "orderGroupId");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLikeInsensitive(String value) {
            addCriterion("upper(GOODS_TYPE) like", value.toUpperCase(), "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLikeInsensitive(String value) {
            addCriterion("upper(GOODS_NO) like", value.toUpperCase(), "goodsNo");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLikeInsensitive(String value) {
            addCriterion("upper(GOODS_NAME) like", value.toUpperCase(), "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsUnitLikeInsensitive(String value) {
            addCriterion("upper(GOODS_UNIT) like", value.toUpperCase(), "goodsUnit");
            return (Criteria) this;
        }

        public Criteria andIsGiftLikeInsensitive(String value) {
            addCriterion("upper(IS_GIFT) like", value.toUpperCase(), "isGift");
            return (Criteria) this;
        }

        public Criteria andOrderRuleIdLikeInsensitive(String value) {
            addCriterion("upper(ORDER_RULE_ID) like", value.toUpperCase(), "orderRuleId");
            return (Criteria) this;
        }

        public Criteria andProductRuleIdLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_RULE_ID) like", value.toUpperCase(), "productRuleId");
            return (Criteria) this;
        }

        public Criteria andProductCouponIdsLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_COUPON_IDS) like", value.toUpperCase(), "productCouponIds");
            return (Criteria) this;
        }

        public Criteria andProductCouponNumsLikeInsensitive(String value) {
            addCriterion("upper(PRODUCT_COUPON_NUMS) like", value.toUpperCase(), "productCouponNums");
            return (Criteria) this;
        }

        public Criteria andOrderCouponIdsLikeInsensitive(String value) {
            addCriterion("upper(ORDER_COUPON_IDS) like", value.toUpperCase(), "orderCouponIds");
            return (Criteria) this;
        }

        public Criteria andOrderCouponNumsLikeInsensitive(String value) {
            addCriterion("upper(ORDER_COUPON_NUMS) like", value.toUpperCase(), "orderCouponNums");
            return (Criteria) this;
        }

        public Criteria andRepairStateLikeInsensitive(String value) {
            addCriterion("upper(REPAIR_STATE) like", value.toUpperCase(), "repairState");
            return (Criteria) this;
        }

        public Criteria andIsCommentLikeInsensitive(String value) {
            addCriterion("upper(IS_COMMENT) like", value.toUpperCase(), "isComment");
            return (Criteria) this;
        }

        public Criteria andIsShowLikeInsensitive(String value) {
            addCriterion("upper(IS_SHOW) like", value.toUpperCase(), "isShow");
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

        public Criteria andCommentsLikeInsensitive(String value) {
            addCriterion("upper(comments) like", value.toUpperCase(), "comments");
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