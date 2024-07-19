<%@page import="com.yedam.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "../includes/header.jsp"%>
<%
BoardVO board = (BoardVO) request.getAttribute("board");
%>
<form action="deleteBoard.do">
<input type="hidden" name="bno" value="<%=board.getBoardNo()%>">
<table class="table">
	<tr>
		<th class="col-sm-3">글번호</th>
		<td class="col-sm-3"><%=board.getBoardNo()%></td>
		<th class="col-sm-3">조회수</th>
		<td class="col-sm-3"><%=board.getViewCnt()%></td>
	</tr>
	<tr>
		<th>제목</th>
		<td colsapn="3"><%=board.getTitle()%></td>
	</tr>
	<tr>
		<th colsapn="3">내용</th>
		<td><%=board.getContent()%></td>
	</tr>
	<tr>
		<th>작성자</th>
		<td colsapn="3"><%=board.getWriter()%></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
			<button class="btn btn-primary" type="button">수정</button> <input
			class="btn btn-danger" type="submit" value="삭제">
		</td>
	</tr>
</table>
</form>
<%@ include file = "../includes/footer.jsp"%>