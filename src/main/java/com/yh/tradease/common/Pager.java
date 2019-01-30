package com.yh.tradease.common;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 翻页对象
 * @author Majestage
 *
 * @param <T>
 */
public  class Pager<T>  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer pageSize;
	
	private Integer total;
	
	private Integer pageCount;
	
	private Integer currentPage;
	
	private Integer offset = 0;
	
	private Integer limit = 10;
	
	private List<T> datas;
	
	private T param;
		

	

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		if(currentPage!=null&&pageSize!=null){
			offset = pageSize*(currentPage-1);
			limit = pageSize*currentPage;
		}
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
		if(this.pageSize!=null){
			this.pageCount = (int) Math.ceil(this.total/(double)this.pageSize);
		}
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		if(pageSize!=null&&currentPage!=null){
			offset = pageSize*(currentPage-1);
			limit = pageSize*currentPage;
		}
		this.currentPage = currentPage;
	}

	public List<T> getDatas() {
		return datas;
	}

	public void setDatas(List<T> datas) {
		this.datas = datas;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public T getParam() {
		return param;
	}

	public void setParam(T param) {
		this.param = param;
	}
	
	
	
	
	
	
}
