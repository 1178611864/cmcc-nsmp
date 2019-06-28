package com.ultrapower.dao;

import com.ultrapower.pojo.BdmVendor;
import com.ultrapower.pojo.BdmVendorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdmVendorMapper {
    int countByExample(BdmVendorExample example);

    int deleteByExample(BdmVendorExample example);

    int deleteByPrimaryKey(String pkVendor);

    int insert(BdmVendor record);

    int insertSelective(BdmVendor record);

    List<BdmVendor> selectByExample(BdmVendorExample example);

    BdmVendor selectByPrimaryKey(String pkVendor);

    int updateByExampleSelective(@Param("record") BdmVendor record, @Param("example") BdmVendorExample example);

    int updateByExample(@Param("record") BdmVendor record, @Param("example") BdmVendorExample example);

    int updateByPrimaryKeySelective(BdmVendor record);

    int updateByPrimaryKey(BdmVendor record);
}