package com.ultrapower.pojo;

import java.io.Serializable;

public class AssetTypeQueryVO implements Serializable {

    private String beginTime;
    private String endTime;
    private String keywords;

    public AssetTypeQueryVO() {
    }

    public AssetTypeQueryVO(String beginTime, String endTime, String keywords) {
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.keywords = keywords;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public String toString() {
        return "AssetTypeQueryVO{" +
                "beginTime='" + beginTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", keywords='" + keywords + '\'' +
                '}';
    }
}
