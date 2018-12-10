package com.yh.tradease.system.dao;

import org.apache.ibatis.annotations.Mapper;

import com.yh.tradease.system.entity.SysUserGroup;
@Mapper
public interface SysUserGroupDao {

	SysUserGroup getByUserId(int userId);

}
