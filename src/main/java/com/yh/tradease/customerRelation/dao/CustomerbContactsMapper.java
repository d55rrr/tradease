package com.yh.tradease.customerRelation.dao;

import com.yh.tradease.customerRelation.entity.CustomerbContacts;
import com.yh.tradease.customerRelation.entity.CustomerbContactsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CustomerbContactsMapper {
    long countByExample(CustomerbContactsExample example);

    int deleteByExample(CustomerbContactsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerbContacts record);

    int insertSelective(CustomerbContacts record);

    List<CustomerbContacts> selectByExample(CustomerbContactsExample example);

    CustomerbContacts selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerbContacts record, @Param("example") CustomerbContactsExample example);

    int updateByExample(@Param("record") CustomerbContacts record, @Param("example") CustomerbContactsExample example);

    int updateByPrimaryKeySelective(CustomerbContacts record);

    int updateByPrimaryKey(CustomerbContacts record);
}