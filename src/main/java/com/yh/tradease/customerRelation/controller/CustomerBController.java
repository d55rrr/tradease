package com.yh.tradease.customerRelation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.customerRelation.entity.CustomerB;
import com.yh.tradease.customerRelation.service.CustomerBService;
/**
 * 
 * @ClassName:  CustomerBController   
 * @Description:企业客户管理
 * @author: 郑涛
 * @date:   2019年2月3日 下午11:36:16   
 *     
 * @Copyright: 2019 tradease. All rights reserved.
 */
@RequestMapping("/customerb")
@Controller
public class CustomerBController {
	
	@Autowired
	private CustomerBService customerBService;
	/**
	 * 
	 * @Title: insert   
	 * @Description: 
	 * @param: @param customerB
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/insert")
	public ResponseData insert(@RequestBody CustomerB customerB){
		
		return customerBService.insert(customerB);
	}
	/**
	 * 
	 * @Title: update   
	 * @Description: 修改 
	 * @param: @param customerB
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/update")
	public ResponseData update(@RequestBody CustomerB customerB){
		
		return customerBService.update(customerB);
	}
	/**
	 * 
	 * @Title: find   
	 * @Description: 查询客户对象信息
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/find")
	public ResponseData find(Integer id){
		
		return customerBService.find(id);
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
	@ResponseBody
	@RequestMapping("/delete")
	public ResponseData delete(Integer[] ids){
		
		return customerBService.delete(ids);
	}
	/**
	 * 
	 * @Title: page   
	 * @Description: 分页条件查询客户信息列表 
	 * @param: @param page
	 * @param: @param customerB
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/page")
	public ResponseData page(Pager page,CustomerB customerB){
		
		return customerBService.page(page,customerB);

	}
	/**
	 * 
	 * @Title: page   
	 * @Description: 查询列表  
	 * @param: @param customerB
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/list")
	public ResponseData page(CustomerB customerB){
		
		return customerBService.list(customerB);

	}

}
