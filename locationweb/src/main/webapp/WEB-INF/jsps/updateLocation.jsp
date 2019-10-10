<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
	<form action="updateLoc" method="post">
		<pre>
		Id:<input type="text" name="id" value="${location.id}" readonly />
		 Code:<input type="text" value="${location.code}" name="code" />
		Name:<input type="text" name="name" value="${location.name}" />
		 Type: Urban<input type="radio"
				value="${location.type=='urban'?'checked':''}" name="type" />
				 Rural<input type="radio" name="type"
				value=${location.type=='rural'?'checked':''} /> 
				<input type="Submit" value="save" />
			</pre>
	</form>
	${msg}
	<a href="displayLocations">View All</a>
</body>
</html>