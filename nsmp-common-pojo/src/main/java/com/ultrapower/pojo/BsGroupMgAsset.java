package com.ultrapower.pojo;

import java.io.Serializable;
import java.security.SecureRandom;

/**
 * 集团业务系统管辖的资产
 */
public class BsGroupMgAsset implements Serializable {

    private String PK_BS_GROUP;
    private String G_BS_NAME;
    private String PROV_CODE;
    private String PROV_NAME;
    private String PK_BS_PROV;
    private String P_BS_NAME;
    private String PK_ASSET;
    private String ASSET_NAME;
    private String ASSET_IP;
    private String PK_ASSET_TYPE;
    private String TYPE_NAME;

    public String getPK_BS_GROUP() {
        return PK_BS_GROUP;
    }

    public void setPK_BS_GROUP(String PK_BS_GROUP) {
        this.PK_BS_GROUP = PK_BS_GROUP;
    }

    public String getG_BS_NAME() {
        return G_BS_NAME;
    }

    public void setG_BS_NAME(String g_BS_NAME) {
        G_BS_NAME = g_BS_NAME;
    }

    public String getPROV_CODE() {
        return PROV_CODE;
    }

    public void setPROV_CODE(String PROV_CODE) {
        this.PROV_CODE = PROV_CODE;
    }

    public String getPROV_NAME() {
        return PROV_NAME;
    }

    public void setPROV_NAME(String PROV_NAME) {
        this.PROV_NAME = PROV_NAME;
    }

    public String getPK_BS_PROV() {
        return PK_BS_PROV;
    }

    public void setPK_BS_PROV(String PK_BS_PROV) {
        this.PK_BS_PROV = PK_BS_PROV;
    }

    public String getP_BS_NAME() {
        return P_BS_NAME;
    }

    public void setP_BS_NAME(String p_BS_NAME) {
        P_BS_NAME = p_BS_NAME;
    }

    public String getPK_ASSET() {
        return PK_ASSET;
    }

    public void setPK_ASSET(String PK_ASSET) {
        this.PK_ASSET = PK_ASSET;
    }

    public String getASSET_NAME() {
        return ASSET_NAME;
    }

    public void setASSET_NAME(String ASSET_NAME) {
        this.ASSET_NAME = ASSET_NAME;
    }

    public String getASSET_IP() {
        return ASSET_IP;
    }

    public void setASSET_IP(String ASSET_IP) {
        this.ASSET_IP = ASSET_IP;
    }

    public String getPK_ASSET_TYPE() {
        return PK_ASSET_TYPE;
    }

    public void setPK_ASSET_TYPE(String PK_ASSET_TYPE) {
        this.PK_ASSET_TYPE = PK_ASSET_TYPE;
    }

    public String getTYPE_NAME() {
        return TYPE_NAME;
    }

    public void setTYPE_NAME(String TYPE_NAME) {
        this.TYPE_NAME = TYPE_NAME;
    }
}
