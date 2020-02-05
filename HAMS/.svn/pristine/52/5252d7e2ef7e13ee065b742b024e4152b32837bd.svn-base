<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="box">
	<form id="addUser" class="form-horizontal" role="form" method="post"
		onsubmit="return registerChenck()" style="width: 50%; margin: 0 auto;">
		<div class="form-group col-sm-12" align="center">
			<img src="assets/img/1.jpg" alt="Bicycle" class="img-circle ">
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label"> 账号:</label>
			<div class="col-sm-10">
				<input class="form-control" id="account" type="text" name="account"
					placeholder="请填写用来登录的账号">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">姓名:</label>
			<div class="col-sm-10">
				<input class="form-control" id="name" type="text" name="name"
					placeholder="请填写真实姓名">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">年龄:</label>
			<div class="col-sm-10">
				<input class="form-control" id="name" type="text" name="age"
					placeholder="请填写真实年龄">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label"> 密码:</label>
			<div class="col-sm-10">
				<input class="form-control" id="password" type="password"
					name="password" placeholder="请填长度在6-8位的密码">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label"> 电话:</label>
			<div class="col-sm-10">
				<input class="form-control" id="phone" type="tel" name="phone"
					placeholder="请填写正确的联系方式">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label"> 单位:</label>
			<div class="col-sm-10">
				<input class="form-control" id="dept" type="text" name="dept"
					placeholder="如暂无单位请填写无">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label">角色:</label>
			<div class="col-sm-10">
			
				<select class="form-control" name='role'>
					<option >请选择角色</option>
					<option value="0">管理员</option>
					<option value="1">游客</option>
				</select>
			</div>
		</div>
		<div class="form-group" hidden="true">
			<label class="col-sm-2 control-label"> 状态:</label>
			<div class="col-sm-10">
				<input class="form-control" id="dept" type="text" name="flag"
					value="1">
			</div>
		</div>
		<div class="form-group">
			<label class="col-sm-2 control-label"></label>
			<div class="col-sm-10">
				<font class="msg" color="red">${msg}</font>
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
		function registerChenck() {
			var patrn = /(1[3-9]\d{9}$)/;
			if ($('#account').val() == "") {
				$('#account').focus();
				$('.msg').text('*账户不能为空')
				return false;
			} else if ($('#name').val() == "") {
				$('#name').focus();
				$('.msg').text('*真实姓名不能为空')
				return false;
			} else if ($('#password').val() == "") {
				$('#name').focus();
				$('.msg').text('*密码不能为空')
				return false;
			} else if ($('#phone').val() == "") {
				$('#phone').focus();
				$('.msg').text('*联系方式不能为空')
				return false;
			} else if ($('#dept').val() == "") {
				$('#dept').focus();
				$('.msg').text('*部门不能为空')
				return false;

			} else if ($('#password').val().length < 6
					|| $('#password').val().length > 8) {
				$('#password').focus();
				$('.msg').text('*密码长度应该是六到八位')
				return false;
			}
			var reg = /(1[3-9]\d{9}$)/;
			if (!reg.test($('#phone').val())) {
				$('#phone').focus();
				$('.msg').text("请输入正确格式的手机号码！");
				return false;
			}
			$.ajax({
		        type: "POST",
		        url:'addSuccess',
		        data:$("#addUser").serialize(),
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