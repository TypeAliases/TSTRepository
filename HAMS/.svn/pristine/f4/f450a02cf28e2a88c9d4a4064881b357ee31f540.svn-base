<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box">
	<form id="addBuild" class="form-horizontal" role="form" method="post"
		onsubmit="return addBuildChenck()" style="width: 80%; margin: 0 auto;"
		>
		<h2>基本信息</h2>
		<div class="form-group">
			<label class="col-sm-2 control-label">名称:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="inputSuccess"
					name="name">
			</div>
			<label class="col-sm-2 control-label">发布人:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="inputSuccess"
					value="admin" readonly="readonly">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">建筑简介:</label>
			<div class="col-sm-10">
				<textarea class="form-control" id="inputSuccess" name="content"></textarea>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">建筑年代:</label>
			<div class="col-sm-4">
				<!-- <input type="text" class="form-control" id="inputSuccess" 
					name="date"> -->
				<input id="inputSuccess" class="form-control" name="date"
					type="date" />
			</div>
			<label class="col-sm-2 control-label">建筑地点:</label>
			<div class="col-sm-4">
				<select name="place" class="form-control">
					<option value="姑苏区">姑苏区</option>
					<option value="虎丘区">虎丘区</option>
					<option value="吴中区">吴中区</option>
					<option value="相城区">相城区</option>
					<option value="吴江区">吴江区</option>
					<option value="常熟市">常熟市</option>
					<option value="张家港市">张家港市</option>
					<option value="昆山市">昆山市</option>
					<option value="太仓市">太仓市</option>
				</select>
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-2 control-label">详细地址:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess"
					name="address">
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-2 control-label">经度:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="inputSuccess" name="lgd">
			</div>
			<label class="col-sm-2 control-label">纬度:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" name="ltd">
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-2 control-label">整体面积:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" name="area"
					placeholder="单位平方米">
			</div>
			<label class="col-sm-2 control-label">占地:</label>
			<div class="col-sm-4">
				<input type="text" class="form-control" id="inputSuccess"
					placeholder="单位平方米" name="cover">
			</div>
		</div>
		
		<div class="col-sm-12" align="right">
			<button type="submit" class="btn btn-danger">保存</button>
			<input class="btn  btn-primary " type="button" value="关闭"
				onclick="closeback()">
			<button type="reset" class="btn btn-info">清空</button>
		</div>

	</form>

	<script type="text/javascript">
		function addBuildChenck() {
			$.ajax({
				type : "POST",
				url : 'addBuildSuccess',
				data : $("#addBuild").serialize(),
				success : function(date) {
					alert('保存成功')
					$('.sideMenu  h3.active').click();
				},
				error : function() {
					alert('请求失败')
				}
			})
			return false;
		}
	</script>

</div>