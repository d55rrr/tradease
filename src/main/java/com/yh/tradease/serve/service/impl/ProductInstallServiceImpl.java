package com.yh.tradease.serve.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.sales.entity.SaleRecord;
import com.yh.tradease.sales.entity.SaleRecordExample;
import com.yh.tradease.serve.dao.ProductInstallMapper;
import com.yh.tradease.serve.entity.ProductInstall;
import com.yh.tradease.serve.entity.ProductInstallExample;
import com.yh.tradease.serve.service.ProductInstallService;

@Service
public class ProductInstallServiceImpl implements ProductInstallService{
	
	@Autowired
	private ProductInstallMapper productInstallMapper ;

	@Override
	public ResponseData insert(ProductInstall product) {
		product.setCdate(new Date());
		product.setFlag((byte)1);
		int result = productInstallMapper.insert(product);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData update(ProductInstall product) {
		product.setMdate(new Date());
		int result = productInstallMapper.updateByPrimaryKey(product);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData delete(Integer id) {
		int result = productInstallMapper.deleteByPrimaryKey(id);
		if(result>0){
			return ResponseData.success();
		}else{
			return ResponseData.error();
		}
	}

	@Override
	public ResponseData findPage(ProductInstall product,Pager page) {
		ProductInstallExample param = new ProductInstallExample();
		param.setOffset(page.getOffset());
		param.setLimit(page.getLimit());
		List<ProductInstall> result = productInstallMapper.selectByExample(param);
		Pager<ProductInstall> resultPage = new Pager<>();
		resultPage.setDatas(result);
		return new ResponseData(resultPage);
	}

}
