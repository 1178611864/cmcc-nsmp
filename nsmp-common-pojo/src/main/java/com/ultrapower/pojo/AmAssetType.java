package com.ultrapower.pojo;

import java.io.Serializable;
import java.util.Date;

public class AmAssetType implements Serializable {
    private String pkAssetType;

    private String typeName;

    private String typeCode;

    private String fullName;

    private String typeDesc;

    private String pkTypeParent;

    private String seriescode;

    private Integer displayIdx;

    private Short isView;

    private Short comeFrom;

    private Short isDeleted;

    private String pkCreator;

    private Date createTime;

    private String pkMender;

    private Date mendTimeLast;

    public String getPkAssetType() {
        return pkAssetType;
    }

    public void setPkAssetType(String pkAssetType) {
        this.pkAssetType = pkAssetType == null ? null : pkAssetType.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode == null ? null : typeCode.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    public String getPkTypeParent() {
        return pkTypeParent;
    }

    public void setPkTypeParent(String pkTypeParent) {
        this.pkTypeParent = pkTypeParent == null ? null : pkTypeParent.trim();
    }

    public String getSeriescode() {
        return seriescode;
    }

    public void setSeriescode(String seriescode) {
        this.seriescode = seriescode == null ? null : seriescode.trim();
    }

    public Integer getDisplayIdx() {
        return displayIdx;
    }

    public void setDisplayIdx(Integer displayIdx) {
        this.displayIdx = displayIdx;
    }

    public Short getIsView() {
        return isView;
    }

    public void setIsView(Short isView) {
        this.isView = isView;
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