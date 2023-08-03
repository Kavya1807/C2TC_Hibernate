<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login success page</title>
</head>
<body bgcolor="lightblue">
	<div align="center">
		<h1>You have logged in  successfully</h1>
		
		<%= "WELCOME  "+request.getParameter("username") %>
	</div>
	
	
</body>
</html>