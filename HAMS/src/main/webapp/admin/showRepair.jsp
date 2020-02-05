<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box">
	<form role="from" class="form-horizontal" style="width: 50%;margin: 0 auto;">
		<div class="form-group col-sm-12" align="center">
			<img src="assets/img/1.jpg" alt="Bicycle" class="img-circle ">
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">建筑名称:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${buildMaintenance.build.name}">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">维修内容:</label>
			<div class="col-sm-10">
				<%-- <input type="text" class="form-control" id="inputSuccess" disabled
					value="${build.content}"> --%>
					<textarea class="form-control" id="inputSuccess" disabled
					>${buildMaintenance.maintenance.content}</textarea>
			</div>
			
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">维修日期:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${buildMaintenance.maintenance.date}">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">维修单位:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" value="${buildMaintenance.maintenance.dept}" disabled>
			</div>
		</div>
		
		<div class="form-group">

			<div class="col-sm-12" align="right">
				<input onclick="closeback()" class="btn  btn-primary  " type="button" value="关闭">
			</div>
				
		</div>
	</form>
</div>