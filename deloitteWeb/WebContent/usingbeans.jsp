<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="emp" class="day3.Employee"></jsp:useBean>
	<jsp:setProperty property="code" name="emp" value="1234"/>
	<jsp:setProperty property="name" name="emp" value="saicharan"/>
	
	Employee code = <jsp:getProperty property="code" name="emp"/><br>
	Employee name = <jsp:getProperty property="name" name="emp"/>
</body>
</html>