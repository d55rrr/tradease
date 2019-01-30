package com.yh.tradease.serve.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.serve.dao.ProductRepairMapper;
import com.yh.tradease.serve.entity.ProductInstall;
import com.yh.tradease.serve.entity.ProductInstallExample;
import com.yh.tradease.serve.entity.ProductRepair;
import com.yh.tradease.serve.entity.ProductRepairExample;
import com.yh.tradease.serve.service.ProductRepairService;
@Service
public class ProductRepairServiceImpl implements ProductRepairService{
	
	@Autowired
	private ProductRepairMapper productRepairMapper;

	@Override
	public ResponseData insert(ProductRepair product) {
		product.setCdate(new Date());
		product.setFlag((byte)1);
		int result = productRepairMapper.insert(product);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData update(ProductRepair product) {
		product.setMdate(new Date());
		int result = productRepairMapper.updateByPrimaryKey(product);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData delete(Integer id) {
		int result = productRepairMapper.deleteByPrimaryKey(id);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData findPage(ProductRepair product, Pager page) {
		ProductRepairExample param = new ProductRepairExample();
		param.setOffset(page.getOffset());
		param.setLimit(page.getLimit());
		List<ProductRepair> result = productRepairMapper.selectByExample(param);
		Pager<ProductRepair> resultPage = new Pager<>();
		resultPage.setDatas(result);
		return new ResponseData(resultPage);
	}

}
