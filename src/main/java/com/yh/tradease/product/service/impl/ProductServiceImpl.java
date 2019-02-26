package com.yh.tradease.product.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.product.dao.ProductMapper;
import com.yh.tradease.product.entity.Product;
import com.yh.tradease.product.entity.ProductExample;
import com.yh.tradease.product.entity.ProductExample.Criteria;
import com.yh.tradease.product.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductMapper productMapper;

	public ResponseData findPage(Product product, Pager page) {
		
		ProductExample param = new ProductExample();
		param.setOffset(page.getOffset());
		param.setLimit(page.getLimit());
		Criteria criteria = param.createCriteria();
		if(product.getType()!=null){
			criteria.andTypeEqualTo(product.getType());
		}
		if(!StringUtils.isEmpty(product.getName())){
			criteria.andNameLike("%"+product.getName()+"%");
		}
		if(product.getBrandId()!=null){
			criteria.andBrandIdEqualTo(product.getBrandId());
		}
		if(!StringUtils.isEmpty(product.getProductCode())){
			criteria.andProductCodeLike("%"+product.getBrandId()+"%");
		}
		if(product.getSaleStatus()!=null){
			criteria.andSaleStatusEqualTo(product.getSaleStatus());
		}
		criteria.andFlagEqualTo((byte) 1);
		long total = productMapper.countByExample(param);
		List<Product> result = productMapper.selectByExample(param);
		page.setTotal((int) total);
		page.setDatas(result);
		return new ResponseData(page);
	}

	@Override
	public ResponseData insert(Product product) {
		product.setCdate(new Date());
		product.setFlag((byte)1);
		int result = productMapper.insert(product);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData update(Product product) {
		product.setMdate(new Date());
		int result = productMapper.updateByPrimaryKey(product);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData delete(Integer[] ids) {
		int result = 0;
		for(int i=0;i<ids.length;i++){
			Product param = new Product();
			param.setId(ids[i]);
			param.setFlag((byte)2);
			param.setMdate(new Date());
			result += productMapper.updateByPrimaryKeySelective(param);
		}
		if(result==ids.length){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData list(Product product) {
		ProductExample param = new ProductExample();
		Criteria criteria = param.createCriteria().andFlagEqualTo((byte) 1);
		if(product.getType()!=null){
			criteria.andTypeEqualTo(product.getType());
		}
		List<Product> results = productMapper.selectByExample(param);
		return new ResponseData(results);
	}

}
