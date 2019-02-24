package com.yh.tradease.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.system.entity.SysDic;
import com.yh.tradease.system.service.SysDicService;

/**
 * 
 * @ClassName:  SysDicController   
 * @Description:TODO(字典信息管理)   
 * @author: 郑涛
 * @date:   2019年2月2日 上午9:24:42   
 *     
 * @Copyright: 2019 tradease. All rights reserved.
 */
@Controller
@RequestMapping("/sysdic")
public class SysDicController {
	
	@Autowired
	private SysDicService sysDicService;
	
	@RequestMapping("/insert")
	@ResponseBody
	public ResponseData<SysDic> insert(SysDic sysDic){
		
		return sysDicService.insert(sysDic);
	}
	/**
	 * 
	 * @Title: find   
	 * @Description: TODO(查询单个字典对象)   
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData<SysMenu>      
	 * @throws
	 */
	@RequestMapping("/find")
	@ResponseBody
	public ResponseData<SysDic> find(Integer id){
		
		return sysDicService.find(id);
	}
	/**
	 * 
	 * @Title: update   
	 * @Description: TODO(修改)   
	 * @param: @param sysDic
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	@RequestMapping("/update")
	@ResponseBody
	public ResponseData<SysDic> update(SysDic sysDic){
		
		return sysDicService.update(sysDic);
	}
	/**
	 * 
	 * @Title: delete   
	 * @Description: TODO(删除)   
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseData<SysDic> delete(Integer id){
		
		return sysDicService.delete(id);
	}
	/**
	 * 
	 * @Title: page   
	 * @Description: TODO(分页条件查询)   
	 * @param: @param page
	 * @param: @param dic
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	@RequestMapping("/page")
	@ResponseBody
	public ResponseData<SysDic> page(Pager page,SysDic dic){
		
		return sysDicService.page(page,dic);
	}
	/**
	 * 
	 * @Title: findModule   
	 * @Description: TODO(字典类型列表查询，无参数查询businessName列表，有参数查询subjectName列表)   
	 * @param: @param businessName
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	@RequestMapping("/typeList")
	@ResponseBody
	public ResponseData<SysDic> findModule(String businessModule){
		
		return sysDicService.findModule(businessModule);
	}
	/**
	 * 
	 * @Title: findList   
	 * @Description: TODO(查询字典信息)   
	 * @param: @param businessName
	 * @param: @param subjectName
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	@RequestMapping("/dicList")
	@ResponseBody
	public ResponseData<SysDic> findList(String businessModule,String subjectModule){
		
		return sysDicService.findList(businessModule,subjectModule);
	};
	
	
}
