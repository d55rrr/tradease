package com.yh.tradease.system.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yh.tradease.common.ResponseData;
import com.yh.tradease.system.entity.SysMenu;
import com.yh.tradease.system.entity.SysUserGroup;
import com.yh.tradease.system.service.SysMenuService;
import com.yh.tradease.system.service.SysUserGroupService;
import com.yh.tradease.system.vo.SysMenuVo;

/**
 * 
 * @author Majestage
 *
 */
@Controller
@RequestMapping("/system/menu")
public class SysMenuController {
	
	@Autowired
	private SysMenuService sysMenuService;
	
	@Autowired 
	private SystemController sysController;
	
	@Autowired
	private SysUserGroupService sysUserGroupService;
	/**
	 * 
	 * @param menu
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public ResponseData addMenu(SysMenu menu){
		
		int result = sysMenuService.add(menu);
		
		return new ResponseData(result);
	}
	/**
	 * 
	 * @Title: getMenu
	 * @Description: 查询菜单对象
	 * @param menu
	 * @return
	 * @Return ResponseData
	 * 2018年3月18日 下午3:32:57
	 */
	@RequestMapping("/queryMenu")
	@ResponseBody
	public  ResponseData getMenu(SysMenu menu){
		
		SysMenuVo vo = new SysMenuVo();
		SysMenu result = sysMenuService.queryMenu(menu.getId());
		BeanUtils.copyProperties(result, vo);
		
		return new ResponseData(vo);
	}
	/**
	 * 
	 * @param menu
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public ResponseData updateMenu(SysMenu menu){
		
		int result = sysMenuService.update(menu);
		
		return new ResponseData(result);
	}
	
	/**
	 * 
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public ResponseData deleteMenu(Integer id){
		
		int result = sysMenuService.delete(id);
		
		return new ResponseData(result);
	}

	/**
	 * 
	 */
	@RequestMapping("/menuList")
	@ResponseBody
	public List<SysMenu> menuList(){
		
    	SysUserGroup us = sysUserGroupService.getByUserId(1);

		//List<SysMenu> gm = sysMenuService.getByGroupId(us.getGroupId());
    	List<SysMenu> gm = sysMenuService.queryAllMenu();
		//sysController.addParents(gm,gm);

		
		return gm;
	}
	/**
	 * 
	 * @Title: menus
	 * @Description: 
	 * @param menuType
	 * @return
	 * @Return List<SysMenu>
	 * 2018年3月17日 下午7:38:25
	 */
	@RequestMapping("/menus")
	@ResponseBody
	public ResponseData menus(Integer menuType){
		
		List<SysMenu> menus = sysMenuService.queryMenus(menuType);

		
		return new ResponseData(menus);
		
	}

}
