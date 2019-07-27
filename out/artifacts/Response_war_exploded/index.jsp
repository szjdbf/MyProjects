<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
	<title>首页</title>
	<script src="js/jquery-3.4.1.js"></script>
</head>
<body>
<a href="a">ServletA</a>
<br>

验证码:<img src="checkcode"><a href="javascript:void(0);">看不清,再来一张?</a>

<script>
    $("a")[1].onclick = function () {
        $("img")[0].src = "checkcode?" + new Date().getTime();
    };
</script>
</body>
</html>