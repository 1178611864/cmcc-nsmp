package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.List;

public class AmPropClassExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmPropClassExample() {
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

        public Criteria andPropClassNameIsNull() {
            addCriterion("PROP_CLASS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andPropClassNameIsNotNull() {
            addCriterion("PROP_CLASS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andPropClassNameEqualTo(String value) {
            addCriterion("PROP_CLASS_NAME =", value, "propClassName");
            return (Criteria) this;
        }

        public Criteria andPropClassNameNotEqualTo(String value) {
            addCriterion("PROP_CLASS_NAME <>", value, "propClassName");
            return (Criteria) this;
        }

        public Criteria andPropClassNameGreaterThan(String value) {
            addCriterion("PROP_CLASS_NAME >", value, "propClassName");
            return (Criteria) this;
        }

        public Criteria andPropClassNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROP_CLASS_NAME >=", value, "propClassName");
            return (Criteria) this;
        }

        public Criteria andPropClassNameLessThan(String value) {
            addCriterion("PROP_CLASS_NAME <", value, "propClassName");
            return (Criteria) this;
        }

        public Criteria andPropClassNameLessThanOrEqualTo(String value) {
            addCriterion("PROP_CLASS_NAME <=", value, "propClassName");
            return (Criteria) this;
        }

        public Criteria andPropClassNameLike(String value) {
            addCriterion("PROP_CLASS_NAME like", value, "propClassName");
            return (Criteria) this;
        }

        public Criteria andPropClassNameNotLike(String value) {
            addCriterion("PROP_CLASS_NAME not like", value, "propClassName");
            return (Criteria) this;
        }

        public Criteria andPropClassNameIn(List<String> values) {
            addCriterion("PROP_CLASS_NAME in", values, "propClassName");
            return (Criteria) this;
        }

        public Criteria andPropClassNameNotIn(List<String> values) {
            addCriterion("PROP_CLASS_NAME not in", values, "propClassName");
            return (Criteria) this;
        }

        public Criteria andPropClassNameBetween(String value1, String value2) {
            addCriterion("PROP_CLASS_NAME between", value1, value2, "propClassName");
            return (Criteria) this;
        }

        public Criteria andPropClassNameNotBetween(String value1, String value2) {
            addCriterion("PROP_CLASS_NAME not between", value1, value2, "propClassName");
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