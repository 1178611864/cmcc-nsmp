package com.ultrapower.pojo;

public class AmAssetTypePropKey {
    private String pkAssetType;

    private String pkAssetProp;

    public String getPkAssetType() {
        return pkAssetType;
    }

    public void setPkAssetType(String pkAssetType) {
        this.pkAssetType = pkAssetType == null ? null : pkAssetType.trim();
    }

    public String getPkAssetProp() {
        return pkAssetProp;
    }

    public void setPkAssetProp(String pkAssetProp) {
        this.pkAssetProp = pkAssetProp == null ? null : pkAssetProp.trim();
    }
}