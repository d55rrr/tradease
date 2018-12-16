package com.yh.tradease.serve.service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.serve.entity.ProductInstall;
/**
 * 产品安装service
 * @author Majestage
 *
 */
public interface ProductInstallService {
	/**
	 * 新增
	 * @param product
	 * @return
	 */
	ResponseData insert(ProductInstall product);
	/**
	 * 修改
	 * @param product
	 * @return
	 */
	ResponseData update(ProductInstall product);
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	ResponseData delete(Integer id);
	/**
	 * 分页+条件查询
	 * @param product
	 * @return
	 */
	ResponseData findPage(ProductInstall product,Pager page);

}
