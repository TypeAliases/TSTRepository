<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box">
	<form role="from" class="form-horizontal" style="width: 50%;margin: 0 auto;">
		<div class="form-group col-sm-12" align="center">
			<img src="assets/img/1.jpg" alt="Bicycle" class="img-circle ">
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">名称:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${build.name}">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">介绍:</label>
			<div class="col-sm-10">
				<%-- <input type="text" class="form-control" id="inputSuccess" disabled
					value="${build.content}"> --%>
					<textarea class="form-control" id="inputSuccess" disabled
					value="${build.content}">${build.content}介绍查不到</textarea>
			</div>
			
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">建筑年代:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${build.date}">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">建筑地点:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" value="${build.place}" disabled>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">占地:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${build.cover}">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">整体面积:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" value="${build.area}" disabled>
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">经度:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${build.lgt}">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">纬度:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" value="${build.ltd}" disabled>
			</div>
		</div>
		
			
		<div class="form-group">

			<div class="col-sm-12" align="right">
				<input onclick="h4closeback()" class="btn  btn-primary  " type="button" value="关闭">
			</div>

				
		</div>

	</form>


</div>