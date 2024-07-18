package com.yedam.common;

import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;

public class AppTest2 {
	public static void main(String[] args) {
		BoardService svc = new BoardServiceImpl();
        svc.boardList().forEach(brd -> System.out.println(brd));
        svc.boardList().forEach(System.out::println);
        System.out.println("- End -");
	}
}
