<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>登录</title>
	<meta charset="UTF-8">
	<script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
</head>
<body>
<form>
	用户名:<input type="text" name="username" id="username"><br>
	密码：<input type="password" name="password" id="password">
</form>
<button id="b">提交</button>
<p id="p"></p>
<script>
    $("#b").click(function () {
        $.ajax({
            url: "myservlet",
            type: "POST",
            dataType: "json",
            contentType: "application/json;charset=utf-8",
            data: JSON.stringify(
                {
                    "username": $("#username").val(),
                    "password": $("#password").val()
                }
            ),
            success: function (message) {
                $("#p")[0].innerText = message["message"];
            },
            error: function (message) {
                console.log(message);
            }
        });
    });
</script>
</body>
</html>
