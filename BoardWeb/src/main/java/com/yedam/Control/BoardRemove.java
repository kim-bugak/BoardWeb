package com.yedam.Control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.BoardService;
import com.yedam.service.BoardServiceImpl;
import com.yedam.vo.BoardVO;

public class BoardRemove implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String bno = req.getParameter("bno");
		String page = req.getParameter("page");

		BoardService svc = new BoardServiceImpl();
		BoardVO baord = svc.getBoard(Integer.parseInt(bno));

		req.setAttribute("board", baord);
		req.setAttribute("page", page);
		req.getRequestDispatcher("board/boardRemove.tiles").forward(req, resp);
	}

}
