package com.ultrapower.dao;

import com.ultrapower.pojo.BdmRegion;
import com.ultrapower.pojo.BdmRegionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdmRegionMapper {
    int countByExample(BdmRegionExample example);

    int deleteByExample(BdmRegionExample example);

    int deleteByPrimaryKey(String pkRegion);

    int insert(BdmRegion record);

    int insertSelective(BdmRegion record);

    List<BdmRegion> selectByExample(BdmRegionExample example);

    BdmRegion selectByPrimaryKey(String pkRegion);

    int updateByExampleSelective(@Param("record") BdmRegion record, @Param("example") BdmRegionExample example);

    int updateByExample(@Param("record") BdmRegion record, @Param("example") BdmRegionExample example);

    int updateByPrimaryKeySelective(BdmRegion record);

    int updateByPrimaryKey(BdmRegion record);
}