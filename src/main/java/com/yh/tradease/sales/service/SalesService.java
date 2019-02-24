package com.yh.tradease.sales.service;

import java.util.List;
import java.util.Map;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.sales.entity.SaleRecord;

public interface SalesService {
	/**
	 * 获得销售记录列表
	 * @param param
	 * @return
	 */
	ResponseData findPage(SaleRecord record,Pager page);
	/**
	 * 新增
	 * @param record
	 * @return
	 */
	ResponseData insert(SaleRecord record);
	/**
	 * 修改
	 * @param record
	 * @return
	 */
	ResponseData update(SaleRecord record);
	/**
	 * 删除
	 * @param record
	 * @return
	 */
	ResponseData delete(SaleRecord record);
	/**
	 * 
	 * @Title: find   
	 * @Description: 查询单条订单详细
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData find(Integer id);

}
