<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>compose</title>
</head>
<body>
<h2>Send Email</h2>
<hr>
	 <%@ include file="menu.jsp" %>
	 
		<form action="send" method="post">
			<pre>
				To<input type="email" name="to" value="${to}">
				Subject<input type="text" name="sub">
				<textarea name=message rows="20" cols="50">
				</textarea>
				<input type="submit" value="send">
			</pre>
		</form>
		${msg }
</body>
</html>