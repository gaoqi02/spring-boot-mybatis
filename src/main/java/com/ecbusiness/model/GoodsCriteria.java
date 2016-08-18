package com.ecbusiness.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GoodsCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodsCriteria() {
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

        public Criteria andFactoryNoIsNull() {
            addCriterion("FACTORY_NO is null");
            return (Criteria) this;
        }

        public Criteria andFactoryNoIsNotNull() {
            addCriterion("FACTORY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andFactoryNoEqualTo(String value) {
            addCriterion("FACTORY_NO =", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoNotEqualTo(String value) {
            addCriterion("FACTORY_NO <>", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoGreaterThan(String value) {
            addCriterion("FACTORY_NO >", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoGreaterThanOrEqualTo(String value) {
            addCriterion("FACTORY_NO >=", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoLessThan(String value) {
            addCriterion("FACTORY_NO <", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoLessThanOrEqualTo(String value) {
            addCriterion("FACTORY_NO <=", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoLike(String value) {
            addCriterion("FACTORY_NO like", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoNotLike(String value) {
            addCriterion("FACTORY_NO not like", value, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoIn(List<String> values) {
            addCriterion("FACTORY_NO in", values, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoNotIn(List<String> values) {
            addCriterion("FACTORY_NO not in", values, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoBetween(String value1, String value2) {
            addCriterion("FACTORY_NO between", value1, value2, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoNotBetween(String value1, String value2) {
            addCriterion("FACTORY_NO not between", value1, value2, "factoryNo");
            return (Criteria) this;
        }

        public Criteria andTrademarkIsNull() {
            addCriterion("TRADEMARK is null");
            return (Criteria) this;
        }

        public Criteria andTrademarkIsNotNull() {
            addCriterion("TRADEMARK is not null");
            return (Criteria) this;
        }

        public Criteria andTrademarkEqualTo(String value) {
            addCriterion("TRADEMARK =", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotEqualTo(String value) {
            addCriterion("TRADEMARK <>", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkGreaterThan(String value) {
            addCriterion("TRADEMARK >", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkGreaterThanOrEqualTo(String value) {
            addCriterion("TRADEMARK >=", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLessThan(String value) {
            addCriterion("TRADEMARK <", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLessThanOrEqualTo(String value) {
            addCriterion("TRADEMARK <=", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkLike(String value) {
            addCriterion("TRADEMARK like", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotLike(String value) {
            addCriterion("TRADEMARK not like", value, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkIn(List<String> values) {
            addCriterion("TRADEMARK in", values, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotIn(List<String> values) {
            addCriterion("TRADEMARK not in", values, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkBetween(String value1, String value2) {
            addCriterion("TRADEMARK between", value1, value2, "trademark");
            return (Criteria) this;
        }

        public Criteria andTrademarkNotBetween(String value1, String value2) {
            addCriterion("TRADEMARK not between", value1, value2, "trademark");
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

        public Criteria andGoodsTypeEqualTo(Integer value) {
            addCriterion("GOODS_TYPE =", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotEqualTo(Integer value) {
            addCriterion("GOODS_TYPE <>", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThan(Integer value) {
            addCriterion("GOODS_TYPE >", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("GOODS_TYPE >=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThan(Integer value) {
            addCriterion("GOODS_TYPE <", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeLessThanOrEqualTo(Integer value) {
            addCriterion("GOODS_TYPE <=", value, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeIn(List<Integer> values) {
            addCriterion("GOODS_TYPE in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotIn(List<Integer> values) {
            addCriterion("GOODS_TYPE not in", values, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_TYPE between", value1, value2, "goodsType");
            return (Criteria) this;
        }

        public Criteria andGoodsTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("GOODS_TYPE not between", value1, value2, "goodsType");
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

        public Criteria andWeightIsNull() {
            addCriterion("WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("WEIGHT =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("WEIGHT >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("WEIGHT <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WEIGHT <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("WEIGHT in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("WEIGHT not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WEIGHT not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andEcPriceIsNull() {
            addCriterion("EC_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andEcPriceIsNotNull() {
            addCriterion("EC_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andEcPriceEqualTo(BigDecimal value) {
            addCriterion("EC_PRICE =", value, "ecPrice");
            return (Criteria) this;
        }

        public Criteria andEcPriceNotEqualTo(BigDecimal value) {
            addCriterion("EC_PRICE <>", value, "ecPrice");
            return (Criteria) this;
        }

        public Criteria andEcPriceGreaterThan(BigDecimal value) {
            addCriterion("EC_PRICE >", value, "ecPrice");
            return (Criteria) this;
        }

        public Criteria andEcPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("EC_PRICE >=", value, "ecPrice");
            return (Criteria) this;
        }

        public Criteria andEcPriceLessThan(BigDecimal value) {
            addCriterion("EC_PRICE <", value, "ecPrice");
            return (Criteria) this;
        }

        public Criteria andEcPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("EC_PRICE <=", value, "ecPrice");
            return (Criteria) this;
        }

        public Criteria andEcPriceIn(List<BigDecimal> values) {
            addCriterion("EC_PRICE in", values, "ecPrice");
            return (Criteria) this;
        }

        public Criteria andEcPriceNotIn(List<BigDecimal> values) {
            addCriterion("EC_PRICE not in", values, "ecPrice");
            return (Criteria) this;
        }

        public Criteria andEcPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EC_PRICE between", value1, value2, "ecPrice");
            return (Criteria) this;
        }

        public Criteria andEcPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("EC_PRICE not between", value1, value2, "ecPrice");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("BAR_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("BAR_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("BAR_CODE =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("BAR_CODE <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("BAR_CODE >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BAR_CODE >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("BAR_CODE <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("BAR_CODE <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("BAR_CODE like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("BAR_CODE not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("BAR_CODE in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("BAR_CODE not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("BAR_CODE between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("BAR_CODE not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsIsNull() {
            addCriterion("MATERIAL_GOODS is null");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsIsNotNull() {
            addCriterion("MATERIAL_GOODS is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsEqualTo(String value) {
            addCriterion("MATERIAL_GOODS =", value, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsNotEqualTo(String value) {
            addCriterion("MATERIAL_GOODS <>", value, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsGreaterThan(String value) {
            addCriterion("MATERIAL_GOODS >", value, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_GOODS >=", value, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsLessThan(String value) {
            addCriterion("MATERIAL_GOODS <", value, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_GOODS <=", value, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsLike(String value) {
            addCriterion("MATERIAL_GOODS like", value, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsNotLike(String value) {
            addCriterion("MATERIAL_GOODS not like", value, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsIn(List<String> values) {
            addCriterion("MATERIAL_GOODS in", values, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsNotIn(List<String> values) {
            addCriterion("MATERIAL_GOODS not in", values, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsBetween(String value1, String value2) {
            addCriterion("MATERIAL_GOODS between", value1, value2, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_GOODS not between", value1, value2, "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNull() {
            addCriterion("MATERIAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIsNotNull() {
            addCriterion("MATERIAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeEqualTo(String value) {
            addCriterion("MATERIAL_TYPE =", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotEqualTo(String value) {
            addCriterion("MATERIAL_TYPE <>", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThan(String value) {
            addCriterion("MATERIAL_TYPE >", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MATERIAL_TYPE >=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThan(String value) {
            addCriterion("MATERIAL_TYPE <", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLessThanOrEqualTo(String value) {
            addCriterion("MATERIAL_TYPE <=", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLike(String value) {
            addCriterion("MATERIAL_TYPE like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotLike(String value) {
            addCriterion("MATERIAL_TYPE not like", value, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeIn(List<String> values) {
            addCriterion("MATERIAL_TYPE in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotIn(List<String> values) {
            addCriterion("MATERIAL_TYPE not in", values, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeBetween(String value1, String value2) {
            addCriterion("MATERIAL_TYPE between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeNotBetween(String value1, String value2) {
            addCriterion("MATERIAL_TYPE not between", value1, value2, "materialType");
            return (Criteria) this;
        }

        public Criteria andGoldWeightIsNull() {
            addCriterion("GOLD_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andGoldWeightIsNotNull() {
            addCriterion("GOLD_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andGoldWeightEqualTo(BigDecimal value) {
            addCriterion("GOLD_WEIGHT =", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightNotEqualTo(BigDecimal value) {
            addCriterion("GOLD_WEIGHT <>", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightGreaterThan(BigDecimal value) {
            addCriterion("GOLD_WEIGHT >", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOLD_WEIGHT >=", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightLessThan(BigDecimal value) {
            addCriterion("GOLD_WEIGHT <", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOLD_WEIGHT <=", value, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightIn(List<BigDecimal> values) {
            addCriterion("GOLD_WEIGHT in", values, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightNotIn(List<BigDecimal> values) {
            addCriterion("GOLD_WEIGHT not in", values, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOLD_WEIGHT between", value1, value2, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGoldWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOLD_WEIGHT not between", value1, value2, "goldWeight");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceIsNull() {
            addCriterion("GRAMS_GOLD_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceIsNotNull() {
            addCriterion("GRAMS_GOLD_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceEqualTo(BigDecimal value) {
            addCriterion("GRAMS_GOLD_PRICE =", value, "gramsGoldPrice");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceNotEqualTo(BigDecimal value) {
            addCriterion("GRAMS_GOLD_PRICE <>", value, "gramsGoldPrice");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceGreaterThan(BigDecimal value) {
            addCriterion("GRAMS_GOLD_PRICE >", value, "gramsGoldPrice");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GRAMS_GOLD_PRICE >=", value, "gramsGoldPrice");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceLessThan(BigDecimal value) {
            addCriterion("GRAMS_GOLD_PRICE <", value, "gramsGoldPrice");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GRAMS_GOLD_PRICE <=", value, "gramsGoldPrice");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceIn(List<BigDecimal> values) {
            addCriterion("GRAMS_GOLD_PRICE in", values, "gramsGoldPrice");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceNotIn(List<BigDecimal> values) {
            addCriterion("GRAMS_GOLD_PRICE not in", values, "gramsGoldPrice");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRAMS_GOLD_PRICE between", value1, value2, "gramsGoldPrice");
            return (Criteria) this;
        }

        public Criteria andGramsGoldPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GRAMS_GOLD_PRICE not between", value1, value2, "gramsGoldPrice");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceIsNull() {
            addCriterion("GOLD_SELLING_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceIsNotNull() {
            addCriterion("GOLD_SELLING_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceEqualTo(BigDecimal value) {
            addCriterion("GOLD_SELLING_PRICE =", value, "goldSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceNotEqualTo(BigDecimal value) {
            addCriterion("GOLD_SELLING_PRICE <>", value, "goldSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceGreaterThan(BigDecimal value) {
            addCriterion("GOLD_SELLING_PRICE >", value, "goldSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOLD_SELLING_PRICE >=", value, "goldSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceLessThan(BigDecimal value) {
            addCriterion("GOLD_SELLING_PRICE <", value, "goldSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOLD_SELLING_PRICE <=", value, "goldSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceIn(List<BigDecimal> values) {
            addCriterion("GOLD_SELLING_PRICE in", values, "goldSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceNotIn(List<BigDecimal> values) {
            addCriterion("GOLD_SELLING_PRICE not in", values, "goldSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOLD_SELLING_PRICE between", value1, value2, "goldSellingPrice");
            return (Criteria) this;
        }

        public Criteria andGoldSellingPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOLD_SELLING_PRICE not between", value1, value2, "goldSellingPrice");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeIsNull() {
            addCriterion("PROCESSING_FEE is null");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeIsNotNull() {
            addCriterion("PROCESSING_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeEqualTo(BigDecimal value) {
            addCriterion("PROCESSING_FEE =", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeNotEqualTo(BigDecimal value) {
            addCriterion("PROCESSING_FEE <>", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeGreaterThan(BigDecimal value) {
            addCriterion("PROCESSING_FEE >", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCESSING_FEE >=", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeLessThan(BigDecimal value) {
            addCriterion("PROCESSING_FEE <", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCESSING_FEE <=", value, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeIn(List<BigDecimal> values) {
            addCriterion("PROCESSING_FEE in", values, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeNotIn(List<BigDecimal> values) {
            addCriterion("PROCESSING_FEE not in", values, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCESSING_FEE between", value1, value2, "processingFee");
            return (Criteria) this;
        }

        public Criteria andProcessingFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCESSING_FEE not between", value1, value2, "processingFee");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNull() {
            addCriterion("COST_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andCostPriceIsNotNull() {
            addCriterion("COST_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCostPriceEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE =", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE <>", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThan(BigDecimal value) {
            addCriterion("COST_PRICE >", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE >=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThan(BigDecimal value) {
            addCriterion("COST_PRICE <", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("COST_PRICE <=", value, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotIn(List<BigDecimal> values) {
            addCriterion("COST_PRICE not in", values, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andCostPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("COST_PRICE not between", value1, value2, "costPrice");
            return (Criteria) this;
        }

        public Criteria andPriceFactorIsNull() {
            addCriterion("PRICE_FACTOR is null");
            return (Criteria) this;
        }

        public Criteria andPriceFactorIsNotNull() {
            addCriterion("PRICE_FACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andPriceFactorEqualTo(BigDecimal value) {
            addCriterion("PRICE_FACTOR =", value, "priceFactor");
            return (Criteria) this;
        }

        public Criteria andPriceFactorNotEqualTo(BigDecimal value) {
            addCriterion("PRICE_FACTOR <>", value, "priceFactor");
            return (Criteria) this;
        }

        public Criteria andPriceFactorGreaterThan(BigDecimal value) {
            addCriterion("PRICE_FACTOR >", value, "priceFactor");
            return (Criteria) this;
        }

        public Criteria andPriceFactorGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE_FACTOR >=", value, "priceFactor");
            return (Criteria) this;
        }

        public Criteria andPriceFactorLessThan(BigDecimal value) {
            addCriterion("PRICE_FACTOR <", value, "priceFactor");
            return (Criteria) this;
        }

        public Criteria andPriceFactorLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE_FACTOR <=", value, "priceFactor");
            return (Criteria) this;
        }

        public Criteria andPriceFactorIn(List<BigDecimal> values) {
            addCriterion("PRICE_FACTOR in", values, "priceFactor");
            return (Criteria) this;
        }

        public Criteria andPriceFactorNotIn(List<BigDecimal> values) {
            addCriterion("PRICE_FACTOR not in", values, "priceFactor");
            return (Criteria) this;
        }

        public Criteria andPriceFactorBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE_FACTOR between", value1, value2, "priceFactor");
            return (Criteria) this;
        }

        public Criteria andPriceFactorNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE_FACTOR not between", value1, value2, "priceFactor");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNull() {
            addCriterion("CERTIFICATE_NO is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIsNotNull() {
            addCriterion("CERTIFICATE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNoEqualTo(String value) {
            addCriterion("CERTIFICATE_NO =", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotEqualTo(String value) {
            addCriterion("CERTIFICATE_NO <>", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThan(String value) {
            addCriterion("CERTIFICATE_NO >", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoGreaterThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NO >=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThan(String value) {
            addCriterion("CERTIFICATE_NO <", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLessThanOrEqualTo(String value) {
            addCriterion("CERTIFICATE_NO <=", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLike(String value) {
            addCriterion("CERTIFICATE_NO like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotLike(String value) {
            addCriterion("CERTIFICATE_NO not like", value, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoIn(List<String> values) {
            addCriterion("CERTIFICATE_NO in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotIn(List<String> values) {
            addCriterion("CERTIFICATE_NO not in", values, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NO between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andCertificateNoNotBetween(String value1, String value2) {
            addCriterion("CERTIFICATE_NO not between", value1, value2, "certificateNo");
            return (Criteria) this;
        }

        public Criteria andFingerRingIsNull() {
            addCriterion("FINGER_RING is null");
            return (Criteria) this;
        }

        public Criteria andFingerRingIsNotNull() {
            addCriterion("FINGER_RING is not null");
            return (Criteria) this;
        }

        public Criteria andFingerRingEqualTo(String value) {
            addCriterion("FINGER_RING =", value, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andFingerRingNotEqualTo(String value) {
            addCriterion("FINGER_RING <>", value, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andFingerRingGreaterThan(String value) {
            addCriterion("FINGER_RING >", value, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andFingerRingGreaterThanOrEqualTo(String value) {
            addCriterion("FINGER_RING >=", value, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andFingerRingLessThan(String value) {
            addCriterion("FINGER_RING <", value, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andFingerRingLessThanOrEqualTo(String value) {
            addCriterion("FINGER_RING <=", value, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andFingerRingLike(String value) {
            addCriterion("FINGER_RING like", value, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andFingerRingNotLike(String value) {
            addCriterion("FINGER_RING not like", value, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andFingerRingIn(List<String> values) {
            addCriterion("FINGER_RING in", values, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andFingerRingNotIn(List<String> values) {
            addCriterion("FINGER_RING not in", values, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andFingerRingBetween(String value1, String value2) {
            addCriterion("FINGER_RING between", value1, value2, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andFingerRingNotBetween(String value1, String value2) {
            addCriterion("FINGER_RING not between", value1, value2, "fingerRing");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyIsNull() {
            addCriterion("COMMODITY_TECHNOLOGY is null");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyIsNotNull() {
            addCriterion("COMMODITY_TECHNOLOGY is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyEqualTo(String value) {
            addCriterion("COMMODITY_TECHNOLOGY =", value, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyNotEqualTo(String value) {
            addCriterion("COMMODITY_TECHNOLOGY <>", value, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyGreaterThan(String value) {
            addCriterion("COMMODITY_TECHNOLOGY >", value, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TECHNOLOGY >=", value, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyLessThan(String value) {
            addCriterion("COMMODITY_TECHNOLOGY <", value, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_TECHNOLOGY <=", value, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyLike(String value) {
            addCriterion("COMMODITY_TECHNOLOGY like", value, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyNotLike(String value) {
            addCriterion("COMMODITY_TECHNOLOGY not like", value, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyIn(List<String> values) {
            addCriterion("COMMODITY_TECHNOLOGY in", values, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyNotIn(List<String> values) {
            addCriterion("COMMODITY_TECHNOLOGY not in", values, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyBetween(String value1, String value2) {
            addCriterion("COMMODITY_TECHNOLOGY between", value1, value2, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_TECHNOLOGY not between", value1, value2, "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityColorIsNull() {
            addCriterion("COMMODITY_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andCommodityColorIsNotNull() {
            addCriterion("COMMODITY_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andCommodityColorEqualTo(String value) {
            addCriterion("COMMODITY_COLOR =", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorNotEqualTo(String value) {
            addCriterion("COMMODITY_COLOR <>", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorGreaterThan(String value) {
            addCriterion("COMMODITY_COLOR >", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorGreaterThanOrEqualTo(String value) {
            addCriterion("COMMODITY_COLOR >=", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorLessThan(String value) {
            addCriterion("COMMODITY_COLOR <", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorLessThanOrEqualTo(String value) {
            addCriterion("COMMODITY_COLOR <=", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorLike(String value) {
            addCriterion("COMMODITY_COLOR like", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorNotLike(String value) {
            addCriterion("COMMODITY_COLOR not like", value, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorIn(List<String> values) {
            addCriterion("COMMODITY_COLOR in", values, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorNotIn(List<String> values) {
            addCriterion("COMMODITY_COLOR not in", values, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorBetween(String value1, String value2) {
            addCriterion("COMMODITY_COLOR between", value1, value2, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andCommodityColorNotBetween(String value1, String value2) {
            addCriterion("COMMODITY_COLOR not between", value1, value2, "commodityColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneIsNull() {
            addCriterion("MAIN_STONE is null");
            return (Criteria) this;
        }

        public Criteria andMainStoneIsNotNull() {
            addCriterion("MAIN_STONE is not null");
            return (Criteria) this;
        }

        public Criteria andMainStoneEqualTo(String value) {
            addCriterion("MAIN_STONE =", value, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainStoneNotEqualTo(String value) {
            addCriterion("MAIN_STONE <>", value, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainStoneGreaterThan(String value) {
            addCriterion("MAIN_STONE >", value, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainStoneGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_STONE >=", value, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainStoneLessThan(String value) {
            addCriterion("MAIN_STONE <", value, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainStoneLessThanOrEqualTo(String value) {
            addCriterion("MAIN_STONE <=", value, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainStoneLike(String value) {
            addCriterion("MAIN_STONE like", value, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainStoneNotLike(String value) {
            addCriterion("MAIN_STONE not like", value, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainStoneIn(List<String> values) {
            addCriterion("MAIN_STONE in", values, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainStoneNotIn(List<String> values) {
            addCriterion("MAIN_STONE not in", values, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainStoneBetween(String value1, String value2) {
            addCriterion("MAIN_STONE between", value1, value2, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainStoneNotBetween(String value1, String value2) {
            addCriterion("MAIN_STONE not between", value1, value2, "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeIsNull() {
            addCriterion("MAIN_ROCK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeIsNotNull() {
            addCriterion("MAIN_ROCK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeEqualTo(String value) {
            addCriterion("MAIN_ROCK_TYPE =", value, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeNotEqualTo(String value) {
            addCriterion("MAIN_ROCK_TYPE <>", value, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeGreaterThan(String value) {
            addCriterion("MAIN_ROCK_TYPE >", value, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_ROCK_TYPE >=", value, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeLessThan(String value) {
            addCriterion("MAIN_ROCK_TYPE <", value, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeLessThanOrEqualTo(String value) {
            addCriterion("MAIN_ROCK_TYPE <=", value, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeLike(String value) {
            addCriterion("MAIN_ROCK_TYPE like", value, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeNotLike(String value) {
            addCriterion("MAIN_ROCK_TYPE not like", value, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeIn(List<String> values) {
            addCriterion("MAIN_ROCK_TYPE in", values, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeNotIn(List<String> values) {
            addCriterion("MAIN_ROCK_TYPE not in", values, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeBetween(String value1, String value2) {
            addCriterion("MAIN_ROCK_TYPE between", value1, value2, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeNotBetween(String value1, String value2) {
            addCriterion("MAIN_ROCK_TYPE not between", value1, value2, "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightIsNull() {
            addCriterion("MAIN_ORE_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightIsNotNull() {
            addCriterion("MAIN_ORE_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightEqualTo(BigDecimal value) {
            addCriterion("MAIN_ORE_WEIGHT =", value, "mainOreWeight");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightNotEqualTo(BigDecimal value) {
            addCriterion("MAIN_ORE_WEIGHT <>", value, "mainOreWeight");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightGreaterThan(BigDecimal value) {
            addCriterion("MAIN_ORE_WEIGHT >", value, "mainOreWeight");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAIN_ORE_WEIGHT >=", value, "mainOreWeight");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightLessThan(BigDecimal value) {
            addCriterion("MAIN_ORE_WEIGHT <", value, "mainOreWeight");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAIN_ORE_WEIGHT <=", value, "mainOreWeight");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightIn(List<BigDecimal> values) {
            addCriterion("MAIN_ORE_WEIGHT in", values, "mainOreWeight");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightNotIn(List<BigDecimal> values) {
            addCriterion("MAIN_ORE_WEIGHT not in", values, "mainOreWeight");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAIN_ORE_WEIGHT between", value1, value2, "mainOreWeight");
            return (Criteria) this;
        }

        public Criteria andMainOreWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAIN_ORE_WEIGHT not between", value1, value2, "mainOreWeight");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityIsNull() {
            addCriterion("MAIN_ORE_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityIsNotNull() {
            addCriterion("MAIN_ORE_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityEqualTo(String value) {
            addCriterion("MAIN_ORE_QUANTITY =", value, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityNotEqualTo(String value) {
            addCriterion("MAIN_ORE_QUANTITY <>", value, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityGreaterThan(String value) {
            addCriterion("MAIN_ORE_QUANTITY >", value, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_ORE_QUANTITY >=", value, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityLessThan(String value) {
            addCriterion("MAIN_ORE_QUANTITY <", value, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityLessThanOrEqualTo(String value) {
            addCriterion("MAIN_ORE_QUANTITY <=", value, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityLike(String value) {
            addCriterion("MAIN_ORE_QUANTITY like", value, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityNotLike(String value) {
            addCriterion("MAIN_ORE_QUANTITY not like", value, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityIn(List<String> values) {
            addCriterion("MAIN_ORE_QUANTITY in", values, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityNotIn(List<String> values) {
            addCriterion("MAIN_ORE_QUANTITY not in", values, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityBetween(String value1, String value2) {
            addCriterion("MAIN_ORE_QUANTITY between", value1, value2, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityNotBetween(String value1, String value2) {
            addCriterion("MAIN_ORE_QUANTITY not between", value1, value2, "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeIsNull() {
            addCriterion("MAIN_ORE_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeIsNotNull() {
            addCriterion("MAIN_ORE_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeEqualTo(String value) {
            addCriterion("MAIN_ORE_GRADE =", value, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeNotEqualTo(String value) {
            addCriterion("MAIN_ORE_GRADE <>", value, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeGreaterThan(String value) {
            addCriterion("MAIN_ORE_GRADE >", value, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_ORE_GRADE >=", value, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeLessThan(String value) {
            addCriterion("MAIN_ORE_GRADE <", value, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeLessThanOrEqualTo(String value) {
            addCriterion("MAIN_ORE_GRADE <=", value, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeLike(String value) {
            addCriterion("MAIN_ORE_GRADE like", value, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeNotLike(String value) {
            addCriterion("MAIN_ORE_GRADE not like", value, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeIn(List<String> values) {
            addCriterion("MAIN_ORE_GRADE in", values, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeNotIn(List<String> values) {
            addCriterion("MAIN_ORE_GRADE not in", values, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeBetween(String value1, String value2) {
            addCriterion("MAIN_ORE_GRADE between", value1, value2, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeNotBetween(String value1, String value2) {
            addCriterion("MAIN_ORE_GRADE not between", value1, value2, "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreColorIsNull() {
            addCriterion("MAIN_ORE_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andMainOreColorIsNotNull() {
            addCriterion("MAIN_ORE_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andMainOreColorEqualTo(String value) {
            addCriterion("MAIN_ORE_COLOR =", value, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOreColorNotEqualTo(String value) {
            addCriterion("MAIN_ORE_COLOR <>", value, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOreColorGreaterThan(String value) {
            addCriterion("MAIN_ORE_COLOR >", value, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOreColorGreaterThanOrEqualTo(String value) {
            addCriterion("MAIN_ORE_COLOR >=", value, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOreColorLessThan(String value) {
            addCriterion("MAIN_ORE_COLOR <", value, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOreColorLessThanOrEqualTo(String value) {
            addCriterion("MAIN_ORE_COLOR <=", value, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOreColorLike(String value) {
            addCriterion("MAIN_ORE_COLOR like", value, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOreColorNotLike(String value) {
            addCriterion("MAIN_ORE_COLOR not like", value, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOreColorIn(List<String> values) {
            addCriterion("MAIN_ORE_COLOR in", values, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOreColorNotIn(List<String> values) {
            addCriterion("MAIN_ORE_COLOR not in", values, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOreColorBetween(String value1, String value2) {
            addCriterion("MAIN_ORE_COLOR between", value1, value2, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOreColorNotBetween(String value1, String value2) {
            addCriterion("MAIN_ORE_COLOR not between", value1, value2, "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceIsNull() {
            addCriterion("MAIN_ORE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceIsNotNull() {
            addCriterion("MAIN_ORE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceEqualTo(BigDecimal value) {
            addCriterion("MAIN_ORE_PRICE =", value, "mainOrePrice");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceNotEqualTo(BigDecimal value) {
            addCriterion("MAIN_ORE_PRICE <>", value, "mainOrePrice");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceGreaterThan(BigDecimal value) {
            addCriterion("MAIN_ORE_PRICE >", value, "mainOrePrice");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAIN_ORE_PRICE >=", value, "mainOrePrice");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceLessThan(BigDecimal value) {
            addCriterion("MAIN_ORE_PRICE <", value, "mainOrePrice");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAIN_ORE_PRICE <=", value, "mainOrePrice");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceIn(List<BigDecimal> values) {
            addCriterion("MAIN_ORE_PRICE in", values, "mainOrePrice");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceNotIn(List<BigDecimal> values) {
            addCriterion("MAIN_ORE_PRICE not in", values, "mainOrePrice");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAIN_ORE_PRICE between", value1, value2, "mainOrePrice");
            return (Criteria) this;
        }

        public Criteria andMainOrePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAIN_ORE_PRICE not between", value1, value2, "mainOrePrice");
            return (Criteria) this;
        }

        public Criteria andBesideStoneIsNull() {
            addCriterion("BESIDE_STONE is null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneIsNotNull() {
            addCriterion("BESIDE_STONE is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneEqualTo(String value) {
            addCriterion("BESIDE_STONE =", value, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneNotEqualTo(String value) {
            addCriterion("BESIDE_STONE <>", value, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGreaterThan(String value) {
            addCriterion("BESIDE_STONE >", value, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGreaterThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE >=", value, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneLessThan(String value) {
            addCriterion("BESIDE_STONE <", value, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneLessThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE <=", value, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneLike(String value) {
            addCriterion("BESIDE_STONE like", value, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneNotLike(String value) {
            addCriterion("BESIDE_STONE not like", value, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneIn(List<String> values) {
            addCriterion("BESIDE_STONE in", values, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneNotIn(List<String> values) {
            addCriterion("BESIDE_STONE not in", values, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE between", value1, value2, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneNotBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE not between", value1, value2, "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeIsNull() {
            addCriterion("BESIDE_STONE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeIsNotNull() {
            addCriterion("BESIDE_STONE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeEqualTo(String value) {
            addCriterion("BESIDE_STONE_TYPE =", value, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeNotEqualTo(String value) {
            addCriterion("BESIDE_STONE_TYPE <>", value, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeGreaterThan(String value) {
            addCriterion("BESIDE_STONE_TYPE >", value, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_TYPE >=", value, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeLessThan(String value) {
            addCriterion("BESIDE_STONE_TYPE <", value, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeLessThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_TYPE <=", value, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeLike(String value) {
            addCriterion("BESIDE_STONE_TYPE like", value, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeNotLike(String value) {
            addCriterion("BESIDE_STONE_TYPE not like", value, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeIn(List<String> values) {
            addCriterion("BESIDE_STONE_TYPE in", values, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeNotIn(List<String> values) {
            addCriterion("BESIDE_STONE_TYPE not in", values, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_TYPE between", value1, value2, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeNotBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_TYPE not between", value1, value2, "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightIsNull() {
            addCriterion("BESIDE_STONE_WEIGHT is null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightIsNotNull() {
            addCriterion("BESIDE_STONE_WEIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT =", value, "besideStoneWeight");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightNotEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT <>", value, "besideStoneWeight");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightGreaterThan(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT >", value, "besideStoneWeight");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT >=", value, "besideStoneWeight");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightLessThan(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT <", value, "besideStoneWeight");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT <=", value, "besideStoneWeight");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightIn(List<BigDecimal> values) {
            addCriterion("BESIDE_STONE_WEIGHT in", values, "besideStoneWeight");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightNotIn(List<BigDecimal> values) {
            addCriterion("BESIDE_STONE_WEIGHT not in", values, "besideStoneWeight");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BESIDE_STONE_WEIGHT between", value1, value2, "besideStoneWeight");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BESIDE_STONE_WEIGHT not between", value1, value2, "besideStoneWeight");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityIsNull() {
            addCriterion("BESIDE_STONE_QUANTITY is null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityIsNotNull() {
            addCriterion("BESIDE_STONE_QUANTITY is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityEqualTo(String value) {
            addCriterion("BESIDE_STONE_QUANTITY =", value, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityNotEqualTo(String value) {
            addCriterion("BESIDE_STONE_QUANTITY <>", value, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityGreaterThan(String value) {
            addCriterion("BESIDE_STONE_QUANTITY >", value, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityGreaterThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_QUANTITY >=", value, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityLessThan(String value) {
            addCriterion("BESIDE_STONE_QUANTITY <", value, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityLessThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_QUANTITY <=", value, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityLike(String value) {
            addCriterion("BESIDE_STONE_QUANTITY like", value, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityNotLike(String value) {
            addCriterion("BESIDE_STONE_QUANTITY not like", value, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityIn(List<String> values) {
            addCriterion("BESIDE_STONE_QUANTITY in", values, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityNotIn(List<String> values) {
            addCriterion("BESIDE_STONE_QUANTITY not in", values, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_QUANTITY between", value1, value2, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityNotBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_QUANTITY not between", value1, value2, "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessIsNull() {
            addCriterion("BESIDE_STONE_CLEANLINESS is null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessIsNotNull() {
            addCriterion("BESIDE_STONE_CLEANLINESS is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessEqualTo(String value) {
            addCriterion("BESIDE_STONE_CLEANLINESS =", value, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessNotEqualTo(String value) {
            addCriterion("BESIDE_STONE_CLEANLINESS <>", value, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessGreaterThan(String value) {
            addCriterion("BESIDE_STONE_CLEANLINESS >", value, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessGreaterThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_CLEANLINESS >=", value, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessLessThan(String value) {
            addCriterion("BESIDE_STONE_CLEANLINESS <", value, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessLessThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_CLEANLINESS <=", value, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessLike(String value) {
            addCriterion("BESIDE_STONE_CLEANLINESS like", value, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessNotLike(String value) {
            addCriterion("BESIDE_STONE_CLEANLINESS not like", value, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessIn(List<String> values) {
            addCriterion("BESIDE_STONE_CLEANLINESS in", values, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessNotIn(List<String> values) {
            addCriterion("BESIDE_STONE_CLEANLINESS not in", values, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_CLEANLINESS between", value1, value2, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessNotBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_CLEANLINESS not between", value1, value2, "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorIsNull() {
            addCriterion("BESIDE_STONE_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorIsNotNull() {
            addCriterion("BESIDE_STONE_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorEqualTo(String value) {
            addCriterion("BESIDE_STONE_COLOR =", value, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorNotEqualTo(String value) {
            addCriterion("BESIDE_STONE_COLOR <>", value, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorGreaterThan(String value) {
            addCriterion("BESIDE_STONE_COLOR >", value, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorGreaterThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_COLOR >=", value, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorLessThan(String value) {
            addCriterion("BESIDE_STONE_COLOR <", value, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorLessThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_COLOR <=", value, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorLike(String value) {
            addCriterion("BESIDE_STONE_COLOR like", value, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorNotLike(String value) {
            addCriterion("BESIDE_STONE_COLOR not like", value, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorIn(List<String> values) {
            addCriterion("BESIDE_STONE_COLOR in", values, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorNotIn(List<String> values) {
            addCriterion("BESIDE_STONE_COLOR not in", values, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_COLOR between", value1, value2, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorNotBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_COLOR not between", value1, value2, "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceIsNull() {
            addCriterion("BESIDE_STONE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceIsNotNull() {
            addCriterion("BESIDE_STONE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE =", value, "besideStonePrice");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceNotEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE <>", value, "besideStonePrice");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceGreaterThan(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE >", value, "besideStonePrice");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE >=", value, "besideStonePrice");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceLessThan(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE <", value, "besideStonePrice");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE <=", value, "besideStonePrice");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceIn(List<BigDecimal> values) {
            addCriterion("BESIDE_STONE_PRICE in", values, "besideStonePrice");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceNotIn(List<BigDecimal> values) {
            addCriterion("BESIDE_STONE_PRICE not in", values, "besideStonePrice");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BESIDE_STONE_PRICE between", value1, value2, "besideStonePrice");
            return (Criteria) this;
        }

        public Criteria andBesideStonePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BESIDE_STONE_PRICE not between", value1, value2, "besideStonePrice");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2IsNull() {
            addCriterion("BESIDE_STONE_TYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2IsNotNull() {
            addCriterion("BESIDE_STONE_TYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2EqualTo(String value) {
            addCriterion("BESIDE_STONE_TYPE2 =", value, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2NotEqualTo(String value) {
            addCriterion("BESIDE_STONE_TYPE2 <>", value, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2GreaterThan(String value) {
            addCriterion("BESIDE_STONE_TYPE2 >", value, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2GreaterThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_TYPE2 >=", value, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2LessThan(String value) {
            addCriterion("BESIDE_STONE_TYPE2 <", value, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2LessThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_TYPE2 <=", value, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2Like(String value) {
            addCriterion("BESIDE_STONE_TYPE2 like", value, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2NotLike(String value) {
            addCriterion("BESIDE_STONE_TYPE2 not like", value, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2In(List<String> values) {
            addCriterion("BESIDE_STONE_TYPE2 in", values, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2NotIn(List<String> values) {
            addCriterion("BESIDE_STONE_TYPE2 not in", values, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2Between(String value1, String value2) {
            addCriterion("BESIDE_STONE_TYPE2 between", value1, value2, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2NotBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_TYPE2 not between", value1, value2, "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2IsNull() {
            addCriterion("BESIDE_STONE_WEIGHT2 is null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2IsNotNull() {
            addCriterion("BESIDE_STONE_WEIGHT2 is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2EqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT2 =", value, "besideStoneWeight2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2NotEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT2 <>", value, "besideStoneWeight2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2GreaterThan(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT2 >", value, "besideStoneWeight2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT2 >=", value, "besideStoneWeight2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2LessThan(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT2 <", value, "besideStoneWeight2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_WEIGHT2 <=", value, "besideStoneWeight2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2In(List<BigDecimal> values) {
            addCriterion("BESIDE_STONE_WEIGHT2 in", values, "besideStoneWeight2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2NotIn(List<BigDecimal> values) {
            addCriterion("BESIDE_STONE_WEIGHT2 not in", values, "besideStoneWeight2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("BESIDE_STONE_WEIGHT2 between", value1, value2, "besideStoneWeight2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneWeight2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BESIDE_STONE_WEIGHT2 not between", value1, value2, "besideStoneWeight2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2IsNull() {
            addCriterion("BESIDE_STONE_QUANTITY2 is null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2IsNotNull() {
            addCriterion("BESIDE_STONE_QUANTITY2 is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2EqualTo(String value) {
            addCriterion("BESIDE_STONE_QUANTITY2 =", value, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2NotEqualTo(String value) {
            addCriterion("BESIDE_STONE_QUANTITY2 <>", value, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2GreaterThan(String value) {
            addCriterion("BESIDE_STONE_QUANTITY2 >", value, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2GreaterThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_QUANTITY2 >=", value, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2LessThan(String value) {
            addCriterion("BESIDE_STONE_QUANTITY2 <", value, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2LessThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_QUANTITY2 <=", value, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2Like(String value) {
            addCriterion("BESIDE_STONE_QUANTITY2 like", value, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2NotLike(String value) {
            addCriterion("BESIDE_STONE_QUANTITY2 not like", value, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2In(List<String> values) {
            addCriterion("BESIDE_STONE_QUANTITY2 in", values, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2NotIn(List<String> values) {
            addCriterion("BESIDE_STONE_QUANTITY2 not in", values, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2Between(String value1, String value2) {
            addCriterion("BESIDE_STONE_QUANTITY2 between", value1, value2, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2NotBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_QUANTITY2 not between", value1, value2, "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2IsNull() {
            addCriterion("BESIDE_STONE_GRADE2 is null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2IsNotNull() {
            addCriterion("BESIDE_STONE_GRADE2 is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2EqualTo(String value) {
            addCriterion("BESIDE_STONE_GRADE2 =", value, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2NotEqualTo(String value) {
            addCriterion("BESIDE_STONE_GRADE2 <>", value, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2GreaterThan(String value) {
            addCriterion("BESIDE_STONE_GRADE2 >", value, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2GreaterThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_GRADE2 >=", value, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2LessThan(String value) {
            addCriterion("BESIDE_STONE_GRADE2 <", value, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2LessThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_GRADE2 <=", value, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2Like(String value) {
            addCriterion("BESIDE_STONE_GRADE2 like", value, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2NotLike(String value) {
            addCriterion("BESIDE_STONE_GRADE2 not like", value, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2In(List<String> values) {
            addCriterion("BESIDE_STONE_GRADE2 in", values, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2NotIn(List<String> values) {
            addCriterion("BESIDE_STONE_GRADE2 not in", values, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2Between(String value1, String value2) {
            addCriterion("BESIDE_STONE_GRADE2 between", value1, value2, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2NotBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_GRADE2 not between", value1, value2, "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2IsNull() {
            addCriterion("BESIDE_STONE_COLOR2 is null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2IsNotNull() {
            addCriterion("BESIDE_STONE_COLOR2 is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2EqualTo(String value) {
            addCriterion("BESIDE_STONE_COLOR2 =", value, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2NotEqualTo(String value) {
            addCriterion("BESIDE_STONE_COLOR2 <>", value, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2GreaterThan(String value) {
            addCriterion("BESIDE_STONE_COLOR2 >", value, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2GreaterThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_COLOR2 >=", value, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2LessThan(String value) {
            addCriterion("BESIDE_STONE_COLOR2 <", value, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2LessThanOrEqualTo(String value) {
            addCriterion("BESIDE_STONE_COLOR2 <=", value, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2Like(String value) {
            addCriterion("BESIDE_STONE_COLOR2 like", value, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2NotLike(String value) {
            addCriterion("BESIDE_STONE_COLOR2 not like", value, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2In(List<String> values) {
            addCriterion("BESIDE_STONE_COLOR2 in", values, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2NotIn(List<String> values) {
            addCriterion("BESIDE_STONE_COLOR2 not in", values, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2Between(String value1, String value2) {
            addCriterion("BESIDE_STONE_COLOR2 between", value1, value2, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2NotBetween(String value1, String value2) {
            addCriterion("BESIDE_STONE_COLOR2 not between", value1, value2, "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2IsNull() {
            addCriterion("BESIDE_STONE_PRICE2 is null");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2IsNotNull() {
            addCriterion("BESIDE_STONE_PRICE2 is not null");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2EqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE2 =", value, "besideStonePrice2");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2NotEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE2 <>", value, "besideStonePrice2");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2GreaterThan(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE2 >", value, "besideStonePrice2");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE2 >=", value, "besideStonePrice2");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2LessThan(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE2 <", value, "besideStonePrice2");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("BESIDE_STONE_PRICE2 <=", value, "besideStonePrice2");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2In(List<BigDecimal> values) {
            addCriterion("BESIDE_STONE_PRICE2 in", values, "besideStonePrice2");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2NotIn(List<BigDecimal> values) {
            addCriterion("BESIDE_STONE_PRICE2 not in", values, "besideStonePrice2");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("BESIDE_STONE_PRICE2 between", value1, value2, "besideStonePrice2");
            return (Criteria) this;
        }

        public Criteria andBesideStonePrice2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BESIDE_STONE_PRICE2 not between", value1, value2, "besideStonePrice2");
            return (Criteria) this;
        }

        public Criteria andIsGroupIsNull() {
            addCriterion("IS_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andIsGroupIsNotNull() {
            addCriterion("IS_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andIsGroupEqualTo(String value) {
            addCriterion("IS_GROUP =", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotEqualTo(String value) {
            addCriterion("IS_GROUP <>", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupGreaterThan(String value) {
            addCriterion("IS_GROUP >", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupGreaterThanOrEqualTo(String value) {
            addCriterion("IS_GROUP >=", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLessThan(String value) {
            addCriterion("IS_GROUP <", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLessThanOrEqualTo(String value) {
            addCriterion("IS_GROUP <=", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupLike(String value) {
            addCriterion("IS_GROUP like", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotLike(String value) {
            addCriterion("IS_GROUP not like", value, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupIn(List<String> values) {
            addCriterion("IS_GROUP in", values, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotIn(List<String> values) {
            addCriterion("IS_GROUP not in", values, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupBetween(String value1, String value2) {
            addCriterion("IS_GROUP between", value1, value2, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsGroupNotBetween(String value1, String value2) {
            addCriterion("IS_GROUP not between", value1, value2, "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNull() {
            addCriterion("IS_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIsNotNull() {
            addCriterion("IS_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andIsDefaultEqualTo(String value) {
            addCriterion("IS_DEFAULT =", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotEqualTo(String value) {
            addCriterion("IS_DEFAULT <>", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThan(String value) {
            addCriterion("IS_DEFAULT >", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("IS_DEFAULT >=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThan(String value) {
            addCriterion("IS_DEFAULT <", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLessThanOrEqualTo(String value) {
            addCriterion("IS_DEFAULT <=", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLike(String value) {
            addCriterion("IS_DEFAULT like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotLike(String value) {
            addCriterion("IS_DEFAULT not like", value, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultIn(List<String> values) {
            addCriterion("IS_DEFAULT in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotIn(List<String> values) {
            addCriterion("IS_DEFAULT not in", values, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultBetween(String value1, String value2) {
            addCriterion("IS_DEFAULT between", value1, value2, "isDefault");
            return (Criteria) this;
        }

        public Criteria andIsDefaultNotBetween(String value1, String value2) {
            addCriterion("IS_DEFAULT not between", value1, value2, "isDefault");
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

        public Criteria andGoodsDescIsNull() {
            addCriterion("GOODS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIsNotNull() {
            addCriterion("GOODS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsDescEqualTo(String value) {
            addCriterion("GOODS_DESC =", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotEqualTo(String value) {
            addCriterion("GOODS_DESC <>", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThan(String value) {
            addCriterion("GOODS_DESC >", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_DESC >=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThan(String value) {
            addCriterion("GOODS_DESC <", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLessThanOrEqualTo(String value) {
            addCriterion("GOODS_DESC <=", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLike(String value) {
            addCriterion("GOODS_DESC like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotLike(String value) {
            addCriterion("GOODS_DESC not like", value, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescIn(List<String> values) {
            addCriterion("GOODS_DESC in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotIn(List<String> values) {
            addCriterion("GOODS_DESC not in", values, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescBetween(String value1, String value2) {
            addCriterion("GOODS_DESC between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodsDescNotBetween(String value1, String value2) {
            addCriterion("GOODS_DESC not between", value1, value2, "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andGoodStockIsNull() {
            addCriterion("GOOD_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andGoodStockIsNotNull() {
            addCriterion("GOOD_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andGoodStockEqualTo(BigDecimal value) {
            addCriterion("GOOD_STOCK =", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockNotEqualTo(BigDecimal value) {
            addCriterion("GOOD_STOCK <>", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockGreaterThan(BigDecimal value) {
            addCriterion("GOOD_STOCK >", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_STOCK >=", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockLessThan(BigDecimal value) {
            addCriterion("GOOD_STOCK <", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("GOOD_STOCK <=", value, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockIn(List<BigDecimal> values) {
            addCriterion("GOOD_STOCK in", values, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockNotIn(List<BigDecimal> values) {
            addCriterion("GOOD_STOCK not in", values, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_STOCK between", value1, value2, "goodStock");
            return (Criteria) this;
        }

        public Criteria andGoodStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("GOOD_STOCK not between", value1, value2, "goodStock");
            return (Criteria) this;
        }

        public Criteria andPrepareStockIsNull() {
            addCriterion("PREPARE_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andPrepareStockIsNotNull() {
            addCriterion("PREPARE_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andPrepareStockEqualTo(BigDecimal value) {
            addCriterion("PREPARE_STOCK =", value, "prepareStock");
            return (Criteria) this;
        }

        public Criteria andPrepareStockNotEqualTo(BigDecimal value) {
            addCriterion("PREPARE_STOCK <>", value, "prepareStock");
            return (Criteria) this;
        }

        public Criteria andPrepareStockGreaterThan(BigDecimal value) {
            addCriterion("PREPARE_STOCK >", value, "prepareStock");
            return (Criteria) this;
        }

        public Criteria andPrepareStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PREPARE_STOCK >=", value, "prepareStock");
            return (Criteria) this;
        }

        public Criteria andPrepareStockLessThan(BigDecimal value) {
            addCriterion("PREPARE_STOCK <", value, "prepareStock");
            return (Criteria) this;
        }

        public Criteria andPrepareStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PREPARE_STOCK <=", value, "prepareStock");
            return (Criteria) this;
        }

        public Criteria andPrepareStockIn(List<BigDecimal> values) {
            addCriterion("PREPARE_STOCK in", values, "prepareStock");
            return (Criteria) this;
        }

        public Criteria andPrepareStockNotIn(List<BigDecimal> values) {
            addCriterion("PREPARE_STOCK not in", values, "prepareStock");
            return (Criteria) this;
        }

        public Criteria andPrepareStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREPARE_STOCK between", value1, value2, "prepareStock");
            return (Criteria) this;
        }

        public Criteria andPrepareStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PREPARE_STOCK not between", value1, value2, "prepareStock");
            return (Criteria) this;
        }

        public Criteria andLockStockIsNull() {
            addCriterion("LOCK_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andLockStockIsNotNull() {
            addCriterion("LOCK_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andLockStockEqualTo(BigDecimal value) {
            addCriterion("LOCK_STOCK =", value, "lockStock");
            return (Criteria) this;
        }

        public Criteria andLockStockNotEqualTo(BigDecimal value) {
            addCriterion("LOCK_STOCK <>", value, "lockStock");
            return (Criteria) this;
        }

        public Criteria andLockStockGreaterThan(BigDecimal value) {
            addCriterion("LOCK_STOCK >", value, "lockStock");
            return (Criteria) this;
        }

        public Criteria andLockStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LOCK_STOCK >=", value, "lockStock");
            return (Criteria) this;
        }

        public Criteria andLockStockLessThan(BigDecimal value) {
            addCriterion("LOCK_STOCK <", value, "lockStock");
            return (Criteria) this;
        }

        public Criteria andLockStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LOCK_STOCK <=", value, "lockStock");
            return (Criteria) this;
        }

        public Criteria andLockStockIn(List<BigDecimal> values) {
            addCriterion("LOCK_STOCK in", values, "lockStock");
            return (Criteria) this;
        }

        public Criteria andLockStockNotIn(List<BigDecimal> values) {
            addCriterion("LOCK_STOCK not in", values, "lockStock");
            return (Criteria) this;
        }

        public Criteria andLockStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOCK_STOCK between", value1, value2, "lockStock");
            return (Criteria) this;
        }

        public Criteria andLockStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LOCK_STOCK not between", value1, value2, "lockStock");
            return (Criteria) this;
        }

        public Criteria andAvailableStockIsNull() {
            addCriterion("AVAILABLE_STOCK is null");
            return (Criteria) this;
        }

        public Criteria andAvailableStockIsNotNull() {
            addCriterion("AVAILABLE_STOCK is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableStockEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_STOCK =", value, "availableStock");
            return (Criteria) this;
        }

        public Criteria andAvailableStockNotEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_STOCK <>", value, "availableStock");
            return (Criteria) this;
        }

        public Criteria andAvailableStockGreaterThan(BigDecimal value) {
            addCriterion("AVAILABLE_STOCK >", value, "availableStock");
            return (Criteria) this;
        }

        public Criteria andAvailableStockGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_STOCK >=", value, "availableStock");
            return (Criteria) this;
        }

        public Criteria andAvailableStockLessThan(BigDecimal value) {
            addCriterion("AVAILABLE_STOCK <", value, "availableStock");
            return (Criteria) this;
        }

        public Criteria andAvailableStockLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AVAILABLE_STOCK <=", value, "availableStock");
            return (Criteria) this;
        }

        public Criteria andAvailableStockIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_STOCK in", values, "availableStock");
            return (Criteria) this;
        }

        public Criteria andAvailableStockNotIn(List<BigDecimal> values) {
            addCriterion("AVAILABLE_STOCK not in", values, "availableStock");
            return (Criteria) this;
        }

        public Criteria andAvailableStockBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_STOCK between", value1, value2, "availableStock");
            return (Criteria) this;
        }

        public Criteria andAvailableStockNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AVAILABLE_STOCK not between", value1, value2, "availableStock");
            return (Criteria) this;
        }

        public Criteria andReturnPointsIsNull() {
            addCriterion("RETURN_POINTS is null");
            return (Criteria) this;
        }

        public Criteria andReturnPointsIsNotNull() {
            addCriterion("RETURN_POINTS is not null");
            return (Criteria) this;
        }

        public Criteria andReturnPointsEqualTo(Integer value) {
            addCriterion("RETURN_POINTS =", value, "returnPoints");
            return (Criteria) this;
        }

        public Criteria andReturnPointsNotEqualTo(Integer value) {
            addCriterion("RETURN_POINTS <>", value, "returnPoints");
            return (Criteria) this;
        }

        public Criteria andReturnPointsGreaterThan(Integer value) {
            addCriterion("RETURN_POINTS >", value, "returnPoints");
            return (Criteria) this;
        }

        public Criteria andReturnPointsGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETURN_POINTS >=", value, "returnPoints");
            return (Criteria) this;
        }

        public Criteria andReturnPointsLessThan(Integer value) {
            addCriterion("RETURN_POINTS <", value, "returnPoints");
            return (Criteria) this;
        }

        public Criteria andReturnPointsLessThanOrEqualTo(Integer value) {
            addCriterion("RETURN_POINTS <=", value, "returnPoints");
            return (Criteria) this;
        }

        public Criteria andReturnPointsIn(List<Integer> values) {
            addCriterion("RETURN_POINTS in", values, "returnPoints");
            return (Criteria) this;
        }

        public Criteria andReturnPointsNotIn(List<Integer> values) {
            addCriterion("RETURN_POINTS not in", values, "returnPoints");
            return (Criteria) this;
        }

        public Criteria andReturnPointsBetween(Integer value1, Integer value2) {
            addCriterion("RETURN_POINTS between", value1, value2, "returnPoints");
            return (Criteria) this;
        }

        public Criteria andReturnPointsNotBetween(Integer value1, Integer value2) {
            addCriterion("RETURN_POINTS not between", value1, value2, "returnPoints");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNull() {
            addCriterion("RECEIVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIsNotNull() {
            addCriterion("RECEIVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeEqualTo(String value) {
            addCriterion("RECEIVE_TIME =", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotEqualTo(String value) {
            addCriterion("RECEIVE_TIME <>", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThan(String value) {
            addCriterion("RECEIVE_TIME >", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeGreaterThanOrEqualTo(String value) {
            addCriterion("RECEIVE_TIME >=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThan(String value) {
            addCriterion("RECEIVE_TIME <", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLessThanOrEqualTo(String value) {
            addCriterion("RECEIVE_TIME <=", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLike(String value) {
            addCriterion("RECEIVE_TIME like", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotLike(String value) {
            addCriterion("RECEIVE_TIME not like", value, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeIn(List<String> values) {
            addCriterion("RECEIVE_TIME in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotIn(List<String> values) {
            addCriterion("RECEIVE_TIME not in", values, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeBetween(String value1, String value2) {
            addCriterion("RECEIVE_TIME between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeNotBetween(String value1, String value2) {
            addCriterion("RECEIVE_TIME not between", value1, value2, "receiveTime");
            return (Criteria) this;
        }

        public Criteria andIsChangeIsNull() {
            addCriterion("IS_CHANGE is null");
            return (Criteria) this;
        }

        public Criteria andIsChangeIsNotNull() {
            addCriterion("IS_CHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andIsChangeEqualTo(String value) {
            addCriterion("IS_CHANGE =", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotEqualTo(String value) {
            addCriterion("IS_CHANGE <>", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeGreaterThan(String value) {
            addCriterion("IS_CHANGE >", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeGreaterThanOrEqualTo(String value) {
            addCriterion("IS_CHANGE >=", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLessThan(String value) {
            addCriterion("IS_CHANGE <", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLessThanOrEqualTo(String value) {
            addCriterion("IS_CHANGE <=", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeLike(String value) {
            addCriterion("IS_CHANGE like", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotLike(String value) {
            addCriterion("IS_CHANGE not like", value, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeIn(List<String> values) {
            addCriterion("IS_CHANGE in", values, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotIn(List<String> values) {
            addCriterion("IS_CHANGE not in", values, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeBetween(String value1, String value2) {
            addCriterion("IS_CHANGE between", value1, value2, "isChange");
            return (Criteria) this;
        }

        public Criteria andIsChangeNotBetween(String value1, String value2) {
            addCriterion("IS_CHANGE not between", value1, value2, "isChange");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionIsNull() {
            addCriterion("GOODS_EDITION is null");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionIsNotNull() {
            addCriterion("GOODS_EDITION is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionEqualTo(String value) {
            addCriterion("GOODS_EDITION =", value, "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionNotEqualTo(String value) {
            addCriterion("GOODS_EDITION <>", value, "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionGreaterThan(String value) {
            addCriterion("GOODS_EDITION >", value, "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionGreaterThanOrEqualTo(String value) {
            addCriterion("GOODS_EDITION >=", value, "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionLessThan(String value) {
            addCriterion("GOODS_EDITION <", value, "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionLessThanOrEqualTo(String value) {
            addCriterion("GOODS_EDITION <=", value, "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionLike(String value) {
            addCriterion("GOODS_EDITION like", value, "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionNotLike(String value) {
            addCriterion("GOODS_EDITION not like", value, "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionIn(List<String> values) {
            addCriterion("GOODS_EDITION in", values, "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionNotIn(List<String> values) {
            addCriterion("GOODS_EDITION not in", values, "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionBetween(String value1, String value2) {
            addCriterion("GOODS_EDITION between", value1, value2, "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionNotBetween(String value1, String value2) {
            addCriterion("GOODS_EDITION not between", value1, value2, "goodsEdition");
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

        public Criteria andIsOnSaleIsNull() {
            addCriterion("IS_ON_SALE is null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIsNotNull() {
            addCriterion("IS_ON_SALE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleEqualTo(String value) {
            addCriterion("IS_ON_SALE =", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotEqualTo(String value) {
            addCriterion("IS_ON_SALE <>", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThan(String value) {
            addCriterion("IS_ON_SALE >", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ON_SALE >=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThan(String value) {
            addCriterion("IS_ON_SALE <", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLessThanOrEqualTo(String value) {
            addCriterion("IS_ON_SALE <=", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLike(String value) {
            addCriterion("IS_ON_SALE like", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotLike(String value) {
            addCriterion("IS_ON_SALE not like", value, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleIn(List<String> values) {
            addCriterion("IS_ON_SALE in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotIn(List<String> values) {
            addCriterion("IS_ON_SALE not in", values, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleBetween(String value1, String value2) {
            addCriterion("IS_ON_SALE between", value1, value2, "isOnSale");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleNotBetween(String value1, String value2) {
            addCriterion("IS_ON_SALE not between", value1, value2, "isOnSale");
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

        public Criteria andErpCategory1IsNull() {
            addCriterion("ERP_CATEGORY1 is null");
            return (Criteria) this;
        }

        public Criteria andErpCategory1IsNotNull() {
            addCriterion("ERP_CATEGORY1 is not null");
            return (Criteria) this;
        }

        public Criteria andErpCategory1EqualTo(String value) {
            addCriterion("ERP_CATEGORY1 =", value, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory1NotEqualTo(String value) {
            addCriterion("ERP_CATEGORY1 <>", value, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory1GreaterThan(String value) {
            addCriterion("ERP_CATEGORY1 >", value, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory1GreaterThanOrEqualTo(String value) {
            addCriterion("ERP_CATEGORY1 >=", value, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory1LessThan(String value) {
            addCriterion("ERP_CATEGORY1 <", value, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory1LessThanOrEqualTo(String value) {
            addCriterion("ERP_CATEGORY1 <=", value, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory1Like(String value) {
            addCriterion("ERP_CATEGORY1 like", value, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory1NotLike(String value) {
            addCriterion("ERP_CATEGORY1 not like", value, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory1In(List<String> values) {
            addCriterion("ERP_CATEGORY1 in", values, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory1NotIn(List<String> values) {
            addCriterion("ERP_CATEGORY1 not in", values, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory1Between(String value1, String value2) {
            addCriterion("ERP_CATEGORY1 between", value1, value2, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory1NotBetween(String value1, String value2) {
            addCriterion("ERP_CATEGORY1 not between", value1, value2, "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory2IsNull() {
            addCriterion("ERP_CATEGORY2 is null");
            return (Criteria) this;
        }

        public Criteria andErpCategory2IsNotNull() {
            addCriterion("ERP_CATEGORY2 is not null");
            return (Criteria) this;
        }

        public Criteria andErpCategory2EqualTo(String value) {
            addCriterion("ERP_CATEGORY2 =", value, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory2NotEqualTo(String value) {
            addCriterion("ERP_CATEGORY2 <>", value, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory2GreaterThan(String value) {
            addCriterion("ERP_CATEGORY2 >", value, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory2GreaterThanOrEqualTo(String value) {
            addCriterion("ERP_CATEGORY2 >=", value, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory2LessThan(String value) {
            addCriterion("ERP_CATEGORY2 <", value, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory2LessThanOrEqualTo(String value) {
            addCriterion("ERP_CATEGORY2 <=", value, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory2Like(String value) {
            addCriterion("ERP_CATEGORY2 like", value, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory2NotLike(String value) {
            addCriterion("ERP_CATEGORY2 not like", value, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory2In(List<String> values) {
            addCriterion("ERP_CATEGORY2 in", values, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory2NotIn(List<String> values) {
            addCriterion("ERP_CATEGORY2 not in", values, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory2Between(String value1, String value2) {
            addCriterion("ERP_CATEGORY2 between", value1, value2, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory2NotBetween(String value1, String value2) {
            addCriterion("ERP_CATEGORY2 not between", value1, value2, "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory3IsNull() {
            addCriterion("ERP_CATEGORY3 is null");
            return (Criteria) this;
        }

        public Criteria andErpCategory3IsNotNull() {
            addCriterion("ERP_CATEGORY3 is not null");
            return (Criteria) this;
        }

        public Criteria andErpCategory3EqualTo(String value) {
            addCriterion("ERP_CATEGORY3 =", value, "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andErpCategory3NotEqualTo(String value) {
            addCriterion("ERP_CATEGORY3 <>", value, "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andErpCategory3GreaterThan(String value) {
            addCriterion("ERP_CATEGORY3 >", value, "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andErpCategory3GreaterThanOrEqualTo(String value) {
            addCriterion("ERP_CATEGORY3 >=", value, "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andErpCategory3LessThan(String value) {
            addCriterion("ERP_CATEGORY3 <", value, "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andErpCategory3LessThanOrEqualTo(String value) {
            addCriterion("ERP_CATEGORY3 <=", value, "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andErpCategory3Like(String value) {
            addCriterion("ERP_CATEGORY3 like", value, "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andErpCategory3NotLike(String value) {
            addCriterion("ERP_CATEGORY3 not like", value, "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andErpCategory3In(List<String> values) {
            addCriterion("ERP_CATEGORY3 in", values, "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andErpCategory3NotIn(List<String> values) {
            addCriterion("ERP_CATEGORY3 not in", values, "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andErpCategory3Between(String value1, String value2) {
            addCriterion("ERP_CATEGORY3 between", value1, value2, "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andErpCategory3NotBetween(String value1, String value2) {
            addCriterion("ERP_CATEGORY3 not between", value1, value2, "erpCategory3");
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

        public Criteria andModelCodeIsNull() {
            addCriterion("MODEL_CODE is null");
            return (Criteria) this;
        }

        public Criteria andModelCodeIsNotNull() {
            addCriterion("MODEL_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andModelCodeEqualTo(String value) {
            addCriterion("MODEL_CODE =", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotEqualTo(String value) {
            addCriterion("MODEL_CODE <>", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeGreaterThan(String value) {
            addCriterion("MODEL_CODE >", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeGreaterThanOrEqualTo(String value) {
            addCriterion("MODEL_CODE >=", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLessThan(String value) {
            addCriterion("MODEL_CODE <", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLessThanOrEqualTo(String value) {
            addCriterion("MODEL_CODE <=", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeLike(String value) {
            addCriterion("MODEL_CODE like", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotLike(String value) {
            addCriterion("MODEL_CODE not like", value, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeIn(List<String> values) {
            addCriterion("MODEL_CODE in", values, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotIn(List<String> values) {
            addCriterion("MODEL_CODE not in", values, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeBetween(String value1, String value2) {
            addCriterion("MODEL_CODE between", value1, value2, "modelCode");
            return (Criteria) this;
        }

        public Criteria andModelCodeNotBetween(String value1, String value2) {
            addCriterion("MODEL_CODE not between", value1, value2, "modelCode");
            return (Criteria) this;
        }

        public Criteria andPromotePriceIsNull() {
            addCriterion("PROMOTE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPromotePriceIsNotNull() {
            addCriterion("PROMOTE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPromotePriceEqualTo(BigDecimal value) {
            addCriterion("PROMOTE_PRICE =", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceNotEqualTo(BigDecimal value) {
            addCriterion("PROMOTE_PRICE <>", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceGreaterThan(BigDecimal value) {
            addCriterion("PROMOTE_PRICE >", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTE_PRICE >=", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceLessThan(BigDecimal value) {
            addCriterion("PROMOTE_PRICE <", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROMOTE_PRICE <=", value, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceIn(List<BigDecimal> values) {
            addCriterion("PROMOTE_PRICE in", values, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceNotIn(List<BigDecimal> values) {
            addCriterion("PROMOTE_PRICE not in", values, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTE_PRICE between", value1, value2, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andPromotePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROMOTE_PRICE not between", value1, value2, "promotePrice");
            return (Criteria) this;
        }

        public Criteria andGoodsNoLikeInsensitive(String value) {
            addCriterion("upper(GOODS_NO) like", value.toUpperCase(), "goodsNo");
            return (Criteria) this;
        }

        public Criteria andFactoryNoLikeInsensitive(String value) {
            addCriterion("upper(FACTORY_NO) like", value.toUpperCase(), "factoryNo");
            return (Criteria) this;
        }

        public Criteria andTrademarkLikeInsensitive(String value) {
            addCriterion("upper(TRADEMARK) like", value.toUpperCase(), "trademark");
            return (Criteria) this;
        }

        public Criteria andUseMarkerLikeInsensitive(String value) {
            addCriterion("upper(USE_MARKER) like", value.toUpperCase(), "useMarker");
            return (Criteria) this;
        }

        public Criteria andBarCodeLikeInsensitive(String value) {
            addCriterion("upper(BAR_CODE) like", value.toUpperCase(), "barCode");
            return (Criteria) this;
        }

        public Criteria andMaterialGoodsLikeInsensitive(String value) {
            addCriterion("upper(MATERIAL_GOODS) like", value.toUpperCase(), "materialGoods");
            return (Criteria) this;
        }

        public Criteria andMaterialTypeLikeInsensitive(String value) {
            addCriterion("upper(MATERIAL_TYPE) like", value.toUpperCase(), "materialType");
            return (Criteria) this;
        }

        public Criteria andCertificateNoLikeInsensitive(String value) {
            addCriterion("upper(CERTIFICATE_NO) like", value.toUpperCase(), "certificateNo");
            return (Criteria) this;
        }

        public Criteria andFingerRingLikeInsensitive(String value) {
            addCriterion("upper(FINGER_RING) like", value.toUpperCase(), "fingerRing");
            return (Criteria) this;
        }

        public Criteria andCommodityTechnologyLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_TECHNOLOGY) like", value.toUpperCase(), "commodityTechnology");
            return (Criteria) this;
        }

        public Criteria andCommodityColorLikeInsensitive(String value) {
            addCriterion("upper(COMMODITY_COLOR) like", value.toUpperCase(), "commodityColor");
            return (Criteria) this;
        }

        public Criteria andMainStoneLikeInsensitive(String value) {
            addCriterion("upper(MAIN_STONE) like", value.toUpperCase(), "mainStone");
            return (Criteria) this;
        }

        public Criteria andMainRockTypeLikeInsensitive(String value) {
            addCriterion("upper(MAIN_ROCK_TYPE) like", value.toUpperCase(), "mainRockType");
            return (Criteria) this;
        }

        public Criteria andMainOreQuantityLikeInsensitive(String value) {
            addCriterion("upper(MAIN_ORE_QUANTITY) like", value.toUpperCase(), "mainOreQuantity");
            return (Criteria) this;
        }

        public Criteria andMainOreGradeLikeInsensitive(String value) {
            addCriterion("upper(MAIN_ORE_GRADE) like", value.toUpperCase(), "mainOreGrade");
            return (Criteria) this;
        }

        public Criteria andMainOreColorLikeInsensitive(String value) {
            addCriterion("upper(MAIN_ORE_COLOR) like", value.toUpperCase(), "mainOreColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneLikeInsensitive(String value) {
            addCriterion("upper(BESIDE_STONE) like", value.toUpperCase(), "besideStone");
            return (Criteria) this;
        }

        public Criteria andBesideStoneTypeLikeInsensitive(String value) {
            addCriterion("upper(BESIDE_STONE_TYPE) like", value.toUpperCase(), "besideStoneType");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantityLikeInsensitive(String value) {
            addCriterion("upper(BESIDE_STONE_QUANTITY) like", value.toUpperCase(), "besideStoneQuantity");
            return (Criteria) this;
        }

        public Criteria andBesideStoneCleanlinessLikeInsensitive(String value) {
            addCriterion("upper(BESIDE_STONE_CLEANLINESS) like", value.toUpperCase(), "besideStoneCleanliness");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColorLikeInsensitive(String value) {
            addCriterion("upper(BESIDE_STONE_COLOR) like", value.toUpperCase(), "besideStoneColor");
            return (Criteria) this;
        }

        public Criteria andBesideStoneType2LikeInsensitive(String value) {
            addCriterion("upper(BESIDE_STONE_TYPE2) like", value.toUpperCase(), "besideStoneType2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneQuantity2LikeInsensitive(String value) {
            addCriterion("upper(BESIDE_STONE_QUANTITY2) like", value.toUpperCase(), "besideStoneQuantity2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneGrade2LikeInsensitive(String value) {
            addCriterion("upper(BESIDE_STONE_GRADE2) like", value.toUpperCase(), "besideStoneGrade2");
            return (Criteria) this;
        }

        public Criteria andBesideStoneColor2LikeInsensitive(String value) {
            addCriterion("upper(BESIDE_STONE_COLOR2) like", value.toUpperCase(), "besideStoneColor2");
            return (Criteria) this;
        }

        public Criteria andIsGroupLikeInsensitive(String value) {
            addCriterion("upper(IS_GROUP) like", value.toUpperCase(), "isGroup");
            return (Criteria) this;
        }

        public Criteria andIsDefaultLikeInsensitive(String value) {
            addCriterion("upper(IS_DEFAULT) like", value.toUpperCase(), "isDefault");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLikeInsensitive(String value) {
            addCriterion("upper(GOODS_NAME) like", value.toUpperCase(), "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsDescLikeInsensitive(String value) {
            addCriterion("upper(GOODS_DESC) like", value.toUpperCase(), "goodsDesc");
            return (Criteria) this;
        }

        public Criteria andReceiveTimeLikeInsensitive(String value) {
            addCriterion("upper(RECEIVE_TIME) like", value.toUpperCase(), "receiveTime");
            return (Criteria) this;
        }

        public Criteria andIsChangeLikeInsensitive(String value) {
            addCriterion("upper(IS_CHANGE) like", value.toUpperCase(), "isChange");
            return (Criteria) this;
        }

        public Criteria andGoodsEditionLikeInsensitive(String value) {
            addCriterion("upper(GOODS_EDITION) like", value.toUpperCase(), "goodsEdition");
            return (Criteria) this;
        }

        public Criteria andIsOnSaleLikeInsensitive(String value) {
            addCriterion("upper(IS_ON_SALE) like", value.toUpperCase(), "isOnSale");
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

        public Criteria andErpCategory1LikeInsensitive(String value) {
            addCriterion("upper(ERP_CATEGORY1) like", value.toUpperCase(), "erpCategory1");
            return (Criteria) this;
        }

        public Criteria andErpCategory2LikeInsensitive(String value) {
            addCriterion("upper(ERP_CATEGORY2) like", value.toUpperCase(), "erpCategory2");
            return (Criteria) this;
        }

        public Criteria andErpCategory3LikeInsensitive(String value) {
            addCriterion("upper(ERP_CATEGORY3) like", value.toUpperCase(), "erpCategory3");
            return (Criteria) this;
        }

        public Criteria andModelCodeLikeInsensitive(String value) {
            addCriterion("upper(MODEL_CODE) like", value.toUpperCase(), "modelCode");
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