package com.yedam.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.Control.ActionControl;
import com.yedam.Control.AddBoardControl;
import com.yedam.Control.BoardListControl;
import com.yedam.Control.BoardRemove;
import com.yedam.Control.DeleteBoard;
import com.yedam.Control.LoginControl;
import com.yedam.Control.LoginForm;
import com.yedam.Control.LogoutControl;
import com.yedam.Control.MemberListControl;
import com.yedam.Control.ModifyBoard;
import com.yedam.Control.StudentListControl;
import com.yedam.Control.UpdateBoard;
import com.yedam.Control.Board;
import com.yedam.Control.BoardForm;
import com.yedam.common.Control;

/*
 *  FrontController 역활은 사용자의 모든 요청을 처리.
 *  서블릿. a.do, sample.do 
 *  객체생성 -> init -> service -> destroy.
 */
public class FrontController extends HttpServlet {
	Map<String, Control> map;

	public FrontController() {
		map = new HashMap<>();
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		map.put("/boardList.do", new BoardListControl());
		// 글등록 구현 : 등록화면(boardForm.do) + DB등록(addBoard.do) -> 글목록페이지이동
		map.put("/boardForm.do", new BoardForm());
		// 상세보기
		map.put("/board.do", new Board());
//     게시판상세
		map.put("/addBoard.do", new AddBoardControl());
		// 학생목록
		map.put("/stdList.do", new StudentListControl());
		// 삭제목록
		map.put("/boardRemove.do", new BoardRemove());
		// 삭제화면
		map.put("/deleteBoard.do", new DeleteBoard());
		// 수정목록
		map.put("/modifyBoard.do", new ModifyBoard());
		// 수정화면
		map.put("/updateBoard.do", new UpdateBoard());
		// 태그연습
		map.put("/action.do", new ActionControl());
		// 로그인
		map.put("/loginForm.do", new LoginForm()); // 로그인화면 open
		map.put("/login.do", new LoginControl()); // 로그인기능
		map.put("/logout.do", new LogoutControl()); // 로그아웃기능

		// 회원목록보기
		map.put("/memberList.do", new MemberListControl());
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// boardList.do - 목록. addBoard.do-등록
//     System.out.println("service() 호출");
		String uri = req.getRequestURI(); // url(http://localhost/boardweb/ vs uri
		String context = req.getContextPath(); // 프로젝트 명
		String path = uri.substring(context.length()); // "/boardList.do"

		System.out.println(path);
		Control sub = map.get(path);
		sub.exec(req, resp);

	}
}
