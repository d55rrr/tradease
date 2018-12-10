package com.yh.tradease.system.entity;

import java.io.Serializable;
import java.util.Date;

public class SysGroup implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6660705812566091403L;
	
	private Integer id;
	
	private String groupName;
	
	private Integer pid;
	
	
	private Date cdate;
	
	private Date mdate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
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
