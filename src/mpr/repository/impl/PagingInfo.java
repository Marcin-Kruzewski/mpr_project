package mpr.repository.impl;

public class PagingInfo {
	private int page;
	private int pageSize;
	private int total;

	public PagingInfo(int page, int pageSize, int total) {
		this.page = page;
		this.pageSize = pageSize;
		this.total = total;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
	   this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalCount() {
		return total;
	}

	public void setTotalCount(int total) {
		this.total = total;
	}
}
