<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index.jsp</title>
</head>
<body>
	<center>
		<h1>JTC Bookstore</h1>
		<h2>Book Search</h2>
		<form action="searchbooks.jtc" method="post">
			<table>
				<tr>
					<td><select name="category">
							<option value="java">java</option>
							<option value="Testing">Testing</option>
							<option value=".Net">.Net</option>
							<option value="SAP">SAP</option>
					</select></td>
				</tr>
				<tr>
					<td><input type="submit" value="SearchBooks" /></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>