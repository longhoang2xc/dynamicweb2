<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<jsp:include page="nav-bar.jsp"></jsp:include>
	<br>
	
	<form action="insert" method="post">
		<h3 class="text-center">ADD USER</h3>
		<fieldset class="form-group">
			<label>Name</label> <input type="text" class="form-control" name="name" required="required">
			<label>Address</label> <input type="text" class="form-control" name="address" required="required">
			<label>Mobile</label> <input type="text" class="form-control" name="mobile" required="required">
		
		</fieldset>
		<button type="submit" class="btn btn-success">ADD</button>
		
<!--	Name: <input type="text" name="name"> 		<br><br>
		Address: <input type="text" name="address"> <br><br>
		Mobile: <input type="text" name="mobile"> 	<br><br>
		
		<input type="submit" value="add"> 
-->
	</form>
	
</body>
</html>
