package com.ultrapower.dao;

import com.ultrapower.pojo.AmPropClass;
import com.ultrapower.pojo.AmPropClassExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmPropClassMapper {
    int countByExample(AmPropClassExample example);

    int deleteByExample(AmPropClassExample example);

    int deleteByPrimaryKey(String pkPropClass);

    int insert(AmPropClass record);

    int insertSelective(AmPropClass record);

    List<AmPropClass> selectByExample(AmPropClassExample example);

    AmPropClass selectByPrimaryKey(String pkPropClass);

    int updateByExampleSelective(@Param("record") AmPropClass record, @Param("example") AmPropClassExample example);

    int updateByExample(@Param("record") AmPropClass record, @Param("example") AmPropClassExample example);

    int updateByPrimaryKeySelective(AmPropClass record);

    int updateByPrimaryKey(AmPropClass record);
}