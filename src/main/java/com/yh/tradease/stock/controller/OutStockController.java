package com.yh.tradease.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.stock.entity.OutStock;
import com.yh.tradease.stock.service.OutStockSevice;
/**
 * 
 * @author Majestage
 *
 */
@Controller
@RequestMapping("/OutStock")
public class OutStockController {
	
	@Autowired
	private OutStockSevice outStockService;
	

	/**
	 * 新增
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/insert")
	public ResponseData insert(OutStock stock){
		
		return outStockService.insert(stock);
	}
	
	/**
	 * 修改
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/update")
	public ResponseData update(OutStock stock){
		
		return outStockService.update(stock);
	}
	
	/**
	 * 删除
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public ResponseData delete(Integer id){
		
		return outStockService.delete(id);
	}
	
	/**
	 * 新增
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/page")
	public ResponseData findPage(Pager page,OutStock stock){
	
		return outStockService.findPage(stock,page);
	}

}
