package com.yh.tradease.sales.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.yh.tradease.common.Constant;
import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.exception.BusinessException;
import com.yh.tradease.sales.dao.OrderDetailMapper;
import com.yh.tradease.sales.dao.WholesaleRecordMapper;
import com.yh.tradease.sales.entity.OrderDetail;
import com.yh.tradease.sales.entity.OrderDetailExample;
import com.yh.tradease.sales.entity.SaleRecord;
import com.yh.tradease.sales.entity.SaleRecordExample;
import com.yh.tradease.sales.entity.WholesaleRecord;
import com.yh.tradease.sales.entity.WholesaleRecordExample;
import com.yh.tradease.sales.entity.WholesaleRecordExample.Criteria;
import com.yh.tradease.sales.service.WholeSaleService;
@Service
@Transactional(readOnly = true)
public class WholeSaleServiceImpl implements WholeSaleService{
	
	@Autowired
	private WholesaleRecordMapper wholesaleRecordMapper;
	
	@Autowired
	private OrderDetailMapper orderDetailMapper;
	
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ResponseData insert(WholesaleRecord record) {
		record.setFlag((byte) 1);
		record.setCdate(new Date());
		int result = wholesaleRecordMapper.insert(record);
		if(CollectionUtils.isEmpty(record.getOrderDetails())){
			throw new BusinessException("请添加订单详细");
		}
		int addnums = 0;
		for(int i=0;i<record.getOrderDetails().size();i++){
			record.getOrderDetails().get(i).setOrderId(record.getId());
			record.getOrderDetails().get(i).setOrderType((byte) 2);
			record.getOrderDetails().get(i).setFlag((byte) 1);
			record.getOrderDetails().get(i).setCdate(new Date());
			addnums+=orderDetailMapper.insert(record.getOrderDetails().get(i));
		}
		if(addnums<record.getOrderDetails().size()){
			throw new BusinessException("订单详细添加失败");
		}
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ResponseData delete(Integer[] ids) {
		int result = 0;
		for(int i=0;i<ids.length;i++){
			WholesaleRecord record = new WholesaleRecord();
			record.setFlag((byte) 2);
			record.setMdate(new Date());
			record.setId(ids[i]);
			result += wholesaleRecordMapper.updateByPrimaryKeySelective(record);
			OrderDetailExample orderExample = new OrderDetailExample();
			orderExample.createCriteria().andOrderIdEqualTo(record.getId()).andFlagEqualTo((byte) 1);
			List<OrderDetail> exists = orderDetailMapper.selectByExample(orderExample);
			if(!CollectionUtils.isEmpty(exists)){
				exists.forEach(item->{
					item.setFlag((byte) 2);
					orderDetailMapper.updateByPrimaryKey(item);
				});
			}
		}	
		if(result==ids.length){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ResponseData update(WholesaleRecord record) {
		record.setMdate(new Date());
		int result = wholesaleRecordMapper.updateByPrimaryKey(record);
		if(CollectionUtils.isEmpty(record.getOrderDetails())){
			throw new BusinessException("订单详细不能为空！");
		}
		OrderDetailExample orderExample = new OrderDetailExample();
		orderExample.createCriteria().andOrderIdEqualTo(record.getId()).andFlagEqualTo((byte) 1).andOrderTypeEqualTo((byte) 2);
		List<OrderDetail> exists = orderDetailMapper.selectByExample(orderExample);
		List<OrderDetail> toDelete = new ArrayList<>();
		List<OrderDetail> toAdd = new ArrayList<>();
		List<OrderDetail> toUpdate = new ArrayList<>();
		for(int i=0;i<record.getOrderDetails().size();i++){
			if(record.getOrderDetails().get(i).getId()==null){
				toAdd.add(record.getOrderDetails().get(i));
			}else{
				for(int j=0;j<exists.size();j++){
					if(record.getOrderDetails().get(i).getId().equals(exists.get(j).getId())){
						record.getOrderDetails().get(i).setMdate(new Date());
						toUpdate.add(record.getOrderDetails().get(i));
						toDelete.add(exists.get(j));
					}
				}
			}
			
		}
		exists.removeAll(toDelete);
		toDelete = exists;
		if(toUpdate.size()>0){
			toUpdate.forEach(item->{
				orderDetailMapper.updateByPrimaryKey(item);
			});
		}
		if(toDelete.size()>0){
			toDelete.forEach(item->{
				item.setFlag((byte) 2);
				orderDetailMapper.updateByPrimaryKey(item);
			});
		}
		if(toAdd.size()>0){
			toAdd.forEach(item->{
				item.setOrderId(record.getId());
				item.setOrderType((byte) 2);
				item.setFlag((byte) 1);
				item.setCdate(new Date());
				orderDetailMapper.insert(item);
			});
		}
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
		Criteria criteria = param.createCriteria();
		if(record.getBuyer()!=null){
			criteria.andBuyerEqualTo(record.getBuyer());
		}
		if(!StringUtils.isEmpty(record.getName())){
			criteria.andNameLike("%"+record.getName()+"%");
		}
		if(record.getOrderTime()!=null){
			criteria.andOrderTimeBetween(record.getOrderTime(),DateUtils.addSeconds(record.getOrderTime(), Constant.LESS_THAN_ONE_DAY_SECONDS));
		}
		if(record.getDeliveryTime()!=null){
			criteria.andDeliveryTimeBetween(record.getDeliveryTime(),DateUtils.addSeconds(record.getDeliveryTime(), Constant.LESS_THAN_ONE_DAY_SECONDS));
		}
		if(record.getOrderStatus()!=null){
			criteria.andOrderStatusEqualTo(record.getOrderStatus());
		}
		if(record.getDeliveryStatus()!=null){
			criteria.andDeliveryStatusEqualTo(record.getDeliveryStatus());
		}
		criteria.andFlagEqualTo((byte) 1);
		long total = wholesaleRecordMapper.countByExample(param);
		page.setTotal((int) total);
		List<WholesaleRecord> result = wholesaleRecordMapper.selectByExample(param);
		page.setDatas(result);
		return new ResponseData(page);
	}

	@Override
	public ResponseData find(Integer id) {
		WholesaleRecord record = wholesaleRecordMapper.selectByPrimaryKey(id);
		OrderDetailExample param = new OrderDetailExample();
		param.createCriteria().andOrderIdEqualTo(id).andFlagEqualTo((byte) 1).andOrderTypeEqualTo((byte) 2);
		List<OrderDetail> orders = orderDetailMapper.selectByExample(param);
		record.setOrderDetails(orders);
		return new ResponseData(record);
	}

}
