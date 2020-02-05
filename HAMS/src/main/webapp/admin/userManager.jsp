<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="admin-biaogelist">

	<div class="listbiaoti am-cf">
		<ul class="am-icon-group on">用户列表
		</ul>
		<span class="am-icon-home" style="float: right; margin: 10px;">
			当前位置： 首页 > 用户管理 </span>

	</div>

	<div class="am-form am-g">
		<div class="table-top">
			<button onclick="addUser()" class="btn btn-success ">
				<i class="glyphicon glyphicon-plus"></i> 添加用户
			</button>
		</div>
		<table
			class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover">
			<thead>
				<tr class="am-success">
					<th class="table-id">序号</th>
					<th>用户账号</th>
					<th>用户姓名</th>
					<th>用户角色</th>
					<th>联系方式</th>
					<th>账号状态</th>
					<th width="100px">操作</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${pageInfo.list}" var="User" varStatus="status">
					<tr>
						<td>${status.index+1}</td>
						<td>${User.account }</td>
						<td>${User.name }</td>
						<c:if test="${User.role==1}">
							<td>普通用户</td>
						</c:if>
						<c:if test="${User.role==0}">
							<td>管理员</td>
						</c:if>
						<td>${User.phone }</td>

						<c:if test="${User.flag==1}">
							<td>可用</td>
						</c:if>
						<c:if test="${User.flag==0}">
							<td>不可用</td>
						</c:if>
						<td><span onclick="showUser(${User.id})"
							class="am-btn am-btn-default am-btn-xs am-text-success am-round">
								<span class="am-icon-search" title="查看详情"></span>
						</span> <span onclick="updateUser(${User.id})"
							class="am-btn am-btn-default am-btn-xs am-text-secondary am-round"
							title="修改"> <span class="am-icon-pencil-square-o"></span>
						</span></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div class="am-btn-group am-btn-group-xs"></div>

		<ul class="am-pagination am-fr">
			<tr>
				<td colspan="5">共${pageInfo.total}条记录 每页 ${pageInfo.pageSize}条 第${pageInfo.pageNum}页 
					<a href="javascript:void(0)" onclick="pageSelect(1)">首页</a>
					 <c:choose>
						<c:when test="${pageInfo.hasPreviousPage}">
							<a href="javascript:void(0)" onclick="pageSelect(${pageInfo.prePage})">上一页</a>
						</c:when>
						<c:otherwise>
							<font color="#ABA8AB">上一页</font>
						</c:otherwise>
					</c:choose> <c:choose>
						<c:when test="${pageInfo.hasNextPage}">
							<a href="javascript:void(0)" onclick="pageSelect(${pageInfo.nextPage})">下一页</a>
						</c:when>
						<c:otherwise>
							<font color="#ABA8AB">下一页</font>
						</c:otherwise>
					</c:choose> <a href="javascript:void(0)" onclick="pageSelect(${pageInfo.lastPage})">尾页</a>
				</td>
			</tr>
		</ul>
	</div>
</div>
<script type="text/javascript">
	//分页
	function pageSelect(curPage){
		var url = "toUserManager/"+curPage;
		$(".admin-biaogelist").load(url);
	}
	</script>
</div>