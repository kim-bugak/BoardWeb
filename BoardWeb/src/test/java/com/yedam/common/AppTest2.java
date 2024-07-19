package com.yedam.common;

import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;

public class AppTest2 {
	public static void main(String[] args) {
		BoardService svc = new BoardServiceImpl();
		SearchVO search = new SearchVO();
		search.setSearchCondition("TW");
		search.setKeyword("test");
		search.setPage(1);
		svc.boardList(search).forEach(System.out::println);
		
		
//        svc.boardList(3).forEach(brd -> System.out.println(brd));
//        svc.boardList(4).forEach(System.out::println);
        System.out.println("- End -");
	}
}
