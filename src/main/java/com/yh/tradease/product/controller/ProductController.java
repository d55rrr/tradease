package com.yh.tradease.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.product.entity.Product;
import com.yh.tradease.product.service.ProductService;

/**
 * 
 * @ClassName:  ProductController   
 * @Description:产品管理模块 
 * @author: 郑涛
 * @date:   2018年12月23日 下午11:12:46   
 *     
 * @Copyright: 2018 tradease. All rights reserved. 
 *
 */
@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	/**
	 * 
	 * @Title: findPage   
	 * @Description: 分页条件查询
	 * @param: @param record
	 * @param: @param page
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@RequestMapping("/page")
	@ResponseBody
	public ResponseData findPage(Product product,Pager page){
		
		return productService.findPage(product,page);
	}
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
	public ResponseData insert(Product product){
		
		return productService.insert(product);
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
	public ResponseData update(Product product){
		
		return productService.update(product);
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
		
		return productService.delete(id);
	}
	
}
