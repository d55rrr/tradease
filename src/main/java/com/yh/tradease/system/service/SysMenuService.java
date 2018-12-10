package com.yh.tradease.system.service;

import java.util.List;

import com.yh.tradease.system.entity.SysMenu;

public interface SysMenuService {
	/**
	 * 根据组id查询菜单
	 * @param groupId
	 * @return
	 */
	List<SysMenu> getByGroupId(Integer groupId);
	/**
	 * 获取对应菜单
	 * @param parentIds
	 * @return
	 */
	List<SysMenu> getByIds(List<Integer> parentIds);
	/**
	 * 添加
	 * @param menu
	 * @return
	 */
	int add(SysMenu menu);
	/**
	 * 修改
	 * @param menu
	 * @return
	 */
	int update(SysMenu menu);
	/**
	 * 删除
	 * @param menuId
	 * @return
	 */
	int delete(int menuId);
	/**
	 * 
	 * @Title: menus
	 * @Description: 根据menuType查询对应的menu
	 * @param menuType
	 * @return
	 * @Return List<SysMenu>
	 * 2018年3月17日 下午7:43:24
	 */
	List<SysMenu> queryMenus(Integer menuType);
	/**
	 * 
	 * @Title: getAllMenu
	 * @Description: 获得所有菜单
	 * @return
	 * @Return List<SysMenu>
	 * 2018年3月18日 上午1:30:30
	 */
	List<SysMenu> queryAllMenu();
	/**
	 * 
	 * @Title: queryMenu
	 * @Description: 查询menu对象
	 * @param id
	 * @return
	 * @Return SysMenu
	 * 2018年3月18日 下午3:35:59
	 */
	SysMenu queryMenu(Integer id);

}
