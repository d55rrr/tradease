package com.yh.tradease.system.service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.system.entity.SysDic;
/**
 * 
 * @ClassName:  SysDicService   
 * @Description:TODO(字典管理业务层)   
 * @author: 郑涛
 * @date:   2019年2月2日 上午9:29:11   
 *     
 * @Copyright: 2019 tradease. All rights reserved.
 */
public interface SysDicService {
	/**
	 * 
	 * @Title: insert   
	 * @Description: TODO(增)   
	 * @param: @param sysDic
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	ResponseData<SysDic> insert(SysDic sysDic);
	/**
	 * 
	 * @Title: find   
	 * @Description: TODO(查对象)   
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	ResponseData<SysDic> find(Integer id);
	/**
	 * 
	 * @Title: update   
	 * @Description: TODO(修改)   
	 * @param: @param sysDic
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	ResponseData<SysDic> update(SysDic sysDic);
	/**
	 * 
	 * @Title: delete   
	 * @Description: TODO(删除)   
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	ResponseData<SysDic> delete(Integer id);
	/**
	 * 
	 * @Title: page   
	 * @Description: TODO(分页查询)   
	 * @param: @param page
	 * @param: @param dic
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	ResponseData<SysDic> page(Pager page, SysDic dic);
	/**
	 * 
	 * @Title: findModule   
	 * @Description: TODO(字典类型列表查询，无参数查询businessName列表，有参数查询subjectName列表)   
	 * @param: @param businessName
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	ResponseData<SysDic> findModule(String businessName);
	/**
	 * 
	 * @Title: findList   
	 * @Description: TODO(根据模块名和业务名查询字典数据)   
	 * @param: @param businessName
	 * @param: @param subjectName
	 * @param: @return      
	 * @return: ResponseData<SysDic>      
	 * @throws
	 */
	ResponseData<SysDic> findList(String businessName, String subjectName);

}
