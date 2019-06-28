package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmBsProvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmBsProvExample() {
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

        public Criteria andBsNameIsNull() {
            addCriterion("BS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andBsNameIsNotNull() {
            addCriterion("BS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andBsNameEqualTo(String value) {
            addCriterion("BS_NAME =", value, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsNameNotEqualTo(String value) {
            addCriterion("BS_NAME <>", value, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsNameGreaterThan(String value) {
            addCriterion("BS_NAME >", value, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsNameGreaterThanOrEqualTo(String value) {
            addCriterion("BS_NAME >=", value, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsNameLessThan(String value) {
            addCriterion("BS_NAME <", value, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsNameLessThanOrEqualTo(String value) {
            addCriterion("BS_NAME <=", value, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsNameLike(String value) {
            addCriterion("BS_NAME like", value, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsNameNotLike(String value) {
            addCriterion("BS_NAME not like", value, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsNameIn(List<String> values) {
            addCriterion("BS_NAME in", values, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsNameNotIn(List<String> values) {
            addCriterion("BS_NAME not in", values, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsNameBetween(String value1, String value2) {
            addCriterion("BS_NAME between", value1, value2, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsNameNotBetween(String value1, String value2) {
            addCriterion("BS_NAME not between", value1, value2, "bsName");
            return (Criteria) this;
        }

        public Criteria andBsCodeIsNull() {
            addCriterion("BS_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBsCodeIsNotNull() {
            addCriterion("BS_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBsCodeEqualTo(String value) {
            addCriterion("BS_CODE =", value, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsCodeNotEqualTo(String value) {
            addCriterion("BS_CODE <>", value, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsCodeGreaterThan(String value) {
            addCriterion("BS_CODE >", value, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BS_CODE >=", value, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsCodeLessThan(String value) {
            addCriterion("BS_CODE <", value, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsCodeLessThanOrEqualTo(String value) {
            addCriterion("BS_CODE <=", value, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsCodeLike(String value) {
            addCriterion("BS_CODE like", value, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsCodeNotLike(String value) {
            addCriterion("BS_CODE not like", value, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsCodeIn(List<String> values) {
            addCriterion("BS_CODE in", values, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsCodeNotIn(List<String> values) {
            addCriterion("BS_CODE not in", values, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsCodeBetween(String value1, String value2) {
            addCriterion("BS_CODE between", value1, value2, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsCodeNotBetween(String value1, String value2) {
            addCriterion("BS_CODE not between", value1, value2, "bsCode");
            return (Criteria) this;
        }

        public Criteria andBsDescIsNull() {
            addCriterion("BS_DESC is null");
            return (Criteria) this;
        }

        public Criteria andBsDescIsNotNull() {
            addCriterion("BS_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andBsDescEqualTo(String value) {
            addCriterion("BS_DESC =", value, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andBsDescNotEqualTo(String value) {
            addCriterion("BS_DESC <>", value, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andBsDescGreaterThan(String value) {
            addCriterion("BS_DESC >", value, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andBsDescGreaterThanOrEqualTo(String value) {
            addCriterion("BS_DESC >=", value, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andBsDescLessThan(String value) {
            addCriterion("BS_DESC <", value, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andBsDescLessThanOrEqualTo(String value) {
            addCriterion("BS_DESC <=", value, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andBsDescLike(String value) {
            addCriterion("BS_DESC like", value, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andBsDescNotLike(String value) {
            addCriterion("BS_DESC not like", value, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andBsDescIn(List<String> values) {
            addCriterion("BS_DESC in", values, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andBsDescNotIn(List<String> values) {
            addCriterion("BS_DESC not in", values, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andBsDescBetween(String value1, String value2) {
            addCriterion("BS_DESC between", value1, value2, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andBsDescNotBetween(String value1, String value2) {
            addCriterion("BS_DESC not between", value1, value2, "bsDesc");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNull() {
            addCriterion("FULL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFullNameIsNotNull() {
            addCriterion("FULL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFullNameEqualTo(String value) {
            addCriterion("FULL_NAME =", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotEqualTo(String value) {
            addCriterion("FULL_NAME <>", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThan(String value) {
            addCriterion("FULL_NAME >", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("FULL_NAME >=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThan(String value) {
            addCriterion("FULL_NAME <", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLessThanOrEqualTo(String value) {
            addCriterion("FULL_NAME <=", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameLike(String value) {
            addCriterion("FULL_NAME like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotLike(String value) {
            addCriterion("FULL_NAME not like", value, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameIn(List<String> values) {
            addCriterion("FULL_NAME in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotIn(List<String> values) {
            addCriterion("FULL_NAME not in", values, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameBetween(String value1, String value2) {
            addCriterion("FULL_NAME between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andFullNameNotBetween(String value1, String value2) {
            addCriterion("FULL_NAME not between", value1, value2, "fullName");
            return (Criteria) this;
        }

        public Criteria andBsSrcIsNull() {
            addCriterion("BS_SRC is null");
            return (Criteria) this;
        }

        public Criteria andBsSrcIsNotNull() {
            addCriterion("BS_SRC is not null");
            return (Criteria) this;
        }

        public Criteria andBsSrcEqualTo(Short value) {
            addCriterion("BS_SRC =", value, "bsSrc");
            return (Criteria) this;
        }

        public Criteria andBsSrcNotEqualTo(Short value) {
            addCriterion("BS_SRC <>", value, "bsSrc");
            return (Criteria) this;
        }

        public Criteria andBsSrcGreaterThan(Short value) {
            addCriterion("BS_SRC >", value, "bsSrc");
            return (Criteria) this;
        }

        public Criteria andBsSrcGreaterThanOrEqualTo(Short value) {
            addCriterion("BS_SRC >=", value, "bsSrc");
            return (Criteria) this;
        }

        public Criteria andBsSrcLessThan(Short value) {
            addCriterion("BS_SRC <", value, "bsSrc");
            return (Criteria) this;
        }

        public Criteria andBsSrcLessThanOrEqualTo(Short value) {
            addCriterion("BS_SRC <=", value, "bsSrc");
            return (Criteria) this;
        }

        public Criteria andBsSrcIn(List<Short> values) {
            addCriterion("BS_SRC in", values, "bsSrc");
            return (Criteria) this;
        }

        public Criteria andBsSrcNotIn(List<Short> values) {
            addCriterion("BS_SRC not in", values, "bsSrc");
            return (Criteria) this;
        }

        public Criteria andBsSrcBetween(Short value1, Short value2) {
            addCriterion("BS_SRC between", value1, value2, "bsSrc");
            return (Criteria) this;
        }

        public Criteria andBsSrcNotBetween(Short value1, Short value2) {
            addCriterion("BS_SRC not between", value1, value2, "bsSrc");
            return (Criteria) this;
        }

        public Criteria andForeignIdIsNull() {
            addCriterion("FOREIGN_ID is null");
            return (Criteria) this;
        }

        public Criteria andForeignIdIsNotNull() {
            addCriterion("FOREIGN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andForeignIdEqualTo(String value) {
            addCriterion("FOREIGN_ID =", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotEqualTo(String value) {
            addCriterion("FOREIGN_ID <>", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdGreaterThan(String value) {
            addCriterion("FOREIGN_ID >", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdGreaterThanOrEqualTo(String value) {
            addCriterion("FOREIGN_ID >=", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdLessThan(String value) {
            addCriterion("FOREIGN_ID <", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdLessThanOrEqualTo(String value) {
            addCriterion("FOREIGN_ID <=", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdLike(String value) {
            addCriterion("FOREIGN_ID like", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotLike(String value) {
            addCriterion("FOREIGN_ID not like", value, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdIn(List<String> values) {
            addCriterion("FOREIGN_ID in", values, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotIn(List<String> values) {
            addCriterion("FOREIGN_ID not in", values, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdBetween(String value1, String value2) {
            addCriterion("FOREIGN_ID between", value1, value2, "foreignId");
            return (Criteria) this;
        }

        public Criteria andForeignIdNotBetween(String value1, String value2) {
            addCriterion("FOREIGN_ID not between", value1, value2, "foreignId");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqIsNull() {
            addCriterion("DISPLAY_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqIsNotNull() {
            addCriterion("DISPLAY_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqEqualTo(Short value) {
            addCriterion("DISPLAY_SEQ =", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqNotEqualTo(Short value) {
            addCriterion("DISPLAY_SEQ <>", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqGreaterThan(Short value) {
            addCriterion("DISPLAY_SEQ >", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqGreaterThanOrEqualTo(Short value) {
            addCriterion("DISPLAY_SEQ >=", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqLessThan(Short value) {
            addCriterion("DISPLAY_SEQ <", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqLessThanOrEqualTo(Short value) {
            addCriterion("DISPLAY_SEQ <=", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqIn(List<Short> values) {
            addCriterion("DISPLAY_SEQ in", values, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqNotIn(List<Short> values) {
            addCriterion("DISPLAY_SEQ not in", values, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqBetween(Short value1, Short value2) {
            addCriterion("DISPLAY_SEQ between", value1, value2, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqNotBetween(Short value1, Short value2) {
            addCriterion("DISPLAY_SEQ not between", value1, value2, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andPkBsParentIsNull() {
            addCriterion("PK_BS_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andPkBsParentIsNotNull() {
            addCriterion("PK_BS_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andPkBsParentEqualTo(String value) {
            addCriterion("PK_BS_PARENT =", value, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andPkBsParentNotEqualTo(String value) {
            addCriterion("PK_BS_PARENT <>", value, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andPkBsParentGreaterThan(String value) {
            addCriterion("PK_BS_PARENT >", value, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andPkBsParentGreaterThanOrEqualTo(String value) {
            addCriterion("PK_BS_PARENT >=", value, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andPkBsParentLessThan(String value) {
            addCriterion("PK_BS_PARENT <", value, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andPkBsParentLessThanOrEqualTo(String value) {
            addCriterion("PK_BS_PARENT <=", value, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andPkBsParentLike(String value) {
            addCriterion("PK_BS_PARENT like", value, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andPkBsParentNotLike(String value) {
            addCriterion("PK_BS_PARENT not like", value, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andPkBsParentIn(List<String> values) {
            addCriterion("PK_BS_PARENT in", values, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andPkBsParentNotIn(List<String> values) {
            addCriterion("PK_BS_PARENT not in", values, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andPkBsParentBetween(String value1, String value2) {
            addCriterion("PK_BS_PARENT between", value1, value2, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andPkBsParentNotBetween(String value1, String value2) {
            addCriterion("PK_BS_PARENT not between", value1, value2, "pkBsParent");
            return (Criteria) this;
        }

        public Criteria andSeriescodeIsNull() {
            addCriterion("SERIESCODE is null");
            return (Criteria) this;
        }

        public Criteria andSeriescodeIsNotNull() {
            addCriterion("SERIESCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSeriescodeEqualTo(String value) {
            addCriterion("SERIESCODE =", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotEqualTo(String value) {
            addCriterion("SERIESCODE <>", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeGreaterThan(String value) {
            addCriterion("SERIESCODE >", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeGreaterThanOrEqualTo(String value) {
            addCriterion("SERIESCODE >=", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeLessThan(String value) {
            addCriterion("SERIESCODE <", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeLessThanOrEqualTo(String value) {
            addCriterion("SERIESCODE <=", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeLike(String value) {
            addCriterion("SERIESCODE like", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotLike(String value) {
            addCriterion("SERIESCODE not like", value, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeIn(List<String> values) {
            addCriterion("SERIESCODE in", values, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotIn(List<String> values) {
            addCriterion("SERIESCODE not in", values, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeBetween(String value1, String value2) {
            addCriterion("SERIESCODE between", value1, value2, "seriescode");
            return (Criteria) this;
        }

        public Criteria andSeriescodeNotBetween(String value1, String value2) {
            addCriterion("SERIESCODE not between", value1, value2, "seriescode");
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

        public Criteria andBsTypeEqualTo(String value) {
            addCriterion("BS_TYPE =", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeNotEqualTo(String value) {
            addCriterion("BS_TYPE <>", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeGreaterThan(String value) {
            addCriterion("BS_TYPE >", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeGreaterThanOrEqualTo(String value) {
            addCriterion("BS_TYPE >=", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeLessThan(String value) {
            addCriterion("BS_TYPE <", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeLessThanOrEqualTo(String value) {
            addCriterion("BS_TYPE <=", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeLike(String value) {
            addCriterion("BS_TYPE like", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeNotLike(String value) {
            addCriterion("BS_TYPE not like", value, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeIn(List<String> values) {
            addCriterion("BS_TYPE in", values, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeNotIn(List<String> values) {
            addCriterion("BS_TYPE not in", values, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeBetween(String value1, String value2) {
            addCriterion("BS_TYPE between", value1, value2, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsTypeNotBetween(String value1, String value2) {
            addCriterion("BS_TYPE not between", value1, value2, "bsType");
            return (Criteria) this;
        }

        public Criteria andBsVerIsNull() {
            addCriterion("BS_VER is null");
            return (Criteria) this;
        }

        public Criteria andBsVerIsNotNull() {
            addCriterion("BS_VER is not null");
            return (Criteria) this;
        }

        public Criteria andBsVerEqualTo(String value) {
            addCriterion("BS_VER =", value, "bsVer");
            return (Criteria) this;
        }

        public Criteria andBsVerNotEqualTo(String value) {
            addCriterion("BS_VER <>", value, "bsVer");
            return (Criteria) this;
        }

        public Criteria andBsVerGreaterThan(String value) {
            addCriterion("BS_VER >", value, "bsVer");
            return (Criteria) this;
        }

        public Criteria andBsVerGreaterThanOrEqualTo(String value) {
            addCriterion("BS_VER >=", value, "bsVer");
            return (Criteria) this;
        }

        public Criteria andBsVerLessThan(String value) {
            addCriterion("BS_VER <", value, "bsVer");
            return (Criteria) this;
        }

        public Criteria andBsVerLessThanOrEqualTo(String value) {
            addCriterion("BS_VER <=", value, "bsVer");
            return (Criteria) this;
        }

        public Criteria andBsVerLike(String value) {
            addCriterion("BS_VER like", value, "bsVer");
            return (Criteria) this;
        }

        public Criteria andBsVerNotLike(String value) {
            addCriterion("BS_VER not like", value, "bsVer");
            return (Criteria) this;
        }

        public Criteria andBsVerIn(List<String> values) {
            addCriterion("BS_VER in", values, "bsVer");
            return (Criteria) this;
        }

        public Criteria andBsVerNotIn(List<String> values) {
            addCriterion("BS_VER not in", values, "bsVer");
            return (Criteria) this;
        }

        public Criteria andBsVerBetween(String value1, String value2) {
            addCriterion("BS_VER between", value1, value2, "bsVer");
            return (Criteria) this;
        }

        public Criteria andBsVerNotBetween(String value1, String value2) {
            addCriterion("BS_VER not between", value1, value2, "bsVer");
            return (Criteria) this;
        }

        public Criteria andSecGradeIsNull() {
            addCriterion("SEC_GRADE is null");
            return (Criteria) this;
        }

        public Criteria andSecGradeIsNotNull() {
            addCriterion("SEC_GRADE is not null");
            return (Criteria) this;
        }

        public Criteria andSecGradeEqualTo(String value) {
            addCriterion("SEC_GRADE =", value, "secGrade");
            return (Criteria) this;
        }

        public Criteria andSecGradeNotEqualTo(String value) {
            addCriterion("SEC_GRADE <>", value, "secGrade");
            return (Criteria) this;
        }

        public Criteria andSecGradeGreaterThan(String value) {
            addCriterion("SEC_GRADE >", value, "secGrade");
            return (Criteria) this;
        }

        public Criteria andSecGradeGreaterThanOrEqualTo(String value) {
            addCriterion("SEC_GRADE >=", value, "secGrade");
            return (Criteria) this;
        }

        public Criteria andSecGradeLessThan(String value) {
            addCriterion("SEC_GRADE <", value, "secGrade");
            return (Criteria) this;
        }

        public Criteria andSecGradeLessThanOrEqualTo(String value) {
            addCriterion("SEC_GRADE <=", value, "secGrade");
            return (Criteria) this;
        }

        public Criteria andSecGradeLike(String value) {
            addCriterion("SEC_GRADE like", value, "secGrade");
            return (Criteria) this;
        }

        public Criteria andSecGradeNotLike(String value) {
            addCriterion("SEC_GRADE not like", value, "secGrade");
            return (Criteria) this;
        }

        public Criteria andSecGradeIn(List<String> values) {
            addCriterion("SEC_GRADE in", values, "secGrade");
            return (Criteria) this;
        }

        public Criteria andSecGradeNotIn(List<String> values) {
            addCriterion("SEC_GRADE not in", values, "secGrade");
            return (Criteria) this;
        }

        public Criteria andSecGradeBetween(String value1, String value2) {
            addCriterion("SEC_GRADE between", value1, value2, "secGrade");
            return (Criteria) this;
        }

        public Criteria andSecGradeNotBetween(String value1, String value2) {
            addCriterion("SEC_GRADE not between", value1, value2, "secGrade");
            return (Criteria) this;
        }

        public Criteria andInfluenceIsNull() {
            addCriterion("INFLUENCE is null");
            return (Criteria) this;
        }

        public Criteria andInfluenceIsNotNull() {
            addCriterion("INFLUENCE is not null");
            return (Criteria) this;
        }

        public Criteria andInfluenceEqualTo(String value) {
            addCriterion("INFLUENCE =", value, "influence");
            return (Criteria) this;
        }

        public Criteria andInfluenceNotEqualTo(String value) {
            addCriterion("INFLUENCE <>", value, "influence");
            return (Criteria) this;
        }

        public Criteria andInfluenceGreaterThan(String value) {
            addCriterion("INFLUENCE >", value, "influence");
            return (Criteria) this;
        }

        public Criteria andInfluenceGreaterThanOrEqualTo(String value) {
            addCriterion("INFLUENCE >=", value, "influence");
            return (Criteria) this;
        }

        public Criteria andInfluenceLessThan(String value) {
            addCriterion("INFLUENCE <", value, "influence");
            return (Criteria) this;
        }

        public Criteria andInfluenceLessThanOrEqualTo(String value) {
            addCriterion("INFLUENCE <=", value, "influence");
            return (Criteria) this;
        }

        public Criteria andInfluenceLike(String value) {
            addCriterion("INFLUENCE like", value, "influence");
            return (Criteria) this;
        }

        public Criteria andInfluenceNotLike(String value) {
            addCriterion("INFLUENCE not like", value, "influence");
            return (Criteria) this;
        }

        public Criteria andInfluenceIn(List<String> values) {
            addCriterion("INFLUENCE in", values, "influence");
            return (Criteria) this;
        }

        public Criteria andInfluenceNotIn(List<String> values) {
            addCriterion("INFLUENCE not in", values, "influence");
            return (Criteria) this;
        }

        public Criteria andInfluenceBetween(String value1, String value2) {
            addCriterion("INFLUENCE between", value1, value2, "influence");
            return (Criteria) this;
        }

        public Criteria andInfluenceNotBetween(String value1, String value2) {
            addCriterion("INFLUENCE not between", value1, value2, "influence");
            return (Criteria) this;
        }

        public Criteria andSrvRangeIsNull() {
            addCriterion("SRV_RANGE is null");
            return (Criteria) this;
        }

        public Criteria andSrvRangeIsNotNull() {
            addCriterion("SRV_RANGE is not null");
            return (Criteria) this;
        }

        public Criteria andSrvRangeEqualTo(String value) {
            addCriterion("SRV_RANGE =", value, "srvRange");
            return (Criteria) this;
        }

        public Criteria andSrvRangeNotEqualTo(String value) {
            addCriterion("SRV_RANGE <>", value, "srvRange");
            return (Criteria) this;
        }

        public Criteria andSrvRangeGreaterThan(String value) {
            addCriterion("SRV_RANGE >", value, "srvRange");
            return (Criteria) this;
        }

        public Criteria andSrvRangeGreaterThanOrEqualTo(String value) {
            addCriterion("SRV_RANGE >=", value, "srvRange");
            return (Criteria) this;
        }

        public Criteria andSrvRangeLessThan(String value) {
            addCriterion("SRV_RANGE <", value, "srvRange");
            return (Criteria) this;
        }

        public Criteria andSrvRangeLessThanOrEqualTo(String value) {
            addCriterion("SRV_RANGE <=", value, "srvRange");
            return (Criteria) this;
        }

        public Criteria andSrvRangeLike(String value) {
            addCriterion("SRV_RANGE like", value, "srvRange");
            return (Criteria) this;
        }

        public Criteria andSrvRangeNotLike(String value) {
            addCriterion("SRV_RANGE not like", value, "srvRange");
            return (Criteria) this;
        }

        public Criteria andSrvRangeIn(List<String> values) {
            addCriterion("SRV_RANGE in", values, "srvRange");
            return (Criteria) this;
        }

        public Criteria andSrvRangeNotIn(List<String> values) {
            addCriterion("SRV_RANGE not in", values, "srvRange");
            return (Criteria) this;
        }

        public Criteria andSrvRangeBetween(String value1, String value2) {
            addCriterion("SRV_RANGE between", value1, value2, "srvRange");
            return (Criteria) this;
        }

        public Criteria andSrvRangeNotBetween(String value1, String value2) {
            addCriterion("SRV_RANGE not between", value1, value2, "srvRange");
            return (Criteria) this;
        }

        public Criteria andImportanceIsNull() {
            addCriterion("IMPORTANCE is null");
            return (Criteria) this;
        }

        public Criteria andImportanceIsNotNull() {
            addCriterion("IMPORTANCE is not null");
            return (Criteria) this;
        }

        public Criteria andImportanceEqualTo(String value) {
            addCriterion("IMPORTANCE =", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceNotEqualTo(String value) {
            addCriterion("IMPORTANCE <>", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceGreaterThan(String value) {
            addCriterion("IMPORTANCE >", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceGreaterThanOrEqualTo(String value) {
            addCriterion("IMPORTANCE >=", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceLessThan(String value) {
            addCriterion("IMPORTANCE <", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceLessThanOrEqualTo(String value) {
            addCriterion("IMPORTANCE <=", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceLike(String value) {
            addCriterion("IMPORTANCE like", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceNotLike(String value) {
            addCriterion("IMPORTANCE not like", value, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceIn(List<String> values) {
            addCriterion("IMPORTANCE in", values, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceNotIn(List<String> values) {
            addCriterion("IMPORTANCE not in", values, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceBetween(String value1, String value2) {
            addCriterion("IMPORTANCE between", value1, value2, "importance");
            return (Criteria) this;
        }

        public Criteria andImportanceNotBetween(String value1, String value2) {
            addCriterion("IMPORTANCE not between", value1, value2, "importance");
            return (Criteria) this;
        }

        public Criteria andManageUrlIsNull() {
            addCriterion("MANAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andManageUrlIsNotNull() {
            addCriterion("MANAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andManageUrlEqualTo(String value) {
            addCriterion("MANAGE_URL =", value, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andManageUrlNotEqualTo(String value) {
            addCriterion("MANAGE_URL <>", value, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andManageUrlGreaterThan(String value) {
            addCriterion("MANAGE_URL >", value, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andManageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGE_URL >=", value, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andManageUrlLessThan(String value) {
            addCriterion("MANAGE_URL <", value, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andManageUrlLessThanOrEqualTo(String value) {
            addCriterion("MANAGE_URL <=", value, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andManageUrlLike(String value) {
            addCriterion("MANAGE_URL like", value, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andManageUrlNotLike(String value) {
            addCriterion("MANAGE_URL not like", value, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andManageUrlIn(List<String> values) {
            addCriterion("MANAGE_URL in", values, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andManageUrlNotIn(List<String> values) {
            addCriterion("MANAGE_URL not in", values, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andManageUrlBetween(String value1, String value2) {
            addCriterion("MANAGE_URL between", value1, value2, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andManageUrlNotBetween(String value1, String value2) {
            addCriterion("MANAGE_URL not between", value1, value2, "manageUrl");
            return (Criteria) this;
        }

        public Criteria andVendorIsNull() {
            addCriterion("VENDOR is null");
            return (Criteria) this;
        }

        public Criteria andVendorIsNotNull() {
            addCriterion("VENDOR is not null");
            return (Criteria) this;
        }

        public Criteria andVendorEqualTo(String value) {
            addCriterion("VENDOR =", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotEqualTo(String value) {
            addCriterion("VENDOR <>", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorGreaterThan(String value) {
            addCriterion("VENDOR >", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorGreaterThanOrEqualTo(String value) {
            addCriterion("VENDOR >=", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLessThan(String value) {
            addCriterion("VENDOR <", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLessThanOrEqualTo(String value) {
            addCriterion("VENDOR <=", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorLike(String value) {
            addCriterion("VENDOR like", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotLike(String value) {
            addCriterion("VENDOR not like", value, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorIn(List<String> values) {
            addCriterion("VENDOR in", values, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotIn(List<String> values) {
            addCriterion("VENDOR not in", values, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorBetween(String value1, String value2) {
            addCriterion("VENDOR between", value1, value2, "vendor");
            return (Criteria) this;
        }

        public Criteria andVendorNotBetween(String value1, String value2) {
            addCriterion("VENDOR not between", value1, value2, "vendor");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("ADMIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("ADMIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("ADMIN_NAME =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("ADMIN_NAME <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("ADMIN_NAME >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("ADMIN_NAME >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("ADMIN_NAME <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("ADMIN_NAME <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("ADMIN_NAME like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("ADMIN_NAME not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("ADMIN_NAME in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("ADMIN_NAME not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("ADMIN_NAME between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("ADMIN_NAME not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andContactInfoIsNull() {
            addCriterion("CONTACT_INFO is null");
            return (Criteria) this;
        }

        public Criteria andContactInfoIsNotNull() {
            addCriterion("CONTACT_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andContactInfoEqualTo(String value) {
            addCriterion("CONTACT_INFO =", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotEqualTo(String value) {
            addCriterion("CONTACT_INFO <>", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoGreaterThan(String value) {
            addCriterion("CONTACT_INFO >", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_INFO >=", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLessThan(String value) {
            addCriterion("CONTACT_INFO <", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_INFO <=", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoLike(String value) {
            addCriterion("CONTACT_INFO like", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotLike(String value) {
            addCriterion("CONTACT_INFO not like", value, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoIn(List<String> values) {
            addCriterion("CONTACT_INFO in", values, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotIn(List<String> values) {
            addCriterion("CONTACT_INFO not in", values, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoBetween(String value1, String value2) {
            addCriterion("CONTACT_INFO between", value1, value2, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andContactInfoNotBetween(String value1, String value2) {
            addCriterion("CONTACT_INFO not between", value1, value2, "contactInfo");
            return (Criteria) this;
        }

        public Criteria andLocationIsNull() {
            addCriterion("LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andLocationIsNotNull() {
            addCriterion("LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andLocationEqualTo(String value) {
            addCriterion("LOCATION =", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotEqualTo(String value) {
            addCriterion("LOCATION <>", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThan(String value) {
            addCriterion("LOCATION >", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationGreaterThanOrEqualTo(String value) {
            addCriterion("LOCATION >=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThan(String value) {
            addCriterion("LOCATION <", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLessThanOrEqualTo(String value) {
            addCriterion("LOCATION <=", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationLike(String value) {
            addCriterion("LOCATION like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotLike(String value) {
            addCriterion("LOCATION not like", value, "location");
            return (Criteria) this;
        }

        public Criteria andLocationIn(List<String> values) {
            addCriterion("LOCATION in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotIn(List<String> values) {
            addCriterion("LOCATION not in", values, "location");
            return (Criteria) this;
        }

        public Criteria andLocationBetween(String value1, String value2) {
            addCriterion("LOCATION between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andLocationNotBetween(String value1, String value2) {
            addCriterion("LOCATION not between", value1, value2, "location");
            return (Criteria) this;
        }

        public Criteria andBsBackupIsNull() {
            addCriterion("BS_BACKUP is null");
            return (Criteria) this;
        }

        public Criteria andBsBackupIsNotNull() {
            addCriterion("BS_BACKUP is not null");
            return (Criteria) this;
        }

        public Criteria andBsBackupEqualTo(String value) {
            addCriterion("BS_BACKUP =", value, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andBsBackupNotEqualTo(String value) {
            addCriterion("BS_BACKUP <>", value, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andBsBackupGreaterThan(String value) {
            addCriterion("BS_BACKUP >", value, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andBsBackupGreaterThanOrEqualTo(String value) {
            addCriterion("BS_BACKUP >=", value, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andBsBackupLessThan(String value) {
            addCriterion("BS_BACKUP <", value, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andBsBackupLessThanOrEqualTo(String value) {
            addCriterion("BS_BACKUP <=", value, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andBsBackupLike(String value) {
            addCriterion("BS_BACKUP like", value, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andBsBackupNotLike(String value) {
            addCriterion("BS_BACKUP not like", value, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andBsBackupIn(List<String> values) {
            addCriterion("BS_BACKUP in", values, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andBsBackupNotIn(List<String> values) {
            addCriterion("BS_BACKUP not in", values, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andBsBackupBetween(String value1, String value2) {
            addCriterion("BS_BACKUP between", value1, value2, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andBsBackupNotBetween(String value1, String value2) {
            addCriterion("BS_BACKUP not between", value1, value2, "bsBackup");
            return (Criteria) this;
        }

        public Criteria andSecZoneIsNull() {
            addCriterion("SEC_ZONE is null");
            return (Criteria) this;
        }

        public Criteria andSecZoneIsNotNull() {
            addCriterion("SEC_ZONE is not null");
            return (Criteria) this;
        }

        public Criteria andSecZoneEqualTo(String value) {
            addCriterion("SEC_ZONE =", value, "secZone");
            return (Criteria) this;
        }

        public Criteria andSecZoneNotEqualTo(String value) {
            addCriterion("SEC_ZONE <>", value, "secZone");
            return (Criteria) this;
        }

        public Criteria andSecZoneGreaterThan(String value) {
            addCriterion("SEC_ZONE >", value, "secZone");
            return (Criteria) this;
        }

        public Criteria andSecZoneGreaterThanOrEqualTo(String value) {
            addCriterion("SEC_ZONE >=", value, "secZone");
            return (Criteria) this;
        }

        public Criteria andSecZoneLessThan(String value) {
            addCriterion("SEC_ZONE <", value, "secZone");
            return (Criteria) this;
        }

        public Criteria andSecZoneLessThanOrEqualTo(String value) {
            addCriterion("SEC_ZONE <=", value, "secZone");
            return (Criteria) this;
        }

        public Criteria andSecZoneLike(String value) {
            addCriterion("SEC_ZONE like", value, "secZone");
            return (Criteria) this;
        }

        public Criteria andSecZoneNotLike(String value) {
            addCriterion("SEC_ZONE not like", value, "secZone");
            return (Criteria) this;
        }

        public Criteria andSecZoneIn(List<String> values) {
            addCriterion("SEC_ZONE in", values, "secZone");
            return (Criteria) this;
        }

        public Criteria andSecZoneNotIn(List<String> values) {
            addCriterion("SEC_ZONE not in", values, "secZone");
            return (Criteria) this;
        }

        public Criteria andSecZoneBetween(String value1, String value2) {
            addCriterion("SEC_ZONE between", value1, value2, "secZone");
            return (Criteria) this;
        }

        public Criteria andSecZoneNotBetween(String value1, String value2) {
            addCriterion("SEC_ZONE not between", value1, value2, "secZone");
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