<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box">
	<form id="apply_link_formtechnique" role="from" class="form-horizontal"
		style="width: 50%; margin: 0 auto;"
		onsubmit="return techniqueUpdateCheck()">
		<div class="form-group col-sm-12" align="center">
			<img src="assets/img/1.jpg" alt="Bicycle" class="img-circle ">
		</div>
				<div class="form-group">
		<input name='id' value='${techniques.techniques.id}' hidden="true">
			<label class="col-sm-2 control-label">建筑名称:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" 
					value="${techniques.build.name}" name="name" disabled="disabled">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">工艺名称:</label>
			<div class="col-sm-10">
					<input type="text" class="form-control" value="${techniques.techniques.name}" name="name">
					
			</div>
			
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">构造介绍:</label>
			<div class="col-sm-10">
			<textarea class="form-control" id="inputSuccess" name="content"
					>${techniques.techniques.content}</textarea>
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