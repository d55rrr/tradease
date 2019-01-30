package com.yh.tradease.product.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.common.ResponseData;
import com.yh.tradease.product.dao.ProductModuleMapper;
import com.yh.tradease.product.entity.ProductModule;
import com.yh.tradease.product.service.ProductModuleService;
@Service
public class ProductModuleServiceImpl implements ProductModuleService{
	
	@Autowired
	private ProductModuleMapper productMapper;

	@Override
	public ResponseData insert(ProductModule productModule) {
		if(productModule.getPid()==null){
			productModule.setPid(0);
		}
		productModule.setCdate(new Date());
		productModule.setFlag((byte)1);
		int result = productMapper.insert(productModule);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
			
	}

	@Override
	public ResponseData update(ProductModule productModule) {
		productModule.setMdate(new Date());
		int result = productMapper.updateByPrimaryKey(productModule);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
			
	}

	@Override
	public ResponseData delete(Integer id) {
		ProductModule param = new ProductModule();
		param.setMdate(new Date());
		param.setFlag((byte)2);
		int result = productMapper.updateByPrimaryKeySelective(param);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData findTree(Integer id) {
		
		List<ProductModule> result = productMapper.getTree(id==null?0:id);
		return new ResponseData(result);
	}

}
