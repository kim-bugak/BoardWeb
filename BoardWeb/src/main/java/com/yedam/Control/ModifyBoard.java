package com.yedam.Control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;
import com.yedam.vo.BoardVO;

public class ModifyBoard implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String bno = req.getParameter("bno");

		BoardService svc = new BoardServiceImpl();
		BoardVO baord = svc.getBoard(Integer.parseInt(bno));

		req.setAttribute("board", baord);


		
		req.getRequestDispatcher("WEB-INF/jsp/modifyBoard.jsp").forward(req,resp);
	}

}
