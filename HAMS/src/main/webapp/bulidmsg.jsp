<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="row clearfix bg-white bulidmsg" style="overflow: hidden;">
	<span class="glyphicon glyphicon-remove btn btn-danger"
		style="float: right; margin: 5px;" onclick="colse()"></span>

	<div class=" column bulidmsg-body">

		<div class="page-header" align="center">
			<h1 id="title">${Build.name }</h1>

		</div>
		<div class="page-body">
			<div class="text-title ">基本信息</div>
			<div class="text baseMsg ">
				<p>
					<label>建筑名称:</label>${Build.name }

				</p>
				<p>
					<label>建筑地址:</label>${Build.place }
				</p>
				<p>
					<label>建筑占地:</label>${Build.cover }
				</p>
			</div>

			<div class="text-title">建筑介绍</div>
			<div class="text ">
				<span>${Build.content }</span>
				<div class="row">
				<c:forEach items="${selectImageByBuildId }" var="buildImage">
				<div class="col-md-4">
						<div class="thumbnail">
							<img alt="300x200" src="./images/${buildImage.image }" />
						</div>
					</div>
				</c:forEach>
					
				</div>
			</div>
			<div class="test">
				<ul class="nav nav-tabs">
					<li class="active"><a data-toggle="collapse"
						data-target="#gouzao">建筑构造</a></li>
					<li><a data-toggle="collapse" data-target="#cailiao"
						onclick="build_material(${Build.id})">建筑材料</a></li>
					<li><a data-toggle="collapse" data-target="#gongyi" onclick="build_technique(${Build.id})">建筑工艺</a></li>
				</ul>

				<div class="row collapse in " id="gouzao">

					<div class="text">
						<c:forEach items="${selectByBuildId}" var="build">
							<c:forEach items="${build.lmake}" var="make">
							<h3>${make.name}</h3>
								${make.content }
								<!-- <div class="col-md-4" > -->
								<div class="thumbnail" >
									<img alt="300x200" src="images/${make.pic}" />
									<div class="caption">
										<h3 align="center">${make.name }</h3>
									</div>
								</div>
								<!-- </div> -->
								</c:forEach>
						</c:forEach>
					</div>
				</div>

				<div class="row collapse" id="cailiao">
					<div class="text">
						<c:forEach items="${selectMaterialByBuildId }"
							var="materialByBuildId">
							<c:forEach items="${materialByBuildId.lmaterrial}" var="material">
							<h3>${material.name}</h3>
							${material.content}
							<div class="thumbnail">
							<img alt="300x200" src="images/${material.pic}" />
							<div class="caption">
								<h3 align="center">${material.name }</h3>
							</div>
							</div>
							</c:forEach>
						</c:forEach>
						</div>
					</div>
				<div class="row collapse" id="gongyi">
					<div class="text">
						
							<c:forEach items="${selectTechniqueByBuildId }" var="techniqueByBuildId">
								<c:forEach items="${techniqueByBuildId.ltechnique }" var="technique">
								<h3>${technique.name}</h3>
									${technique.content }
									<!-- <div class="col-md-4"> -->
						<div class="thumbnail">
							<img alt="300x200" src="images/${technique.pic }" />
							<div class="caption">
								<h3 align="center">${technique.name }</h3>
							</div>
						<!-- </div> -->
					</div>
									
								</c:forEach>
							</c:forEach>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script type="text/javascript">
	$('.test .nav  li').click(function() {
		$('.test .nav  li').removeClass('active');
		$('.test .collapse').removeClass('in');
		$(this).addClass('active');
	})
	function build_material(id) {
		console.info(id)
		$('.cailiao').load("findBuildById?id="+id);
	}
	function build_technique(id) {
		console.info(id)
		$('.gongyi').load("findBuildById?id="+id);
	}
</script>