package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmBsGroupProvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmBsGroupProvExample() {
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

        public Criteria andPkBsGroupProvIsNull() {
            addCriterion("PK_BS_GROUP_PROV is null");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvIsNotNull() {
            addCriterion("PK_BS_GROUP_PROV is not null");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvEqualTo(String value) {
            addCriterion("PK_BS_GROUP_PROV =", value, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvNotEqualTo(String value) {
            addCriterion("PK_BS_GROUP_PROV <>", value, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvGreaterThan(String value) {
            addCriterion("PK_BS_GROUP_PROV >", value, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BS_GROUP_PROV >=", value, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvLessThan(String value) {
            addCriterion("PK_BS_GROUP_PROV <", value, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvLessThanOrEqualTo(String value) {
            addCriterion("PK_BS_GROUP_PROV <=", value, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvLike(String value) {
            addCriterion("PK_BS_GROUP_PROV like", value, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvNotLike(String value) {
            addCriterion("PK_BS_GROUP_PROV not like", value, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvIn(List<String> values) {
            addCriterion("PK_BS_GROUP_PROV in", values, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvNotIn(List<String> values) {
            addCriterion("PK_BS_GROUP_PROV not in", values, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvBetween(String value1, String value2) {
            addCriterion("PK_BS_GROUP_PROV between", value1, value2, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupProvNotBetween(String value1, String value2) {
            addCriterion("PK_BS_GROUP_PROV not between", value1, value2, "pkBsGroupProv");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupIsNull() {
            addCriterion("PK_BS_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupIsNotNull() {
            addCriterion("PK_BS_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupEqualTo(String value) {
            addCriterion("PK_BS_GROUP =", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupNotEqualTo(String value) {
            addCriterion("PK_BS_GROUP <>", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupGreaterThan(String value) {
            addCriterion("PK_BS_GROUP >", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BS_GROUP >=", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupLessThan(String value) {
            addCriterion("PK_BS_GROUP <", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupLessThanOrEqualTo(String value) {
            addCriterion("PK_BS_GROUP <=", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupLike(String value) {
            addCriterion("PK_BS_GROUP like", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupNotLike(String value) {
            addCriterion("PK_BS_GROUP not like", value, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupIn(List<String> values) {
            addCriterion("PK_BS_GROUP in", values, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupNotIn(List<String> values) {
            addCriterion("PK_BS_GROUP not in", values, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupBetween(String value1, String value2) {
            addCriterion("PK_BS_GROUP between", value1, value2, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsGroupNotBetween(String value1, String value2) {
            addCriterion("PK_BS_GROUP not between", value1, value2, "pkBsGroup");
            return (Criteria) this;
        }

        public Criteria andPkBsProvIsNull() {
            addCriterion("PK_BS_PROV is null");
            return (Criteria) this;
        }

        public Criteria andPkBsProvIsNotNull() {
            addCriterion("PK_BS_PROV is not null");
            return (Criteria) this;
        }

        public Criteria andPkBsProvEqualTo(String value) {
            addCriterion("PK_BS_PROV =", value, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andPkBsProvNotEqualTo(String value) {
            addCriterion("PK_BS_PROV <>", value, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andPkBsProvGreaterThan(String value) {
            addCriterion("PK_BS_PROV >", value, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andPkBsProvGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BS_PROV >=", value, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andPkBsProvLessThan(String value) {
            addCriterion("PK_BS_PROV <", value, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andPkBsProvLessThanOrEqualTo(String value) {
            addCriterion("PK_BS_PROV <=", value, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andPkBsProvLike(String value) {
            addCriterion("PK_BS_PROV like", value, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andPkBsProvNotLike(String value) {
            addCriterion("PK_BS_PROV not like", value, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andPkBsProvIn(List<String> values) {
            addCriterion("PK_BS_PROV in", values, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andPkBsProvNotIn(List<String> values) {
            addCriterion("PK_BS_PROV not in", values, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andPkBsProvBetween(String value1, String value2) {
            addCriterion("PK_BS_PROV between", value1, value2, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andPkBsProvNotBetween(String value1, String value2) {
            addCriterion("PK_BS_PROV not between", value1, value2, "pkBsProv");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNull() {
            addCriterion("MATCH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIsNotNull() {
            addCriterion("MATCH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTypeEqualTo(Short value) {
            addCriterion("MATCH_TYPE =", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotEqualTo(Short value) {
            addCriterion("MATCH_TYPE <>", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThan(Short value) {
            addCriterion("MATCH_TYPE >", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("MATCH_TYPE >=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThan(Short value) {
            addCriterion("MATCH_TYPE <", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeLessThanOrEqualTo(Short value) {
            addCriterion("MATCH_TYPE <=", value, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeIn(List<Short> values) {
            addCriterion("MATCH_TYPE in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotIn(List<Short> values) {
            addCriterion("MATCH_TYPE not in", values, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeBetween(Short value1, Short value2) {
            addCriterion("MATCH_TYPE between", value1, value2, "matchType");
            return (Criteria) this;
        }

        public Criteria andMatchTypeNotBetween(Short value1, Short value2) {
            addCriterion("MATCH_TYPE not between", value1, value2, "matchType");
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