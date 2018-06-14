<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>administer list</title>
</head>
<body>
	<table>
		<tr>
			<th>adid</th>
			<th>adname</th>
			<th>adpassword</th>
			<th>adgender</th>
			<th>adphone</th>
			<th>-----</th>
			<th>-----</th>
			
		</tr>
		<c:forEach items="${adminsters }" var="admin">
			<tr>
				<td>${admin.adid }</td>
				<td>${admin.adname }</td>
				<td>${admin.adpassword }</td>
				<td>${admin.adgender }</td>
				<td>${admin.adphone }</td>
				<td><a href="/EditAdmin/${admin.adid }">删除信息</a></td>
				<td><a href="/UpdateAdminPage/${admin.adid }">更新信息</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>