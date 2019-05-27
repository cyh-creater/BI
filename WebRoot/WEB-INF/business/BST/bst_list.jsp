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
	<style type="text/css">
		.h:HOVER{
			color:#a39595;
		}
	</style>
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
						<form action="<%=path%>/dmc/toList.action" name="form1" method="post">
							<input type="hidden" id="id" name="id" />
							<div class="layui-input-block" style="margin-left:15px;">
							
							<label style="float:left;margin-left: 15px;line-height: 30px;margin-right: 15px;">
								日期：	
							</label>
								<input type="text" name="time" placeholder="请选择想查询的时间"
									autocomplete="off" class="layui-input"
									value="${not empty(time)?time:'' }"
									style="width:300px;height:30px;"> <input type="submit"
									value="查询" class="layui-btn layuiadmin-btn-admin"
									data-type="batchdel"
									style="float: right;margin-right: 465px;margin-top: -29px;" />
								<button class="layui-btn layuiadmin-btn-admin"
									data-type="batchdel" onclick="edit(0);"
									style="float: right;margin-right: 380px;margin-top: -29px;">新增</button>
							</div>
							<table class="layui-table" lay-even="" lay-skin="row"
								style="width:900px;text-align:center;margin-left:25px;">
								<colgroup>
									<col width="150">
									<col width="150">
									<col width="200">
								</colgroup>
								<thead>
									<tr style="text-align:center;">
										<th style="text-align:center;">序号</th>
										<th style="text-align:center;">项目名</th>
										<th style="text-align:center;">操作</th>
										
									</tr>
								</thead>
								<tbody>
									<c:forEach var="b" items="${bsts}" varStatus="t">
										<tr>
											<%-- <td> <input type="checkbox" name="ids" value="${goods.id }" /></td> --%>
											<td>${t.index+1 }</td>
											<td class="h" onclick="xqs(${b.id});">${b.time }${b.priject }</td>
											
											<td>
												<button class="layui-btn layuiadmin-btx`pe="
													batchdel" onclick="dele(${b.id});">删除</button>
												<button class="layui-btn layuiadmin-btn-admin"
													data-type="batchdel" onclick="edit(${b.id});">编辑</button>
											</td>
										</tr>
									</c:forEach>

								</tbody>
							</table>
							<div class="layui-card-body" style="margin-left:490px;">
								<div id="test-laypage-demo1">
									<div class="layui-box layui-laypage layui-laypage-default"
										id="layui-laypage-2">
										<a
											href="<%=path %>/dmc/toList.action?pageIndex=${page.firstPage}&time=${time}"
											data-page="1">首页</a>
										<c:choose>
											<c:when test="${page.pageNum==page.firstPage}">
												<a href="javascript:void(0)" data-page="${page.firstPage}">上一页</a>
											</c:when>
											<c:otherwise>
												<a class="layui-laypage-prev"
													href="<%=path %>/dmc/toList.action?pageIndex=${page.prePage}&time=${time}">上一页</a>
											</c:otherwise>
										</c:choose>
										<a href="javascript:void(0)" data-page="${page.pageNum}">当前为第${page.pageNum}页</a>
										<c:choose>
											<c:when test="${page.pageNum==page.pages}">
												<a href="javascript:void(0)" data-page="${page.lastPage}">下一页</a>
											</c:when>
											<c:otherwise>
												<a class="layui-laypage-next"
													href="<%=path %>/dmc/toList.action?pageIndex=${page.nextPage}&time=${time}">下一页</a>
											</c:otherwise>
										</c:choose>
										<a
											href="<%=path %>/dmc/toList.action?pageIndex=${page.pages}&time=${time}"
											data-page="${page.pages}">尾页</a> <a href="javascript:void(0)"
											data-page="${page.pages}">共${page.pages }页</a>
									</div>
								</div>
							</div>
						</form>
					</div>
				</div>
			</div>


		</div>
	</div>

	<script src="<%=path%>/layui/layui.js"></script>
	<script src="<%=path%>/js/layui/jquery.js"></script>
	<script type="text/javascript">
  	function dele(id){
  		document.getElementById("id").value=id;
  		document.forms.form1.action="<%=path%>/dmc/del.action";
  		document.forms.form1.submit();
  	}
  	function edit(id){
  		document.getElementById("id").value=id;
  		document.forms.form1.action="<%=path%>/dmc/zs.action";
  		document.forms.form1.submit();
  	}
  	function xqs(id){
  		document.getElementById("id").value=id;
  		document.forms.form1.action="<%=path%>/dmc/zs.action";
  		document.forms.form1.submit();
  	}
  </script>
</body>
</html>