<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>登录</title>
	<!--Bootstrap-->
	<link rel="stylesheet" href="css/bootstrap.css">
	<!--jQuery-->
	<script src="js/jquery-3.4.1.js"></script>
	<!--Bootstrap的JS文件-->
	<script src="js/bootstrap.js"></script>
</head>
<body>
${requestScope.msg}
<form action="login" method="get">
	<div class="form-group">
		<label for="username">用户名</label>
		<input type="text" class="form-control" id="username" name="username" placeholder="请输入用户名">
	</div>
	<div class="form-group">
		<label for="password">密码</label>
		<input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
	</div>
	<div class="form-group">
		<label for="checkcode">验证码</label>
		<input type="text" class="form-control" id="checkcode" name="checkcode" placeholder="请输入验证码">
	</div>
	<img src="checkcode">
	<button type="submit" class="btn btn-default">登录</button>
</form>

</body>
</html>