package com.ultrapower.pojo;


import java.io.Serializable;

/*
 *根据指定的集团业务系统ID，查询右下角映射的省份业务系统
 * */
public class ProvDTO implements Serializable {

    private String pkBsProv;
    private String bsName;
    private String matchType;
    private String provName;
    private String assetCount;

    public String getPkBsProv() {
        return pkBsProv;
    }

    public void setPkBsProv(String pkBsProv) {
        this.pkBsProv = pkBsProv;
    }

    public String getBsName() {
        return bsName;
    }

    public void setBsName(String bsName) {
        this.bsName = bsName;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName;
    }

    public String getAssetCount() {
        return assetCount;
    }

    public void setAssetCount(String assetCount) {
        this.assetCount = assetCount;
    }
}
