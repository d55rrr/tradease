package com.yh.tradease.sales.service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.sales.entity.WholesaleRecord;

public interface WholeSaleService {
	/**
	 * 新增
	 * @param record
	 * @return
	 */
	ResponseData insert(WholesaleRecord record);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	ResponseData delete(Integer id);
	/**
	 * 更新
	 * @param record
	 * @return
	 */
	ResponseData update(WholesaleRecord record);
	/**
	 * 分页查询
	 * @param record
	 * @param page
	 * @return
	 */
	ResponseData findPage(WholesaleRecord record, Pager page);

}
