package com.yh.tradease.sales.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.sales.dao.WholesaleRecordMapper;
import com.yh.tradease.sales.entity.SaleRecord;
import com.yh.tradease.sales.entity.SaleRecordExample;
import com.yh.tradease.sales.entity.WholesaleRecord;
import com.yh.tradease.sales.entity.WholesaleRecordExample;
import com.yh.tradease.sales.service.WholeSaleService;
@Service
public class WholeSaleServiceImpl implements WholeSaleService{
	
	@Autowired
	private WholesaleRecordMapper wholesaleRecordMapper;
	
	@Override
	public ResponseData insert(WholesaleRecord record) {
		record.setFlag((byte) 1);
		record.setCdate(new Date());
		int result = wholesaleRecordMapper.insert(record);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData delete(Integer id) {
		
		int result = wholesaleRecordMapper.deleteByPrimaryKey(id);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData update(WholesaleRecord record) {
		record.setMdate(new Date());
		int result = wholesaleRecordMapper.updateByPrimaryKey(record);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData findPage(WholesaleRecord record, Pager page) {
		WholesaleRecordExample param = new WholesaleRecordExample();
		param.setOffset(page.getOffset());
		param.setLimit(page.getLimit());
		List<WholesaleRecord> result = wholesaleRecordMapper.selectByExample(param);
		Pager<WholesaleRecord> resultPage = new Pager<WholesaleRecord>();
		resultPage.setDatas(result);
		return new ResponseData(resultPage);
	}

}
