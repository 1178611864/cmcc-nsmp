package com.ultrapower.pojo;

import java.io.Serializable;

public class Nodes implements Serializable {

    private String id;
    private String pId;
    private String name;

    public Nodes() {
    }

    public Nodes(String id, String pId, String name) {
        this.id = id;
        this.pId = pId;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
