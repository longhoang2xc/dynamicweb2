<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<%-- TO-DO: CREATE A NAVIGATION BAR WHICH INCLUDES HYPERLINK TO ADD & VIEW USER FORM --%>
	<header>
		<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<ul class="nav navbar-nav">
				<li><a href="<%=request.getContextPath() %>/list">USER TABLE</a></li>
				<li><a href="<%=request.getContextPath() %>/new">ADD USER</a></li>
				<li><a href="<%=request.getContextPath() %>/update">UPDATE USER</a></li>
				<li><a href="<%=request.getContextPath() %>/delete">DELETE USER</a></li>
			</ul>
		</div>
		</nav>
	</header>
</body>
</html>