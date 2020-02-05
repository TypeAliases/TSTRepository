<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box">
	<form id="apply_link_formbuild" role="from" class="form-horizontal"
		style="width: 50%; margin: 0 auto;"
		onsubmit="return buildUpdateCheck()">
		<div class="form-group col-sm-12" align="center">
			<img src="assets/img/1.jpg" alt="Bicycle" class="img-circle ">
		</div>
		<div class="form-group">
		<input name='id' value='${build.id}' hidden="true">
			<label class="col-sm-2 control-label">名称:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" 
					value="${build.name}" name="name">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">介绍:</label>
			<div class="col-sm-10">
				<%-- <input type="text" class="form-control" id="inputSuccess" disabled
					value="${build.content}"> --%>
					<textarea class="form-control" id="inputSuccess" name="content"
					>${build.content}</textarea>
			</div>
			
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">建筑年代:</label>
			<div class="col-sm-10">
				<%-- <input type="text" class="form-control" id="inputSuccess" 
					value="${build.date}" name="date"> --%>
					<input id="inputSuccess" class="form-control" name="date" type="date"
					placeholder="${build.date}"/>
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">建筑地点:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" value="${build.place}" name="place">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">经度:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="lgt" value="${build.lgt}">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">纬度:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="ltd" value="${build.ltd}">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">占地:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" 
					value="${build.cover}" name="cover">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">整体面积:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" value="${build.area}" name="area">
			</div>
		</div>
		
			
		<div class="form-group">

			<div class="col-sm-12" align="right">
				<input id="submit" name="submit" class="btn  btn-warning "
					type="submit" value="修改"> <input class="btn  btn-primary "
					onclick="h4closeback()" type="button" value="关闭">
			</div>


		</div>
	</form>


</div>