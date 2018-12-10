package com.yh.tradease.system.entity;

import java.io.Serializable;
import java.util.Date;

public class SysUserGroup implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6193443822350603819L;
	
	private Integer id;
	
	private Integer userId;
	
	private Integer groupId;
	
	private Date cdate;
	
	private Date mdate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Date getCdate() {
		return cdate;
	}

	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}

	public Date getMdate() {
		return mdate;
	}

	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	
	
}
