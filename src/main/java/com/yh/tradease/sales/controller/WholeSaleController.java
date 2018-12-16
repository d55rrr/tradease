package com.yh.tradease.sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.sales.entity.WholesaleRecord;
import com.yh.tradease.sales.service.WholeSaleService;

/**
 * 批发模块
 * @author Majestage
 *
 */
@Controller
@RequestMapping("/wholesales")
public class WholeSaleController {
	
	@Autowired
	private WholeSaleService wholeSalesService;
	/**
	 * 新增
	 * @param record
	 * @return
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public ResponseData insert(WholesaleRecord record){
		
		return wholeSalesService.insert(record);
	}
	/**
	 * 删除
	 * @param id
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseData delete(Integer id){
		
		return wholeSalesService.delete(id);
	}
	
	/**
	 * 修改
	 * @param record
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public ResponseData update(WholesaleRecord record){
		
		return wholeSalesService.update(record);
	}
	
	/**
	 * 分页列表
	 * @param record
	 * @return
	 */
	@RequestMapping("/page")
	@ResponseBody
	public ResponseData findPage(WholesaleRecord record,Pager page){
		
		return wholeSalesService.findPage(record,page);
	}
	
	
	
	
}
