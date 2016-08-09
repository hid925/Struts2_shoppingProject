<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ProductView</title>
</head>
<body>
<div class="margin" style="height:80px">
</div>
<center>
<form action="productCart.action" method="post">
	<input type="hidden" name="cPnum" value="${pNum }">
	<input type="hidden" name="cOrderer" value="${session.user.id }">
	<input type="hidden" name="cPname" value="${resultClass.pName }">
	<input type="hidden" name="cPprice" value="${resultClass.pPrice }">
	
	<table border="1">
		<tr>
			<td rowspan ="6" >Image</td>
			<td>Information</td>
			<td>${resultClass.pInnerContent}</td>
		</tr>
		<tr>
			<td>Price</td>
			<td>${resultClass.pPrice} </td>
		</tr>
		
		<tr>
			<td>Amount</td>
			<td>
				<select name="cAmount">
					<option value="1">1</option>	
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
			</td>
		</tr>
		
		
		<tr>
			<td></td>
			<td><input type ="button" value ="Buy"></td>
		</tr>
		
		<c:if test="${session.user.id != null }">
		<tr>
			<td></td>
			<td><input type ="submit" value ="Cart"></td>
		</tr>
		</c:if>
		<tr>
			<td></td>
			<td><a href="qnaList.action?pRecNum=${resultClass.pNum }"><input type ="button" value ="QnA"></a></td>
		</tr>
		<tr>
			<td></td>
			<td><a href="qnaWrite.action?pRecNum=${resultClass.pNum }"><input type ="button" value ="Write QnA"></a></td>
		</tr>
	</table>
</form>
</center>
</body>
</html>