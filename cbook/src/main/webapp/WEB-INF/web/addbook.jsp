<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加书</title>
</head>
<body>
	<form action="/AddBookFunc" method="post">
		<table>
			<tr>
				<td>书名：</td>
				<td><input type="text" name="bname" /></td>
			</tr>
			<tr>
				<td>作者：</td>
				<td><input type="text" name="bauthor" /></td>
			</tr>
			<tr>
				<td>国家：</td>
				<td><input type="text" name="bnation" /></td>
			</tr>
			<tr>
				<td>价格：</td>
				<td><input type="text" name="bprice" /></td>
			</tr>
			<tr>
				<td>存储：</td>
				<td><input type="text" name="bstock" /></td>
			</tr>
			<tr>
				<td>热：</td>
				<td><input type="text" name="bhot" /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" value="提交" /></td>
			</tr>
		</table>
	</form>

</body>
</html>