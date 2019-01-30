package com.yh.tradease.system.service;

import java.util.List;

import com.yh.tradease.common.Pager;
import com.yh.tradease.system.entity.SysUser;
import com.yh.tradease.system.vo.SysUserVo;

public interface SysUserService {
	/**
	 * 
	 * @Title: queryUserList
	 * @Description: 查询用户列表
	 * @return
	 * @Return List<SysUser>
	 * 2018年3月18日 下午6:07:22
	 */
	Pager queryUserList(SysUserVo user,Pager page);
	/**
	 * 
	 * @Title: addUser
	 * @Description:添加用户
	 * @param user
	 * @return
	 * @Return int
	 * 2018年3月19日 下午6:13:59
	 */
	int addUser(SysUserVo user);
	/**
	 * 
	 * @Title: updateUser
	 * @Description:更新用户 
	 * @param user
	 * @return
	 * @Return int
	 * 2018年3月19日 下午6:14:45
	 */
	int updateUser(SysUserVo user);
	/**
	 * 
	 * @Title: deleteUser
	 * @Description: 删除用户
	 * @param user
	 * @return
	 * @Return int
	 * 2018年3月19日 下午6:16:09
	 */
	int deleteUser(Integer[] param);
	/**
	 * 
	 * @Title: updatepwd
	 * @Description: 重设密码
	 * @param user
	 * @return
	 * @Return int
	 * 2018年3月19日 下午6:23:11
	 */
	int updatepwd(SysUserVo user);

}
