package com.yh.tradease.finance.service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.finance.entity.OrderBill;

public interface OrderBillService {
	/**
	 * 
	 * @Title: insert   
	 * @Description: 新增
	 * @param: @param bill
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData insert(OrderBill bill);
	/**
	 * 
	 * @Title: update   
	 * @Description: 修改
	 * @param: @param bill
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData update(OrderBill bill);
	/**
	 * 
	 * @Title: delete   
	 * @Description: 删除
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData delete(Integer id);
	/**
	 * 
	 * @Title: findPage   
	 * @Description: 条件分页
	 * @param: @param bill
	 * @param: @param page
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData findPage(OrderBill bill, Pager page);

}
