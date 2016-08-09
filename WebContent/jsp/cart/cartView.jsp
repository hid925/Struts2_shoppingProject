<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="margin" style="height:80px">
</div>
<center>
	<table border="1">
		<tr>
			<td width="450" align="center">Title</td>
			<td width="100" align="center">Price</td>
			<td width="100" align="center">Amount</td>
			<td width="100" align="center">Total</td>
		</tr>
		
	<c:forEach var="dto" items="${cList}">
	<c:if test="cList == null">
		No item in Cart
	</c:if>	
		<tr>
			<td align="center">${dto.cPname }</td>
			<td align="center">${dto.cPprice }</td>
			<td align="center">${dto.cAmount }</td>
			<td align="center">${dto.cPprice * dto.cAmount } Won</td>
		</tr>
	</c:forEach>
			
		<tr>
			<td colspan="4"> <input type="button" value="buy"> </td>
		</tr>
	
	</table>
</center>
<div class="margin" style="height:80px">
</div>
</body>
</html>