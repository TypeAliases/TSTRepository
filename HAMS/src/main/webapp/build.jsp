<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<div class="clearfix">
	<div class="bulid-search row" role="navigation">
		<form id="form1" class="form-horizontal">
			<div class="input-group col-lg-2 search">
				<input type="text" id="buildname" name="buildname"
					class="form-control" onkeydown="keydown(event)"/> 
					<input type="text" style="display: none;">
					<span class="input-group-btn ">
					<button class=" btn btn-info" type="button" onclick="selectBuild()">
						<span class="glyphicon glyphicon-search"></span>
					</button>
				</span>
			</div>
		</form>
	</div>
	<div class="row">
		<c:forEach items="${AllBuilds }" var="build">
			<div class="col-sm-6 col-md-3">
				<div class="thumbnail">
					<img src="./images/${build.pic }" alt="通用的占位符缩略图"
						onclick="selectmsg(${build.id})">
					<div class="caption" style="text-align: center;">
						<span class="text-danger">${build.name }</span>
					</div>
				</div>
			</div>
		</c:forEach>

	</div>
</div>
<script type="text/javascript">
	/* $('.thumbnail').click(function(value) {
		console.log("进来-------");
		build_id= $(this).attr('value');
		
		//$('.container').load("findBuildById?id=");
		$('.container').load('bulidmsg.html'+build_id);
	}) */
	
	function selectmsg(id) {
		console.info(id)
		$('.container').load("findBuildById?id="+id);
	}
	function keydown(event) {
		if (event.keyCode==13) {
			selectBuild();
		}
	}
	
	function selectBuild(){
		var buildname=$("#buildname").val();
		console.info(buildname)
		//$('.container').load('findBuildByName/'+buildname);
		$('.container').load("findBuildByName?buildname="+buildname);
	}

</script>