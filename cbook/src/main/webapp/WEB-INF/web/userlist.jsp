<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>uid</th>
		<th>uname</th>
		<th>upassport</th>
		<th>uaddr</th>
		<th>urank</th>
	</tr>
	<c:forEach items="${users }" var="user">
		<tr>
			<td>${user.uid }</td>
			<td>${user.uname }</td>
			<td>${user.upassport }</td>
			<td>${user.uaddr }</td>
			<td>${user.urank }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>