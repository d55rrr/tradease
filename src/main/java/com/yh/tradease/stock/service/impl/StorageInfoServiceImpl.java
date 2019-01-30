package com.yh.tradease.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.stock.dao.StorageInfoMapper;
import com.yh.tradease.stock.entity.InStock;
import com.yh.tradease.stock.entity.InStockExample;
import com.yh.tradease.stock.entity.StorageInfo;
import com.yh.tradease.stock.entity.StorageInfoExample;
import com.yh.tradease.stock.service.StorageInfoService;
/**
 * 
 * @ClassName:  StorageInfoServiceImpl   
 * @Description:库存信息维护实现类
 * @author: 郑涛
 * @date:   2018年12月23日 下午9:40:31   
 *     
 * @Copyright: 2018 tradease. All rights reserved. 
 *
 */
@Service
public class StorageInfoServiceImpl implements StorageInfoService{
	
	@Autowired
	private StorageInfoMapper storageInfoMapper;

	@Override
	public ResponseData insert(StorageInfo stock) {
		stock.setCdate(new Date());
		stock.setFlag((byte)1);
		int result =  storageInfoMapper.insert(stock);
		if(result> 0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData update(StorageInfo stock) {
		stock.setMdate(new Date());
		int result =  storageInfoMapper.updateByPrimaryKey(stock);
		if(result> 0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData delete(Integer id) {
		StorageInfo param = new StorageInfo();
		param.setId(id);
		param.setFlag((byte)2);
		int result =  storageInfoMapper.updateByPrimaryKeySelective(param);
		if(result> 0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData findPage(StorageInfo stock, Pager page) {
		StorageInfoExample param = new StorageInfoExample();
		param.setOffset(page.getOffset());
		param.setLimit(page.getLimit());
		List<StorageInfo> result = storageInfoMapper.selectByExample(param);
		Pager<StorageInfo> resultPage = new Pager<>();
		resultPage.setDatas(result);
		return new ResponseData(resultPage);
	}

}
