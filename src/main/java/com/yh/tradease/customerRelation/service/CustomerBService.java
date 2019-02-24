package com.yh.tradease.customerRelation.service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.customerRelation.entity.CustomerB;

public interface CustomerBService {
	/**
	 * 
	 * @Title: insert   
	 * @Description: 新增
	 * @param: @param customerB
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData insert(CustomerB customerB);
	/**
	 * 
	 * @Title: update   
	 * @Description: 修改  
	 * @param: @param customerB
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData update(CustomerB customerB);
	/**
	 * 
	 * @Title: page   
	 * @Description: 分页条件查询
	 * @param: @param page
	 * @param: @param customerB
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData page(Pager page, CustomerB customerB);
	/**
	 * 
	 * @Title: delete   
	 * @Description: 删除 
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData delete(Integer[] ids);
	/**
	 * 
	 * @Title: find   
	 * @Description: 查询对象   
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData find(Integer id);
	/**
	 * 
	 * @Title: list   
	 * @Description: 查询列表
	 * @param: @param customerB
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData list(CustomerB customerB);

}
