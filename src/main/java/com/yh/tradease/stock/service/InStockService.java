package com.yh.tradease.stock.service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.stock.entity.InStock;

public interface InStockService {
	/**
	 * 新增
	 * @param stock
	 * @return
	 */
	ResponseData insert(InStock stock);
	/**
	 * 修改
	 * @param stock
	 * @return
	 */
	ResponseData update(InStock stock);
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
	ResponseData findPage(InStock stock, Pager page);

}
