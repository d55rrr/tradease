package com.yh.tradease.product.service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.product.entity.Product;
/**
 * 
 * @ClassName:  ProductService   
 * @Description:产品管理业务层
 * @author: 郑涛
 * @date:   2018年12月23日 下午11:18:48   
 *     
 * @Copyright: 2018 tradease. All rights reserved. 
 *
 */
public interface ProductService {

	ResponseData findPage(Product product, Pager page);

	ResponseData insert(Product product);

	ResponseData update(Product product);

	ResponseData delete(Integer id);
	/**
	 * 
	 * @Title: list   
	 * @Description: 查询产品列表   
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData list(Product product);

}
