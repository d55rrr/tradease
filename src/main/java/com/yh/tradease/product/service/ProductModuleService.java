package com.yh.tradease.product.service;

import com.yh.tradease.common.ResponseData;
import com.yh.tradease.product.entity.ProductModule;

public interface ProductModuleService {
	/**
	 * 
	 * @Title: insert   
	 * @Description: 新增
	 * @param: @param product
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData insert(ProductModule product);
	/**
	 * 
	 * @Title: update   
	 * @Description: 修改
	 * @param: @param product
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData update(ProductModule product);
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
	 * @Title: findTree   
	 * @Description: 查询树
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData findTree(Integer id);

}
