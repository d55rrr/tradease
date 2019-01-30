package com.yh.tradease.serve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.serve.entity.ProductRepair;
import com.yh.tradease.serve.service.ProductRepairService;

@Controller
@RequestMapping("/productRepair")
public class ProductRepairController {
	
	@Autowired
	private ProductRepairService productRepairService;
	
	/**
	 * 新增
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/insert")
	public ResponseData insert(ProductRepair product){
		
		return productRepairService.insert(product);
	}
	
	/**
	 * 修改
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/update")
	public ResponseData update(ProductRepair product){
		
		return productRepairService.update(product);
	}
	
	/**
	 * 删除
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public ResponseData delete(Integer id){
		
		return productRepairService.delete(id);
	}
	
	/**
	 * 新增
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/page")
	public ResponseData findPage(Pager page,ProductRepair product){
		
		return productRepairService.findPage(product,page);
	}

}
