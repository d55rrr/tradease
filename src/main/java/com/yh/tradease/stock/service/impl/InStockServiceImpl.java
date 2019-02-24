package com.yh.tradease.stock.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.exception.BusinessException;
import com.yh.tradease.stock.dao.InStockDetailMapper;
import com.yh.tradease.stock.dao.InStockMapper;
import com.yh.tradease.stock.entity.InStock;
import com.yh.tradease.stock.entity.InStockDetail;
import com.yh.tradease.stock.entity.InStockDetailExample;
import com.yh.tradease.stock.entity.InStockExample;
import com.yh.tradease.stock.service.InStockService;

@Service
public class InStockServiceImpl implements InStockService{
	
	@Autowired
	private InStockMapper inStockMapper;
	
	@Autowired
	private InStockDetailMapper inStockDetailMapper;

	@Override
	public ResponseData insert(InStock stock) {
		stock.setCdate(new Date());
		stock.setFlag((byte)1);
		int result = inStockMapper.insert(stock);
		if(result>0){
			if(CollectionUtils.isEmpty(stock.getInStockDetail())){
				throw new BusinessException("入库详细信息不能为空");
			}
			int resultNum = 0 ;
			for(int i=0;i<stock.getInStockDetail().size();i++){
				stock.getInStockDetail().get(i).setCdate(new Date());
				stock.getInStockDetail().get(i).setFlag((byte) 1);
				resultNum+=inStockDetailMapper.insert(stock.getInStockDetail().get(i));
			}
			if(resultNum<stock.getInStockDetail().size()){
				throw new BusinessException("入库详细添加失败");
			}
		}else{
			return ResponseData.error();
		}
		
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
		if(CollectionUtils.isEmpty(stock.getInStockDetail())){
			throw new BusinessException("入库详细不能为空");
		}
		List<InStockDetail> toAdd = new ArrayList<>();
		List<InStockDetail> toDelete = new ArrayList<>();
		List<InStockDetail> toUpdate = new ArrayList<>();
		InStockDetailExample param = new InStockDetailExample();
		param.createCriteria().andStockIdEqualTo(stock.getId()).andFlagEqualTo((byte) 1);
		List<InStockDetail> exists = inStockDetailMapper.selectByExample(param);
		for(int i=0;i<stock.getInStockDetail().size();i++){
			if(stock.getInStockDetail().get(i).getId()==null){
				toAdd.add(stock.getInStockDetail().get(i));
			}else{
				for(int j=0;i<exists.size();j++){
					if(stock.getInStockDetail().get(i).getId().equals(exists.get(j).getId())){
						toUpdate.add(stock.getInStockDetail().get(i));
						toDelete.add(exists.get(j));

					}
				}
			}
		}
		exists.removeAll(toDelete);
		toDelete = exists;
		if(!CollectionUtils.isEmpty(toAdd)){
			for(InStockDetail instock:toAdd){
				instock.setCdate(new Date());
				instock.setFlag((byte) 1);
				inStockDetailMapper.insert(instock);
			}
		}
		if(!CollectionUtils.isEmpty(toUpdate)){
			for(InStockDetail instock:toAdd){
				instock.setMdate(new Date());
				inStockDetailMapper.updateByPrimaryKey(instock);
			}
		}
		if(!CollectionUtils.isEmpty(toDelete)){
			for(InStockDetail instock:toDelete){
				instock.setMdate(new Date());
				instock.setFlag((byte) 2);
				inStockDetailMapper.updateByPrimaryKey(instock);
			}
		}

		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData delete(Integer id) {
		int result = inStockMapper.deleteByPrimaryKey(id);
		InStockDetailExample param = new InStockDetailExample();
		param.createCriteria().andStockIdEqualTo(id).andFlagEqualTo((byte) 1);
		List<InStockDetail> stocks = inStockDetailMapper.selectByExample(param);
		if(!CollectionUtils.isEmpty(stocks)){
			for(InStockDetail stock: stocks){
				stock.setFlag((byte) 2);
				stock.setMdate(new Date());
				inStockDetailMapper.updateByPrimaryKey(stock);
			}
		}
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

	@Override
	public ResponseData find(Integer id) {
		InStock stock = inStockMapper.selectByPrimaryKey(id);
		InStockDetailExample param = new InStockDetailExample();
		param.createCriteria().andFlagEqualTo((byte) 1).andStockIdEqualTo(id);
		List<InStockDetail> details = inStockDetailMapper.selectByExample(param);
		stock.setInStockDetail(details);
		return new ResponseData(details);
	}

}
