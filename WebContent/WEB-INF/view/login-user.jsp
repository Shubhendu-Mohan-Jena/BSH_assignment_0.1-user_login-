<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>User Login Page</title>

	<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/style.css">
		
		<link type="text/css"
		rel="stylesheet"
		href="${pageContext.request.contextPath}/resources/css/add-customer-style.css">

</head>
<body>
	
	<div id="wrapper">
		<div id="header">
			<h2>URM - User Relationship Manager</h2>
		</div>
	</div>

	
<div id="container">
		<h3>Enter your login details</h3>
		
		<form action="checkUser"  method="POST">
		
		<table>
		
			<tbody>
				<tr>
						<td><label>Email :</label></td>
						<td><input type="text" name="check_email" placeholder="Enter email"/></td>
				</tr>
				
				<tr>
						<td><label>Password :</label></td>
						<td><input type="password" name="check_password" placeholder = "Enter password" /></td>
				</tr>
				
				<tr>
						<td><label></label></td>
						<td><input type="submit" value="Submit" class="save"/></td>
				</tr>
				
			</tbody>
			
		</table>
		
		</form>
		
	</div>
	
	<div>${errorMessage}</div>
</body>

</html>
