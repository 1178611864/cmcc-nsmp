package com.ultrapower.dao;

import com.ultrapower.pojo.AmBsGroup;
import com.ultrapower.pojo.AmBsGroupExample;
import com.ultrapower.pojo.BsGroupVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmBsGroupMapper {
    int countByExample(AmBsGroupExample example);

    int deleteByExample(AmBsGroupExample example);

    int deleteByPrimaryKey(String pkBsGroup);

    int insert(AmBsGroup record);

    int insertSelective(AmBsGroup record);

    List<AmBsGroup> selectByExample(AmBsGroupExample example);

    AmBsGroup selectByPrimaryKey(String pkBsGroup);

    int updateByExampleSelective(@Param("record") AmBsGroup record, @Param("example") AmBsGroupExample example);

    int updateByExample(@Param("record") AmBsGroup record, @Param("example") AmBsGroupExample example);

    int updateByPrimaryKeySelective(AmBsGroup record);

    int updateByPrimaryKey(AmBsGroup record);

    /*集团业务系统树*/
    List<BsGroupVO> initBsGroupTree();
}