package com.ultrapower.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BdmRegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BdmRegionExample() {
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

        public Criteria andPkRegionIsNull() {
            addCriterion("PK_REGION is null");
            return (Criteria) this;
        }

        public Criteria andPkRegionIsNotNull() {
            addCriterion("PK_REGION is not null");
            return (Criteria) this;
        }

        public Criteria andPkRegionEqualTo(String value) {
            addCriterion("PK_REGION =", value, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andPkRegionNotEqualTo(String value) {
            addCriterion("PK_REGION <>", value, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andPkRegionGreaterThan(String value) {
            addCriterion("PK_REGION >", value, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andPkRegionGreaterThanOrEqualTo(String value) {
            addCriterion("PK_REGION >=", value, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andPkRegionLessThan(String value) {
            addCriterion("PK_REGION <", value, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andPkRegionLessThanOrEqualTo(String value) {
            addCriterion("PK_REGION <=", value, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andPkRegionLike(String value) {
            addCriterion("PK_REGION like", value, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andPkRegionNotLike(String value) {
            addCriterion("PK_REGION not like", value, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andPkRegionIn(List<String> values) {
            addCriterion("PK_REGION in", values, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andPkRegionNotIn(List<String> values) {
            addCriterion("PK_REGION not in", values, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andPkRegionBetween(String value1, String value2) {
            addCriterion("PK_REGION between", value1, value2, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andPkRegionNotBetween(String value1, String value2) {
            addCriterion("PK_REGION not between", value1, value2, "pkRegion");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNull() {
            addCriterion("REGION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andRegionNameIsNotNull() {
            addCriterion("REGION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andRegionNameEqualTo(String value) {
            addCriterion("REGION_NAME =", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotEqualTo(String value) {
            addCriterion("REGION_NAME <>", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThan(String value) {
            addCriterion("REGION_NAME >", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_NAME >=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThan(String value) {
            addCriterion("REGION_NAME <", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLessThanOrEqualTo(String value) {
            addCriterion("REGION_NAME <=", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameLike(String value) {
            addCriterion("REGION_NAME like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotLike(String value) {
            addCriterion("REGION_NAME not like", value, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameIn(List<String> values) {
            addCriterion("REGION_NAME in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotIn(List<String> values) {
            addCriterion("REGION_NAME not in", values, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameBetween(String value1, String value2) {
            addCriterion("REGION_NAME between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionNameNotBetween(String value1, String value2) {
            addCriterion("REGION_NAME not between", value1, value2, "regionName");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNull() {
            addCriterion("REGION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIsNotNull() {
            addCriterion("REGION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andRegionCodeEqualTo(String value) {
            addCriterion("REGION_CODE =", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotEqualTo(String value) {
            addCriterion("REGION_CODE <>", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThan(String value) {
            addCriterion("REGION_CODE >", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_CODE >=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThan(String value) {
            addCriterion("REGION_CODE <", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLessThanOrEqualTo(String value) {
            addCriterion("REGION_CODE <=", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeLike(String value) {
            addCriterion("REGION_CODE like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotLike(String value) {
            addCriterion("REGION_CODE not like", value, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeIn(List<String> values) {
            addCriterion("REGION_CODE in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotIn(List<String> values) {
            addCriterion("REGION_CODE not in", values, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeBetween(String value1, String value2) {
            addCriterion("REGION_CODE between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionCodeNotBetween(String value1, String value2) {
            addCriterion("REGION_CODE not between", value1, value2, "regionCode");
            return (Criteria) this;
        }

        public Criteria andRegionDescIsNull() {
            addCriterion("REGION_DESC is null");
            return (Criteria) this;
        }

        public Criteria andRegionDescIsNotNull() {
            addCriterion("REGION_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andRegionDescEqualTo(String value) {
            addCriterion("REGION_DESC =", value, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andRegionDescNotEqualTo(String value) {
            addCriterion("REGION_DESC <>", value, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andRegionDescGreaterThan(String value) {
            addCriterion("REGION_DESC >", value, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andRegionDescGreaterThanOrEqualTo(String value) {
            addCriterion("REGION_DESC >=", value, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andRegionDescLessThan(String value) {
            addCriterion("REGION_DESC <", value, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andRegionDescLessThanOrEqualTo(String value) {
            addCriterion("REGION_DESC <=", value, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andRegionDescLike(String value) {
            addCriterion("REGION_DESC like", value, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andRegionDescNotLike(String value) {
            addCriterion("REGION_DESC not like", value, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andRegionDescIn(List<String> values) {
            addCriterion("REGION_DESC in", values, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andRegionDescNotIn(List<String> values) {
            addCriterion("REGION_DESC not in", values, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andRegionDescBetween(String value1, String value2) {
            addCriterion("REGION_DESC between", value1, value2, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andRegionDescNotBetween(String value1, String value2) {
            addCriterion("REGION_DESC not between", value1, value2, "regionDesc");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentIsNull() {
            addCriterion("PKT_REGION_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentIsNotNull() {
            addCriterion("PKT_REGION_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentEqualTo(String value) {
            addCriterion("PKT_REGION_PARENT =", value, "pktRegionParent");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentNotEqualTo(String value) {
            addCriterion("PKT_REGION_PARENT <>", value, "pktRegionParent");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentGreaterThan(String value) {
            addCriterion("PKT_REGION_PARENT >", value, "pktRegionParent");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentGreaterThanOrEqualTo(String value) {
            addCriterion("PKT_REGION_PARENT >=", value, "pktRegionParent");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentLessThan(String value) {
            addCriterion("PKT_REGION_PARENT <", value, "pktRegionParent");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentLessThanOrEqualTo(String value) {
            addCriterion("PKT_REGION_PARENT <=", value, "pktRegionParent");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentLike(String value) {
            addCriterion("PKT_REGION_PARENT like", value, "pktRegionParent");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentNotLike(String value) {
            addCriterion("PKT_REGION_PARENT not like", value, "pktRegionParent");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentIn(List<String> values) {
            addCriterion("PKT_REGION_PARENT in", values, "pktRegionParent");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentNotIn(List<String> values) {
            addCriterion("PKT_REGION_PARENT not in", values, "pktRegionParent");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentBetween(String value1, String value2) {
            addCriterion("PKT_REGION_PARENT between", value1, value2, "pktRegionParent");
            return (Criteria) this;
        }

        public Criteria andPktRegionParentNotBetween(String value1, String value2) {
            addCriterion("PKT_REGION_PARENT not between", value1, value2, "pktRegionParent");
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

        public Criteria andDisplaySeqIsNull() {
            addCriterion("DISPLAY_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqIsNotNull() {
            addCriterion("DISPLAY_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqEqualTo(Integer value) {
            addCriterion("DISPLAY_SEQ =", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqNotEqualTo(Integer value) {
            addCriterion("DISPLAY_SEQ <>", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqGreaterThan(Integer value) {
            addCriterion("DISPLAY_SEQ >", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("DISPLAY_SEQ >=", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqLessThan(Integer value) {
            addCriterion("DISPLAY_SEQ <", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqLessThanOrEqualTo(Integer value) {
            addCriterion("DISPLAY_SEQ <=", value, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqIn(List<Integer> values) {
            addCriterion("DISPLAY_SEQ in", values, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqNotIn(List<Integer> values) {
            addCriterion("DISPLAY_SEQ not in", values, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqBetween(Integer value1, Integer value2) {
            addCriterion("DISPLAY_SEQ between", value1, value2, "displaySeq");
            return (Criteria) this;
        }

        public Criteria andDisplaySeqNotBetween(Integer value1, Integer value2) {
            addCriterion("DISPLAY_SEQ not between", value1, value2, "displaySeq");
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