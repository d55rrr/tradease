package com.yh.tradease.finance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.finance.entity.OrderBill;
import com.yh.tradease.finance.service.OrderBillService;

@Controller
@RequestMapping("/orderBill")
public class OrderBillController {
	
	@Autowired
	private OrderBillService orderBillService;
	
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
	public ResponseData findPage(OrderBill bill,Pager page){
		
		return orderBillService.findPage(bill,page);
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
	public ResponseData insert(OrderBill bill){
		
		return orderBillService.insert(bill);
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
	public ResponseData update(OrderBill bill){
		
		return orderBillService.update(bill);
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
		
		return orderBillService.delete(id);
	}
}
