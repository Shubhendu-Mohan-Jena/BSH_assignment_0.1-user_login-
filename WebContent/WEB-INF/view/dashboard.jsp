
<!DOCTYPE html>
<html>
<head>

<title>Welcome Dashboard</title>

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
			<h3> Welcome ${user.name} </h3>
	</div>
</body>
</html>