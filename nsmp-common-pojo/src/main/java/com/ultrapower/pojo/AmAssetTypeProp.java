package com.ultrapower.pojo;

public class AmAssetTypeProp extends AmAssetTypePropKey {
    private Short isView;

    private Short needValue;

    private String collectType;

    private Short displayIdx;

    private String displayPriority;

    private Short comeFrom;

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

    public Short getDisplayIdx() {
        return displayIdx;
    }

    public void setDisplayIdx(Short displayIdx) {
        this.displayIdx = displayIdx;
    }

    public String getDisplayPriority() {
        return displayPriority;
    }

    public void setDisplayPriority(String displayPriority) {
        this.displayPriority = displayPriority == null ? null : displayPriority.trim();
    }

    public Short getComeFrom() {
        return comeFrom;
    }

    public void setComeFrom(Short comeFrom) {
        this.comeFrom = comeFrom;
    }
}