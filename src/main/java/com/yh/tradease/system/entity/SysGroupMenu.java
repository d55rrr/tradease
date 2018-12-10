package com.yh.tradease.system.entity;

import java.io.Serializable;
import java.util.Date;

public class SysGroupMenu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3427021565135093548L;
	
	private Integer id;
	
	private Integer groupId;
	
	private Integer menuId;
	
	private Date cdate;
	
	private Date mdate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getMenuId() {
		return menuId;
	}

	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
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
