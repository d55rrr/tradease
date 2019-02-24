package com.yh.tradease.stock.dao;

import com.yh.tradease.stock.entity.OutStockDetail;
import com.yh.tradease.stock.entity.OutStockDetailExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OutStockDetailMapper {
    long countByExample(OutStockDetailExample example);

    int deleteByExample(OutStockDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OutStockDetail record);

    int insertSelective(OutStockDetail record);

    List<OutStockDetail> selectByExample(OutStockDetailExample example);

    OutStockDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OutStockDetail record, @Param("example") OutStockDetailExample example);

    int updateByExample(@Param("record") OutStockDetail record, @Param("example") OutStockDetailExample example);

    int updateByPrimaryKeySelective(OutStockDetail record);

    int updateByPrimaryKey(OutStockDetail record);
}