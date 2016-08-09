<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>admin Detail</title>
</head>
<body>
<div class="margin" style="height:80px">
</div>
<center>
<form action="qnaEditDone.action" method="post" enctype="multipart/form-data">
	<input type="hidden" name="pAuthor" value="${dto.pAuthor }">
	<c:set var="dto" value="${resultClass }"></c:set>
	<table border="1" cellpadding="10" cellspacing="10">	
		<tr>
			<td>Pro_name</td>
			<td width="150">${dto.pName }</td>
		</tr>
		
		<tr>
			<td>Pro_price</td>
			<td>${dto.pPrice }</td>
		</tr>
		
		<tr>
			<td>Pro_color</td>
			<td>${dto.pColor }</td>
		</tr>
		
		<tr>
			<td>Pro_size</td>
			<td>${dto.pSize }</td>
		</tr>
		
		<tr>
			<td>Pro_innerCon</td>
			<td>${dto.pInnerContent }</td>
		</tr>
		
		<tr>
			<td>Pro_outerCon</td>
			<td>${dto.pOuterContent }</td>
		</tr>
		
		<tr>
			<td>Pro_amonut</td>
			<td>${dto.pAmount }</td>
		</tr>
		
		<tr>
			<td>Pro_category</td>
			<td>${dto.pCategory }</td>
		</tr>
		
		<tr>
			<td>Pro_file1</td>
			<td>${dto.pOrgFile1 }</td>
		</tr>
		<tr>
			<td>Pro_file2</td>
			<td>${dto.pOrgFile2 }</td>
		</tr>
		<tr>
			<td>Pro_file3</td>
			<td>${dto.pOrgFile3 }</td>
		</tr>
		
		<tr>
			<td><a href="adminEdit.action?pNum=${dto.pNum }" > <input type="button" value="Edit"></a></td>
			<td><a href="adminDelete.action?pNum=${dto.pNum }"> <input type="button" value="Delete"></a></td>
		</tr>
		
		
	</table>
</form>
</center>


</body>
</html>