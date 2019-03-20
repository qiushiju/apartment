<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 房屋信息管理</title>
	<link rel="stylesheet" href="<c:url value='/css/main.css'/> ">
	<link rel="stylesheet" href="<c:url value='/lib/font-awesome/css/font-awesome.css' />">
</head>
<body>
<div class="box">
	<h3>房屋信息管理</h3>
	<form id="searchForm" action="<c:url value="/house/list"/>" method="post">
				<span>搜索关键字</span>
				<input id="i1" name="keywords" placeholder="请输入搜索关键词" value="${keywords }">
				&nbsp;&nbsp;&nbsp;
				<span>搜索条件</span>
				<select name="filed">
					<option value="haddress" ${filed=='haddress'?'selected':'' }>地址</option>
					<option value="hfloor" ${filed=='hfloor'?'selected':'' }>楼层</option>
				</select>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				<!-- 隐藏的input输入框 -->
				<input id="pnn" type="hidden" name="pageNo" value="${page.pageNo }">
				<input type="submit"  class="btn btn-default" value="搜索">
	</form>
	<div class="actions">
		<div>
			<a class="btn btn-primary" href="add.html">添加房屋信息</a>
		</div>
	</div>

	<table class="list">
		<tr>
			<th>序号</th>
			<th>详细地址</th>
			<th>所属楼层</th>
			<th>房间号</th>
			<th>面积</th>
			<th>朝向</th>
			<th>精/简/毛</th>
			<th>是否双气</th>
			<th>出租价格(元)</th>
			<th>出租状态</th>
			<th>添加时间</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${houses }" var="house">
		<tr>
			<td>${house.hid }</td>
			<td>${house.haddress}</td>
			<td>${house.hfloor }</td>
			<td>${house.hroomNum }</td>
			<td>${house.harea }</td>
			<td>${house.hdir }</td>
			<td>${house.hdeco == 1?"精装":house.hdeco==2?"简装":"毛坯" }</td>
			<td>${house.hair==1?"是":"否" }</td>
			<td>${house.hprice }</td>
			<td>${house.hrentStatus==1?"已出租":house.hrentStatus==2?"待出租":"停止出租"}</td>
			<td>${house.haddTime}</td>
			<td>
				<a class="fa fa-info" title="详情" href="<c:url value='/house/detatil?hid=${house.hid }' />"></a>
				&nbsp;&nbsp;
				<a class="fa fa-pencil" title="编辑" href="<c:url value='/house/edit?hid=${house.hid }' />"></a>
				&nbsp;&nbsp;
				<a class="fa fa-remove" title="删除" href="#" onclick="confirmDelete(1)"></a>
			</td>
		</tr>
		</c:forEach>
	</table>
	<div class="pager-info">
		<div>共有 ${page.total } 条记录，第 ${page.pageNo }/${page.pageCount } 页 </div>
		<div>
			<ul class="pagination">
				<li class="paginate_button previous disabled }">
				<c:choose>
					<c:when test="${page.pageNo==1 }">
						<a href="#">上一页</a>
					</c:when>
					<c:otherwise>
					<!-- <c:url value='/house/list?pageNo=${page.pageNo+1}' /> -->
					<a href="#" onclick="goPage(${page.pageNo-1})">上一页</a>
					</c:otherwise>
				</c:choose>
				</li>
				<li class="paginate_button active"><a href="#">${page.pageNo }</a></li>
				<li class="paginate_button next disabled">
				<c:choose>
					<c:when test="${page.pageNo==page.pageCount }">
						<a href="#">下一页</a>
					</c:when>
					<c:otherwise>
					<!-- <c:url value='/house/list?pageNo=${page.pageNo+1}' /> -->
					<a href="#" onclick="goPage(${page.pageNo+1})">下一页</a>
					</c:otherwise>
				</c:choose>
				</li>
			</ul>
		</div>
	</div>
</div>
<script src="<c:url value='/lib/jquery/jquery.js' /> "></script>
<script>
function confirmDelete(id){
	if (confirm("确定要删除码？")) {
		alert('发送删除请求，刷新页面（不要异步）');
	}
	return false;
}
/* 点击事件触发该函数,传入当前页码 */
function goPage(pageNo){
	// 获取搜索form表单中的隐藏input对象
	var pn = document.getElementById('pnn');
	// 为该隐藏对象value赋值
	pn.value=pageNo;
	// 获取搜索form表单对象
	var sub = document.getElementById("searchForm");
	// 使表单提交
	sub.submit();
	
}
</script>
</body>
</html>