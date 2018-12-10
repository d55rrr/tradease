package com.yh.tradease.system.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yh.tradease.system.entity.SysUser;
import com.yh.tradease.system.vo.SysUserVo;
@Mapper
public interface SysUserDao {

	public List<SysUser> queryUserList();

	public int addUser(SysUser userEntity);

	public int updateUser(SysUser userEntity);

	public int deleteUser(Integer[] param);

	public int updatepwd(String account, String password);

	

}
