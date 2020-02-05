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
<title>新用户注册</title>
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="./css/style.css">
<link rel="icon" type="image/png" href="images/logo.png">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<script type="text/javascript" src="js/main.js"></script>
<body class="bg-warning">
	<div class="panel panel-danger col-sm-4 login ">
		<div class="panel-heading">
			<h3 class="panel-title" align="center">新用户注册</h3>
		</div>
		<div class="panel-body">
			<form class="form-horizontal" role="form" action="register"
				method="post" onsubmit="return registerChenck()">
				<div class="form-group">
					<label class="col-sm-2 control-label"> 账号:</label>
					<div class="col-sm-10">
						<input class="form-control" id="account" type="text"
							name="account" placeholder="请填写用来登录的账号">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">姓名:</label>
					<div class="col-sm-10">
						<input class="form-control" id="name" type="text" name="name"
							placeholder="请填写真实姓名">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label"> 密码:</label>
					<div class="col-sm-10">
						<input class="form-control" id="password" type="password"
							name="password" placeholder="请填长度在6-8位的密码">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label"> 电话:</label>
					<div class="col-sm-10">
						<input class="form-control" id="phone" type="tel" name="phone"
							placeholder="请填写正确的联系方式">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label"> 单位:</label>
					<div class="col-sm-10">
						<input class="form-control" id="dept" type="text" name="dept"
							placeholder="如暂无单位请填写无">
					</div>
				</div>
				<div class="form-group" hidden="true">
					<label class="col-sm-2 control-label"> 角色:</label>
					<div class="col-sm-10">
						<input class="form-control" id="dept" type="text" name="role"
							value="1">
					</div>
				</div>
				<div class="form-group" hidden="true">
					<label class="col-sm-2 control-label"> 状态:</label>
					<div class="col-sm-10">
						<input class="form-control" id="dept" type="text" name="flag"
							value="1">
					</div>
				</div>
				<div class="form-group">
					<font class="msg">${msg}</font> <a href="skipLogin">已有账号，去登录！</a>
				</div>
				<div class="form-group">
					<div class="col-sm-6" align="center">
						<button type="reset" class="btn btn-info">清空</button>
					</div>
					<div class="col-sm-6" align="center">
						<button type="submit" class="btn btn-danger">注册</button>
					</div>
				</div>
			</form>
		</div>
	</div>
	<footer class="navbar-fixed-bottom">
		<div class="container" align="center">苏州古建筑管理系统&copy;2019</div>
	</footer>
	<script type="text/javascript">
		function registerChenck() {
			var patrn = /(1[3-9]\d{9}$)/;
			if ($('#account').val() == "") {
				$('#account').focus();
				$('.msg').text('*账户不能为空')
				return false;
			} else if ($('#name').val() == "") {
				$('#name').focus();
				$('.msg').text('*真实姓名不能为空')
				return false;
			} else if ($('#password').val() == "") {
				$('#name').focus();
				$('.msg').text('*密码不能为空')
				return false;
			} else if ($('#phone').val() == "") {
				$('#phone').focus();
				$('.msg').text('*联系方式不能为空')
				return false;
			} else if ($('#dept').val() == "") {
				$('#dept').focus();
				$('.msg').text('*部门不能为空')
				return false;

			} else if ($('#password').val().length < 6
					|| $('#password').val().length > 8) {
				$('#password').focus();
				$('.msg').text('*密码长度应该是六到八位')
				return false;
			}
			var reg = /(1[3-9]\d{9}$)/;
			if (!reg.test($('#phone').val())) {
				$('#phone').focus();
				$('.msg').text("请输入正确格式的手机号码！");
				return false;
			}
		}
	</script>
</body>
</html>