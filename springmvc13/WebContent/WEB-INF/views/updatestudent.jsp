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
	<c:out value="${regno}"></c:out>

</body>
</html>

	<form action="updatestudent" method="post">
		Enter the regno : <input type="hidden" name="regno" value="<c:out value="${regno1}"/>" /> <br/>
		Enter the stdname : <input type="text" name="stdname"/><br/>
		Enter the marks : <input type="number" name="marks"/><br/>
		<input type="submit">
	</form>