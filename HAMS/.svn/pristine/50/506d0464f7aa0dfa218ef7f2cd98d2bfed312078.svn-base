<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>>">
<meta charset="utf-8">
<title>登录</title>
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="./css/style.css">
<link rel="icon" type="image/png" href="images/logo.png">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- <script type="text/javascript" src="js/main.js"></script> -->
</head>
<body class="bg-success">
	<div class="panel panel-info col-sm-4 login ">
		<div class="panel-heading">
			<h3 class="panel-title" align="center">欢迎登录苏州历史建筑管理系统</h3>
		</div>
		<div class="panel-body">
			<form class="form-horizontal" role="form" action="loginSuccess"
				method="post" onsubmit="return loginCheck()">
				<div class="form-group">
					<label class="col-sm-2 control-label">账号:</label>
					<div class="col-sm-10">
						<input class="form-control" id="account" type="text"
							name="account" placeholder="请输入账号！">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label"> 密码:</label>
					<div class="col-sm-10">
						<input class="form-control" id="password" type="password"
							name="password" placeholder="请输入密码！">
					</div>
				</div>
				<div class="form-group">
					<font class="msg">${msg}</font> <a href="skipRegister">还没有账号！</a>
				</div>
				<div class="form-group">
					<div class="col-sm-6" align="center">
						<button type="reset" class="btn btn-info">重置</button>
					</div>
					<div class="col-sm-6" align="center">
						<button type="submit" class="btn btn-danger">登录</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<footer class="navbar-fixed-bottom">
		<div class="container" align="center">苏州古建筑管理系统&copy;2019</div>
	</footer>
	<script type="text/javascript">
		function loginCheck() {
			console.log()
			if ($('#account').val() == "") {
				$('div .msg').text('*账户不能为空')
				return false;
			} else if ($('#password').val() == "") {
				$('div .msg').text('*密码不能为空')
				return false;
			}
			return true;
		}
	</script>
</body>
</html>