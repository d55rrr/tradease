package com.yh.tradease.system.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yh.tradease.system.dao.SysUserDao;
import com.yh.tradease.system.entity.SysUser;
import com.yh.tradease.system.service.SysUserService;
import com.yh.tradease.system.vo.SysUserVo;
@Service
public class SysUserServiceImpl implements SysUserService{
	@Autowired
	private SysUserDao sysUserDao;
	@Override
	public List<SysUser> queryUserList() {
		
		return sysUserDao.queryUserList();
	}
	@Override
	public int addUser(SysUserVo user) {

		SysUser userEntity  = new SysUser();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setCdate(new Date());
		return sysUserDao.addUser(userEntity);
	}
	@Override
	public int updateUser(SysUserVo user) {
		
		SysUser userEntity  = new SysUser();
		BeanUtils.copyProperties(user, userEntity);
		userEntity.setCdate(new Date());
		
		
		return sysUserDao.updateUser(userEntity);
	}
	@Override
	public int deleteUser(Integer[] param) {
		
		return sysUserDao.deleteUser(param);
	}
	@Override
	public int updatepwd(SysUserVo user) {
		
		return sysUserDao.updatepwd(user.getAccount(),user.getPassword());
	}

}
