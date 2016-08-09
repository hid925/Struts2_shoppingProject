<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Edit</title>
</head>
<body>

<center>
<div class="margin" style="height:80px">
</div>
<form action="adminEditDone.action" method="post" enctype="multipart/form-data">
	<input type="hidden" name="pNum" value="${resultClass.pNum }"/>
	<input type="hidden" name="currentPage" value="${ currentPage }">	<!-- 어디에  쓰이냐? -->
	
	<table border="1" cellpadding="1" cellspacing="1">
		<tr>
			<td><input type="hidden" name="pAuthor" value="noname"></td>
		</tr>
	
		<tr>
			<td>Pro_name</td>
			<td><input type="text" name="pName" value="${resultClass.pName }"></td>
		</tr>
		
		<tr>
			<td>Pro_price</td>
			<td><input type="text" name="pPrice" value="${resultClass.pPrice }"></td>
		</tr>
		
		<tr>
			<td>Pro_color</td>
			<td><select name="pColor">
				<option selected value="${resultClass.pColor}">-- ${resultClass.pColor } --</option>
				<option value="Red">Red</option>
				<option value="Orange">Orange</option>
				<option value="Yellow">Yellow</option>
				<option value="Green">Green</option>
				<option value="Blue">Blue</option>
				<option value="Navy">Navy</option>
				<option value="Violet">Violet</option>	
			</select></td>
		</tr>
		
		<tr>
			<td>Pro_size</td>			
			<td><select name="pSize">
				<option selected value="${resultClass.pSize }">-- ${resultClass.pSize } --</option> 
				<option value="L">Large</option>
				<option value="M">Medium</option>
				<option value="S">Small</option>
				<option value="Free">Free</option>	
			</select></td>
		</tr>
		
		<tr>
			<td>Pro_innerCon</td>
			<td><textarea name="pInnerContent" rows="5" cols="20">${resultClass.pInnerContent }</textarea></td>
		</tr>
		
		<tr>
			<td>Pro_outerCon</td>
			<td><textarea name="pOuterContent" rows="5" cols="20">${resultClass.pOuterContent }</textarea></td>
		</tr>
		
		<tr>
			<td>Pro_amonut</td>
			<td><input type="text" name="pAmount" value="${resultClass.pAmount }"></td>
		</tr>
		
		<tr>
			<td>Pro_cate</td>
			<td><select name="pCategory">
				<option selected value="${resultClass.pCategory }">-- ${resultClass.pCategory } --</option>
				<option value="Outer">Outer</option>
				<option value="Top">Top</option>
				<option value="Bottom">Bottom</option>
				<option value="Acc">Acc</option>	
			</select></td>
		</tr>
		
		<tr>
			<td>Pro_file</td>
			<td><input type="file" name="uploads"/>
			<c:if test="resultClass.pOrgFile1 != null">
				${resultClass.pOrgFile1} 파일이 등록되어 있습니다. 다시 업로드 하면 기존의 파일은 삭제 됩니다.
			</c:if></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="file" name="uploads"/>
			<c:if test="resultClass.pOrgFile2 != null">
				${resultClass.pOrgFile2} 파일이 등록되어 있습니다. 다시 업로드 하면 기존의 파일은 삭제 됩니다.
			</c:if></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="file" name="uploads"/>
			<c:if test="resultClass.pOrgFile3 != null">
				${resultClass.pOrgFile3} 파일이 등록되어 있습니다. 다시 업로드 하면 기존의 파일은 삭제 됩니다.
			</c:if></td>
		</tr>
		
		<tr>
			<td>
				<input type="submit" value="Edit">
				<input type="reset" value="reset">
			</td>
		</tr>
	</table>
</form>
</center>

</body>
</html>