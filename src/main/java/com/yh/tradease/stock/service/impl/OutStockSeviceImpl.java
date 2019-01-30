package com.yh.tradease.stock.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.stock.dao.OutStockMapper;
import com.yh.tradease.stock.entity.OutStock;
import com.yh.tradease.stock.entity.OutStockExample;
import com.yh.tradease.stock.service.OutStockSevice;
@Service
public class OutStockSeviceImpl implements OutStockSevice{
	
	@Autowired
	private OutStockMapper outStockMapper;

	@Override
	public ResponseData insert(OutStock stock) {
		stock.setCdate(new Date());
		stock.setFlag((byte)1);
		int result = outStockMapper.insert(stock);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData update(OutStock stock) {
		stock.setMdate(new Date());
		stock.setFlag((byte)1);
		int result = outStockMapper.updateByPrimaryKey(stock);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData delete(Integer id) {
		OutStock stock = new OutStock();
		stock.setMdate(new Date());
		stock.setFlag((byte) 2);
		stock.setId(id);
		int result = outStockMapper.updateByPrimaryKeySelective(stock);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData findPage(OutStock stock, Pager page) {
		OutStockExample param = new OutStockExample();
		param.setOffset(page.getOffset());
		param.setLimit(page.getLimit());
		List<OutStock> result = outStockMapper.selectByExample(param);
		Pager<OutStock> resultPage = new Pager<>();
		resultPage.setDatas(result);
		return new ResponseData(resultPage);
	}

}
