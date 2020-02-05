<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="box">
	<form id="addRepair" class="form-horizontal" role="form" method="post"
		onsubmit="return addRepairChenck()" style="width: 50%; margin: 0 auto;">
		<div class="form-group col-sm-12" align="center">
			<img src="assets/img/1.jpg" alt="Bicycle" class="img-circle ">
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">建筑的名称:</label>
			<div class="col-sm-10">
			
				<select class="form-control" name='buildid'>
					<option >请选择建筑</option>
					<c:forEach items="${builds}" var="build">
					<option value="${build.id}">${build.name }</option>
					</c:forEach>
				</select>
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">维修内容:</label>
			<div class="col-sm-10">
					<textarea class="form-control" id="inputSuccess" name="content"></textarea>
			</div>
			
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">维修日期:</label>
			<div class="col-sm-10">
				<input type="date" class="form-control" id="inputSuccess" name="date">
			</div>
			<div class="form-group">
			<hr>
			</div>
			<label class="col-sm-2 control-label">维修单位:</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" name="dept">
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
	function addRepairChenck() {
	$.ajax({
        type: "POST",
        url:'addRepairSuccess',
        data:$("#addRepair").serialize(),
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