package com.yh.tradease.system.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.sales.entity.SaleRecord;
import com.yh.tradease.system.dao.SysDicMapper;
import com.yh.tradease.system.entity.SysDic;
import com.yh.tradease.system.entity.SysDicExample;
import com.yh.tradease.system.entity.SysDicExample.Criteria;
import com.yh.tradease.system.service.SysDicService;
@Service
public class SysDicServiceImpl implements SysDicService{
	
	@Autowired
	private SysDicMapper sysDicMapper;
	@Override
	public ResponseData<SysDic> insert(SysDic sysDic) {
		sysDic.setCdate(new Date());
		sysDic.setFlag((byte) 1);
		int result = sysDicMapper.insert(sysDic);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData<SysDic> find(Integer id) {
		SysDic result = sysDicMapper.selectByPrimaryKey(id);
		return new ResponseData(result);
		
	}

	@Override
	public ResponseData<SysDic> update(SysDic sysDic) {
		sysDic.setMdate(new Date());
		int result = sysDicMapper.updateByPrimaryKeySelective(sysDic);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData<SysDic> delete(Integer id) {
		SysDic param = new SysDic();
		param.setId(id);
		param.setFlag((byte) 2);
		int result = sysDicMapper.updateByPrimaryKeySelective(param);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData<SysDic> page(Pager page, SysDic dic) {
		SysDicExample param = new SysDicExample();
		param.createCriteria().andFlagEqualTo((byte) 1);
		long count = sysDicMapper.countByExample(param);
		page.setTotal((int) count);
		param.setLimit(page.getLimit());
		param.setOffset(page.getOffset());
		List<SysDic> result = sysDicMapper.selectByExample(param);
		page.setDatas(result);
		return new ResponseData(page);
	}

	@Override
	public ResponseData<SysDic> findModule(String businessModule) {
		if(StringUtils.isEmpty(businessModule)){
			List<String> result = sysDicMapper.selectBusinessNames();
			return new ResponseData(result);
			
		}else{
			List<String> result = sysDicMapper.selectSubjectNames(businessModule);
			return new ResponseData(result);
		}
	}

	@Override
	public ResponseData<SysDic> findList(String businessName, String subjectName) {
		SysDicExample param = new SysDicExample();
		param.createCriteria().andBusinessModuleEqualTo(businessName).andSubjectModuleEqualTo(subjectName).andFlagEqualTo((byte) 1);
		List<SysDic> result =  sysDicMapper.selectByExample(param);
		return new ResponseData(result);
	}

}
