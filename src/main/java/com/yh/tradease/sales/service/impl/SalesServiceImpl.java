package com.yh.tradease.sales.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.sales.dao.SaleRecordMapper;
import com.yh.tradease.sales.entity.SaleRecord;
import com.yh.tradease.sales.entity.SaleRecordExample;
import com.yh.tradease.sales.service.SalesService;

@Service
public class SalesServiceImpl implements SalesService{
	
	@Autowired
	private SaleRecordMapper saleRecordMapper;
	@Override
	public ResponseData<SaleRecord> findPage(SaleRecord record,Pager page) {
			 
		SaleRecordExample param = new SaleRecordExample();
		param.setOffset(page.getOffset());
		param.setLimit(page.getLimit());
		List<SaleRecord> result = saleRecordMapper.selectByExample(param);
		Pager<SaleRecord> resultPage = new Pager<SaleRecord>();
		resultPage.setDatas(result);
		return new ResponseData(resultPage);
	}
	@Override
	public ResponseData insert(SaleRecord record) {
		record.setFlag((byte) 1);
		int result = saleRecordMapper.insert(record);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}
	@Override
	public ResponseData update(SaleRecord record) {
		record.setFlag((byte) 1);
		int result = saleRecordMapper.updateByPrimaryKey(record);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}
	@Override
	public ResponseData delete(SaleRecord record) {
		record.setFlag((byte) 2);
		int result = saleRecordMapper.updateByPrimaryKeySelective(record);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

}
