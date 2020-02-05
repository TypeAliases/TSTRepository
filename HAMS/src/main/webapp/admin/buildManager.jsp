<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<base href="<%=basePath%>">
<div class="admin-biaogelist">

	<div class="listbiaoti am-cf">
		<ul class="am-icon-institution on">建筑列表
		</ul>
		<span class="am-icon-home" style="float: right; margin: 10px;">
			当前位置： 首页 > 建筑管理 </span>

	</div>
	<div class="am-form am-g">
		<div class="table-top">
			<button onclick="addBuild()" class="btn btn-success ">
				<i class="glyphicon glyphicon-plus"></i> 添加建筑
			</button>
		</div>
	<table
		class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover">
		<thead>
			<tr class="am-success">
				<th class="table-id">序号</th>
				<th>建筑名称</th>
				<th>建筑地址</th>
				<th>建筑占地</th>
				<th>浏览量</th>
				<th>发布人</th>
				<th width="70px" class="table-set">操作</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${pageInfo.list}" var="build" varStatus="status">
				<tr>
					<td>${status.index+1}</td>
					<td>${build.name }</td>
					<td>${build.place }</td>
					<td>${build.cover }</td>
					<td>${build.pageviews }</td>
					<td>${build.user.name }</td>
					<td>
						<div class="am-btn-toolbar">
							<div class="am-btn-group am-btn-group-xs">
								<%-- <span onclick="showBuild(${build.id})"
									class="am-btn am-btn-default am-btn-xs am-text-success am-round">
									<span class="am-icon-search" title="查看详情"></span>
								</span> <span onclick="updateBuild(${build.id})"
									class="am-btn am-btn-default am-btn-xs am-text-secondary am-round"
									title="修改"> <span class="am-icon-pencil-square-o"></span>
								</span>  --%><span onclick="deleteBuild(${build.id})"
									class="am-btn am-btn-default am-btn-xs am-text-danger am-round"
									title="删除"> <span class="am-icon-trash-o"></span>
								</span>
							</div>
						</div>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div class="am-btn-group am-btn-group-xs"></div>

	<ul class="am-pagination am-fr">
		<tr>
				<td colspan="5">共${pageInfo.total}条记录 每页 ${pageInfo.pageSize}
				条 第${pageInfo.pageNum}页  <a
					href="javascript:void(0)" onclick="pageSelect(1)">首页</a>
					<c:choose>
					<c:when test="${pageInfo.hasPreviousPage}">
							<a href="javascript:void(0)" onclick="pageSelect(${pageInfo.prePage})">上一页</a>
							</c:when>
					<c:otherwise>
							<font color="#ABA8AB">上一页</font>
							</c:otherwise>
				</c:choose> 
				
				<c:choose>
					<c:when test="${pageInfo.hasNextPage}">
							<a href="javascript:void(0)" onclick="pageSelect(${pageInfo.nextPage})">下一页</a>
							</c:when>

					<c:otherwise>
							<font color="#ABA8AB">下一页</font>
							</c:otherwise>
				</c:choose>
					 <a href="javascript:void(0)" onclick="pageSelect(${pageInfo.lastPage})">尾页</a>
				</td>
			</tr>
		</ul>
</div>
<script type="text/javascript">
	//分页
	function pageSelect(curPage){
		var url = "toBuildManager/"+curPage;
		$(".admin-biaogelist").load(url);
	}
	</script>
</html>

