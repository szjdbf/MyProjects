<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>首页</title>
	<script src="js/jquery-3.4.1.js"></script>
</head>
<body>
用户名<input type="text" name="username" id="username">
密码<input type="text" name="password" id="password">
<button id="submit">提交</button>


<!--Ajax提交-->
<script>
    $("#submit")[0].onclick = function () {
        $.ajax({
            url: "login",
            //必须是post请求
            type: "post",
            dataType: "json",
            data: {"username": $("#username").val(), "password": $("#password").val()}
        })
    }
</script>

</body>
</html>
