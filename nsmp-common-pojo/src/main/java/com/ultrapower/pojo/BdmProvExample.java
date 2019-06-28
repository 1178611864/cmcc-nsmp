package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdmProvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdmProvExample() {
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

        public Criteria andPkProvIsNull() {
            addCriterion("PK_PROV is null");
            return (Criteria) this;
        }

        public Criteria andPkProvIsNotNull() {
            addCriterion("PK_PROV is not null");
            return (Criteria) this;
        }

        public Criteria andPkProvEqualTo(String value) {
            addCriterion("PK_PROV =", value, "pkProv");
            return (Criteria) this;
        }

        public Criteria andPkProvNotEqualTo(String value) {
            addCriterion("PK_PROV <>", value, "pkProv");
            return (Criteria) this;
        }

        public Criteria andPkProvGreaterThan(String value) {
            addCriterion("PK_PROV >", value, "pkProv");
            return (Criteria) this;
        }

        public Criteria andPkProvGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PROV >=", value, "pkProv");
            return (Criteria) this;
        }

        public Criteria andPkProvLessThan(String value) {
            addCriterion("PK_PROV <", value, "pkProv");
            return (Criteria) this;
        }

        public Criteria andPkProvLessThanOrEqualTo(String value) {
            addCriterion("PK_PROV <=", value, "pkProv");
            return (Criteria) this;
        }

        public Criteria andPkProvLike(String value) {
            addCriterion("PK_PROV like", value, "pkProv");
            return (Criteria) this;
        }

        public Criteria andPkProvNotLike(String value) {
            addCriterion("PK_PROV not like", value, "pkProv");
            return (Criteria) this;
        }

        public Criteria andPkProvIn(List<String> values) {
            addCriterion("PK_PROV in", values, "pkProv");
            return (Criteria) this;
        }

        public Criteria andPkProvNotIn(List<String> values) {
            addCriterion("PK_PROV not in", values, "pkProv");
            return (Criteria) this;
        }

        public Criteria andPkProvBetween(String value1, String value2) {
            addCriterion("PK_PROV between", value1, value2, "pkProv");
            return (Criteria) this;
        }

        public Criteria andPkProvNotBetween(String value1, String value2) {
            addCriterion("PK_PROV not between", value1, value2, "pkProv");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNull() {
            addCriterion("PROV_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProvNameIsNotNull() {
            addCriterion("PROV_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProvNameEqualTo(String value) {
            addCriterion("PROV_NAME =", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotEqualTo(String value) {
            addCriterion("PROV_NAME <>", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThan(String value) {
            addCriterion("PROV_NAME >", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROV_NAME >=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThan(String value) {
            addCriterion("PROV_NAME <", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLessThanOrEqualTo(String value) {
            addCriterion("PROV_NAME <=", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameLike(String value) {
            addCriterion("PROV_NAME like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotLike(String value) {
            addCriterion("PROV_NAME not like", value, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameIn(List<String> values) {
            addCriterion("PROV_NAME in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotIn(List<String> values) {
            addCriterion("PROV_NAME not in", values, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameBetween(String value1, String value2) {
            addCriterion("PROV_NAME between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andProvNameNotBetween(String value1, String value2) {
            addCriterion("PROV_NAME not between", value1, value2, "provName");
            return (Criteria) this;
        }

        public Criteria andProvCodeIsNull() {
            addCriterion("PROV_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProvCodeIsNotNull() {
            addCriterion("PROV_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProvCodeEqualTo(String value) {
            addCriterion("PROV_CODE =", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotEqualTo(String value) {
            addCriterion("PROV_CODE <>", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThan(String value) {
            addCriterion("PROV_CODE >", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROV_CODE >=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThan(String value) {
            addCriterion("PROV_CODE <", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLessThanOrEqualTo(String value) {
            addCriterion("PROV_CODE <=", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeLike(String value) {
            addCriterion("PROV_CODE like", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotLike(String value) {
            addCriterion("PROV_CODE not like", value, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeIn(List<String> values) {
            addCriterion("PROV_CODE in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotIn(List<String> values) {
            addCriterion("PROV_CODE not in", values, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeBetween(String value1, String value2) {
            addCriterion("PROV_CODE between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvCodeNotBetween(String value1, String value2) {
            addCriterion("PROV_CODE not between", value1, value2, "provCode");
            return (Criteria) this;
        }

        public Criteria andProvDescIsNull() {
            addCriterion("PROV_DESC is null");
            return (Criteria) this;
        }

        public Criteria andProvDescIsNotNull() {
            addCriterion("PROV_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andProvDescEqualTo(String value) {
            addCriterion("PROV_DESC =", value, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvDescNotEqualTo(String value) {
            addCriterion("PROV_DESC <>", value, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvDescGreaterThan(String value) {
            addCriterion("PROV_DESC >", value, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvDescGreaterThanOrEqualTo(String value) {
            addCriterion("PROV_DESC >=", value, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvDescLessThan(String value) {
            addCriterion("PROV_DESC <", value, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvDescLessThanOrEqualTo(String value) {
            addCriterion("PROV_DESC <=", value, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvDescLike(String value) {
            addCriterion("PROV_DESC like", value, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvDescNotLike(String value) {
            addCriterion("PROV_DESC not like", value, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvDescIn(List<String> values) {
            addCriterion("PROV_DESC in", values, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvDescNotIn(List<String> values) {
            addCriterion("PROV_DESC not in", values, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvDescBetween(String value1, String value2) {
            addCriterion("PROV_DESC between", value1, value2, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvDescNotBetween(String value1, String value2) {
            addCriterion("PROV_DESC not between", value1, value2, "provDesc");
            return (Criteria) this;
        }

        public Criteria andProvStateIsNull() {
            addCriterion("PROV_STATE is null");
            return (Criteria) this;
        }

        public Criteria andProvStateIsNotNull() {
            addCriterion("PROV_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andProvStateEqualTo(Short value) {
            addCriterion("PROV_STATE =", value, "provState");
            return (Criteria) this;
        }

        public Criteria andProvStateNotEqualTo(Short value) {
            addCriterion("PROV_STATE <>", value, "provState");
            return (Criteria) this;
        }

        public Criteria andProvStateGreaterThan(Short value) {
            addCriterion("PROV_STATE >", value, "provState");
            return (Criteria) this;
        }

        public Criteria andProvStateGreaterThanOrEqualTo(Short value) {
            addCriterion("PROV_STATE >=", value, "provState");
            return (Criteria) this;
        }

        public Criteria andProvStateLessThan(Short value) {
            addCriterion("PROV_STATE <", value, "provState");
            return (Criteria) this;
        }

        public Criteria andProvStateLessThanOrEqualTo(Short value) {
            addCriterion("PROV_STATE <=", value, "provState");
            return (Criteria) this;
        }

        public Criteria andProvStateIn(List<Short> values) {
            addCriterion("PROV_STATE in", values, "provState");
            return (Criteria) this;
        }

        public Criteria andProvStateNotIn(List<Short> values) {
            addCriterion("PROV_STATE not in", values, "provState");
            return (Criteria) this;
        }

        public Criteria andProvStateBetween(Short value1, Short value2) {
            addCriterion("PROV_STATE between", value1, value2, "provState");
            return (Criteria) this;
        }

        public Criteria andProvStateNotBetween(Short value1, Short value2) {
            addCriterion("PROV_STATE not between", value1, value2, "provState");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexIsNull() {
            addCriterion("JUDGE_REGEX is null");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexIsNotNull() {
            addCriterion("JUDGE_REGEX is not null");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexEqualTo(String value) {
            addCriterion("JUDGE_REGEX =", value, "judgeRegex");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexNotEqualTo(String value) {
            addCriterion("JUDGE_REGEX <>", value, "judgeRegex");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexGreaterThan(String value) {
            addCriterion("JUDGE_REGEX >", value, "judgeRegex");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexGreaterThanOrEqualTo(String value) {
            addCriterion("JUDGE_REGEX >=", value, "judgeRegex");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexLessThan(String value) {
            addCriterion("JUDGE_REGEX <", value, "judgeRegex");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexLessThanOrEqualTo(String value) {
            addCriterion("JUDGE_REGEX <=", value, "judgeRegex");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexLike(String value) {
            addCriterion("JUDGE_REGEX like", value, "judgeRegex");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexNotLike(String value) {
            addCriterion("JUDGE_REGEX not like", value, "judgeRegex");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexIn(List<String> values) {
            addCriterion("JUDGE_REGEX in", values, "judgeRegex");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexNotIn(List<String> values) {
            addCriterion("JUDGE_REGEX not in", values, "judgeRegex");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexBetween(String value1, String value2) {
            addCriterion("JUDGE_REGEX between", value1, value2, "judgeRegex");
            return (Criteria) this;
        }

        public Criteria andJudgeRegexNotBetween(String value1, String value2) {
            addCriterion("JUDGE_REGEX not between", value1, value2, "judgeRegex");
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