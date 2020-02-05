<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box">
	<form id="apply_link_formnotice" role="from" class="form-horizontal"
		style="width: 50%; margin: 0 auto;"
		onsubmit="return noticeUpdateCheck()">
		<div class="form-group col-sm-12" align="center">
			<img src="assets/img/1.jpg" alt="Bicycle" class="img-circle ">
		</div>
		<div class="form-group">
		<input name='id' value='${updateBulletion.id}' hidden="true">
			<label class="col-sm-2 control-label">标题:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" 
					value="${updateBulletion.title}" name="title">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">公告内容:</label>
			<div class="col-sm-10">
				<%-- <input type="text" class="form-control" id="inputSuccess" disabled
					value="${build.content}"> --%>
					<textarea class="form-control" id="inputSuccess"  name="content"
					>${updateBulletion.content}</textarea>
			</div>
			
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">发布时间:</label>
			<div class="col-sm-10">
				<input type="date" class="form-control" id="inputSuccess" 
					value="${updateBulletion.date}" name="date">
					
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


</div>