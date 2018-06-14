<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<th>adid</th>
			<th>adname</th>
			<th>adpassword</th>
			<th>adgender</th>
			<th>adphone</th>
		</tr>
		<c:forEach items="${adminsters }" var="adminster">
			<tr>
				<td>${admin.adid }</td>
				<td>${admin.adname }</td>
				<td>${admin.adpassword }</td>
				<td>${admin.adgender }</td>
				<td>${admin.adphone }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>