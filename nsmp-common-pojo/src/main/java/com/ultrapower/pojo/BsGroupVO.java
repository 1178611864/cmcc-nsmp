package com.ultrapower.pojo;

import java.io.Serializable;
import java.util.List;


/*
*
* 用来映射initBsGroupTree  sql语句
* */
public class BsGroupVO extends AmBsGroup{

    /* 二级节点的集合 */
    List<BsGroupVO> second;

    /* 三级级节点的集合 */
    List<BsGroupVO> third;

    public List<BsGroupVO> getSecond() {
        return second;
    }

    public void setSecond(List<BsGroupVO> second) {
        this.second = second;
    }

    public List<BsGroupVO> getThird() {
        return third;
    }

    public void setThird(List<BsGroupVO> third) {
        this.third = third;
    }
}
