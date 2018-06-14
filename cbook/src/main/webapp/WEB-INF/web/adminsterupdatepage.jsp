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

		</tr>
		<form action="/UpdateAdmin" method="post">
		<tr>
			<td><input type="text" name="adid" value="${adminster.adid }"></td>
			<td><input type="text" name="adname" value="${adminster.adname }"></td>
			<td><input type="password" name="adpassword" value="${adminster.adpassword }"></td>
			<td><input type="text" name="adgender" value="${adminster.adgender }"></td>
			<td><input type="text" name="adphone" value="${adminster.adphone }"></td>
			<td><input type="submit" value="提交"></td>
		</tr>
		</form>
	</table>
</body>
</html>