<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>Tid</th>
		<th>departure_add</th>
		<th>destination_add</th>
		<th>departure_time</th>
		<th>arrival_time</th>
		<th>price</th>
		<th>Uid</th>
	</tr>
	<c:forEach items="${tickets }" var="ticket">
		<tr>
			<td>${ticket.tid }</td>
			<td>${ticket.departure_add }</td>
			<td>${ticket.destination_add }</td>
			<td>${ticket.departure_time }</td>
			<td>${ticket.arrival_time }</td>
			<td>${ticket.price }</td>
			<td>${ticket.uid }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>