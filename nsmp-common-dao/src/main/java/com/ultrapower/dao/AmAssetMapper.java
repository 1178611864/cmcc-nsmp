package com.ultrapower.dao;

import com.ultrapower.pojo.AmAsset;
import com.ultrapower.pojo.AmAssetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmAssetMapper {
    int countByExample(AmAssetExample example);

    int deleteByExample(AmAssetExample example);

    int deleteByPrimaryKey(String pkAsset);

    int insert(AmAsset record);

    int insertSelective(AmAsset record);

    List<AmAsset> selectByExample(AmAssetExample example);

    AmAsset selectByPrimaryKey(String pkAsset);

    int updateByExampleSelective(@Param("record") AmAsset record, @Param("example") AmAssetExample example);

    int updateByExample(@Param("record") AmAsset record, @Param("example") AmAssetExample example);

    int updateByPrimaryKeySelective(AmAsset record);

    int updateByPrimaryKey(AmAsset record);
}