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
	<c:set var="name" value="deloitte"> </c:set>
	<c:out value="${name}"></c:out>
	<c:out value="hello"></c:out>
	<c:out value="${name}"></c:out>
	<c:if test="${name eq 'deloitte'}">
		<c:out value="It is deloitte"></c:out>
	</c:if>
</body>
</html>