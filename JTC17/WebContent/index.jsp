<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index.jsp</title>
</head>
<body>
	<h1>This is Index Jsp</h1>
	<%
	String str = "jtc";
	application.setAttribute("MSG", str);
	application.setAttribute("MSG", "Java Training Center");
	List<String> emails = new ArrayList<String>();
	emails.add("som@jtc.com");
	emails.add("Rahul@jtc.com");
	emails.add("Neha@jtc.com");
	emails.add("Rahul@jtc.com");
	application.setAttribute("EMAILS", emails);
	%>
	<a href="show.jsp">Show Data</a>

</body>
</html>