<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- Include the JSTL Core library in JSP --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dynamic Web 2</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="nav-bar.jsp"></jsp:include>
	<div></div>
	<div class="container">
		<br>
		<h3 class="text-center">Users Table</h3>
		<br>
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Address</th>
					<th>Mobile</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="users" items="${listUsers}">
					<tr>
						<%-- c:out => for expressions --%>
						<td><c:out value="${users.id}" /></td>
						<td><c:out value="${users.name}" /></td>
						<td><c:out value="${users.address}" /></td>
						<td><c:out value="${users.mobile}" /></td>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>