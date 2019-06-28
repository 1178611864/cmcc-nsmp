package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmAssetPropExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAssetPropExample() {
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

        public Criteria andPkAssetPropIsNull() {
            addCriterion("PK_ASSET_PROP is null");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropIsNotNull() {
            addCriterion("PK_ASSET_PROP is not null");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropEqualTo(String value) {
            addCriterion("PK_ASSET_PROP =", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropNotEqualTo(String value) {
            addCriterion("PK_ASSET_PROP <>", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropGreaterThan(String value) {
            addCriterion("PK_ASSET_PROP >", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_PROP >=", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropLessThan(String value) {
            addCriterion("PK_ASSET_PROP <", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropLessThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_PROP <=", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropLike(String value) {
            addCriterion("PK_ASSET_PROP like", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropNotLike(String value) {
            addCriterion("PK_ASSET_PROP not like", value, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropIn(List<String> values) {
            addCriterion("PK_ASSET_PROP in", values, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropNotIn(List<String> values) {
            addCriterion("PK_ASSET_PROP not in", values, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropBetween(String value1, String value2) {
            addCriterion("PK_ASSET_PROP between", value1, value2, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPkAssetPropNotBetween(String value1, String value2) {
            addCriterion("PK_ASSET_PROP not between", value1, value2, "pkAssetProp");
            return (Criteria) this;
        }

        public Criteria andPropNameIsNull() {
            addCriterion("PROP_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPropNameIsNotNull() {
            addCriterion("PROP_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPropNameEqualTo(String value) {
            addCriterion("PROP_NAME =", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameNotEqualTo(String value) {
            addCriterion("PROP_NAME <>", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameGreaterThan(String value) {
            addCriterion("PROP_NAME >", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROP_NAME >=", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameLessThan(String value) {
            addCriterion("PROP_NAME <", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameLessThanOrEqualTo(String value) {
            addCriterion("PROP_NAME <=", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameLike(String value) {
            addCriterion("PROP_NAME like", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameNotLike(String value) {
            addCriterion("PROP_NAME not like", value, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameIn(List<String> values) {
            addCriterion("PROP_NAME in", values, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameNotIn(List<String> values) {
            addCriterion("PROP_NAME not in", values, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameBetween(String value1, String value2) {
            addCriterion("PROP_NAME between", value1, value2, "propName");
            return (Criteria) this;
        }

        public Criteria andPropNameNotBetween(String value1, String value2) {
            addCriterion("PROP_NAME not between", value1, value2, "propName");
            return (Criteria) this;
        }

        public Criteria andPropCodeIsNull() {
            addCriterion("PROP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andPropCodeIsNotNull() {
            addCriterion("PROP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andPropCodeEqualTo(String value) {
            addCriterion("PROP_CODE =", value, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropCodeNotEqualTo(String value) {
            addCriterion("PROP_CODE <>", value, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropCodeGreaterThan(String value) {
            addCriterion("PROP_CODE >", value, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROP_CODE >=", value, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropCodeLessThan(String value) {
            addCriterion("PROP_CODE <", value, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropCodeLessThanOrEqualTo(String value) {
            addCriterion("PROP_CODE <=", value, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropCodeLike(String value) {
            addCriterion("PROP_CODE like", value, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropCodeNotLike(String value) {
            addCriterion("PROP_CODE not like", value, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropCodeIn(List<String> values) {
            addCriterion("PROP_CODE in", values, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropCodeNotIn(List<String> values) {
            addCriterion("PROP_CODE not in", values, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropCodeBetween(String value1, String value2) {
            addCriterion("PROP_CODE between", value1, value2, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropCodeNotBetween(String value1, String value2) {
            addCriterion("PROP_CODE not between", value1, value2, "propCode");
            return (Criteria) this;
        }

        public Criteria andPropDescIsNull() {
            addCriterion("PROP_DESC is null");
            return (Criteria) this;
        }

        public Criteria andPropDescIsNotNull() {
            addCriterion("PROP_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andPropDescEqualTo(String value) {
            addCriterion("PROP_DESC =", value, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPropDescNotEqualTo(String value) {
            addCriterion("PROP_DESC <>", value, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPropDescGreaterThan(String value) {
            addCriterion("PROP_DESC >", value, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPropDescGreaterThanOrEqualTo(String value) {
            addCriterion("PROP_DESC >=", value, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPropDescLessThan(String value) {
            addCriterion("PROP_DESC <", value, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPropDescLessThanOrEqualTo(String value) {
            addCriterion("PROP_DESC <=", value, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPropDescLike(String value) {
            addCriterion("PROP_DESC like", value, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPropDescNotLike(String value) {
            addCriterion("PROP_DESC not like", value, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPropDescIn(List<String> values) {
            addCriterion("PROP_DESC in", values, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPropDescNotIn(List<String> values) {
            addCriterion("PROP_DESC not in", values, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPropDescBetween(String value1, String value2) {
            addCriterion("PROP_DESC between", value1, value2, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPropDescNotBetween(String value1, String value2) {
            addCriterion("PROP_DESC not between", value1, value2, "propDesc");
            return (Criteria) this;
        }

        public Criteria andPkPropClassIsNull() {
            addCriterion("PK_PROP_CLASS is null");
            return (Criteria) this;
        }

        public Criteria andPkPropClassIsNotNull() {
            addCriterion("PK_PROP_CLASS is not null");
            return (Criteria) this;
        }

        public Criteria andPkPropClassEqualTo(String value) {
            addCriterion("PK_PROP_CLASS =", value, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andPkPropClassNotEqualTo(String value) {
            addCriterion("PK_PROP_CLASS <>", value, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andPkPropClassGreaterThan(String value) {
            addCriterion("PK_PROP_CLASS >", value, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andPkPropClassGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PROP_CLASS >=", value, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andPkPropClassLessThan(String value) {
            addCriterion("PK_PROP_CLASS <", value, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andPkPropClassLessThanOrEqualTo(String value) {
            addCriterion("PK_PROP_CLASS <=", value, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andPkPropClassLike(String value) {
            addCriterion("PK_PROP_CLASS like", value, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andPkPropClassNotLike(String value) {
            addCriterion("PK_PROP_CLASS not like", value, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andPkPropClassIn(List<String> values) {
            addCriterion("PK_PROP_CLASS in", values, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andPkPropClassNotIn(List<String> values) {
            addCriterion("PK_PROP_CLASS not in", values, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andPkPropClassBetween(String value1, String value2) {
            addCriterion("PK_PROP_CLASS between", value1, value2, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andPkPropClassNotBetween(String value1, String value2) {
            addCriterion("PK_PROP_CLASS not between", value1, value2, "pkPropClass");
            return (Criteria) this;
        }

        public Criteria andBsTypeIsNull() {
            addCriterion("BS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBsTypeIsNotNull() {
            addCriterion("BS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBsTypeEqualTo(Short value) {
            addCriterion("BS_TYPE =", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeNotEqualTo(Short value) {
            addCriterion("BS_TYPE <>", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeGreaterThan(Short value) {
            addCriterion("BS_TYPE >", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("BS_TYPE >=", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeLessThan(Short value) {
            addCriterion("BS_TYPE <", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeLessThanOrEqualTo(Short value) {
            addCriterion("BS_TYPE <=", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeIn(List<Short> values) {
            addCriterion("BS_TYPE in", values, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeNotIn(List<Short> values) {
            addCriterion("BS_TYPE not in", values, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeBetween(Short value1, Short value2) {
            addCriterion("BS_TYPE between", value1, value2, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeNotBetween(Short value1, Short value2) {
            addCriterion("BS_TYPE not between", value1, value2, "bsType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNull() {
            addCriterion("DATA_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDataTypeIsNotNull() {
            addCriterion("DATA_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDataTypeEqualTo(String value) {
            addCriterion("DATA_TYPE =", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotEqualTo(String value) {
            addCriterion("DATA_TYPE <>", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThan(String value) {
            addCriterion("DATA_TYPE >", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE >=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThan(String value) {
            addCriterion("DATA_TYPE <", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLessThanOrEqualTo(String value) {
            addCriterion("DATA_TYPE <=", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeLike(String value) {
            addCriterion("DATA_TYPE like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotLike(String value) {
            addCriterion("DATA_TYPE not like", value, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeIn(List<String> values) {
            addCriterion("DATA_TYPE in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotIn(List<String> values) {
            addCriterion("DATA_TYPE not in", values, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeBetween(String value1, String value2) {
            addCriterion("DATA_TYPE between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andDataTypeNotBetween(String value1, String value2) {
            addCriterion("DATA_TYPE not between", value1, value2, "dataType");
            return (Criteria) this;
        }

        public Criteria andIsViewIsNull() {
            addCriterion("IS_VIEW is null");
            return (Criteria) this;
        }

        public Criteria andIsViewIsNotNull() {
            addCriterion("IS_VIEW is not null");
            return (Criteria) this;
        }

        public Criteria andIsViewEqualTo(Short value) {
            addCriterion("IS_VIEW =", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotEqualTo(Short value) {
            addCriterion("IS_VIEW <>", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewGreaterThan(Short value) {
            addCriterion("IS_VIEW >", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_VIEW >=", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewLessThan(Short value) {
            addCriterion("IS_VIEW <", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewLessThanOrEqualTo(Short value) {
            addCriterion("IS_VIEW <=", value, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewIn(List<Short> values) {
            addCriterion("IS_VIEW in", values, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotIn(List<Short> values) {
            addCriterion("IS_VIEW not in", values, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewBetween(Short value1, Short value2) {
            addCriterion("IS_VIEW between", value1, value2, "isView");
            return (Criteria) this;
        }

        public Criteria andIsViewNotBetween(Short value1, Short value2) {
            addCriterion("IS_VIEW not between", value1, value2, "isView");
            return (Criteria) this;
        }

        public Criteria andNeedValueIsNull() {
            addCriterion("NEED_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andNeedValueIsNotNull() {
            addCriterion("NEED_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andNeedValueEqualTo(Short value) {
            addCriterion("NEED_VALUE =", value, "needValue");
            return (Criteria) this;
        }

        public Criteria andNeedValueNotEqualTo(Short value) {
            addCriterion("NEED_VALUE <>", value, "needValue");
            return (Criteria) this;
        }

        public Criteria andNeedValueGreaterThan(Short value) {
            addCriterion("NEED_VALUE >", value, "needValue");
            return (Criteria) this;
        }

        public Criteria andNeedValueGreaterThanOrEqualTo(Short value) {
            addCriterion("NEED_VALUE >=", value, "needValue");
            return (Criteria) this;
        }

        public Criteria andNeedValueLessThan(Short value) {
            addCriterion("NEED_VALUE <", value, "needValue");
            return (Criteria) this;
        }

        public Criteria andNeedValueLessThanOrEqualTo(Short value) {
            addCriterion("NEED_VALUE <=", value, "needValue");
            return (Criteria) this;
        }

        public Criteria andNeedValueIn(List<Short> values) {
            addCriterion("NEED_VALUE in", values, "needValue");
            return (Criteria) this;
        }

        public Criteria andNeedValueNotIn(List<Short> values) {
            addCriterion("NEED_VALUE not in", values, "needValue");
            return (Criteria) this;
        }

        public Criteria andNeedValueBetween(Short value1, Short value2) {
            addCriterion("NEED_VALUE between", value1, value2, "needValue");
            return (Criteria) this;
        }

        public Criteria andNeedValueNotBetween(Short value1, Short value2) {
            addCriterion("NEED_VALUE not between", value1, value2, "needValue");
            return (Criteria) this;
        }

        public Criteria andCollectTypeIsNull() {
            addCriterion("COLLECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCollectTypeIsNotNull() {
            addCriterion("COLLECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCollectTypeEqualTo(String value) {
            addCriterion("COLLECT_TYPE =", value, "collectType");
            return (Criteria) this;
        }

        public Criteria andCollectTypeNotEqualTo(String value) {
            addCriterion("COLLECT_TYPE <>", value, "collectType");
            return (Criteria) this;
        }

        public Criteria andCollectTypeGreaterThan(String value) {
            addCriterion("COLLECT_TYPE >", value, "collectType");
            return (Criteria) this;
        }

        public Criteria andCollectTypeGreaterThanOrEqualTo(String value) {
            addCriterion("COLLECT_TYPE >=", value, "collectType");
            return (Criteria) this;
        }

        public Criteria andCollectTypeLessThan(String value) {
            addCriterion("COLLECT_TYPE <", value, "collectType");
            return (Criteria) this;
        }

        public Criteria andCollectTypeLessThanOrEqualTo(String value) {
            addCriterion("COLLECT_TYPE <=", value, "collectType");
            return (Criteria) this;
        }

        public Criteria andCollectTypeLike(String value) {
            addCriterion("COLLECT_TYPE like", value, "collectType");
            return (Criteria) this;
        }

        public Criteria andCollectTypeNotLike(String value) {
            addCriterion("COLLECT_TYPE not like", value, "collectType");
            return (Criteria) this;
        }

        public Criteria andCollectTypeIn(List<String> values) {
            addCriterion("COLLECT_TYPE in", values, "collectType");
            return (Criteria) this;
        }

        public Criteria andCollectTypeNotIn(List<String> values) {
            addCriterion("COLLECT_TYPE not in", values, "collectType");
            return (Criteria) this;
        }

        public Criteria andCollectTypeBetween(String value1, String value2) {
            addCriterion("COLLECT_TYPE between", value1, value2, "collectType");
            return (Criteria) this;
        }

        public Criteria andCollectTypeNotBetween(String value1, String value2) {
            addCriterion("COLLECT_TYPE not between", value1, value2, "collectType");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNull() {
            addCriterion("COME_FROM is null");
            return (Criteria) this;
        }

        public Criteria andComeFromIsNotNull() {
            addCriterion("COME_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andComeFromEqualTo(Short value) {
            addCriterion("COME_FROM =", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotEqualTo(Short value) {
            addCriterion("COME_FROM <>", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThan(Short value) {
            addCriterion("COME_FROM >", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromGreaterThanOrEqualTo(Short value) {
            addCriterion("COME_FROM >=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThan(Short value) {
            addCriterion("COME_FROM <", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromLessThanOrEqualTo(Short value) {
            addCriterion("COME_FROM <=", value, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromIn(List<Short> values) {
            addCriterion("COME_FROM in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotIn(List<Short> values) {
            addCriterion("COME_FROM not in", values, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromBetween(Short value1, Short value2) {
            addCriterion("COME_FROM between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andComeFromNotBetween(Short value1, Short value2) {
            addCriterion("COME_FROM not between", value1, value2, "comeFrom");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNull() {
            addCriterion("IS_DELETED is null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIsNotNull() {
            addCriterion("IS_DELETED is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeletedEqualTo(Short value) {
            addCriterion("IS_DELETED =", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotEqualTo(Short value) {
            addCriterion("IS_DELETED <>", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThan(Short value) {
            addCriterion("IS_DELETED >", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_DELETED >=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThan(Short value) {
            addCriterion("IS_DELETED <", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedLessThanOrEqualTo(Short value) {
            addCriterion("IS_DELETED <=", value, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedIn(List<Short> values) {
            addCriterion("IS_DELETED in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotIn(List<Short> values) {
            addCriterion("IS_DELETED not in", values, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedBetween(Short value1, Short value2) {
            addCriterion("IS_DELETED between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andIsDeletedNotBetween(Short value1, Short value2) {
            addCriterion("IS_DELETED not between", value1, value2, "isDeleted");
            return (Criteria) this;
        }

        public Criteria andPkCreatorIsNull() {
            addCriterion("PK_CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andPkCreatorIsNotNull() {
            addCriterion("PK_CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andPkCreatorEqualTo(String value) {
            addCriterion("PK_CREATOR =", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorNotEqualTo(String value) {
            addCriterion("PK_CREATOR <>", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorGreaterThan(String value) {
            addCriterion("PK_CREATOR >", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("PK_CREATOR >=", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorLessThan(String value) {
            addCriterion("PK_CREATOR <", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorLessThanOrEqualTo(String value) {
            addCriterion("PK_CREATOR <=", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorLike(String value) {
            addCriterion("PK_CREATOR like", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorNotLike(String value) {
            addCriterion("PK_CREATOR not like", value, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorIn(List<String> values) {
            addCriterion("PK_CREATOR in", values, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorNotIn(List<String> values) {
            addCriterion("PK_CREATOR not in", values, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorBetween(String value1, String value2) {
            addCriterion("PK_CREATOR between", value1, value2, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andPkCreatorNotBetween(String value1, String value2) {
            addCriterion("PK_CREATOR not between", value1, value2, "pkCreator");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andPkMenderIsNull() {
            addCriterion("PK_MENDER is null");
            return (Criteria) this;
        }

        public Criteria andPkMenderIsNotNull() {
            addCriterion("PK_MENDER is not null");
            return (Criteria) this;
        }

        public Criteria andPkMenderEqualTo(String value) {
            addCriterion("PK_MENDER =", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderNotEqualTo(String value) {
            addCriterion("PK_MENDER <>", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderGreaterThan(String value) {
            addCriterion("PK_MENDER >", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderGreaterThanOrEqualTo(String value) {
            addCriterion("PK_MENDER >=", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderLessThan(String value) {
            addCriterion("PK_MENDER <", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderLessThanOrEqualTo(String value) {
            addCriterion("PK_MENDER <=", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderLike(String value) {
            addCriterion("PK_MENDER like", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderNotLike(String value) {
            addCriterion("PK_MENDER not like", value, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderIn(List<String> values) {
            addCriterion("PK_MENDER in", values, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderNotIn(List<String> values) {
            addCriterion("PK_MENDER not in", values, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderBetween(String value1, String value2) {
            addCriterion("PK_MENDER between", value1, value2, "pkMender");
            return (Criteria) this;
        }

        public Criteria andPkMenderNotBetween(String value1, String value2) {
            addCriterion("PK_MENDER not between", value1, value2, "pkMender");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastIsNull() {
            addCriterion("MEND_TIME_LAST is null");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastIsNotNull() {
            addCriterion("MEND_TIME_LAST is not null");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastEqualTo(Date value) {
            addCriterion("MEND_TIME_LAST =", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastNotEqualTo(Date value) {
            addCriterion("MEND_TIME_LAST <>", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastGreaterThan(Date value) {
            addCriterion("MEND_TIME_LAST >", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastGreaterThanOrEqualTo(Date value) {
            addCriterion("MEND_TIME_LAST >=", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastLessThan(Date value) {
            addCriterion("MEND_TIME_LAST <", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastLessThanOrEqualTo(Date value) {
            addCriterion("MEND_TIME_LAST <=", value, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastIn(List<Date> values) {
            addCriterion("MEND_TIME_LAST in", values, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastNotIn(List<Date> values) {
            addCriterion("MEND_TIME_LAST not in", values, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastBetween(Date value1, Date value2) {
            addCriterion("MEND_TIME_LAST between", value1, value2, "mendTimeLast");
            return (Criteria) this;
        }

        public Criteria andMendTimeLastNotBetween(Date value1, Date value2) {
            addCriterion("MEND_TIME_LAST not between", value1, value2, "mendTimeLast");
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