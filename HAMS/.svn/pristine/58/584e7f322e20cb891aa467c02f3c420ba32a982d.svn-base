<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box">
	<form id="addTechnique" class="form-horizontal" role="form" method="post"
		onsubmit="return addTechniqueChenck()" style="width: 80%; margin: 0 auto;">
		<h2>添加工艺</h2>
		<input type="text" name="buildId" hidden="true" value="${buildId}">
		<div class="form-group">
			<label class="col-sm-2 control-label">工艺名称:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="inputSuccess"
					name="name">
			</div>
			<label class="col-sm-2 control-label">编辑人:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="inputSuccess"
					value="admin" readonly="readonly">
			</div>
		</div>
		 <div class="form-group">
			<label class="col-sm-2 control-label">文字说明:</label>
			<div class="col-sm-10">
				<textarea class="form-control" id="inputSuccess" name="content"></textarea>
			</div>
		</div> 
		
		
		<div class="form-group  ">
			<div class="col-sm-2 ">
				<input type="file" id="FileUpload"
					accept="image/jpg,image/jpeg,image/png,image/PNG"
					onchange="changePic()">
				<button class="btn btn-success control-label" style="float: left;">上传图片</button>
			</div>
			<div class="col-sm-2 ">
				<img id="imgpre"
					style="display: block; max-width: 100%; height: auto;">
			</div>
		</div>



		<div class="col-sm-12" align="right">
			<button type="submit" class="btn btn-danger">保存</button>
			<input class="btn  btn-primary " type="button" value="关闭"
				onclick="h4closeback()">
			<button type="reset" class="btn btn-info">清空</button>
		</div>

	</form>

	<script type="text/javascript">
		function addTechniqueChenck() {
			$.ajax({
				type : "POST",
				url : 'addTechniqueSuccess',
				data : $("#addTechnique").serialize(),
				success : function(date) {
					alert('保存成功')
					$('.sideMenu h5.active').click();
				},
				error : function() {
					console.log(date);
					alert('请求失败')
				}
			})
			return false;
		}
	</script>

</div>
