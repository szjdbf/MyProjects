<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" %>
<!-- 网页使用的语言 -->
<html>
<head>
	<!-- 指定字符集 -->
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>修改用户</title>

	<link href="css/bootstrap.min.css" rel="stylesheet">
	<script src="js/jquery-2.1.0.min.js"></script>
	<script src="js/bootstrap.min.js"></script>

</head>
<body>
<div class="container" style="width: 400px;">
	<h3 style="text-align: center;">修改联系人</h3>
	<form action="updateServlet" method="post">
		<input type="hidden" name="id" value="${user.id}">
		<div class="form-group">
			<label for="name">姓名：</label>
			<input type="text" class="form-control" id="name" name="name" value="${user.name}" readonly="readonly"
				   placeholder="请输入姓名"/>
		</div>

		<div class="form-group">
			<label>性别：</label>
			<input type="radio" name="gender" value="男"/>男
			<input type="radio" name="gender" value="女"/>女
		</div>

		<div class="form-group">
			<label for="age">年龄：</label>
			<input type="text" class="form-control" id="age" name="age" value="${user.age}" placeholder="请输入年龄"/>
		</div>

		<div class="form-group">
			<label for="address">籍贯：</label>
			<select name="address" class="form-control" id="address">
				<option value="许昌">许昌</option>
				<option value="周口">周口</option>
				<option value="郑州">郑州</option>
			</select>
		</div>

		<div class="form-group">
			<label for="qq">QQ：</label>
			<input type="text" class="form-control" name="qq" value="${user.qq}" placeholder="请输入QQ号码" id="qq"/>
		</div>

		<div class="form-group">
			<label for="email">Email：</label>
			<input type="text" class="form-control" name="email" value="${user.email}" placeholder="请输入邮箱地址"
				   id="email"/>
		</div>

		<div class="form-group" style="text-align: center">
			<input class="btn btn-primary" type="submit" value="提交"/>
			<input class="btn btn-default" type="reset" value="重置"/>
			<input class="btn btn-default" type="button" value="返回" id="back"/>
		</div>
	</form>
</div>

<script>
    //获取address
    var address = "${user.address}";
    var options = document.getElementsByTagName("option");
    for (var i = 0; i < options.length; i++) {
        if (options[i].value === address) {
            options[i].setAttribute("selected", "true");
            break;
        }
    }
    //获取性别
    var gender = "${user.gender}";
    var genders = document.getElementsByName("gender");
    if (gender === "男") {
        genders[0].setAttribute("checked", "true");
    } else {
        genders[1].setAttribute("checked", "true");
    }

    //返回
    var back = document.getElementById("back");
    back.onclick = function () {
        history.back();
    }
</script>
</body>
</html>