package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmBsGroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmBsGroupExample() {
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

        public Criteria andMappingRegexIsNull() {
            addCriterion("MAPPING_REGEX is null");
            return (Criteria) this;
        }

        public Criteria andMappingRegexIsNotNull() {
            addCriterion("MAPPING_REGEX is not null");
            return (Criteria) this;
        }

        public Criteria andMappingRegexEqualTo(String value) {
            addCriterion("MAPPING_REGEX =", value, "mappingRegex");
            return (Criteria) this;
        }

        public Criteria andMappingRegexNotEqualTo(String value) {
            addCriterion("MAPPING_REGEX <>", value, "mappingRegex");
            return (Criteria) this;
        }

        public Criteria andMappingRegexGreaterThan(String value) {
            addCriterion("MAPPING_REGEX >", value, "mappingRegex");
            return (Criteria) this;
        }

        public Criteria andMappingRegexGreaterThanOrEqualTo(String value) {
            addCriterion("MAPPING_REGEX >=", value, "mappingRegex");
            return (Criteria) this;
        }

        public Criteria andMappingRegexLessThan(String value) {
            addCriterion("MAPPING_REGEX <", value, "mappingRegex");
            return (Criteria) this;
        }

        public Criteria andMappingRegexLessThanOrEqualTo(String value) {
            addCriterion("MAPPING_REGEX <=", value, "mappingRegex");
            return (Criteria) this;
        }

        public Criteria andMappingRegexLike(String value) {
            addCriterion("MAPPING_REGEX like", value, "mappingRegex");
            return (Criteria) this;
        }

        public Criteria andMappingRegexNotLike(String value) {
            addCriterion("MAPPING_REGEX not like", value, "mappingRegex");
            return (Criteria) this;
        }

        public Criteria andMappingRegexIn(List<String> values) {
            addCriterion("MAPPING_REGEX in", values, "mappingRegex");
            return (Criteria) this;
        }

        public Criteria andMappingRegexNotIn(List<String> values) {
            addCriterion("MAPPING_REGEX not in", values, "mappingRegex");
            return (Criteria) this;
        }

        public Criteria andMappingRegexBetween(String value1, String value2) {
            addCriterion("MAPPING_REGEX between", value1, value2, "mappingRegex");
            return (Criteria) this;
        }

        public Criteria andMappingRegexNotBetween(String value1, String value2) {
            addCriterion("MAPPING_REGEX not between", value1, value2, "mappingRegex");
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