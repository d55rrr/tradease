package com.yh.tradease.system.vo;

import java.io.Serializable;

public class SysUserVo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3171965537020383726L;

	private Integer id;
	
	private String userName;
	
	private String account;
	
	private String password;
	
	private String phone;
	
	private Integer sex;
	
	private String occupy;
	
	private Integer flag;
	
	private Integer editPass;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getOccupy() {
		return occupy;
	}

	public void setOccupy(String occupy) {
		this.occupy = occupy;
	}

	public Integer getFlag() {
		return flag;
	}

	public void setFlag(Integer flag) {
		this.flag = flag;
	}

	public Integer getEditPass() {
		return editPass;
	}

	public void setEditPass(Integer editPass) {
		this.editPass = editPass;
	}

	
}
