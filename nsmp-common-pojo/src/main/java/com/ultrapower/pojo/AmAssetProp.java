package com.ultrapower.pojo;

import java.io.Serializable;
import java.util.Date;

public class AmAssetProp implements Serializable {
    private String pkAssetProp;

    private String propName;

    private String propCode;

    private String propDesc;

    private String pkPropClass;

    private Short bsType;

    private String dataType;

    private Short isView;

    private Short needValue;

    private String collectType;

    private Short comeFrom;

    private Short isDeleted;

    private String pkCreator;

    private Date createTime;

    private String pkMender;

    private Date mendTimeLast;

    public String getPkAssetProp() {
        return pkAssetProp;
    }

    public void setPkAssetProp(String pkAssetProp) {
        this.pkAssetProp = pkAssetProp == null ? null : pkAssetProp.trim();
    }

    public String getPropName() {
        return propName;
    }

    public void setPropName(String propName) {
        this.propName = propName == null ? null : propName.trim();
    }

    public String getPropCode() {
        return propCode;
    }

    public void setPropCode(String propCode) {
        this.propCode = propCode == null ? null : propCode.trim();
    }

    public String getPropDesc() {
        return propDesc;
    }

    public void setPropDesc(String propDesc) {
        this.propDesc = propDesc == null ? null : propDesc.trim();
    }

    public String getPkPropClass() {
        return pkPropClass;
    }

    public void setPkPropClass(String pkPropClass) {
        this.pkPropClass = pkPropClass == null ? null : pkPropClass.trim();
    }

    public Short getBsType() {
        return bsType;
    }

    public void setBsType(Short bsType) {
        this.bsType = bsType;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType == null ? null : dataType.trim();
    }

    public Short getIsView() {
        return isView;
    }

    public void setIsView(Short isView) {
        this.isView = isView;
    }

    public Short getNeedValue() {
        return needValue;
    }

    public void setNeedValue(Short needValue) {
        this.needValue = needValue;
    }

    public String getCollectType() {
        return collectType;
    }

    public void setCollectType(String collectType) {
        this.collectType = collectType == null ? null : collectType.trim();
    }

    public Short getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(Short comeFrom) {
        this.comeFrom = comeFrom;
    }

    public Short getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Short isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getPkCreator() {
        return pkCreator;
    }

    public void setPkCreator(String pkCreator) {
        this.pkCreator = pkCreator == null ? null : pkCreator.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getPkMender() {
        return pkMender;
    }

    public void setPkMender(String pkMender) {
        this.pkMender = pkMender == null ? null : pkMender.trim();
    }

    public Date getMendTimeLast() {
        return mendTimeLast;
    }

    public void setMendTimeLast(Date mendTimeLast) {
        this.mendTimeLast = mendTimeLast;
    }
}