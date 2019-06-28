package com.ultrapower.pojo;

import java.io.Serializable;
import java.util.Date;

public class BdmProv implements Serializable {
    private String pkProv;

    private String provName;

    private String provCode;

    private String provDesc;

    private Short provState;

    private String judgeRegex;

    private String pkCreator;

    private Date createTime;

    private String pkMender;

    private Date mendTimeLast;

    public String getPkProv() {
        return pkProv;
    }

    public void setPkProv(String pkProv) {
        this.pkProv = pkProv == null ? null : pkProv.trim();
    }

    public String getProvName() {
        return provName;
    }

    public void setProvName(String provName) {
        this.provName = provName == null ? null : provName.trim();
    }

    public String getProvCode() {
        return provCode;
    }

    public void setProvCode(String provCode) {
        this.provCode = provCode == null ? null : provCode.trim();
    }

    public String getProvDesc() {
        return provDesc;
    }

    public void setProvDesc(String provDesc) {
        this.provDesc = provDesc == null ? null : provDesc.trim();
    }

    public Short getProvState() {
        return provState;
    }

    public void setProvState(Short provState) {
        this.provState = provState;
    }

    public String getJudgeRegex() {
        return judgeRegex;
    }

    public void setJudgeRegex(String judgeRegex) {
        this.judgeRegex = judgeRegex == null ? null : judgeRegex.trim();
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