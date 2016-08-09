<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin List</title>
</head>
<body>
<div class="margin" style="height:80px">
</div>
	<a href="adminWrite.action">Write</a>
	<table>
		<tr>
			<td width="5%">No</td>
			<td width="10%">Category</td>
			<td width="10%">Image</td>
			<td width="45%">Title</td>
			<td width="10%">Author</td>
			<td width="10%">Wdate</td>
			<td width="10%">Readhit</td>
		</tr>
		<c:forEach var="dto" items="${list}">
		<c:if test="list == null">
			등록된 데이터가 없습니다.
		</c:if>
		
		<s:url id="viewURL" action="adminDetail.action">
			<s:param name="pNum"><s:property value="pNum"/></s:param>
			<s:param name="currentPage"><s:property value="currentPage"/></s:param>		
		</s:url>
		
		<tr>
			<td>${dto.pNum }</td>
			<td>${dto.pCategory }		</td>
			<td>${dto.pFileName1 }		</td>				
			<td><a href="adminDetail.action?pNum=${dto.pNum }"> ${dto.pName } </a>
			<%-- <s:a href="%{viewURL}">	</s:a> --%></td>
			
			<td>${dto.pAuthor }		</td>
			<td>${dto.pWdate }		</td>
			<td>${dto.pReadHit }		</td>
		</tr>
		</c:forEach>
		
		
		<s:if test="list.size() <= 0">
			<tr>
				<td colspan="5" align="center">등록된 게시물이 없습니다.</td>
			</tr>
		</s:if>
		<tr>
			<td align="center" colspan="5">
			<s:property value="pagingHtml" escape="false"/>
			</td>
		</tr>
	</table>
</body>
</html>