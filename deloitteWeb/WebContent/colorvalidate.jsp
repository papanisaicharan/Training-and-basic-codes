<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		
<%char color = request.getParameter("color").toUpperCase().charAt(0); %>
<%switch(color){
case 'R': {%>
	<h3>It is <span style="background-color : red;">red</span> color.</h3>
<% } break; case 'B': { %>
	<h3>It is <span style="background-color : blue;">blue</span> color.</h3>
	<% } break; case 'G': { %>
	<h3>It is <span style="background-color : green;">green</span> color.</h3>
	<%} break; default : {%>
		<h3> not applicable</h3>
		<%}} %>

</body>
</html>