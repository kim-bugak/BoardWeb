package com.yedam.common;

import lombok.Data;

@Data
public class PageDTO {
	private int page; // 현재페이지.
	private int startPage, endPage;// <<11 12 13 14.....20>>
	private boolean prev, next;

	public PageDTO(int page, int totalCnt) {
		// 예) page 3, totalCnt: 88 (18page
		this.page = page;
		this.endPage = (int) (Math.ceil(page / 10.0) * 10);// 2*10
		this.startPage = this.endPage - 9;

		
		int realEnd = (int)Math.ceil(totalCnt / 5.0);
		this.endPage = this.endPage > realEnd ? realEnd : this.endPage;
		
		this.prev = this.startPage > 1;
		this.next= this.endPage < realEnd;
	}

}
