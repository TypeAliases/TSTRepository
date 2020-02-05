<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box">
	<form role="from" class="form-horizontal" style="width: 50%;margin: 0 auto;">
		<div class="form-group col-sm-12" align="center">
			<img src="assets/img/1.jpg" alt="Bicycle" class="img-circle ">
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">标题:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${showBulletion.title}">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">公告内容:</label>
			<div class="col-sm-10">
				<%-- <input type="text" class="form-control" id="inputSuccess" disabled
					value="${build.content}"> --%>
					<textarea class="form-control" id="inputSuccess" disabled
					>${showBulletion.content}</textarea>
			</div>
			
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">发布时间:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${showBulletion.date}">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">发布人:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" value="${showBulletion.user.name}" disabled>
			</div>
		</div>
		
		<div class="form-group">

			<div class="col-sm-12" align="right">
				<input onclick="closeback()" class="btn  btn-primary  " type="button" value="关闭">
			</div>

				
		</div>

	</form>


</div>