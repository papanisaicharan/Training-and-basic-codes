<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int choice = 1; %>
<%switch(choice){
case 1: {%>
	<h3>this is one.</h3>
<% } break; case 2: { %>
	<h3>this is two</h3>
	<%} break; default : {%>
		<h3> not applicable</h3>
		<%}} %>
</body>
</html>