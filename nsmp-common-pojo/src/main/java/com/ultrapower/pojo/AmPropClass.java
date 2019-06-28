package com.ultrapower.pojo;

import java.io.Serializable;

public class AmPropClass implements Serializable {
    private String pkPropClass;

    private String propClassName;

    public String getPkPropClass() {
        return pkPropClass;
    }

    public void setPkPropClass(String pkPropClass) {
        this.pkPropClass = pkPropClass == null ? null : pkPropClass.trim();
    }

    public String getPropClassName() {
        return propClassName;
    }

    public void setPropClassName(String propClassName) {
        this.propClassName = propClassName == null ? null : propClassName.trim();
    }
}