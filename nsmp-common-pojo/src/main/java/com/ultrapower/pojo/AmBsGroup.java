package com.ultrapower.pojo;

import java.io.Serializable;
import java.util.Date;

public class AmBsGroup implements Serializable {
    private String pkBsGroup;

    private String bsName;

    private String bsCode;

    private String bsDesc;

    private String fullName;

    private Short bsSrc;

    private Short displaySeq;

    private String pkBsParent;

    private String seriescode;

    private String mappingRegex;

    private Short isDeleted;

    private String pkCreator;

    private Date createTime;

    private String pkMender;

    private Date mendTimeLast;


    public String getPkBsGroup() {
        return pkBsGroup;
    }

    public void setPkBsGroup(String pkBsGroup) {
        this.pkBsGroup = pkBsGroup == null ? null : pkBsGroup.trim();
    }

    public String getBsName() {
        return bsName;
    }

    public void setBsName(String bsName) {
        this.bsName = bsName == null ? null : bsName.trim();
    }

    public String getBsCode() {
        return bsCode;
    }

    public void setBsCode(String bsCode) {
        this.bsCode = bsCode == null ? null : bsCode.trim();
    }

    public String getBsDesc() {
        return bsDesc;
    }

    public void setBsDesc(String bsDesc) {
        this.bsDesc = bsDesc == null ? null : bsDesc.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    public Short getBsSrc() {
        return bsSrc;
    }

    public void setBsSrc(Short bsSrc) {
        this.bsSrc = bsSrc;
    }

    public Short getDisplaySeq() {
        return displaySeq;
    }

    public void setDisplaySeq(Short displaySeq) {
        this.displaySeq = displaySeq;
    }

    public String getPkBsParent() {
        return pkBsParent;
    }

    public void setPkBsParent(String pkBsParent) {
        this.pkBsParent = pkBsParent == null ? null : pkBsParent.trim();
    }

    public String getSeriescode() {
        return seriescode;
    }

    public void setSeriescode(String seriescode) {
        this.seriescode = seriescode == null ? null : seriescode.trim();
    }

    public String getMappingRegex() {
        return mappingRegex;
    }

    public void setMappingRegex(String mappingRegex) {
        this.mappingRegex = mappingRegex == null ? null : mappingRegex.trim();
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