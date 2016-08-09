<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>P_View</title>
<style>
A:link    { text-decoration:none;}
A:visited    { text-decoration:none;}
A:active    { text-decoration:none;}
A:hover    { text-decoration:none;}
</style>
</head>
<body>
<div class="margin" style="height:80px">
</div>
	<form>
	<p>this is product view</p>
		<table border="1" cellspacing="0" cellpadding="0" align="center" width="650">
				<% int cnt=0; %>
				<tr>
					<c:forEach var="dto" items="${list}">
						<td>
							<table>
								<tr>
									<td width="150"><a href="javascript:location.href='productView.action?pNum=${dto.pNum }'"> 
									<img width="50" height="50" src="/jsp/uploadFile/file_52_0.jpeg"></a>    </td>
									<td>C:/uploadFile/file_${dto.pNum}_0.jpeg
								</tr>
								<tr>
									<td>${dto.pName}
									</td>
								
								</tr>
							</table>
						</td>
						<% cnt++; %>
						<% if(cnt%3==0){%></tr><tr><%} %>
					</c:forEach>
				</tr>	
			</table>
	</form>
</body>
</html>


			
