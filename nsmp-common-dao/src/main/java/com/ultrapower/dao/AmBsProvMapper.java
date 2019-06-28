package com.ultrapower.dao;

import com.ultrapower.pojo.AmBsProv;
import com.ultrapower.pojo.AmBsProvExample;
import com.ultrapower.pojo.BsProvVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmBsProvMapper {
    int countByExample(AmBsProvExample example);

    int deleteByExample(AmBsProvExample example);

    int deleteByPrimaryKey(String pkBsProv);

    int insert(AmBsProv record);

    int insertSelective(AmBsProv record);

    List<AmBsProv> selectByExample(AmBsProvExample example);

    AmBsProv selectByPrimaryKey(String pkBsProv);

    int updateByExampleSelective(@Param("record") AmBsProv record, @Param("example") AmBsProvExample example);

    int updateByExample(@Param("record") AmBsProv record, @Param("example") AmBsProvExample example);

    int updateByPrimaryKeySelective(AmBsProv record);

    int updateByPrimaryKey(AmBsProv record);

    List<BsProvVO> initBsProvTree();
}