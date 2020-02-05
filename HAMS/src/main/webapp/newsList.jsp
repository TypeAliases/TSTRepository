<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="newsList">
	<div class="row clearfix "
		style="border-bottom: 1px solid #dcdbdd; margin-bottom: 10px;">
		<!-- <form role="form" action="">
			<div class="col-md-2 column">

				<div class="">
					<input id="bulletinName" name="bulletinName" type="text" class="form-control" placeholder="请输入关键字" onkeydown="keydown(event)"/>
					<input type="text" style="display: none;">
				</div>
			</div>
			<div class="col-md-2 column">
				<div>
					<select class="form-control" name="recently" id="recently">
						<option value="">--全部--</option>
						<option value="最近一周">最近一周</option>
						<option value="最近半个月">最近半个月</option>
						<option value="最近一个月">最近一个月</option>
					</select>
				</div>
			</div>


			<button type="button" style="float: right; margin-right: 20px;"
				class="btn btn-info" onclick="selectNewBulletin()">
				<span class="glyphicon glyphicon-search"></span>
			</button>

		</form> -->
	</div>
	

	<h3 style="color: #337ab7">
		新闻资讯 <small><label class="">最近一周</label></small>
	</h3>
	<table class="table table-hover table-bordered">
		<thead style="background: #337ab7; color: white;">
			<tr>
				<th>编号</th>
				<th>主题</th>
				<th>发布时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${allBulletins.list}" var="allBulletin">
			<tr>
				<td>${allBulletin.id }</td>
				<td>${allBulletin.title }</td>
				<td>${allBulletin.date }</td>
				<td onclick="selectBulletinsMsg(${allBulletin.id})"><a>查看详情</a></td>
			</tr>
		</c:forEach>
			
		</tbody>
	</table>
	
	 <div align="center">
		
		
		
		<div class="am-btn-group am-btn-group-xs"></div>
		<ul class="am-pagination am-fr">
		<tr>
				<td colspan="5">共${allBulletins.total}条记录 每页 ${allBulletins.pageSize}
				条 第${allBulletins.pageNum}页  <a
					href="javascript:void(0)" onclick="pageSelect(1)">首页</a>
					<c:choose>
					<c:when test="${allBulletins.hasPreviousPage}">
							<a href="javascript:void(0)" onclick="pageSelect(${allBulletins.prePage})">上一页</a>
							</c:when>
					<c:otherwise>
							<font color="#ABA8AB">上一页</font>
							</c:otherwise>
				</c:choose> 
				
				<c:choose>
					<c:when test="${allBulletins.hasNextPage}">
							<a href="javascript:void(0)" onclick="pageSelect(${allBulletins.nextPage})">下一页</a>
							</c:when>

					<c:otherwise>
							<font color="#ABA8AB">下一页</font>
							</c:otherwise>
				</c:choose>
					 <a href="javascript:void(0)" onclick="pageSelect(${allBulletins.lastPage})">尾页</a>
				</td>
			</tr>
		</ul>
	</div> 
	
</div>
<script type="text/javascript">
	console.log($('.newsList .table a'));
	$('.newsList .table a').click(function() {
		$('.container').load('newsMsg.html');
	});
	function selectNewBulletin() {
		var bulletinName=$("#bulletinName").val();
		var recently=$("#recently").val();
		
		console.info(bulletinName)
		/* if ("最近一周".equals(recently)) {
			
		} */
		console.info(recently)
		$('.container').load("findBulletinByName?bulletinName="+bulletinName);
	}
	function keydown(event){
		if (event.keyCode==13) {
			selectNewBulletin();
		}
	}
	function selectBulletinsMsg(bulletinId) {
		console.info(bulletinId)
		$('.container').load("findBulletinById?bulletinId="+bulletinId);
	}
	function pageSelect(event) {
		//console.info(event.id)
		console.info(event)
		//$('.container').load("newBulletinShow?curPage="+parseInt(event.id));
		$('.container').load("newBulletinShow?curPage="+event);
	}
</script>
    