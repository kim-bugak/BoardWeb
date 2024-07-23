<%@page import="com.yedam.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
BoardVO board = (BoardVO) request.getAttribute("board");
%>
<h3>수정화면</h3>
<form action="updateBoard.do">
<input type="hidden" name="bno" value="<%=board.getBoardNo()%>">
<table class="table">
	<tr>
		<th>제목</th>
		<td><input class="form-control" type="text" name="title" value="<%=board.getTitle() %>"></td>
	</tr>
	<tr>
		<th>내용</th>
		<td><textarea class="form-control" name="content"><%=board.getContent() %></textarea></td>
	</tr>
	<tr>
		<th>작성자</th>
		<td><%=board.getWriter() %></td>
	</tr>
		<tr>
		<td colspan="2" align="center">
		<input class="btn btn-primary"  type="submit">
		<input class="btn btn-secondary"  type="reset">
		</td>
	</tr>
</table>
</form>
