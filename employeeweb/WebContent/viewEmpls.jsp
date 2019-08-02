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
	<table border="3">
	<tr>
		<th>empcode</th>
		<th>empname</th>
		<th>job</th>
		<th>salary</th>
		<th>datejoin</th>
		<th>update</th>
		<th>delete</th>
	</tr>
	<c:forEach var="emp" items="${empls }">
		<tr>
			<td><c:out value="${emp.empcode }"></c:out></td>
			<td><c:out value="${emp.empname }"></c:out></td>
			<td><c:out value="${emp.job }"></c:out></td>
			<td><c:out value="${emp.salary }"></c:out></td>
			<td><c:out value="${emp.datejoin }"></c:out></td>
			<td><a href="UpdateEmployee?empcode=${emp.empcode }">update</a></td>
			<td><a href="DeleteServlet?empcode=${emp.empcode }">delete</a></td>
			
		</tr>
	</c:forEach>
	
	</table>
</body>
</html>