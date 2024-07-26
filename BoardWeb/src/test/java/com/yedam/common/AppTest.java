package com.yedam.common;

import com.yedam.service.ReplyService;
import com.yedam.service.ReplyServiceImpl;
import com.yedam.vo.ReplyVO;

public class AppTest {
	public static void main(String[] args) {
		ReplyService svc = new ReplyServiceImpl();
		 
		SearchVO search = new SearchVO();
		search.setBno(148);
		search.setPage(1);
		
		svc.replyList(search).forEach(System.out::println);
		System.out.println("-END-");
//		SqlSession sqlSession = //
//				DataSource.getInstance().openSession(true); //<--true 써야지 자동커밋 
//		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
//		
//		BoardVO brd = new BoardVO();
//		brd.setTitle ("매퍼테스트11111");
//		brd.setContent("조건이 제대로 되는지11111");
//		brd.setWriter("newbie11111");
//		brd.setBoardNo(5);
//		
//		if(mapper.updateBoard(brd)==1) {
//			System.out.println("OK");
//		}
		
//		System.out.println(mapper.deleteBoard(2));
		 
//		System.out.println(mapper.selectBoard(4));
//		mapper.selectList().forEach(board -> System.out.println(board.toString()));
//		System.out.println("END");
//		mapper.studentList().forEach(student -> {System.out.println(student);});
		
	}
}
