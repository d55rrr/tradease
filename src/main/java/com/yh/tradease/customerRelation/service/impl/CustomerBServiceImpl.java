package com.yh.tradease.customerRelation.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.customerRelation.dao.CustomerBMapper;
import com.yh.tradease.customerRelation.dao.CustomerbContactsMapper;
import com.yh.tradease.customerRelation.entity.CustomerB;
import com.yh.tradease.customerRelation.entity.CustomerBExample;
import com.yh.tradease.customerRelation.entity.CustomerBExample.Criteria;
import com.yh.tradease.customerRelation.entity.CustomerbContacts;
import com.yh.tradease.customerRelation.entity.CustomerbContactsExample;
import com.yh.tradease.customerRelation.service.CustomerBService;
import com.yh.tradease.exception.BusinessException;
@Service
@Transactional(readOnly = true)
public class CustomerBServiceImpl implements CustomerBService{
	
	@Autowired
	private CustomerBMapper customerBMapper;
	
	@Autowired
	private CustomerbContactsMapper customerbContactsMapper;
	
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ResponseData insert(CustomerB customerB) {
		customerB.setFlag((byte) 1);
		customerB.setCdate(new Date());
		int result = customerBMapper.insert(customerB);
		if(result>0){
			if(!CollectionUtils.isEmpty(customerB.getContacts())){
				int subnum = 0;
				for(CustomerbContacts item :customerB.getContacts()){
					item.setFlag((byte) 1);
					item.setCdate(new Date());
					item.setCustomerId(customerB.getId());
					subnum+=customerbContactsMapper.insert(item);
				}
				if(subnum<customerB.getContacts().size()){
					throw new BusinessException("客户联系人添加失败！");
				}
			}
		}
		
		return ResponseData.success();
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ResponseData update(CustomerB customerB) {
		customerB.setMdate(new Date());
		int result = customerBMapper.updateByPrimaryKey(customerB);
		CustomerbContactsExample param = new CustomerbContactsExample();
		param.createCriteria().andFlagEqualTo((byte) 1).andCustomerIdEqualTo(customerB.getId());
		List<CustomerbContacts> exists = customerbContactsMapper.selectByExample(param);
		List<CustomerbContacts> toAdd = new ArrayList<>();
		List<CustomerbContacts> toDelete = new ArrayList<>();
		List<CustomerbContacts> toUpdate = new ArrayList<>();
		if(!CollectionUtils.isEmpty(customerB.getContacts())){
			for(CustomerbContacts item:customerB.getContacts()){
				if(item.getId()==null){
					toAdd.add(item);
				}
				if(!CollectionUtils.isEmpty(exists)){
					for(CustomerbContacts exist:exists){
						if(item.getId().equals(exist.getId())){
							toUpdate.add(item);
							toDelete.add(item);
						}
					}
				}
			}
			
		}
		if(toAdd.size()>0){
			toAdd.forEach(item->{
				item.setCdate(new Date());
				item.setFlag((byte) 1);
				customerbContactsMapper.insert(item);
			});
		}
		exists.removeAll(toDelete);
		toDelete = exists;
		if(toDelete.size()>0){
			toDelete.forEach(item->{
				item.setMdate(new Date());
				item.setFlag((byte) 2);
				customerbContactsMapper.updateByPrimaryKey(item);
			});
		}
		if(toUpdate.size()>0){
			toUpdate.forEach(item->{
				item.setMdate(new Date());
				customerbContactsMapper.updateByPrimaryKey(item);
			});
		}
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData page(Pager page, CustomerB customerB) {
		CustomerBExample param = new CustomerBExample();
		param.setLimit(page.getLimit());
		param.setOffset(page.getOffset());
		Criteria criteria = param.createCriteria();
		criteria.andFlagEqualTo((byte) 1);
		if(!StringUtils.isEmpty(customerB.getName())){
			criteria.andNameLike("%"+customerB.getName()+"%");
		}
		if(customerB.getLevel()!=null){
			criteria.andLevelEqualTo(customerB.getLevel());
		}
		if(!StringUtils.isEmpty(customerB.getRepresentative())){
			criteria.andRepresentativeLike("%"+customerB.getRepresentative()+"%");
		}
		long count = customerBMapper.countByExample(param);
		page.setTotal((int) count);
		List<CustomerB> results = customerBMapper.selectByExample(param);
		page.setDatas(results);
		return new ResponseData(page);
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public ResponseData delete(Integer[] ids) {
		for(Integer id:ids){
			CustomerB cparam = new CustomerB();
			cparam.setId(id);
			cparam.setMdate(new Date());
			cparam.setFlag((byte) 2);
			int result = customerBMapper.updateByPrimaryKeySelective(cparam);
			if(result>0){
				CustomerbContactsExample param = new CustomerbContactsExample();
				param.createCriteria().andFlagEqualTo((byte) 1).andCustomerIdEqualTo(id);
				List<CustomerbContacts> contacts = customerbContactsMapper.selectByExample(param);
				for(CustomerbContacts item:contacts){
					item.setFlag((byte) 2);
					item.setMdate(new Date());
					customerbContactsMapper.updateByPrimaryKey(item);
				}
			}else{
				throw new BusinessException("删除失败");
			}
			if(result<1){
				throw new BusinessException("删除失败");
			}
		}
		return ResponseData.success();
		
	}

	@Override
	public ResponseData find(Integer id) {
		CustomerB customer = customerBMapper.selectByPrimaryKey(id);
		CustomerbContactsExample param = new CustomerbContactsExample();
		param.createCriteria().andFlagEqualTo((byte) 1).andCustomerIdEqualTo(id);
		List<CustomerbContacts> contacts = customerbContactsMapper.selectByExample(param);
		customer.setContacts(contacts);
		return new ResponseData(customer);
	}

	@Override
	public ResponseData list(CustomerB customerB) {
		CustomerBExample param = new CustomerBExample();
		param.createCriteria().andFlagEqualTo((byte) 1);
		List<CustomerB> results = customerBMapper.selectByExample(param);
		return new ResponseData(results);
	}

}
