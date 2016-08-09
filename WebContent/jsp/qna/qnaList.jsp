<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<center>
<p>Qna Board</p>
	<table border ="1">
		<tr>
			<td width="5%">No</td>
			<td width="45%">Title</td>
			<td width="10%">Name</td>
			<td width="10%">Date</td>
		</tr>
		<c:forEach var="dto" items="${list}">
			<c:if test="list1 == null">
			등록된 데이터가 없습니다.
		    </c:if>
	
		<tr>
			<td>${dto.qnaNum }</td>
			<td>${dto.qnaTitle }</td>
			<td>${dto.qnaName }</td>				
			<td>${dto.qnaDate }</td>
		</tr>
		</c:forEach>
		
	</table>
<p>THe End</p>
</center>
</body>
</html>