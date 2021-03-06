
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row">
	<div class="col-lg-3 ">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">新闻公告</h3>
			</div>
			<div class="panel-body" style="padding: 0px;">
				<ul class="list-group bulletin">
					<ul class="list-group bulletin">

						<c:forEach items="${allBulletins}" var="Bulletin" end="7">
							<li class="list-group-item"><a
								onclick="selectBulletinsMsg(${Bulletin.id})"
								name="${Bulletin.id}">${Bulletin.title}</a></li>
						</c:forEach>
					</ul>
				</ul>
			</div>
		</div>
	</div>
	<div class="col-lg-6">
		<div id="myCarousel" class="carousel slide">
			<!-- 轮播（Carousel）项目 -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="./images/test8.jpg" alt="First slide">
					<div class="carousel-caption">苏州太湖</div>
				</div>
				<div class="item">
					<img src="./images/test1.png" alt="First slide">
					<div class="carousel-caption">七里山塘</div>
				</div>
				<div class="item ">
					<img src="./images/test2.jpg" alt="First slide">
					<div class="carousel-caption">东方之门</div>

				</div>
			</div>
			<!-- 轮播（Carousel）导航 -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>

	</div>
	<div class="col-lg-3 ">
		<div class="panel panel-primary">
			<div class="panel-heading">
				<h3 class="panel-title">
					游客随笔 <span style="float: right; margin-right: 20px;" title="我要投稿"
						onclick="toCollection()"><i
						class="glyphicon glyphicon-envelope"></i></span>
				</h3>
			</div>
			<div class="panel-body" style="padding: 0px;">
				<ul class="list-group bulletin">
					<li class="list-group-item"><a>秋游苏州--“飞越”西山岛</a></li>
					<li class="list-group-item"><a>“翰墨雅韵”--殷德泉评弹书画藏品展</a></li>
					<li class="list-group-item"><a>一条街的前世今生</a></li>
					<li class="list-group-item"><a>历史的错落交叠——万种风情</a></li>
					<li class="list-group-item"><a>小小的姑苏山塘，在历史上竟生出了万千别致的风情。</a></li>
					<li class="list-group-item"><a>除了拙政园、平江路，环岛骑行、树山隐居、牡丹国色……带你发现一个更美的姑苏城</a></li>
					<li class="list-group-item"><a>纸短情长啊，诉不尽当时年少</a></li>
					<li class="list-group-item"><a>唯有牡丹真国色</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="row tuijian">
		<div class="col-sm-12 col-md-12">
			<h3 style="color: #337ab7">今日推荐</h3>
			<hr style="border: 1px solid;">
		</div>
		<c:forEach items="${allBuilds}" var="Build" end="3">
			<div class="col-sm-6 col-md-3" align="center">
				<div class="thumbnail">
					<img src="./images/${Build.pic}" alt="通用的占位符缩略图"
						onclick="selectmsg(${Build.id})">
					<div class="caption">
						<span class="text-danger">${Build.name }</span>
					</div>
				</div>
			</div>
		</c:forEach>

	</div>
</div>
