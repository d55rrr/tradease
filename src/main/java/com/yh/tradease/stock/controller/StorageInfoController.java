package com.yh.tradease.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.stock.entity.StorageInfo;
import com.yh.tradease.stock.service.StorageInfoService;
/**
 * 
 * @ClassName:  StorageInfoController   
 * @Description:库存信息
 * @author: 郑涛
 * @date:   2018年12月23日 下午9:35:16   
 *     
 * @Copyright: 2018 tradease. All rights reserved. 
 *
 */
@Controller
@RequestMapping("/storage")
public class StorageInfoController {
	
	@Autowired
	private StorageInfoService storageInfoService;
	

	/**
	 * 
	 * @Title: insert   
	 * @Description: 新增库存
	 * @param: @param stock
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/insert")
	public ResponseData insert(StorageInfo stock){
		
		return storageInfoService.insert(stock);
	}
	
	/**
	 * 
	 * @Title: update   
	 * @Description: 修改库存
	 * @param: @param stock
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/update")
	public ResponseData update(StorageInfo stock){
		
		return storageInfoService.update(stock);
	}
	
	/**
	 * 
	 * @Title: delete   
	 * @Description: 删除库存
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public ResponseData delete(Integer id){
		
		return storageInfoService.delete(id);
	}
	
	/**
	 * 
	 * @Title: findPage   
	 * @Description: 库存分页列表
	 * @param: @param page
	 * @param: @param stock
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	@ResponseBody
	@RequestMapping("/page")
	public ResponseData findPage(Pager page,StorageInfo stock){
	
		return storageInfoService.findPage(stock,page);
	}
}
