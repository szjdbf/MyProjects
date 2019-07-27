<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>foreach练习</title>
</head>
<body>


<table border="1px solid" cellspacing="0">
	<tr>
		<td>ID</td>
		<td>Name</td>
		<td>Sex</td>
	</tr>

	<c:forEach items="${users}" var="user">
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.sex}</td>
		</tr>
	</c:forEach>
</table>


</body>
</html>
