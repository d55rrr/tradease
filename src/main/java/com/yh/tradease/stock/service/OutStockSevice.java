package com.yh.tradease.stock.service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.stock.entity.OutStock;

public interface OutStockSevice {
	/**
	 * 新增
	 * @param stock
	 * @return
	 */
	ResponseData insert(OutStock stock);
	/**
	 * 修改
	 * @param stock
	 * @return
	 */
	ResponseData update(OutStock stock);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	ResponseData delete(Integer id);
	/**
	 * 分页条件查询
	 * @param stock
	 * @param page
	 * @return
	 */
	ResponseData findPage(OutStock stock, Pager page);

}
