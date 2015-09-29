<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="/Tsme/css/login/login.css"/>
<script type="text/javascript" src="/Tsme/js/jQuery/jquery-1.7.2.js"></script>
<script type="text/javascript" src="/Tsme/js/login/login.js"></script>
</head>
<body onload="changeCheckNum()">
	<div class="wrap">
		<h>登录</h>
		<div>
			<form action="/Tsme/login/userLogin" method="post" id="form">
				<ul>
					<li><span>用户名</span><input type="text" name="username" value="${username}"></li>
					<li><span>密码</span><input type="text" name="password" value="${password}"></li>
					<li><span>验证码</span><input type="text" name="checkNum"><img id="checkNumImage" onclick="changeCheckNum()" title="点击换一张"></li>
					<li><a class="asub"><span class="submit" onclick="submit()">登录</span></a><span class="error">${msg}</span></li>
				</ul>
			</form>
		</div>
	</div>
</body>
</html>