package com.yh.tradease.serve.service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.serve.entity.ProductRepair;

public interface ProductRepairService {
	/**
	 * 新增
	 * @param product
	 * @return
	 */
	ResponseData insert(ProductRepair product);
	/**
	 * 修改
	 * @param product
	 * @return
	 */
	ResponseData update(ProductRepair product);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	ResponseData delete(Integer id);
	/**
	 * 列表分页
	 * @param product
	 * @param page
	 * @return
	 */
	ResponseData findPage(ProductRepair product, Pager page);

}
