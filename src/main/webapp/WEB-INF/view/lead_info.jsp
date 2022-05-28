<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>lead information</title>
</head>
<body>
<h2>Lead | Show Lead Information</h2>
<hr>
 <%@ include file="menu.jsp" %>
		<pre>
			First Name	:${lead.firstName }
			Last Name	:${lead.lastName }
			Email		:${lead.email }
			Lead Source	:${lead.leadSource }
			Mobile		:${lead.mobile }
		</pre>
		
		<form action="sendemail" method="post">
			<pre>
					<input type="hidden" name="email" value="${lead.email }">
					<input type="submit" value="send email">
			</pre>
		</form>
		
		<form action="convertToContact" method="post">
			<pre>
					<input type="hidden" name="id" value="${lead.id}">
					<input type="submit" value="convert">
			</pre>
		</form>
</body>
</html>