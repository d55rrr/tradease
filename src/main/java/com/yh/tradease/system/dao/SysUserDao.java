package com.yh.tradease.system.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.yh.tradease.common.Pager;
import com.yh.tradease.system.entity.SysUser;
import com.yh.tradease.system.vo.SysUserVo;
@Mapper
public interface SysUserDao {

	public List<SysUser> queryUserList(Pager page);
	
	public int queryCount(SysUser user);

	public int addUser(SysUser userEntity);

	public int updateUser(SysUser userEntity);

	public int deleteUser(Integer[] param);

	public int updatepwd(String account, String password);

	

}
