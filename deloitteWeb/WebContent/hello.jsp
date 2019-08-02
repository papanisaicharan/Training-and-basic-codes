<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- this is a comment bro --%>
	<h1> this is a jsp page</h1>
	<%! int x =10; %>
	<%= x++ %>
	<h3>x value is <%= x %></h3>
	<%if(x>0){ %>
		<h3> it is positive</h3>
	<%}else{ %>
		<h3>it is negative</h3>
	<% } %>
	
</body>
</html>