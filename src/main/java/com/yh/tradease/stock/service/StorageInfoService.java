package com.yh.tradease.stock.service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.stock.entity.StorageInfo;
/**
 * 
 * @ClassName:  StorageInfoService   
 * @Description:库存信息业务层
 * @author: 郑涛
 * @date:   2018年12月23日 下午9:39:08   
 *     
 * @Copyright: 2018 tradease. All rights reserved. 
 *
 */
public interface StorageInfoService {
	/**
	 * 
	 * @Title: insert   
	 * @Description: 新增
	 * @param: @param stock
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData insert(StorageInfo stock);
	/**
	 * 
	 * @Title: update   
	 * @Description: 修改
	 * @param: @param stock
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData update(StorageInfo stock);
	/**
	 * 
	 * @Title: delete   
	 * @Description: 删除
	 * @param: @param id
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData delete(Integer id);
	/**
	 * 
	 * @Title: findPage   
	 * @Description: 分页查询
	 * @param: @param stock
	 * @param: @param page
	 * @param: @return      
	 * @return: ResponseData      
	 * @throws
	 */
	ResponseData findPage(StorageInfo stock, Pager page);

}
