package com.ultrapower.dao;

import com.ultrapower.pojo.AmUser;
import com.ultrapower.pojo.AmUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AmUserMapper {
    int countByExample(AmUserExample example);

    int deleteByExample(AmUserExample example);

    int deleteByPrimaryKey(String pkNsmpUser);

    int insert(AmUser record);

    int insertSelective(AmUser record);

    List<AmUser> selectByExample(AmUserExample example);

    AmUser selectByPrimaryKey(String pkNsmpUser);

    int updateByExampleSelective(@Param("record") AmUser record, @Param("example") AmUserExample example);

    int updateByExample(@Param("record") AmUser record, @Param("example") AmUserExample example);

    int updateByPrimaryKeySelective(AmUser record);

    int updateByPrimaryKey(AmUser record);
}