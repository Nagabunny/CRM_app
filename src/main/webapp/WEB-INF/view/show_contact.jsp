<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>contact</title>
</head>
<body>
<h2>Show Contact Details </h2>
<hr>
 <%@ include file="menu.jsp" %>
	<table border="1">
			<tr>
				<th>Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
				<th>Lead Source</th>
				<th>Mobile</th>
				<th>Billing</th>
			</tr>
			
							<c:forEach var="contact" items="${contact}">  
									<tr>
										<td>${contact.id}</td>
										<td>${contact.firstName}</td>
										<td>${contact.lastName }</td>
										<td>${contact.email }</td>
										<td>${contact.leadSource }</td>
										<td>${contact.mobile}</td>
										<td><a href="getIdForBilling?id=${contact.id}">billing</a></td>
									
									</tr>
							</c:forEach>
		</table>
</body>
</html>