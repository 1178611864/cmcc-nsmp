package com.ultrapower.dao;

import com.ultrapower.pojo.AmBsGroupProv;
import com.ultrapower.pojo.BdmProv;
import com.ultrapower.pojo.BdmProvExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdmProvMapper {
    int countByExample(BdmProvExample example);

    int deleteByExample(BdmProvExample example);

    int deleteByPrimaryKey(String pkProv);

    int insert(BdmProv record);

    int insertSelective(BdmProv record);

    List<BdmProv> selectByExample(BdmProvExample example);

    BdmProv selectByPrimaryKey(String pkProv);

    int updateByExampleSelective(@Param("record") BdmProv record, @Param("example") BdmProvExample example);

    int updateByExample(@Param("record") BdmProv record, @Param("example") BdmProvExample example);

    int updateByPrimaryKeySelective(BdmProv record);

    int updateByPrimaryKey(BdmProv record);

}