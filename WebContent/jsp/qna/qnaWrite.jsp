<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<center>
<form action="qnaInsert.action" method="post" >

<input type="hidden" name="pRecNum" value="${admin.pNum}"> 
	<center>
	<table border="1" cellpadding="1" cellspacing="1">
		<p>Qna Write </p>
		<tr>
			<td>Title </td>
			<td><input type="text" name="qnaTitle"></td>
		</tr>
		<tr>
			<td>Name</td>
			<td><input type="text" name="qnaName" value="${session.user.id }"></td>
		</tr>
		
		<tr>
			<td>Contents</td>
			<td><textarea name="qnaContents"></textarea></td>
		</tr>
	
		<tr><td><input type="submit" value="Ok"></td></tr>
	</table>
	</center>
</form>
</center>
</body>
</html>