<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>EL表达式</title>
</head>
<body>


<h2>取List集合的数据</h2>

${requestScope.list[0]}<br>
${requestScope.list[1]}<br>
${requestScope.list[2]}<br>
${requestScope.list[3]}<br><%--当索引越界时不会报错,而是会输出空字符串--%>

<hr>

<h2>取Map集合的数据</h2>
${requestScope.map.username}<br>
${requestScope.map.password}<br>
${requestScope.map["username"]}<br>
${requestScope.map["password"]}<br>

<hr>
</body>
</html>
