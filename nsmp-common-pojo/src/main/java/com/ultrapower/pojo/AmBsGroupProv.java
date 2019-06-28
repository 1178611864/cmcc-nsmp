package com.ultrapower.pojo;

import java.io.Serializable;
import java.util.Date;

public class AmBsGroupProv implements Serializable {
    private String pkBsGroupProv;

    private String pkBsGroup;

    private String pkBsProv;

    private Short matchType;

    private String pkCreator;

    private Date createTime;

    public String getPkBsGroupProv() {
        return pkBsGroupProv;
    }

    public void setPkBsGroupProv(String pkBsGroupProv) {
        this.pkBsGroupProv = pkBsGroupProv == null ? null : pkBsGroupProv.trim();
    }

    public String getPkBsGroup() {
        return pkBsGroup;
    }

    public void setPkBsGroup(String pkBsGroup) {
        this.pkBsGroup = pkBsGroup == null ? null : pkBsGroup.trim();
    }

    public String getPkBsProv() {
        return pkBsProv;
    }

    public void setPkBsProv(String pkBsProv) {
        this.pkBsProv = pkBsProv == null ? null : pkBsProv.trim();
    }

    public Short getMatchType() {
        return matchType;
    }

    public void setMatchType(Short matchType) {
        this.matchType = matchType;
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
}