package com.yh.tradease.sales.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.sales.entity.SaleRecord;
import com.yh.tradease.sales.service.SalesService;
/**
 * 零售模块
 * @author Majestage
 *
 */
@Controller
@RequestMapping("/sales")
public class SalesController {
	
	@Autowired
	private SalesService salesService;
	/**
	 * 分页查询
	 * @param record
	 * @param page
	 * @return
	 */
	@RequestMapping("/page")
	@ResponseBody
	public ResponseData findPage(SaleRecord record,Pager page){
		
		return salesService.findPage(record,page);
	}
	/**
	 * 新增
	 * @param record
	 * @return
	 */
	@RequestMapping("/insert")
	@ResponseBody
	public ResponseData insert(@RequestBody SaleRecord record){
		
		return salesService.insert(record);
	}
	/**
	 * 修改
	 * @param record
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public ResponseData update(@RequestBody SaleRecord record){
		
		return salesService.update(record);
	}
	
	/**
	 * 删除
	 * @param record
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseData delete(Integer[] ids){
		
		return salesService.delete(ids);
	}
	/**
	 * 
	 * @Title: find   
	 * @Description: 查询单条销售信息   
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@RequestMapping("/find")
	@ResponseBody
	public ResponseData find(Integer id){
		
		return salesService.find(id);
	}
	
	
	

}
