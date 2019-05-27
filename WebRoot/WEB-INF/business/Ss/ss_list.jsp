<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>



<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>静态表格</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
<link rel="stylesheet" href="<%=path%>/layui/css/layui.css" media="all">
<link rel="stylesheet" href="<%=path%>/layui/style/admin.css"
	media="all">
</head>
<body style="height:800px;">

	<div class="layui-card layadmin-header">
		<div class="layui-breadcrumb" lay-filter="breadcrumb">
			<a lay-href="">主页</a> <a><cite>组件</cite>
			</a> <a><cite>静态表格</cite>
			</a>
		</div>
	</div>

	<div class="layui-fluid">
		<div class="layui-row layui-col-space15">
			<div class="layui-col-md12">
				<div class="layui-card">
					<div class="layui-card-header"></div>
					<div class="layui-card-body">
						<form action="<%=path%>/ss/toList.action" name="form1" method="post">
							
							
							<table class="layui-table" lay-even="" lay-skin="row"
								style="width:900px;text-align:center;margin-left:25px;">
								<colgroup>
									<col width="150">
									<col width="150">
									<col width="150">
									<col width="150">
									<col width="200">
									<col width="200">
								</colgroup>
								<thead>
									<tr style="text-align:center;">
										<th style="text-align:center;">序号</th>
										<th style="text-align:center;">名称</th>
										<th style="text-align:center;">上升前</th>
										<th style="text-align:center;">上升后</th>
										<th style="text-align:center;">上升值</th>
										<th style="text-align:center;">操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="list" items="${list}" varStatus="t">
										<tr>
											
											<td>${t.index+1 }</td>
											<td>${list.rType }</td>
											<td>${list.rQnumber}</td>
											<td>${list.rNumber }</td>
											<td>${list.rRising }</td>
											<td>
													<button class="layui-btn layuiadmin-btn-admin"
													data-type="batchdel" onclick="edit(${list.id});">编辑</button>
											</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
						
						</form>
					</div>
				</div>
			</div>


		</div>
	</div>

	<script src="<%=path%>/layui/layui.js"></script>
	<script src="<%=path%>/js/layui/jquery.js"></script>
	<script type="text/javascript">
  	
  	function edit(id){
  		document.forms.form1.action="<%=path%>/ss/"+id+".action";
  		document.forms.form1.submit();
  	}
  </script>
</body>
</html>