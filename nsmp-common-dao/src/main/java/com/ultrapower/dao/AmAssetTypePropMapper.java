package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetTypeProp;
import com.ultrapower.pojo.AmAssetTypePropExample;
import com.ultrapower.pojo.AmAssetTypePropKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetTypePropMapper {
    int countByExample(AmAssetTypePropExample example);

    int deleteByExample(AmAssetTypePropExample example);

    int deleteByPrimaryKey(AmAssetTypePropKey key);

    int insert(AmAssetTypeProp record);

    int insertSelective(AmAssetTypeProp record);

    List<AmAssetTypeProp> selectByExample(AmAssetTypePropExample example);

    AmAssetTypeProp selectByPrimaryKey(AmAssetTypePropKey key);

    int updateByExampleSelective(@Param("record") AmAssetTypeProp record, @Param("example") AmAssetTypePropExample example);

    int updateByExample(@Param("record") AmAssetTypeProp record, @Param("example") AmAssetTypePropExample example);

    int updateByPrimaryKeySelective(AmAssetTypeProp record);

    int updateByPrimaryKey(AmAssetTypeProp record);
}