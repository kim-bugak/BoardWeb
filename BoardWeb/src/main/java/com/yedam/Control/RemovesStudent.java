package com.yedam.Control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yedam.common.Control;
import com.yedam.service.MemberService;
import com.yedam.service.MemberServiceImpl;

public class RemovesStudent implements Control {

	@Override
	public void exec(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sno = req.getParameter("sno"); // removeStudent.do?sno=S2024-001
		MemberService svc = new MemberServiceImpl();

		if (svc.removesStudent(sno)) {
			resp.getWriter().print("\"retCode\":\"Success\"}");
		} else {
			resp.getWriter().print("\"retCode\":\"Fail\"}");
		}
	}

}
