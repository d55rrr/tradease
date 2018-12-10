package com.yh.tradease.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.system.dao.SysUserGroupDao;
import com.yh.tradease.system.entity.SysUserGroup;
import com.yh.tradease.system.service.SysUserGroupService;
@Service
public class SysUserGroupServiceImpl implements SysUserGroupService{
	
	@Autowired
	private SysUserGroupDao sysUserGroupServiceDao;
	
	@Override
	public SysUserGroup getByUserId(int i) {
		
		return sysUserGroupServiceDao.getByUserId(i);
	}

}
