package com.yh.tradease.serve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.Pager;
import com.yh.tradease.common.ResponseData;
import com.yh.tradease.serve.entity.ProductInstall;
import com.yh.tradease.serve.service.ProductInstallService;
/**
 * 产品安装
 * @author Majestage
 *
 */
@Controller
@RequestMapping("/productInstall")
public class ProductInstallController {
	
	@Autowired
	private ProductInstallService productInstallService;
	
	/**
	 * 新增
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/insert")
	public ResponseData insert(ProductInstall product){
		
		return productInstallService.insert(product);
	}
	
	/**
	 * 修改
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/update")
	public ResponseData update(ProductInstall product){
		
		return productInstallService.update(product);
	}
	
	/**
	 * 删除
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/delete")
	public ResponseData delete(Integer id){
		
		return productInstallService.delete(id);
	}
	
	/**
	 * 新增
	 * @param product
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/page")
	public ResponseData findPage(Pager page,ProductInstall product){
		
		return productInstallService.findPage(product,page);
	}
	
}
