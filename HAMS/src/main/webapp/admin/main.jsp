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
<base href="<%=basePath%>">
<meta http-equiv="Content-Type"
	content="multipart/form-data;         charset=utf-8" />
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>苏州历史建筑管理系统</title>
<link rel="icon" type="image/png" href="images/logo.png">
<link rel="stylesheet" href="assets/css/amazeui.min.css" />
<link rel="stylesheet" href="assets/css/admin.css">

<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/app.js"></script>

<link rel="stylesheet" type="text/css" />


<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js">
	
</script>
<script
	src="https://webapi.amap.com/maps?v=1.4.15&key=c4f16b4da2e9c9023eac7f81d021bb1b&plugin=AMap.DistrictSearch"></script>
<script src="https://webapi.amap.com/ui/1.0/main.js?v=1.0.11"></script>
</head>
<body>
	<header class="am-topbar admin-header">
		<h2
			style="color: white; font-size: 24px; margin: 5px 20px; display: inline-block;">苏州历史建筑后台管理系统</h2>
	</header>

	<div class="am-cf admin-main">
		<div class="nav-navicon admin-main admin-sidebar"
			style="overflow-x: hidden; height: 100%; overflow-y: scroll;">
			<div id="sideMenu" class="sideMenu">
				<h3 class="active">
					<i class="am-icon-home"></i> 首页
				</h3>
				<h3 data-toggle="collapse" data-target="#bulid" >
					<i class="am-icon-home"></i> 历史建筑项目
				</h3>
				<div id="bulid" class="collapse on">
					<c:forEach items="${buildList }" var="bulid">

						<h4 data-toggle="collapse" data-target="#${bulid.name }">
							<i class="am-icon-institution"></i> ${bulid.name }
						</h4>
						<div id="${bulid.name}" class="collapse on">
							<h5 onclick="bulidMsg(${bulid.id})">基本信息</h5>
							<h5 onclick="showMakeManager(${bulid.id})">建筑构造篇</h5>
							<h5 onclick="showTechnique(${bulid.id})">建筑工艺篇</h5>
						</div>
					</c:forEach>
				</div>




				<h3>
					<i class="am-icon-cogs"></i> 建筑技艺
				</h3>
				<h3>
					<i class="am-icon-calendar"></i> 建筑标准
				</h3>
				<h3>
					<i class="am-icon-newspaper-o"></i> 建筑技艺汇编
				</h3>
				<h3 data-toggle="collapse" data-target="#demo">
					<i class="am-icon-institution"></i> 建筑管理
				</h3>
				<h3>
					<i class="am-icon-group"></i> 用户管理
				</h3>

			</div>
		</div>

		<div class=" admin-content">
			<div class="admin-index"></div>
			<div class="admin" id="admin"></div>
		</div>
	</div>

	<script src="assets/js/amazeui.min.js"></script>
	<script type="text/javascript">
		document.addEventListener("touchmove", function(e) {
			e.preventDefault();
		}, false);
		document.getElementById('sideMenu').addEventListener('touchmove',
				function(e) {
					e.stopPropagation();
				}, false);
	</script>
</body>
</html>