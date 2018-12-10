package com.yh.tradease.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yh.tradease.system.entity.SysMenu;
@Mapper
public interface SysMenuDao {

	List<SysMenu> getByGroupId(Integer groupId);

	List<SysMenu> getByIds(List<Integer> parentIds);

	int add(SysMenu menu);

	int update(SysMenu menu);

	int delete(int menuId);
	/**
	 * 
	 * @Title: queryMenus
	 * @Description: 查询对应menuType的menus
	 * @param menuType
	 * @return
	 * @Return List<SysMenu>
	 * 2018年3月17日 下午7:45:00
	 */
	List<SysMenu> queryMenus(Integer menuType);
	/**
	 * 
	 * @Title: queryAllMenu
	 * @Description: 获得所有菜单
	 * @return
	 * @Return List<SysMenu>
	 * 2018年3月18日 上午1:31:34
	 */
	List<SysMenu> queryAllMenu();
	/**
	 * 
	 * @Title: queryMenu
	 * @Description: 查询menu对象
	 * @param id
	 * @return
	 * @Return SysMenu
	 * 2018年3月18日 下午3:36:44
	 */
	SysMenu queryMenu(Integer id);

}
