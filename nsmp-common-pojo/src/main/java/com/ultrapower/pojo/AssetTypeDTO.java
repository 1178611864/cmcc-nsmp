package com.ultrapower.pojo;

import java.io.Serializable;
import java.util.List;

public class AssetTypeDTO implements Serializable {

    private String id;
    private String name;

    private List<AssetTypeDTO> secondTypes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AssetTypeDTO> getSecondTypes() {
        return secondTypes;
    }

    public void setSecondTypes(List<AssetTypeDTO> secondTypes) {
        this.secondTypes = secondTypes;
    }
}
