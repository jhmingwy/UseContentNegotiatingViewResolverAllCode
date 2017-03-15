<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctp" value="${pageContext.request.contextPath }"></c:set>
<link href="${ctp}/static/css/style.css" rel="stylesheet" type="text/css">

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table class="query_form_table" border="0" cellPadding="3" cellSpacing="0" align="center">
		<tr>
			<td><a
				href="http://localhost:8080/UseContentNegotiatingViewResolverAllCode/demo/1/user.pdf">user/1.pdf</a></td>
		</tr>
		<tr>
			<td><a
				href="http://localhost:8080/UseContentNegotiatingViewResolverAllCode/demo/2/user.xls">user/2.xls</a></td>
		</tr>
		<tr>
			<td><a
				href="http://localhost:8080/UseContentNegotiatingViewResolverAllCode/demo/3/user.json">user/3.json</a></td>
		</tr>
		<tr>
			<td><a
				href="http://localhost:8080/UseContentNegotiatingViewResolverAllCode/demo/4/user.xml">user/4.xml</a></td>
		</tr>
		<tr>
			<td><a
				href="http://localhost:8080/UseContentNegotiatingViewResolverAllCode/demo/5/user.html">user/5.html</a></td>
		</tr>
		<tr>
			<td><a
				href="http://localhost:8080/UseContentNegotiatingViewResolverAllCode/demo/6/user">user/6.jsp</a></td>
		</tr>

	</table>
<img src="${ctp}/static/logo.jpg"/>
</body>
</html>