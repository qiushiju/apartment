<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>公寓管理系统 - 角色信息管理</title>
	<link rel="stylesheet" href="<c:url value='/css/main.css'/>">
	<link rel="stylesheet" href="<c:url value='/lib/font-awesome/css/font-awesome.css'/>">
</head>
<body>
<div class="box">
	<h3>角色信息管理</h3>
	<div class="actions">
		<div>
			<a class="btn btn-primary" href="add.html">添加角色信息</a>
		</div>
	</div>

	<table class="list">
		<tr>
			<th>序号</th>
			<th>角色名称</th>
			<th>角色描述</th>
			<th>角色权限</th>
			<th>添加时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${roles }" var="role">
		<tr>
			<td>${role.roid }</td>
			<td>${role.roname }</td>
			<td>${role.rodesc }</td>
			<td>
				<c:forEach items="${role.auths }" var="auth">
					${auth.adesc }/
				</c:forEach>
			</td>
			<td>${role.roaddTime }</td>
			<td>
				<a class="fa fa-info" title="详情" href="<c:url value=''/>"></a>
				&nbsp;&nbsp;
				<a class="fa fa-pencil" title="编辑" href="<c:url value='/role/edit?roid=${role.roid }'/>"></a>
				&nbsp;&nbsp;
				<a class="fa fa-remove" title="删除" href="#" onclick="confirmDelete(1)"></a>
			</td>
		</tr>
		</c:forEach>
	</table>
	<div class="pager-info">
		<div>共有 ${page.total } 条记录，第 ${page.pageNo }/${page.pageCount }页 </div>
		<div>
			<ul class="pagination">
				<li class="paginate_button previous disabled }">
				<c:choose>
				<c:when test="${page.pageNo==1 }">
				<a href="#">上一页</a>
				</c:when>
				<c:otherwise>
				<a href="<c:url value='/role/list?pageNo=${page.pageNo-1}' />">上一页</a>
				</c:otherwise>
				</c:choose>
				</li>
				<li class="paginate_button active"><a href="#">${page.pageNo }</a></li>
				<li class="paginate_button next disabled">
				<c:choose>
				  <c:when test="${page.pageNo == page.pageCount }">
				<a href="#">下一页</a>
				   </c:when>
				   <c:otherwise>
				   <a href="<c:url value='/role/list?pageNo=${page.pageNo+1}' />">下一页</a>
				   </c:otherwise>
				</c:choose>
				</li>
			</ul>
		</div>
	</div>
</div>
<script src="<c:url value='/lib/jquery/jquery.js'/>"></script>
<script>
function confirmDelete(id){
	if (confirm("确定要删除码？")) {
		alert('发送删除请求，刷新页面（不要异步）');
	}
	return false;
}
</script>
</body>
</html>