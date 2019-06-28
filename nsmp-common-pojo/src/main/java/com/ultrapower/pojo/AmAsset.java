package com.ultrapower.pojo;

import java.io.Serializable;
import java.util.Date;

public class AmAsset implements Serializable {
    private String pkAsset;

    private String provCode;

    private String version;

    private String assetName;

    private String assetCode;

    private String assetIp;

    private String assetDesc;

    private Short assetState;

    private String pkAssetType;

    private String pkProvBs;

    private Short comeFrom;

    private String foreignId;

    private Date firstFoundTime;

    private Date lastFoundTime;

    private Short firstFoundType;

    private Short lastFoundType;

    private Date firstSyncTime;

    private Date lastSyncTime;

    private String pkCreator;

    private Date createTime;

    private String pkMender;

    private Date mendTimeLast;

    private String pkOnlineUser;

    private Date onlineTime;

    private String pkOfflineUser;

    private Date offlineTime;

    private String pkDeleteUser;

    private Date deleteTime;

    public String getPkAsset() {
        return pkAsset;
    }

    public void setPkAsset(String pkAsset) {
        this.pkAsset = pkAsset == null ? null : pkAsset.trim();
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode == null ? null : provCode.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName == null ? null : assetName.trim();
    }

    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode == null ? null : assetCode.trim();
    }

    public String getAssetIp() {
        return assetIp;
    }

    public void setAssetIp(String assetIp) {
        this.assetIp = assetIp == null ? null : assetIp.trim();
    }

    public String getAssetDesc() {
        return assetDesc;
    }

    public void setAssetDesc(String assetDesc) {
        this.assetDesc = assetDesc == null ? null : assetDesc.trim();
    }

    public Short getAssetState() {
        return assetState;
    }

    public void setAssetState(Short assetState) {
        this.assetState = assetState;
    }

    public String getPkAssetType() {
        return pkAssetType;
    }

    public void setPkAssetType(String pkAssetType) {
        this.pkAssetType = pkAssetType == null ? null : pkAssetType.trim();
    }

    public String getPkProvBs() {
        return pkProvBs;
    }

    public void setPkProvBs(String pkProvBs) {
        this.pkProvBs = pkProvBs == null ? null : pkProvBs.trim();
    }

    public Short getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(Short comeFrom) {
        this.comeFrom = comeFrom;
    }

    public String getForeignId() {
        return foreignId;
    }

    public void setForeignId(String foreignId) {
        this.foreignId = foreignId == null ? null : foreignId.trim();
    }

    public Date getFirstFoundTime() {
        return firstFoundTime;
    }

    public void setFirstFoundTime(Date firstFoundTime) {
        this.firstFoundTime = firstFoundTime;
    }

    public Date getLastFoundTime() {
        return lastFoundTime;
    }

    public void setLastFoundTime(Date lastFoundTime) {
        this.lastFoundTime = lastFoundTime;
    }

    public Short getFirstFoundType() {
        return firstFoundType;
    }

    public void setFirstFoundType(Short firstFoundType) {
        this.firstFoundType = firstFoundType;
    }

    public Short getLastFoundType() {
        return lastFoundType;
    }

    public void setLastFoundType(Short lastFoundType) {
        this.lastFoundType = lastFoundType;
    }

    public Date getFirstSyncTime() {
        return firstSyncTime;
    }

    public void setFirstSyncTime(Date firstSyncTime) {
        this.firstSyncTime = firstSyncTime;
    }

    public Date getLastSyncTime() {
        return lastSyncTime;
    }

    public void setLastSyncTime(Date lastSyncTime) {
        this.lastSyncTime = lastSyncTime;
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

    public String getPkOnlineUser() {
        return pkOnlineUser;
    }

    public void setPkOnlineUser(String pkOnlineUser) {
        this.pkOnlineUser = pkOnlineUser == null ? null : pkOnlineUser.trim();
    }

    public Date getOnlineTime() {
        return onlineTime;
    }

    public void setOnlineTime(Date onlineTime) {
        this.onlineTime = onlineTime;
    }

    public String getPkOfflineUser() {
        return pkOfflineUser;
    }

    public void setPkOfflineUser(String pkOfflineUser) {
        this.pkOfflineUser = pkOfflineUser == null ? null : pkOfflineUser.trim();
    }

    public Date getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(Date offlineTime) {
        this.offlineTime = offlineTime;
    }

    public String getPkDeleteUser() {
        return pkDeleteUser;
    }

    public void setPkDeleteUser(String pkDeleteUser) {
        this.pkDeleteUser = pkDeleteUser == null ? null : pkDeleteUser.trim();
    }

    public Date getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Date deleteTime) {
        this.deleteTime = deleteTime;
    }
}