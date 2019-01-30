package com.yh.tradease.finance.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.finance.dao.OrderBillMapper;
import com.yh.tradease.finance.entity.OrderBill;
import com.yh.tradease.finance.entity.OrderBillExample;
import com.yh.tradease.finance.service.OrderBillService;


@Service
public class OrderBillServiceImpl implements OrderBillService{
	
	@Autowired
	private OrderBillMapper orderBillMapper;

	@Override
	public ResponseData insert(OrderBill bill) {
		bill.setCdate(new Date());
		bill.setFlag((byte)1);
		int result = orderBillMapper.insert(bill);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData update(OrderBill bill) {
		bill.setMdate(new Date());
		int result = orderBillMapper.updateByPrimaryKey(bill);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData delete(Integer id) {
		OrderBill param = new OrderBill();
		param.setId(id);
		param.setMdate(new Date());
		param.setFlag((byte)2);
		int result = orderBillMapper.deleteByPrimaryKey(id);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData findPage(OrderBill bill, Pager page) {
		OrderBillExample param = new OrderBillExample();
		param.setOffset(page.getOffset());
		param.setLimit(page.getLimit());
		List<OrderBill> result = orderBillMapper.selectByExample(param);
		Pager<OrderBill> resultPage = new Pager<OrderBill>();
		resultPage.setDatas(result);
		return new ResponseData(resultPage);
	}

}
