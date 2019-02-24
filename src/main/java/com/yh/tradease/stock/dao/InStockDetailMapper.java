package com.yh.tradease.stock.dao;

import com.yh.tradease.stock.entity.InStockDetail;
import com.yh.tradease.stock.entity.InStockDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface InStockDetailMapper {
    long countByExample(InStockDetailExample example);

    int deleteByExample(InStockDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(InStockDetail record);

    int insertSelective(InStockDetail record);

    List<InStockDetail> selectByExample(InStockDetailExample example);

    InStockDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") InStockDetail record, @Param("example") InStockDetailExample example);

    int updateByExample(@Param("record") InStockDetail record, @Param("example") InStockDetailExample example);

    int updateByPrimaryKeySelective(InStockDetail record);

    int updateByPrimaryKey(InStockDetail record);
}