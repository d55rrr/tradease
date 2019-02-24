package com.yh.tradease.customerRelation.dao;

import com.yh.tradease.customerRelation.entity.CustomerB;
import com.yh.tradease.customerRelation.entity.CustomerBExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CustomerBMapper {
    long countByExample(CustomerBExample example);

    int deleteByExample(CustomerBExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CustomerB record);

    int insertSelective(CustomerB record);

    List<CustomerB> selectByExample(CustomerBExample example);

    CustomerB selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CustomerB record, @Param("example") CustomerBExample example);

    int updateByExample(@Param("record") CustomerB record, @Param("example") CustomerBExample example);

    int updateByPrimaryKeySelective(CustomerB record);

    int updateByPrimaryKey(CustomerB record);
}