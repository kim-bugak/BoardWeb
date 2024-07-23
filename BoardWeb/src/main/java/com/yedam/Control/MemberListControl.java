package com.yedam.Control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.MemberService;
import com.yedam.service.MemberServiceImpl;
import com.yedam.vo.MemberVO;

public class MemberListControl implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String order = req.getParameter("order");
		MemberService sve = new MemberServiceImpl();
		List<MemberVO> list = sve.memberList(order);
		req.setAttribute("members", list);
	 
		req.getRequestDispatcher("admin/memberList.tiles").forward(req,resp);
	}

}
