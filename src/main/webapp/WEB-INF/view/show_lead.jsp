<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show Lead</title>
</head>
<body>
<h2>Lead | Show All Leads</h2>
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
			</tr>
			
							<c:forEach var="lead" items="${lead}">  
									<tr>
										<td>${lead.id}</td>
										<td><a href="getLeadById?id=${lead.id}">${lead.firstName }</a></td>
										<td>${lead.lastName }</td>
										<td>${lead.email }</td>
										<td>${lead.leadSource }</td>
										<td>${lead.mobile}</td>
									
									</tr>
							</c:forEach>
		</table>
		${msg }

</body>
</html>