package com.yedam.common;

import org.apache.ibatis.session.SqlSession;

import com.yedam.mapper.BoardMapper;
import com.yedam.vo.BoardVO;

public class AppTest {
	public static void main(String[] args) {
		SqlSession sqlSession = //
				DataSource.getInstance().openSession(true); //<--true 써야지 자동커밋 
		BoardMapper mapper = sqlSession.getMapper(BoardMapper.class);
		
		BoardVO brd = new BoardVO();
//		brd.setTitle ("매퍼테스트11111");
//		brd.setContent("조건이 제대로 되는지11111");
//		brd.setWriter("newbie11111");
//		brd.setBoardNo(5);
//		
//		if(mapper.updateBoard(brd)==1) {
//			System.out.println("OK");
//		}
		
//		System.out.println(mapper.deleteBoard(2));
		 
		System.out.println(mapper.selectBoard(4));
//		mapper.selectList().forEach(board -> System.out.println(board.toString()));
//		System.out.println("END");
//		mapper.studentList().forEach(student -> {System.out.println(student);});
		
	}
}
