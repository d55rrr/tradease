package com.yh.tradease.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.product.entity.ProductModule;
import com.yh.tradease.product.service.ProductModuleService;
/**
 * 
 * @ClassName:  ProductModuleController   
 * @Description:产品模块管理
 * @author: 郑涛
 * @date:   2018年12月24日 上午12:41:46   
 *     
 * @Copyright: 2018 tradease. All rights reserved. 
 *
 */
@Controller
@RequestMapping("/productModule")
public class ProductModuleController {
	
	@Autowired
	private ProductModuleService  productModuleService;
	
	/**
	 * 
	 * @Title: insert   
	 * @Description: 新增
	 * @param: @param record
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public ResponseData insert(ProductModule product){
		
		return productModuleService.insert(product);
	}
	/**
	 * 
	 * @Title: update   
	 * @Description: 修改
	 * @param: @param record
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@RequestMapping("/update")
	@ResponseBody
	public ResponseData update(ProductModule product){
		
		return productModuleService.update(product);
	}
	
	/**
	 * 
	 * @Title: delete   
	 * @Description: 删除
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseData delete(Integer id){
		
		return productModuleService.delete(id);
	}
	/**
	 * 
	 * @Title: findTree   
	 * @Description: 查询产品树，id为时查询全部
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@RequestMapping("/tree")
	@ResponseBody
	public ResponseData findTree(Integer id){
		
		return productModuleService.findTree(id);
	}
}
