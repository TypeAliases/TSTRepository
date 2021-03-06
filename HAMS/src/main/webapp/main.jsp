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
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="initial-scale=1.0, user-scalable=no, width=device-width">
<title>苏州古建筑管理系统</title>
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="icon" type="image/png" href="images/logo.png">
<link rel="stylesheet" href="./css/style.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="./js/main.js"></script>
<script
	src="https://webapi.amap.com/maps?v=1.4.15&key=c4f16b4da2e9c9023eac7f81d021bb1b&plugin=AMap.DistrictSearch"></script>
<script src="https://webapi.amap.com/ui/1.0/main.js?v=1.0.11"></script>
<script src="js/wangEditor.min.js">
	
</script>
<style type="text/css">
#myCarousel img {
	height: 370px;
	width: 100%;
}

</style>
</head>
<body>
	<div class=" head main_bg">
		<img alt="苏州古建筑管理系统" src="./images/title.PNG">
	</div>
	<nav class="main_bg  title">
		<ul>
			<li class="active">首页</li>
			<li>建筑陈列</li>
			<li>新闻资讯</li>
			<li>素材收集</li>
			<li>地图分布</li>
			<!-- <li>关联检索</li> -->
			<li>关于我们</li>
		</ul>
		<div class="index-search"
			style="display: inline; float: right; margin: 10px; vertical-align: middle;"
			align="center">
			<form class="form-horizontal " action="">
				<input type="text" name="name" class="form-control "
					style="width: 150px; display: inline;" placeholder="请输入关键字检索！" />
				<button type="button" class="btn btn-info" onclick="search()">
					<span class="glyphicon glyphicon-search"
						style="vertical-align: middle;"> </span>
				</button>
			</form>
		</div>
	</nav>
	
	<div class="container" id="mainbody"></div>
	<footer>
		<div class="footer" align="center">苏州历史建筑信息管理系统&copy;2019-苏州科技大学</div>
	</footer>
</body>
<script type="text/javascript">
	
	function search() {
		$('.container').load('indexSearch.html');

	}
	function selectBulletinsMsg(bulletinId) {
		console.info(bulletinId)
		$('.container').load("findBulletinById?bulletinId="+bulletinId);
	}
	function selectmsg(id) {
		console.info(id)
		$('.container').load("findBuildById?id="+id);
		
	}
</script>
</html>