<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>This is home page</h1>
<%
Integer name=(Integer)request.getAttribute("name");
String li=(String)request.getAttribute("lists");
%>
<%=name %>
<%


	out.println(li);

%>
</body>
</html>