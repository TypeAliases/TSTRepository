<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<meta http-equiv="Content-Type"
	content="multipart/form-data; charset=utf-8" />
<div class="box">
	<form id="apply_link_form" role="from" class="form-horizontal"
		style="width: 50%; margin: 0 auto;"
		onsubmit="return userUpdateCheck()" enctype="multipart/form-data">

		<div class="form-group" align="center">
			<c:if test="${selectTUserById.pic == null }">
				<img src="assets/img/1.jpg" alt="Bicycle"
					class="img-circle img-thumbnail">
			</c:if>
			<c:if test="${selectTUserById.pic != null }">
				<img src="assets/img/${selectTUserById.pic }" alt="Bicycle"
					style="width: 200px; height: 400px;"
					class="img-circle img-thumbnail">
			</c:if>
		</div>

		<div class="form-group">
			<input name='id' value='${selectTUserById.id }' hidden="true">
			<label class="col-sm-2 control-label">姓名:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess"
					value="${selectTUserById.name}" name="name">
			</div>
			<div class="form-group">
				<hr>
			</div>
			<label class="col-sm-2 control-label">账户:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${selectTUserById.account}" name="account">
			</div>

		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">年龄:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess"
					value="${selectTUserById.age}" name="age">
			</div>
			<div class="form-group">
				<hr>
			</div>
			<label class="col-sm-2 control-label">部门:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control"
					value="${selectTUserById.dept}" name="dept">
			</div>
		</div>

		<div class="form-group">
			<label class="col-sm-2 control-label">联系方式:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess"
					value="${selectTUserById.phone}" name="phone">
			</div>
			<div class="form-group">
				<hr>
			</div>
			<label class="col-sm-2 control-label">用户状态:</label>
			<div class="col-sm-10">
				<select class="form-control" value="${selectTUserById.flag}"
					name='flag'>
					<option value="1">可用</option>
					<option value="0">不可用</option>
				</select>
			</div>

			<div class="form-group">
				<hr>
			</div>
		</div>
		<div class="form-group">

			<div class="col-sm-12" align="right">
				<input id="submit" name="submit" class="btn  btn-warning "
					type="submit" value="修改"> <input class="btn  btn-primary "
					onclick="closeback()" type="button" value="关闭">
			</div>


		</div>

	</form>
	<form id="imageSubmit" action="uploadImage/${build.id }"
				enctype="multipart/form-data" method="post">
				<div class="form-group ">
					<div class="col-sm-2 ">
						<input type="file" id="FileUpload" name="file"
							accept="image/jpg,image/jpeg,image/png,image/PNG"
							onchange="changePic()">
						<button class="btn btn-success control-label" style="float: left;">上传头像</button>
					</div>
					<div class="col-sm-2 ">
						<img id="imgpre"
							style="display: block; max-width: 100%; height: auto;">
					</div>
				</div>
			</form>
</div>