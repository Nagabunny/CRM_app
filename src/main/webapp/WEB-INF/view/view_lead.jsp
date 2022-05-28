<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view lead</title>
</head>
<body>
<h2>Lead | new Lead</h2>
<hr>
	<%@ include file="menu.jsp" %>

	<form action="savelead" method="post">
		<pre>
				First Name:<input type="text" name="firstName"/>
				Last Name:<input type="text" name="lastName"/>
				Email:<input type="email" name="email"/>
				Lead Source:
					<select name="leadSource">
					  <option value="TV ads">TV ads</option>
					  <option value="online">Online</option>
					  <option value="news paper">News paper</option>
					  <option value="telegram">Telegram</option>
					  <option value="Twitter">Twitter</option>
					</select>
				
				Mobile:<input type="text" name="mobile"/>
				
				<input type="submit" value="save"/>
				
				${error }
		</pre>
	</form>
</body>
</html>