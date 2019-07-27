<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
	<!-- 指定字符集 -->
	<meta charset="utf-8">
	<!-- 使用Edge最新的浏览器的渲染方式 -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
	width: 默认宽度与设备的宽度相同
	initial-scale: 初始的缩放比，为1:1 -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
	<title>用户信息管理系统</title>

	<!-- 1. 导入CSS的全局样式 -->
	<link href="css/bootstrap.min.css" rel="stylesheet">
	<!-- 2. jQuery导入，建议使用1.9以上的版本 -->
	<script src="js/jquery-2.1.0.min.js"></script>
	<!-- 3. 导入bootstrap的js文件 -->
	<script src="js/bootstrap.min.js"></script>
	<style type="text/css">
		td, th {
			text-align: center;
		}
	</style>
</head>
<body>
<div class="container">
	<h3 style="text-align: center">用户信息列表</h3>

	<div style="float: left;">

		<form class="form-inline" action="userPageServlet" method="get">
			<div class="form-group">
				<label for="name">姓名</label>
				<input type="text" class="form-control" name="name" id="name" value="${name}">
			</div>
			<div class="form-group">
				<label for="address">籍贯</label>
				<input type="text" class="form-control" name="address" id="address" value="${address}">
			</div>

			<div class="form-group">
				<label for="email">邮箱</label>
				<input type="text" class="form-control" name="email" id="email" value="${email}">
			</div>
			<button type="submit" class="btn btn-default">查询</button>
		</form>

	</div>
	<form action="delsServlet" method="post">
		<div style="float: right;margin: 5px;">

			<a class="btn btn-primary" href="add.html">添加联系人</a>
			<input type="submit" class="btn btn-primary" value="删除选中"/>

		</div>

		<table border="1" class="table table-bordered table-hover">
			<tr class="success">
				<th><input type="checkbox" id="all" title="全选/取消全选"></th>
				<th>编号</th>
				<th>姓名</th>
				<th>性别</th>
				<th>年龄</th>
				<th>籍贯</th>
				<th>QQ</th>
				<th>邮箱</th>
				<th>操作</th>
			</tr>

			<c:forEach items="${pageBean.users}" var="user" varStatus="s">
				<tr>
					<td><input type="checkbox" class="checks" name="id" value="${user.id}"></td>
					<td>${s.count}</td>
					<td>${user.name}</td>
					<td>${user.gender}</td>
					<td>${user.age}</td>
					<td>${user.address}</td>
					<td>${user.qq}</td>
					<td>${user.email}</td>
					<td><a class="btn btn-default btn-sm" href="selectOneServlet?id=${user.id}">修改</a>&nbsp;<a
							class="btn btn-default btn-sm" onclick="del(${user.id})">删除
					</a>
					</td>
				</tr>
			</c:forEach>


		</table>
	</form>
	<div align="center">
		<nav aria-label="Page navigation">
			<ul class="pagination">
				<li id="li_last">
					<a aria-label="Previous" id="previous">
						<span aria-hidden="true">&laquo;</span>
					</a>
				</li>
				<c:forEach begin="1" end="${pageBean.totalPage}" var="i">
					<li id="${i}"><a
							href="userPageServlet?currentPage=${i}&rows=${pageBean.rows}&name=${name}&address=${address}&email=${email}">${i}</a>
					</li>
				</c:forEach>
				<li id="li_next">
					<a aria-label="Next" id="next">
						<span aria-hidden="true">&raquo;</span>
					</a>
				</li>
				<span style="font-size: 25px;margin-left: 5px;">
                    共${pageBean.totalCount}条记录;${pageBean.totalPage}页
                </span>
				<span style="font-size: 25px;margin-left: 5px;">
                   每页显示<select name="rows" id="rows">
					<option value="5" <c:if test="${pageBean.rows==5}">selected</c:if>>5</option>
					<option value="10" <c:if test="${pageBean.rows==10}">selected</c:if>>10</option>
					<option value="15" <c:if test="${pageBean.rows==15}">selected</c:if>>15</option>
					<option value="20" <c:if test="${pageBean.rows==20}">selected</c:if>>20</option>
				</select>
                </span>
			</ul>
		</nav>


	</div>


</div>


<script>
    function del(id) {
        var b = confirm(" 确认删除?");
        if (b) {
            window.location = "delServlet?id=" + id;
        }
    }

    //全选/取消全选
    var all = document.getElementById("all");
    all.onclick = function () {
        //获取所有多选框
        var checks = document.getElementsByClassName("checks");
        for (var i = 0; i < checks.length; i++) {
            checks[i].checked = all.checked;
        }
    };

    //删除选中
    var form = document.getElementsByTagName("form")[1];
    form.onsubmit = function () {
        var b = confirm("确认删除选中的用户?");
        if (b) {
            //判断是否有选中的值
            var checks = document.getElementsByClassName("checks");
            for (var i = 0; i < checks.length; i++) {
                if (checks[i].checked === true) {
                    return true;
                }
            }
        }
        return false;
    };

    //给当前页加上active
    var currentPage = "${pageBean.currentPage}";
    var li = document.getElementById(currentPage);
    li.className = "active";

    //上一页/下一页
    var li_last = document.getElementById("li_last");
    var li_next = document.getElementById("li_next");
    var previous = document.getElementById("previous");
    var next = document.getElementById("next");

    if (currentPage == 1) {
        li_last.className = "disabled";
    } else {
        previous.href = "userPageServlet?currentPage=" + (+currentPage - 1) + "&rows=${pageBean.rows}&name=${name}&address=${address}&email=${email}";
    }
    if (currentPage == "${pageBean.totalPage}") {
        li_next.className = "disabled";
    } else {
        next.href = "userPageServlet?currentPage=" + (+currentPage + 1) + "&rows=${pageBean.rows}&name=${name}&address=${address}&email=${email}";
    }


    //设置每页显示的条数
    var rows = document.getElementById("rows");
    rows.onchange = function () {
        //获取当前的值
        var v = rows.value;
        location = "userPageServlet?rows=" + v + "&name=${name}&address=${address}&email=${email}";
    }
</script>

</body>
</html>
