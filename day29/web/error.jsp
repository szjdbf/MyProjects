<%@ page contentType="text/html;charset=UTF-8" isErrorPage="true" %>
<html>
<head>
	<title>错误</title>
</head>
<body>
<h1>服务器错误</h1>
<!-- 当指定isErrorPage="true",才能使用exception对象 -->
<%=exception.getMessage()%>
</body>
</html>