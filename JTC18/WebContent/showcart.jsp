<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ShowCart.jsp</title>
</head>
<body>
	<center>
		<h1>JTC BookStore</h1>
		<h2>Book Search</h2>
	</center>
	<%
	Object object = request.getAttribute("MSG");
	if (object != null) {
	%>
	<br />
	<center>
		<font color="red" size="6"><%=object%></font>
	</center>
	<%
	} else {
	object = request.getAttribute("Cart");
	ArrayList<String> blist = (ArrayList<String>) object;
	for (String bnm : blist) {
	%>
	<form action="removefromcart.jtc" method="post">
		<input type="hidden" name="bname" value="<%=bnm%>" /> <font size="5"><%=bnm%>
			<input type="submit" value="Remove From Cart" /> </font>
	</form>
	<%
	}
	%>
	<br />
	<center>
		<a href="placeorder.jsp">PLACE ORDER</a>
	</center>
	<%
	}
	%>
</body>
</html>