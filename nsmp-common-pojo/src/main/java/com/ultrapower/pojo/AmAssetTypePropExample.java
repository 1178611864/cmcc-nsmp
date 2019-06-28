package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.List;

public class AmAssetTypePropExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAssetTypePropExample() {
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

        public Criteria andPkAssetTypeIsNull() {
            addCriterion("PK_ASSET_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeIsNotNull() {
            addCriterion("PK_ASSET_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeEqualTo(String value) {
            addCriterion("PK_ASSET_TYPE =", value, "pkAssetType");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeNotEqualTo(String value) {
            addCriterion("PK_ASSET_TYPE <>", value, "pkAssetType");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeGreaterThan(String value) {
            addCriterion("PK_ASSET_TYPE >", value, "pkAssetType");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_TYPE >=", value, "pkAssetType");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeLessThan(String value) {
            addCriterion("PK_ASSET_TYPE <", value, "pkAssetType");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeLessThanOrEqualTo(String value) {
            addCriterion("PK_ASSET_TYPE <=", value, "pkAssetType");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeLike(String value) {
            addCriterion("PK_ASSET_TYPE like", value, "pkAssetType");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeNotLike(String value) {
            addCriterion("PK_ASSET_TYPE not like", value, "pkAssetType");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeIn(List<String> values) {
            addCriterion("PK_ASSET_TYPE in", values, "pkAssetType");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeNotIn(List<String> values) {
            addCriterion("PK_ASSET_TYPE not in", values, "pkAssetType");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeBetween(String value1, String value2) {
            addCriterion("PK_ASSET_TYPE between", value1, value2, "pkAssetType");
            return (Criteria) this;
        }

        public Criteria andPkAssetTypeNotBetween(String value1, String value2) {
            addCriterion("PK_ASSET_TYPE not between", value1, value2, "pkAssetType");
            return (Criteria) this;
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

        public Criteria andDisplayIdxIsNull() {
            addCriterion("DISPLAY_IDX is null");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxIsNotNull() {
            addCriterion("DISPLAY_IDX is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxEqualTo(Short value) {
            addCriterion("DISPLAY_IDX =", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxNotEqualTo(Short value) {
            addCriterion("DISPLAY_IDX <>", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxGreaterThan(Short value) {
            addCriterion("DISPLAY_IDX >", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxGreaterThanOrEqualTo(Short value) {
            addCriterion("DISPLAY_IDX >=", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxLessThan(Short value) {
            addCriterion("DISPLAY_IDX <", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxLessThanOrEqualTo(Short value) {
            addCriterion("DISPLAY_IDX <=", value, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxIn(List<Short> values) {
            addCriterion("DISPLAY_IDX in", values, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxNotIn(List<Short> values) {
            addCriterion("DISPLAY_IDX not in", values, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxBetween(Short value1, Short value2) {
            addCriterion("DISPLAY_IDX between", value1, value2, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayIdxNotBetween(Short value1, Short value2) {
            addCriterion("DISPLAY_IDX not between", value1, value2, "displayIdx");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityIsNull() {
            addCriterion("DISPLAY_PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityIsNotNull() {
            addCriterion("DISPLAY_PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityEqualTo(String value) {
            addCriterion("DISPLAY_PRIORITY =", value, "displayPriority");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityNotEqualTo(String value) {
            addCriterion("DISPLAY_PRIORITY <>", value, "displayPriority");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityGreaterThan(String value) {
            addCriterion("DISPLAY_PRIORITY >", value, "displayPriority");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("DISPLAY_PRIORITY >=", value, "displayPriority");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityLessThan(String value) {
            addCriterion("DISPLAY_PRIORITY <", value, "displayPriority");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityLessThanOrEqualTo(String value) {
            addCriterion("DISPLAY_PRIORITY <=", value, "displayPriority");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityLike(String value) {
            addCriterion("DISPLAY_PRIORITY like", value, "displayPriority");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityNotLike(String value) {
            addCriterion("DISPLAY_PRIORITY not like", value, "displayPriority");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityIn(List<String> values) {
            addCriterion("DISPLAY_PRIORITY in", values, "displayPriority");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityNotIn(List<String> values) {
            addCriterion("DISPLAY_PRIORITY not in", values, "displayPriority");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityBetween(String value1, String value2) {
            addCriterion("DISPLAY_PRIORITY between", value1, value2, "displayPriority");
            return (Criteria) this;
        }

        public Criteria andDisplayPriorityNotBetween(String value1, String value2) {
            addCriterion("DISPLAY_PRIORITY not between", value1, value2, "displayPriority");
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