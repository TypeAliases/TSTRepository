<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box">
	<form id="addNotice" class="form-horizontal" role="form" method="post"
		onsubmit="return addNoticeChenck()" style="width: 50%; margin: 0 auto;">
		<div class="form-group col-sm-12" align="center">
			<img src="assets/img/1.jpg" alt="Bicycle" class="img-circle ">
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">标题:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="inputSuccess" 
					name="title">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">公告内容:</label>
			<div class="col-sm-10">
				<%-- <input type="text" class="form-control" id="inputSuccess" disabled
					value="${build.content}"> --%>
					<textarea class="form-control" id="inputSuccess"  name="content"
					></textarea>
			</div>
			
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">发布时间:</label>
			<div class="col-sm-10">
				<input type="date" class="form-control" id="inputSuccess" 
					name="date">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">发布人:</label>
			<div class="col-sm-10">
			
				<select class="form-control" name='userId'>
					<option >请选择发布人</option>
					<c:forEach items="${UserList}" var="user">
					<option value="${user.id}">${user.name }</option>
					</c:forEach>
				</select>
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
	function addNoticeChenck() {
	$.ajax({
        type: "POST",
        url:'addNoticeSuccess',
        data:$("#addNotice").serialize(),
        success: function (date) {
        	alert('保存成功')
        	$('.sideMenu h3.active').click();
          },
        error: function () {
        	console.log(date);
	        	alert('请求失败')
        }
    })
    return false;
}
	</script>


</div>