<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<base href="<%=basePath%>">
<div class="admin-biaogelist">

	<div class="listbiaoti am-cf">
		<ul class="am-icon-institution on">建筑概述
		</ul>
		<span class="am-icon-home" style="float: right; margin: 10px;">
			当前位置： 历史建筑项目 > ${build.name } >建筑概述 </span>
	</div>
	<div class="am-form am-g">
		<div class="box" style="display: flow-root;">
			<form id="addBuild" class="form-horizontal" role="form" method="post"
				onsubmit="return addBuildChenck()"
				style="width: 80%; margin: 0 auto;">
				<h2>${build.name }</h2>
				<div>
					<input type="hidden" value="${build.id }" name="id">
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">编辑:</label>
					<div class="col-sm-4">
						<input type="text" class="form-control" id="inputSuccess"
							value="${build.user.name }" readonly="readonly">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">建筑介绍</label>
					<div class="col-sm-10">
						<textarea class="form-control" id="inputSuccess" name="content">${build.content }</textarea>
					</div>
				</div>
				
				<div class="form-group">
					<c:forEach items="${buildImageList }" var="image">
						<div class="col-sm-2 ">
							<img style="display: block; max-width: 100%; height: auto;" src="admin/tupian/jinbenxinxi/${image.image}">
						</div>
					</c:forEach>
				</div>
				<div class="">
					<div class="col-sm-12" align="right">
						<button type="submit" class="btn btn-danger">保存</button>
					</div>

				</div>
			</form>

			<form id="imageSubmit" action="uploadUserImage/${build.id }"
				enctype="multipart/form-data" method="post">
				<div class="form-group ">
					<div class="col-sm-2 ">
						<input type="file" id="FileUpload" name="file"
							accept="image/jpg,image/jpeg,image/png,image/PNG"
							onchange="changePic()">
						<button class="btn btn-success control-label" style="float: left;">上传图片</button>
					</div>
					<div class="col-sm-2 ">
						<img id="imgpre"
							style="display: block; max-width: 100%; height: auto;">
					</div>
				</div>
			</form>
		</div>

		<script type="text/javascript">
			function addBuildChenck() {
				$.ajax({
					type : "POST",
					url : 'updateBuildSuccess',
					data : $("#addBuild").serialize(),
					success : function() {
						alert('修改成功')
						$('.sideMenu h5.active').click();
					},
					error : function() {
						console.log(date);
						alert('请求失败')
					}
				})
				return false;
			}
			function changePic() {
				var reads = new FileReader();
				f = document.getElementById('FileUpload').files[0];
				reads.readAsDataURL(f);
				reads.onload = function(e) {
					document.getElementById('imgpre').src = this.result;
					$("#imgpre").css("display", "block");
				};
				var formData = new FormData();
				formData.append("file", $("#FileUpload")[0].files[0]);
				$.ajax({
					type : "POST",
					url : 'uploadImage/${build.id }',
					data : formData,
					contentType : false,
					processData : false,
					success : function(data) {
						alert('上传成功')
						$('.sideMenu h5.active').click();
					},
					error : function() {
						alert('请求失败')
					}
				})

			}
		</script>
	</div>
</div>
