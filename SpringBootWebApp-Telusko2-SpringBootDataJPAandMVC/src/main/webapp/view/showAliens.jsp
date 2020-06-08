<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List Of All Aliens</h1>
	<table border="1">
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Tech</th>
		</tr>
		<c:forEach var="temp" items="${aliens}">
		<tr>
			<td>${temp.aid}</td>
			<td>${temp.anme}</td>
			<td>${temp.tech}</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>