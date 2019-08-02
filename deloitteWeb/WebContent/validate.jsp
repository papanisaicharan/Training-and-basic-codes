<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%String user = request.getParameter("user"); %>
	<%if(user.equals("admin")){ %>
		<jsp:forward page="Admin"></jsp:forward>
	<%} else { %>
		<h2>unauthorized access</h2>
		<jsp:include page="form.jsp"></jsp:include>
	<%} %>
</body>
</html>