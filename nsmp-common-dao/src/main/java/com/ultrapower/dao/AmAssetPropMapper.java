package com.ultrapower.dao;

import com.ultrapower.pojo.AmAssetProp;
import com.ultrapower.pojo.AmAssetPropExample;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface AmAssetPropMapper {
    int countByExample(AmAssetPropExample example);

    int deleteByExample(AmAssetPropExample example);

    int deleteByPrimaryKey(String pkAssetProp);

    int insert(AmAssetProp record);

    int insertSelective(AmAssetProp record);

    List<AmAssetProp> selectByExample(AmAssetPropExample example);

    AmAssetProp selectByPrimaryKey(String pkAssetProp);

    int updateByExampleSelective(@Param("record") AmAssetProp record, @Param("example") AmAssetPropExample example);

    int updateByExample(@Param("record") AmAssetProp record, @Param("example") AmAssetPropExample example);

    int updateByPrimaryKeySelective(AmAssetProp record);

    int updateByPrimaryKey(AmAssetProp record);
    /*
    id:类型的id
    * */
    List<AmAssetProp> findPropListByAssetTypeId(String id);

    /*
    * 模糊查询指定类型绑定的属性
    * */
    List<AmAssetProp> findPropListByAssetTypeIdAndLikePropName(HashMap<String,String> hashMap);
}