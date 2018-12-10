package com.yh.tradease.system.service;

import com.yh.tradease.system.entity.SysUserGroup;

public interface SysUserGroupService {
	/**
	 * 根据用户查询组
	 * @param i
	 * @return
	 */
	SysUserGroup getByUserId(int i);

}
