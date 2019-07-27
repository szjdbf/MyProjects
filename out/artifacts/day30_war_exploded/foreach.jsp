<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Title</title>
</head>
<body>

<%--把数组存放到pageContext中--%>
<%
	int[] arr = {1320, 40665, 465, 1, 3243, 46, 123, 165, 4, 6, 46, 8, 54, 654, 8};
	pageContext.setAttribute("arr", arr);

%>

<c:forEach items="${arr}" var="i">
	${i}&emsp;
</c:forEach>
<hr>

<c:forEach begin="0" end="10" var="i" step="4">

	<h4>${i}</h4>

</c:forEach>


</body>
</html>
