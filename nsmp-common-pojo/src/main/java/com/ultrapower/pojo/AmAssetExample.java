package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AmAssetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AmAssetExample() {
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

        public Criteria andPkAssetIsNull() {
            addCriterion("PK_ASSET is null");
            return (Criteria) this;
        }

        public Criteria andPkAssetIsNotNull() {
            addCriterion("PK_ASSET is not null");
            return (Criteria) this;
        }

        public Criteria andPkAssetEqualTo(String value) {
            addCriterion("PK_ASSET =", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetNotEqualTo(String value) {
            addCriterion("PK_ASSET <>", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetGreaterThan(String value) {
            addCriterion("PK_ASSET >", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ASSET >=", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetLessThan(String value) {
            addCriterion("PK_ASSET <", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetLessThanOrEqualTo(String value) {
            addCriterion("PK_ASSET <=", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetLike(String value) {
            addCriterion("PK_ASSET like", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetNotLike(String value) {
            addCriterion("PK_ASSET not like", value, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetIn(List<String> values) {
            addCriterion("PK_ASSET in", values, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetNotIn(List<String> values) {
            addCriterion("PK_ASSET not in", values, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetBetween(String value1, String value2) {
            addCriterion("PK_ASSET between", value1, value2, "pkAsset");
            return (Criteria) this;
        }

        public Criteria andPkAssetNotBetween(String value1, String value2) {
            addCriterion("PK_ASSET not between", value1, value2, "pkAsset");
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

        public Criteria andVersionIsNull() {
            addCriterion("VERSION is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("VERSION is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("VERSION =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("VERSION <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("VERSION >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("VERSION >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("VERSION <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("VERSION <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("VERSION like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("VERSION not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("VERSION in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("VERSION not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("VERSION between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("VERSION not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNull() {
            addCriterion("ASSET_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAssetNameIsNotNull() {
            addCriterion("ASSET_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAssetNameEqualTo(String value) {
            addCriterion("ASSET_NAME =", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotEqualTo(String value) {
            addCriterion("ASSET_NAME <>", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThan(String value) {
            addCriterion("ASSET_NAME >", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameGreaterThanOrEqualTo(String value) {
            addCriterion("ASSET_NAME >=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThan(String value) {
            addCriterion("ASSET_NAME <", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLessThanOrEqualTo(String value) {
            addCriterion("ASSET_NAME <=", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameLike(String value) {
            addCriterion("ASSET_NAME like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotLike(String value) {
            addCriterion("ASSET_NAME not like", value, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameIn(List<String> values) {
            addCriterion("ASSET_NAME in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotIn(List<String> values) {
            addCriterion("ASSET_NAME not in", values, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameBetween(String value1, String value2) {
            addCriterion("ASSET_NAME between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetNameNotBetween(String value1, String value2) {
            addCriterion("ASSET_NAME not between", value1, value2, "assetName");
            return (Criteria) this;
        }

        public Criteria andAssetCodeIsNull() {
            addCriterion("ASSET_CODE is null");
            return (Criteria) this;
        }

        public Criteria andAssetCodeIsNotNull() {
            addCriterion("ASSET_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andAssetCodeEqualTo(String value) {
            addCriterion("ASSET_CODE =", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotEqualTo(String value) {
            addCriterion("ASSET_CODE <>", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeGreaterThan(String value) {
            addCriterion("ASSET_CODE >", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ASSET_CODE >=", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeLessThan(String value) {
            addCriterion("ASSET_CODE <", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeLessThanOrEqualTo(String value) {
            addCriterion("ASSET_CODE <=", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeLike(String value) {
            addCriterion("ASSET_CODE like", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotLike(String value) {
            addCriterion("ASSET_CODE not like", value, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeIn(List<String> values) {
            addCriterion("ASSET_CODE in", values, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotIn(List<String> values) {
            addCriterion("ASSET_CODE not in", values, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeBetween(String value1, String value2) {
            addCriterion("ASSET_CODE between", value1, value2, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetCodeNotBetween(String value1, String value2) {
            addCriterion("ASSET_CODE not between", value1, value2, "assetCode");
            return (Criteria) this;
        }

        public Criteria andAssetIpIsNull() {
            addCriterion("ASSET_IP is null");
            return (Criteria) this;
        }

        public Criteria andAssetIpIsNotNull() {
            addCriterion("ASSET_IP is not null");
            return (Criteria) this;
        }

        public Criteria andAssetIpEqualTo(String value) {
            addCriterion("ASSET_IP =", value, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetIpNotEqualTo(String value) {
            addCriterion("ASSET_IP <>", value, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetIpGreaterThan(String value) {
            addCriterion("ASSET_IP >", value, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetIpGreaterThanOrEqualTo(String value) {
            addCriterion("ASSET_IP >=", value, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetIpLessThan(String value) {
            addCriterion("ASSET_IP <", value, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetIpLessThanOrEqualTo(String value) {
            addCriterion("ASSET_IP <=", value, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetIpLike(String value) {
            addCriterion("ASSET_IP like", value, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetIpNotLike(String value) {
            addCriterion("ASSET_IP not like", value, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetIpIn(List<String> values) {
            addCriterion("ASSET_IP in", values, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetIpNotIn(List<String> values) {
            addCriterion("ASSET_IP not in", values, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetIpBetween(String value1, String value2) {
            addCriterion("ASSET_IP between", value1, value2, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetIpNotBetween(String value1, String value2) {
            addCriterion("ASSET_IP not between", value1, value2, "assetIp");
            return (Criteria) this;
        }

        public Criteria andAssetDescIsNull() {
            addCriterion("ASSET_DESC is null");
            return (Criteria) this;
        }

        public Criteria andAssetDescIsNotNull() {
            addCriterion("ASSET_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andAssetDescEqualTo(String value) {
            addCriterion("ASSET_DESC =", value, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetDescNotEqualTo(String value) {
            addCriterion("ASSET_DESC <>", value, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetDescGreaterThan(String value) {
            addCriterion("ASSET_DESC >", value, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetDescGreaterThanOrEqualTo(String value) {
            addCriterion("ASSET_DESC >=", value, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetDescLessThan(String value) {
            addCriterion("ASSET_DESC <", value, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetDescLessThanOrEqualTo(String value) {
            addCriterion("ASSET_DESC <=", value, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetDescLike(String value) {
            addCriterion("ASSET_DESC like", value, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetDescNotLike(String value) {
            addCriterion("ASSET_DESC not like", value, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetDescIn(List<String> values) {
            addCriterion("ASSET_DESC in", values, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetDescNotIn(List<String> values) {
            addCriterion("ASSET_DESC not in", values, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetDescBetween(String value1, String value2) {
            addCriterion("ASSET_DESC between", value1, value2, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetDescNotBetween(String value1, String value2) {
            addCriterion("ASSET_DESC not between", value1, value2, "assetDesc");
            return (Criteria) this;
        }

        public Criteria andAssetStateIsNull() {
            addCriterion("ASSET_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAssetStateIsNotNull() {
            addCriterion("ASSET_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAssetStateEqualTo(Short value) {
            addCriterion("ASSET_STATE =", value, "assetState");
            return (Criteria) this;
        }

        public Criteria andAssetStateNotEqualTo(Short value) {
            addCriterion("ASSET_STATE <>", value, "assetState");
            return (Criteria) this;
        }

        public Criteria andAssetStateGreaterThan(Short value) {
            addCriterion("ASSET_STATE >", value, "assetState");
            return (Criteria) this;
        }

        public Criteria andAssetStateGreaterThanOrEqualTo(Short value) {
            addCriterion("ASSET_STATE >=", value, "assetState");
            return (Criteria) this;
        }

        public Criteria andAssetStateLessThan(Short value) {
            addCriterion("ASSET_STATE <", value, "assetState");
            return (Criteria) this;
        }

        public Criteria andAssetStateLessThanOrEqualTo(Short value) {
            addCriterion("ASSET_STATE <=", value, "assetState");
            return (Criteria) this;
        }

        public Criteria andAssetStateIn(List<Short> values) {
            addCriterion("ASSET_STATE in", values, "assetState");
            return (Criteria) this;
        }

        public Criteria andAssetStateNotIn(List<Short> values) {
            addCriterion("ASSET_STATE not in", values, "assetState");
            return (Criteria) this;
        }

        public Criteria andAssetStateBetween(Short value1, Short value2) {
            addCriterion("ASSET_STATE between", value1, value2, "assetState");
            return (Criteria) this;
        }

        public Criteria andAssetStateNotBetween(Short value1, Short value2) {
            addCriterion("ASSET_STATE not between", value1, value2, "assetState");
            return (Criteria) this;
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

        public Criteria andPkProvBsIsNull() {
            addCriterion("PK_PROV_BS is null");
            return (Criteria) this;
        }

        public Criteria andPkProvBsIsNotNull() {
            addCriterion("PK_PROV_BS is not null");
            return (Criteria) this;
        }

        public Criteria andPkProvBsEqualTo(String value) {
            addCriterion("PK_PROV_BS =", value, "pkProvBs");
            return (Criteria) this;
        }

        public Criteria andPkProvBsNotEqualTo(String value) {
            addCriterion("PK_PROV_BS <>", value, "pkProvBs");
            return (Criteria) this;
        }

        public Criteria andPkProvBsGreaterThan(String value) {
            addCriterion("PK_PROV_BS >", value, "pkProvBs");
            return (Criteria) this;
        }

        public Criteria andPkProvBsGreaterThanOrEqualTo(String value) {
            addCriterion("PK_PROV_BS >=", value, "pkProvBs");
            return (Criteria) this;
        }

        public Criteria andPkProvBsLessThan(String value) {
            addCriterion("PK_PROV_BS <", value, "pkProvBs");
            return (Criteria) this;
        }

        public Criteria andPkProvBsLessThanOrEqualTo(String value) {
            addCriterion("PK_PROV_BS <=", value, "pkProvBs");
            return (Criteria) this;
        }

        public Criteria andPkProvBsLike(String value) {
            addCriterion("PK_PROV_BS like", value, "pkProvBs");
            return (Criteria) this;
        }

        public Criteria andPkProvBsNotLike(String value) {
            addCriterion("PK_PROV_BS not like", value, "pkProvBs");
            return (Criteria) this;
        }

        public Criteria andPkProvBsIn(List<String> values) {
            addCriterion("PK_PROV_BS in", values, "pkProvBs");
            return (Criteria) this;
        }

        public Criteria andPkProvBsNotIn(List<String> values) {
            addCriterion("PK_PROV_BS not in", values, "pkProvBs");
            return (Criteria) this;
        }

        public Criteria andPkProvBsBetween(String value1, String value2) {
            addCriterion("PK_PROV_BS between", value1, value2, "pkProvBs");
            return (Criteria) this;
        }

        public Criteria andPkProvBsNotBetween(String value1, String value2) {
            addCriterion("PK_PROV_BS not between", value1, value2, "pkProvBs");
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

        public Criteria andFirstFoundTimeIsNull() {
            addCriterion("FIRST_FOUND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTimeIsNotNull() {
            addCriterion("FIRST_FOUND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTimeEqualTo(Date value) {
            addCriterion("FIRST_FOUND_TIME =", value, "firstFoundTime");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTimeNotEqualTo(Date value) {
            addCriterion("FIRST_FOUND_TIME <>", value, "firstFoundTime");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTimeGreaterThan(Date value) {
            addCriterion("FIRST_FOUND_TIME >", value, "firstFoundTime");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_FOUND_TIME >=", value, "firstFoundTime");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTimeLessThan(Date value) {
            addCriterion("FIRST_FOUND_TIME <", value, "firstFoundTime");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTimeLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_FOUND_TIME <=", value, "firstFoundTime");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTimeIn(List<Date> values) {
            addCriterion("FIRST_FOUND_TIME in", values, "firstFoundTime");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTimeNotIn(List<Date> values) {
            addCriterion("FIRST_FOUND_TIME not in", values, "firstFoundTime");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTimeBetween(Date value1, Date value2) {
            addCriterion("FIRST_FOUND_TIME between", value1, value2, "firstFoundTime");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTimeNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_FOUND_TIME not between", value1, value2, "firstFoundTime");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeIsNull() {
            addCriterion("LAST_FOUND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeIsNotNull() {
            addCriterion("LAST_FOUND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeEqualTo(Date value) {
            addCriterion("LAST_FOUND_TIME =", value, "lastFoundTime");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeNotEqualTo(Date value) {
            addCriterion("LAST_FOUND_TIME <>", value, "lastFoundTime");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeGreaterThan(Date value) {
            addCriterion("LAST_FOUND_TIME >", value, "lastFoundTime");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_FOUND_TIME >=", value, "lastFoundTime");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeLessThan(Date value) {
            addCriterion("LAST_FOUND_TIME <", value, "lastFoundTime");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_FOUND_TIME <=", value, "lastFoundTime");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeIn(List<Date> values) {
            addCriterion("LAST_FOUND_TIME in", values, "lastFoundTime");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeNotIn(List<Date> values) {
            addCriterion("LAST_FOUND_TIME not in", values, "lastFoundTime");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_FOUND_TIME between", value1, value2, "lastFoundTime");
            return (Criteria) this;
        }

        public Criteria andLastFoundTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_FOUND_TIME not between", value1, value2, "lastFoundTime");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeIsNull() {
            addCriterion("FIRST_FOUND_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeIsNotNull() {
            addCriterion("FIRST_FOUND_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeEqualTo(Short value) {
            addCriterion("FIRST_FOUND_TYPE =", value, "firstFoundType");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeNotEqualTo(Short value) {
            addCriterion("FIRST_FOUND_TYPE <>", value, "firstFoundType");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeGreaterThan(Short value) {
            addCriterion("FIRST_FOUND_TYPE >", value, "firstFoundType");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("FIRST_FOUND_TYPE >=", value, "firstFoundType");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeLessThan(Short value) {
            addCriterion("FIRST_FOUND_TYPE <", value, "firstFoundType");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeLessThanOrEqualTo(Short value) {
            addCriterion("FIRST_FOUND_TYPE <=", value, "firstFoundType");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeIn(List<Short> values) {
            addCriterion("FIRST_FOUND_TYPE in", values, "firstFoundType");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeNotIn(List<Short> values) {
            addCriterion("FIRST_FOUND_TYPE not in", values, "firstFoundType");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeBetween(Short value1, Short value2) {
            addCriterion("FIRST_FOUND_TYPE between", value1, value2, "firstFoundType");
            return (Criteria) this;
        }

        public Criteria andFirstFoundTypeNotBetween(Short value1, Short value2) {
            addCriterion("FIRST_FOUND_TYPE not between", value1, value2, "firstFoundType");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeIsNull() {
            addCriterion("LAST_FOUND_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeIsNotNull() {
            addCriterion("LAST_FOUND_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeEqualTo(Short value) {
            addCriterion("LAST_FOUND_TYPE =", value, "lastFoundType");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeNotEqualTo(Short value) {
            addCriterion("LAST_FOUND_TYPE <>", value, "lastFoundType");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeGreaterThan(Short value) {
            addCriterion("LAST_FOUND_TYPE >", value, "lastFoundType");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("LAST_FOUND_TYPE >=", value, "lastFoundType");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeLessThan(Short value) {
            addCriterion("LAST_FOUND_TYPE <", value, "lastFoundType");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeLessThanOrEqualTo(Short value) {
            addCriterion("LAST_FOUND_TYPE <=", value, "lastFoundType");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeIn(List<Short> values) {
            addCriterion("LAST_FOUND_TYPE in", values, "lastFoundType");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeNotIn(List<Short> values) {
            addCriterion("LAST_FOUND_TYPE not in", values, "lastFoundType");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeBetween(Short value1, Short value2) {
            addCriterion("LAST_FOUND_TYPE between", value1, value2, "lastFoundType");
            return (Criteria) this;
        }

        public Criteria andLastFoundTypeNotBetween(Short value1, Short value2) {
            addCriterion("LAST_FOUND_TYPE not between", value1, value2, "lastFoundType");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeIsNull() {
            addCriterion("FIRST_SYNC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeIsNotNull() {
            addCriterion("FIRST_SYNC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeEqualTo(Date value) {
            addCriterion("FIRST_SYNC_TIME =", value, "firstSyncTime");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeNotEqualTo(Date value) {
            addCriterion("FIRST_SYNC_TIME <>", value, "firstSyncTime");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeGreaterThan(Date value) {
            addCriterion("FIRST_SYNC_TIME >", value, "firstSyncTime");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FIRST_SYNC_TIME >=", value, "firstSyncTime");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeLessThan(Date value) {
            addCriterion("FIRST_SYNC_TIME <", value, "firstSyncTime");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeLessThanOrEqualTo(Date value) {
            addCriterion("FIRST_SYNC_TIME <=", value, "firstSyncTime");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeIn(List<Date> values) {
            addCriterion("FIRST_SYNC_TIME in", values, "firstSyncTime");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeNotIn(List<Date> values) {
            addCriterion("FIRST_SYNC_TIME not in", values, "firstSyncTime");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeBetween(Date value1, Date value2) {
            addCriterion("FIRST_SYNC_TIME between", value1, value2, "firstSyncTime");
            return (Criteria) this;
        }

        public Criteria andFirstSyncTimeNotBetween(Date value1, Date value2) {
            addCriterion("FIRST_SYNC_TIME not between", value1, value2, "firstSyncTime");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeIsNull() {
            addCriterion("LAST_SYNC_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeIsNotNull() {
            addCriterion("LAST_SYNC_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeEqualTo(Date value) {
            addCriterion("LAST_SYNC_TIME =", value, "lastSyncTime");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeNotEqualTo(Date value) {
            addCriterion("LAST_SYNC_TIME <>", value, "lastSyncTime");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeGreaterThan(Date value) {
            addCriterion("LAST_SYNC_TIME >", value, "lastSyncTime");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_SYNC_TIME >=", value, "lastSyncTime");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeLessThan(Date value) {
            addCriterion("LAST_SYNC_TIME <", value, "lastSyncTime");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_SYNC_TIME <=", value, "lastSyncTime");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeIn(List<Date> values) {
            addCriterion("LAST_SYNC_TIME in", values, "lastSyncTime");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeNotIn(List<Date> values) {
            addCriterion("LAST_SYNC_TIME not in", values, "lastSyncTime");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_SYNC_TIME between", value1, value2, "lastSyncTime");
            return (Criteria) this;
        }

        public Criteria andLastSyncTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_SYNC_TIME not between", value1, value2, "lastSyncTime");
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

        public Criteria andPkOnlineUserIsNull() {
            addCriterion("PK_ONLINE_USER is null");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserIsNotNull() {
            addCriterion("PK_ONLINE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserEqualTo(String value) {
            addCriterion("PK_ONLINE_USER =", value, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserNotEqualTo(String value) {
            addCriterion("PK_ONLINE_USER <>", value, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserGreaterThan(String value) {
            addCriterion("PK_ONLINE_USER >", value, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserGreaterThanOrEqualTo(String value) {
            addCriterion("PK_ONLINE_USER >=", value, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserLessThan(String value) {
            addCriterion("PK_ONLINE_USER <", value, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserLessThanOrEqualTo(String value) {
            addCriterion("PK_ONLINE_USER <=", value, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserLike(String value) {
            addCriterion("PK_ONLINE_USER like", value, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserNotLike(String value) {
            addCriterion("PK_ONLINE_USER not like", value, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserIn(List<String> values) {
            addCriterion("PK_ONLINE_USER in", values, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserNotIn(List<String> values) {
            addCriterion("PK_ONLINE_USER not in", values, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserBetween(String value1, String value2) {
            addCriterion("PK_ONLINE_USER between", value1, value2, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andPkOnlineUserNotBetween(String value1, String value2) {
            addCriterion("PK_ONLINE_USER not between", value1, value2, "pkOnlineUser");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNull() {
            addCriterion("ONLINE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIsNotNull() {
            addCriterion("ONLINE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeEqualTo(Date value) {
            addCriterion("ONLINE_TIME =", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotEqualTo(Date value) {
            addCriterion("ONLINE_TIME <>", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThan(Date value) {
            addCriterion("ONLINE_TIME >", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ONLINE_TIME >=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThan(Date value) {
            addCriterion("ONLINE_TIME <", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeLessThanOrEqualTo(Date value) {
            addCriterion("ONLINE_TIME <=", value, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeIn(List<Date> values) {
            addCriterion("ONLINE_TIME in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotIn(List<Date> values) {
            addCriterion("ONLINE_TIME not in", values, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeBetween(Date value1, Date value2) {
            addCriterion("ONLINE_TIME between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andOnlineTimeNotBetween(Date value1, Date value2) {
            addCriterion("ONLINE_TIME not between", value1, value2, "onlineTime");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserIsNull() {
            addCriterion("PK_OFFLINE_USER is null");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserIsNotNull() {
            addCriterion("PK_OFFLINE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserEqualTo(String value) {
            addCriterion("PK_OFFLINE_USER =", value, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserNotEqualTo(String value) {
            addCriterion("PK_OFFLINE_USER <>", value, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserGreaterThan(String value) {
            addCriterion("PK_OFFLINE_USER >", value, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserGreaterThanOrEqualTo(String value) {
            addCriterion("PK_OFFLINE_USER >=", value, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserLessThan(String value) {
            addCriterion("PK_OFFLINE_USER <", value, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserLessThanOrEqualTo(String value) {
            addCriterion("PK_OFFLINE_USER <=", value, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserLike(String value) {
            addCriterion("PK_OFFLINE_USER like", value, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserNotLike(String value) {
            addCriterion("PK_OFFLINE_USER not like", value, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserIn(List<String> values) {
            addCriterion("PK_OFFLINE_USER in", values, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserNotIn(List<String> values) {
            addCriterion("PK_OFFLINE_USER not in", values, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserBetween(String value1, String value2) {
            addCriterion("PK_OFFLINE_USER between", value1, value2, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andPkOfflineUserNotBetween(String value1, String value2) {
            addCriterion("PK_OFFLINE_USER not between", value1, value2, "pkOfflineUser");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIsNull() {
            addCriterion("OFFLINE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIsNotNull() {
            addCriterion("OFFLINE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeEqualTo(Date value) {
            addCriterion("OFFLINE_TIME =", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotEqualTo(Date value) {
            addCriterion("OFFLINE_TIME <>", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeGreaterThan(Date value) {
            addCriterion("OFFLINE_TIME >", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OFFLINE_TIME >=", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeLessThan(Date value) {
            addCriterion("OFFLINE_TIME <", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeLessThanOrEqualTo(Date value) {
            addCriterion("OFFLINE_TIME <=", value, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeIn(List<Date> values) {
            addCriterion("OFFLINE_TIME in", values, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotIn(List<Date> values) {
            addCriterion("OFFLINE_TIME not in", values, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeBetween(Date value1, Date value2) {
            addCriterion("OFFLINE_TIME between", value1, value2, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andOfflineTimeNotBetween(Date value1, Date value2) {
            addCriterion("OFFLINE_TIME not between", value1, value2, "offlineTime");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserIsNull() {
            addCriterion("PK_DELETE_USER is null");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserIsNotNull() {
            addCriterion("PK_DELETE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserEqualTo(String value) {
            addCriterion("PK_DELETE_USER =", value, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserNotEqualTo(String value) {
            addCriterion("PK_DELETE_USER <>", value, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserGreaterThan(String value) {
            addCriterion("PK_DELETE_USER >", value, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserGreaterThanOrEqualTo(String value) {
            addCriterion("PK_DELETE_USER >=", value, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserLessThan(String value) {
            addCriterion("PK_DELETE_USER <", value, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserLessThanOrEqualTo(String value) {
            addCriterion("PK_DELETE_USER <=", value, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserLike(String value) {
            addCriterion("PK_DELETE_USER like", value, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserNotLike(String value) {
            addCriterion("PK_DELETE_USER not like", value, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserIn(List<String> values) {
            addCriterion("PK_DELETE_USER in", values, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserNotIn(List<String> values) {
            addCriterion("PK_DELETE_USER not in", values, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserBetween(String value1, String value2) {
            addCriterion("PK_DELETE_USER between", value1, value2, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andPkDeleteUserNotBetween(String value1, String value2) {
            addCriterion("PK_DELETE_USER not between", value1, value2, "pkDeleteUser");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("DELETE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("DELETE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("DELETE_TIME =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("DELETE_TIME <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("DELETE_TIME >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DELETE_TIME >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("DELETE_TIME <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("DELETE_TIME <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("DELETE_TIME in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("DELETE_TIME not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("DELETE_TIME between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("DELETE_TIME not between", value1, value2, "deleteTime");
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