$(function() {

	$('.sideMenu h3').click(function() {
		$('.sideMenu h3').removeClass('active');
		$('.sideMenu  h4').removeClass('active');
		$(this).addClass('active');
		if ($(this).text().trim() == "首页") {
			$('.admin').load('admin/index.jsp');

		}
		else if ($(this).text().trim() == "用户管理") {
			$('.admin').load('toUserManager/'+1);
			console.log($(this).text().trim());
		}

		else if ($(this).text().trim() == "建筑管理") {
			$('.admin').load('toBuildManager/'+1);
			console.log($(this).text().trim());
		}
	})
	$('.sideMenu  h4').click(function() {
		$('.sideMenu  h4').removeClass('active');
		$(this).addClass('active');
	})
	$('.sideMenu  h5').click(function() {
		$('.sideMenu  h5').removeClass('active');
		$(this).addClass('active');})
		$('.admin').load('admin/index.jsp');
});

//用戶管理
function showUser(id) {
//	展示用户
	console.log('ok  this is  onclick')
	$('.admin').load('toShowUser/'+id);

}
function addUser() {
//	添加用户
	$('.admin').load('toAddUser');
}
function updateUser(id) {
	//更新用户
	$('.admin').load('toUpdateUser/'+id);
}
function closeback() {
	console.log($('.sideMenu h3.active'))
	$('.sideMenu h3.active').click();
}
function userUpdateCheck(){
	console.log($("#apply_link_form"))
	$.ajax({
		type: "POST",
		url:'updateSuccess',
		data:$("#apply_link_form").serialize(),
		success: function (date) {
			//console.log(date);
			alert('修改成功')
			$('.sideMenu h3.active').click();
		},
		error: function () {
			console.log(date);
			alert('请求失败')
		}
	})
	return false;
}

//建筑管理
function showBuild(id) {
//	建筑详情
	console.log('ok  this is  onclick')
	$('.admin').load('toShowBuild/'+id);

}
function addBuild() {
//	添加建筑
	$('.admin').load('toAddBuild');
}
function updateBuild(id) {
	//修改建筑
	$('.admin').load('toUpdateBuild/'+id);
}
function deleteBuild(id) {
	//删除建筑
	$.ajax({
		type: "GET",
		url:'toDeleteBuild/'+id,
		success: function (date) {
			alert('删除成功！')
			$('.sideMenu h3.active').click();
		},
		error: function () {
			console.log(date);
			alert('请求失败')
		}
	})
	return false;
}
function closeback() {
	$('.sideMenu h3.active').click();
}
function h4closeback() {
	$('.sideMenu h5.active').click();
}
function buildUpdateCheck(){
	console.log($("#apply_link_formbuild"))
	$.ajax({
		type: "POST",
		url:'updateBuildSuccess',
		data:$("#apply_link_formbuild").serialize(),
		success: function (date) {
			alert('修改成功')
			$('.sideMenu h4.active').click();
		},
		error: function () {
			console.log(date);
			alert('请求失败')
		}
	})
	return false;
}

//维修管理
function showRepair(id) {
//	维修详情
	console.log('ok  this is  onclick')
	$('.admin').load('toShowRepair/'+id);

}
function addRepair() {
//	添加维修
	$('.admin').load('toAddRepair');
}
function updateRepair(id) {
	//修改维修
	$('.admin').load('toUpdateRepair/'+id);
}
function deleteRepair(id) {
	//删除维修
	$.ajax({
		type: "GET",
		url:'toDeleteRepair/'+id,
		success: function (date) {
			alert('删除成功！')
			$('.sideMenu h3.active').click();
			//location.reload(true);
		},
		error: function () {
			console.log(date);
			alert('请求失败')
		}
	})
	return false;
}
function closeback() {
	console.log($('.sideMenu h3.active'))
	$('.sideMenu h3.active').click();
}

function repairUpdateCheck(){
	console.log($("#apply_link_formrepair"))
	$.ajax({
		type: "POST",
		url:'updateRepairSuccess',
		data:$("#apply_link_formrepair").serialize(),
		success: function (date) {
			alert('修改成功')
			$('.sideMenu h3.active').click();
		},
		error: function () {
			console.log(date);
			alert('请求失败')
		}
	})
	return false;
}

