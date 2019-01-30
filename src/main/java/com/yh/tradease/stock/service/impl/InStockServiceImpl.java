package com.yh.tradease.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.stock.dao.InStockMapper;
import com.yh.tradease.stock.entity.InStock;
import com.yh.tradease.stock.entity.InStockExample;
import com.yh.tradease.stock.service.InStockService;

@Service
public class InStockServiceImpl implements InStockService{
	
	@Autowired
	private InStockMapper inStockMapper;

	@Override
	public ResponseData insert(InStock stock) {
		stock.setCdate(new Date());
		stock.setFlag((byte)1);
		int result = inStockMapper.insert(stock);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData update(InStock stock) {
		stock.setMdate(new Date());
		stock.setFlag((byte)1);
		int result = inStockMapper.updateByPrimaryKey(stock);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData delete(Integer id) {
		int result = inStockMapper.deleteByPrimaryKey(id);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData findPage(InStock stock, Pager page) {
		InStockExample param = new InStockExample();
		param.setOffset(page.getOffset());
		param.setLimit(page.getLimit());
		List<InStock> result = inStockMapper.selectByExample(param);
		Pager<InStock> resultPage = new Pager<>();
		resultPage.setDatas(result);
		return new ResponseData(resultPage);
	}

}
