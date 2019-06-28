package com.ultrapower.pojo;

import java.io.Serializable;
import java.util.Date;

public class AmBsProv implements Serializable {
    private String pkBsProv;

    private String provCode;

    private String bsName;

    private String bsCode;

    private String bsDesc;

    private String fullName;

    private Short bsSrc;

    private String foreignId;

    private Short displaySeq;

    private String pkBsParent;

    private String seriescode;

    private String bsType;

    private String bsVer;

    private String secGrade;

    private String influence;

    private String srvRange;

    private String importance;

    private String manageUrl;

    private String vendor;

    private String adminName;

    private String contactInfo;

    private String location;

    private String bsBackup;

    private String secZone;

    private Short isDeleted;

    private String pkCreator;

    private Date createTime;

    private String pkMender;

    private Date mendTimeLast;

    public String getPkBsProv() {
        return pkBsProv;
    }

    public void setPkBsProv(String pkBsProv) {
        this.pkBsProv = pkBsProv == null ? null : pkBsProv.trim();
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode == null ? null : provCode.trim();
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

    public String getForeignId() {
        return foreignId;
    }

    public void setForeignId(String foreignId) {
        this.foreignId = foreignId == null ? null : foreignId.trim();
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

    public String getBsType() {
        return bsType;
    }

    public void setBsType(String bsType) {
        this.bsType = bsType == null ? null : bsType.trim();
    }

    public String getBsVer() {
        return bsVer;
    }

    public void setBsVer(String bsVer) {
        this.bsVer = bsVer == null ? null : bsVer.trim();
    }

    public String getSecGrade() {
        return secGrade;
    }

    public void setSecGrade(String secGrade) {
        this.secGrade = secGrade == null ? null : secGrade.trim();
    }

    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence == null ? null : influence.trim();
    }

    public String getSrvRange() {
        return srvRange;
    }

    public void setSrvRange(String srvRange) {
        this.srvRange = srvRange == null ? null : srvRange.trim();
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance == null ? null : importance.trim();
    }

    public String getManageUrl() {
        return manageUrl;
    }

    public void setManageUrl(String manageUrl) {
        this.manageUrl = manageUrl == null ? null : manageUrl.trim();
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor == null ? null : vendor.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo == null ? null : contactInfo.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public String getBsBackup() {
        return bsBackup;
    }

    public void setBsBackup(String bsBackup) {
        this.bsBackup = bsBackup == null ? null : bsBackup.trim();
    }

    public String getSecZone() {
        return secZone;
    }

    public void setSecZone(String secZone) {
        this.secZone = secZone == null ? null : secZone.trim();
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