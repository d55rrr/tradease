package com.yh.tradease.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.stock.entity.InStock;
import com.yh.tradease.stock.service.InStockService;

/**
 * 
 * @author Majestage
 *
 */
@Controller
@RequestMapping("/inStock")
public class InStockController {
	
	@Autowired
	private InStockService inStockService;
	
	/**
	 * 新增
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/insert")
	public ResponseData insert(@RequestBody InStock stock){
		
		return inStockService.insert(stock);
	}
	
	/**
	 * 修改
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/update")
	public ResponseData update(@RequestBody InStock stock){
		
		return inStockService.update(stock);
	}
	
	/**
	 * 删除
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public ResponseData delete(Integer id){
		
		return inStockService.delete(id);
	}
	
	/**
	 * 新增
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/page")
	public ResponseData findPage(Pager page,InStock stock){
		
		return inStockService.findPage(stock,page);
	}
	/**
	 * 
	 * @Title: find   
	 * @Description: 查询单个对象
	 * @param: @param stock
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/find")
	public ResponseData find(Integer id){
		
		return inStockService.find(id);
	}

}
