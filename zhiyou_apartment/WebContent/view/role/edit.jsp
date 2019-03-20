<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>XX系统 - 房屋信息更新</title>
	<link rel="stylesheet" href="<c:url value='/css/main.css'/> ">
	<link rel="stylesheet" href="<c:url value='/lib/font-awesome/css/font-awesome.css'/> ">
</head>
<body>
<div class="box">
	<h3>修改角色信息</h3>
	<form action="<c:url value='/role/edit' />" method="post">
	<input type="hidden" name="roid" value="${role.roid }">
		<table class="form-table">
			<tr>
				<td>角色名</td>
				<td colspan="3" class="control">
					<input type="text" name="roname" placeholder="角色名" value="${role.roname }">
				</td>
			</tr>
			<tr>
				<td>角色描述</td>
				<td colspan="3" class="control">
					<input type="text" name="rodesc" placeholder="角色描述" value="${role.rodesc }">
				</td>
			</tr>
			
			<tr>
				<td>角色权限</td>
				<td colspan="3" class="control">
					<input id="ch1" type="checkbox" name="auths"  value="1" >增<br>
					<input id="ch2" type="checkbox" name="auths"  value="2" >删<br>
					<input id="ch3" type="checkbox" name="auths"  value="3" >改<br>
					<input id="ch4" type="checkbox" name="auths"  value="4" >查<br>
				<c:forEach items="${auths }" var="auth">
					<c:if test="${auth.aid==1 }">
						<script type="text/javascript">
							var ch = document.getElementById("ch1");
							ch.setAttribute('checked','checked');
						</script>
					</c:if>
					<c:if test="${auth.aid==2 }">
						<script type="text/javascript">
							var ch = document.getElementById("ch2");
							ch.setAttribute('checked','checked');
						</script>
					</c:if>
					<c:if test="${auth.aid==3 }">
						<script type="text/javascript">
							var ch = document.getElementById("ch3");
							ch.setAttribute('checked','checked');
						</script>
					</c:if>
					<c:if test="${auth.aid==4 }">
						<script type="text/javascript">
							var ch = document.getElementById("ch4");
							ch.setAttribute('checked','checked');
						</script>
					</c:if>
				</c:forEach>
				</td>
			</tr>
			
		</table>
		<div class="buttons">
			<input class="btn btn-primary va-bottom" type="submit" value="保存">&nbsp;&nbsp;
			<a class="btn btn-default" href="javascript:history.go(-1)">返回</a>
		</div>
	</form>
</div>
</body>
</html>