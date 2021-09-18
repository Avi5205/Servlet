<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is Index Jsp</h1>
	<%
	for (int i = 0; i < 5; i++) {
		System.out.println(i);
		out.write("<br.>" + i);
	}
	%>
	<br /> Current Time
	<%
	Date dt = new Date();
	out.write("<br/>" + dt);
	String str = "JTC";
	%>
	<br />
	<font color="red" size="5"><%=dt%></font>
	<br />
	<font color="red" size="5"><%=str%></font>

</body>
</html>