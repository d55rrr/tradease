package com.yh.tradease.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.system.dao.SysMenuDao;
import com.yh.tradease.system.entity.SysMenu;
import com.yh.tradease.system.service.SysMenuService;

@Service
public class SysMenuServiceImpl implements SysMenuService{
	
	@Autowired
	SysMenuDao sysMenuDao;
	@Override
	public List<SysMenu> getByGroupId(Integer groupId) {
		
		return sysMenuDao.getByGroupId(groupId);
	}
	@Override
	public List<SysMenu> getByIds(List<Integer> parentIds) {

		return sysMenuDao.getByIds(parentIds);
	}
	@Override
	public int add(SysMenu menu) {
		
		return sysMenuDao.add(menu);
	}
	@Override
	public int update(SysMenu menu) {
		
		return sysMenuDao.update(menu);
	}
	@Override
	public int delete(int menuId) {
		
		return sysMenuDao.delete(menuId);
	}
	@Override
	public List<SysMenu> queryMenus(Integer menuType) {
		
		return sysMenuDao.queryMenus(menuType);
	}
	@Override
	public List<SysMenu> queryAllMenu() {
		
		return sysMenuDao.queryAllMenu();
	}
	@Override
	public SysMenu queryMenu(Integer id) {
		
		return sysMenuDao.queryMenu(id);
	}

}
