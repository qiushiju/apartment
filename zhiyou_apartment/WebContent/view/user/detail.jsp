<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>公寓管理系统 - 房屋信息详情查看</title>
	<link rel="stylesheet" href="<c:url value='/css/main.css'/>">
	<link rel="stylesheet" href="<c:url value='/lib/font-awesome/css/font-awesome.css'/>">
</head>
<body>
<div class="box">
	<h3>房屋信息详情</h3>
	<form action="#" method="post">
		<table class="form-table">
			<tr>
				<td class="label">详细地址</td>
				<td class="detail">
					${houseDetail.haddress }
				</td>
			</tr>
			<tr>
				<td class="label">所属楼层</td>
				<td colspan="3" class="detail">
					${houseDetail.hfloor }
				</td>
			</tr>
			<tr>
				<td class="label">房间号</td>
				<td colspan="3" class="detail">
					${houseDetail.hroomNum }
				</td>
			</tr>
			<tr>
				<td class="label">面积(平米)</td>
				<td colspan="3" class="detail">
					${houseDetail.harea }
				</td>
			</tr>
			<tr>
				<td class="label">朝向</td>
				<td colspan="3" class="detail">
					${houseDetail.hdir }
				</td>
			</tr>
			<tr>
				<td class="label">装修</td>
				<td colspan="3" class="detail">
					${houseDetail.hdeco == 1?"精装":"简装" }
				</td>
			</tr>
			<tr>
				<td class="label">是否双气</td>
				<td colspan="3" class="detail">
					${houseDetail.hair == 1?"是":"否"}
				</td>
			</tr>
			<tr>
				<td class="label">配套设施</td>
				<td colspan="3" class="detail">
					有家具，有家电，包括洗衣机、冰箱、微波炉
				</td>
			</tr>
			<tr>
				<td class="label">出租价格(元/月)</td>
				<td colspan="3" class="detail">
					${houseDetail.hprice }
				</td>
			</tr>
			<tr>
				<td class="label">出租状态</td>
				<td colspan="3" class="detail">
					${houseDetail.hrentStatus == 1?"已出租":houseDetail.hrentStatus == 2?"待出租":"停止出租" }
				</td>
			</tr>
			<tr>
				<td class="label">添加时间</td>
				<td colspan="3" class="detail">
					${houseDetail.haddTime }
				</td>
			</tr>
			<tr>
				<td class="label">房屋图片</td>
				<td colspan="3" class="detail">
					<img src="../../../image/image.png" width="300px" height="200px">
				</td>
			</tr>


		</table>
		<div class="buttons">
			<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
		</div>
	</form>
</div>
</body>
</html>