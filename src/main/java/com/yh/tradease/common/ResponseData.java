package com.yh.tradease.common;

import java.util.List;

public class ResponseData<T> {
	
	private int code ;
	
	private String msg;
	
	private List<T> data;
	
	private T obj;
	
	private Pager<T> page;
	
	public static final ResponseData success = new ResponseData(0);
	
	public static final ResponseData error = new ResponseData(-1);



	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	public Pager<T> getPage() {
		return page;
	}

	public void setPage(Pager<T> page) {
		this.page = page;
	}

	public ResponseData(List<T> data){
		this.code = 0;
		this.data = data;
	}
	public ResponseData(T obj){
		this.code = 0;
		this.obj = obj;
	}
	public ResponseData(int code){
		if(code>=0){
			this.code = 0;
			this.msg = "operation success!";
		}else{
			this.code = -1;
			this.msg = "operation fail!";
		}
	}
	public ResponseData(Pager<T> page){
		this.code = 0;
		this.page = page;
		
	}
	public static ResponseData success(){
		return success;
	}
	public static ResponseData error(){
		return error;
		
	}
	public static ResponseData error(String error){
		ResponseData errorRes = new ResponseData(-1);
		errorRes.setMsg(error);
		return errorRes;
			

	}

	
	

}
