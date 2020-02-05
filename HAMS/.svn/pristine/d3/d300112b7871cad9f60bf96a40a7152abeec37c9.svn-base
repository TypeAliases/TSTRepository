<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box">
	<form role="from" class="form-horizontal" style="width: 50%;margin: 0 auto;">
		<div class="form-group col-sm-12" align="center">
			<img src="assets/img/1.jpg" alt="Bicycle" class="img-circle ">
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">姓名:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${selectTUserById.name}">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">账户:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${selectTUserById.account}">
			</div>
			
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">年龄:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" disabled
					value="${selectTUserById.age}">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">部门:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" value="${selectTUserById.dept}" disabled>
			</div>
		</div>
		
			<div class="form-group">
			<label class="col-sm-2 control-label">联系方式:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" value="${selectTUserById.phone}" disabled>
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">用户状态:</label>
			<c:if test="${selectTUserById.flag==0}">
			<div class="col-sm-10">
				<input type="text" class="form-control" value="不可用" disabled>
			</div>
			</c:if>
			<c:if test="${selectTUserById.flag==1}">
			<div class="col-sm-10">
				<input type="text" class="form-control" value="可用" disabled>
			</div>
			</c:if>
		</div>
		
		<div class="form-group">

			<div class="col-sm-12" align="right">
				<input onclick="closeback()" class="btn  btn-primary  " type="button" value="关闭">
			</div>

				
		</div>

	</form>


</div>