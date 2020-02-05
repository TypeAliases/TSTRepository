<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="admin-biaogelist">

	<div class="listbiaoti am-cf">
		<ul class="am-icon-newspaper-o on">日志列表
		</ul>
		<span class="am-icon-home" style="float: right; margin: 10px;">
			当前位置： 首页 > 日志管理 </span>

	</div>
	<form class="am-form am-g">
		<table
			class="am-table am-table-bordered am-table-radius am-table-striped am-table-hover">
			<thead>
				<tr class="am-success">
					<th class="table-id">序号</th>
					<th>操作时间</th>
					<th>用户行为</th>
					<th>用户</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${pageInfo.list}" var="log" varStatus="status">
					<tr>
						<td>${status.index+1}</td>
						<td>${log.date }</td>
						<td>${log.operate }</td>
						<td>${log.user.name }</td>	
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
		
	</form>
	<script type="text/javascript">
	//分页
	function pageSelect(curPage){
		var url = "toLogManager/"+curPage;
		$(".admin-biaogelist").load(url);
	}
	</script>
</div>


