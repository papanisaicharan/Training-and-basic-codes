<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<th>regno</th>
			<th>stdname</th>
			<th>marks</th>
		</tr>
		<c:forEach var="std" items="${stdlist}">
			<tr>
				<td> <c:out value="${std.regno}"></c:out> </td>
				<td> <c:out value="${std.stdname}"></c:out> </td>
				<td> <c:out value="${std.marks}"></c:out> </td>
				<td> <a href="update?regno=${std.regno}">Update</a> </td>
				<td> <a href="delete?regno=${std.regno}">Delete</a> </td>
			</tr>
		</c:forEach>
	</table>
	<a href="addstd">Add new Student.</a>
</body>
</html>