//公告管理
function showNotice(id) {
//	公告详情
	$('.admin').load('toShowNotice/'+id);

}
function addNotice() {
//	添加公告
	$('.admin').load('toAddNotice');
}
function updateNotice(id) {
	//修改公告
	$('.admin').load('toUpdateNotice/'+id);
}
function deleteNotice(id) {
	//删除公告
	$.ajax({
		type: "GET",
		url:'toDeleteNotice/'+id,
		success: function (date) {
			alert('删除成功！')
			$('.sideMenu h3.active').click();
			//location.reload(true);
		},
		error: function () {
			console.log(date);
			alert('请求失败')
		}
	})
	return false;

}
function h5closeback() {
	console.log($('.sideMenu h5.active'))
	$('.sideMenu h5.active').click();
}

function noticeUpdateCheck(){
	console.log($("#apply_link_formnotice"))
	$.ajax({
		type: "POST",
		url:'updateNoticeSuccess',
		data:$("#apply_link_formnotice").serialize(),
		success: function (date) {
			alert('修改成功')
			$('.sideMenu h3.active').click();
		},
		error: function () {
			console.log(date);
			alert('请求失败')
		}
	})
	return false;
}


//构造信息管理
function showMake(id) {
//	构造详情
	console.log('ok  this is  onclick')
	$('.admin').load('toShowMake/'+id);

}
function addMake(id) {
//	添加构造
	$('.admin').load('toAddMake/'+id);
}
function updateMake(id) {
	//修改构造
	$('.admin').load('toUpdateMake/'+id);
}
function deleteMake(id) {
	//删除构造
	$.ajax({
		type: "GET",
		url:'toDeleteMake/'+id,
		success: function (date) {
			alert('删除成功！')
			$('.sideMenu h5.active').click();
			//location.reload(true);
		},
		error: function () {
			console.log(date);
			alert('请求失败')
		}
	})
	return false;

}
function closeback() {
	console.log($('.sideMenu h3.active'))
	$('.sideMenu h3.active').click();
}

function makeUpdateCheck(){
	console.log($("#apply_link_formmake"))
	$.ajax({
		type: "POST",
		url:'updateMakeSuccess',
		data:$("#apply_link_formmake").serialize(),
		success: function (date) {
			alert('修改成功')
			$('.sideMenu h5.active').click();
		},
		error: function () {
			console.log(date);
			alert('请求失败')
		}
	})
	return false;
}

//历史建筑项目之基本信息
function bulidMsg(id){

	$('.admin').load('toShowBuild/'+id);
}
//历史建筑项目之构造信息管理
function showMakeManager(id) {
	$('.admin').load('toMakeManager/'+id+'/1');

}

//构造信息管理
//跳转到建筑工艺篇
function showTechnique(id){
	$('.admin').load('toTechniqueManager/'+id+"/"+1)
}

//添加建筑工艺
function addTechnique(id){
	$('.admin').load('toAddTechnique/'+id);

}

function showTechnique1(id) {
//	工艺详情
	console.log('ok  this is  onclick')
	$('.admin').load('toShowTechnique/'+id);

}
function updateTechnique(id) {
	//修改工艺
	$('.admin').load('toUpdateTechnique/'+id);
}
function deleteTechnique(id) {
	//删除构造
	$.ajax({
		type: "GET",
		url:'toDeleteTechnique/'+id,
		success: function (date) {
			alert('删除成功！')
			$('.sideMenu h5.active').click();
			//location.reload(true);
		},
		error: function () {
			console.log(date);
			alert('请求失败')
		}
	})
	return false;

}

function techniqueUpdateCheck(){
	console.log($("#apply_link_formtechnique"))
	$.ajax({
		type: "POST",
		url:'updateTechniqueSuccess',
		data:$("#apply_link_formtechnique").serialize(),
		success: function (date) {
			alert('修改成功')
			$('.sideMenu h5.active').click();
		},
		error: function () {
			console.log(date);
			alert('请求失败')
		}
	})
	return false;
}


function addMake1(){
	$('.admin').load('admin/addMake.jsp')
}
function addTechnology1(){
	$('.admin').load('admin/addTechnology.jsp')
}

