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
<link rel="stylesheet"
	href="<%=path%>/layui/css/modules/layer/default/layer.css">


<script src="<%=path%>/js/layui/jquery.js"></script>
</head>
<body>

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
						<form action="<%=path%>/park/toList.action" name="form1" method="post">
							<input type="hidden" id="id" name="id" />
							<input type="hidden" id="pId" name="pId">
							<div class="layui-input-block" style="margin-left:15px;">
							
							<label style="float:left;margin-left: 15px;line-height: 30px;margin-right: 15px;">
								园区名称：	
							</label>
								<input type="text" name="yName" placeholder="请输入想查询的园区"
									autocomplete="off" class="layui-input"
									style="width:300px;height:30px;"
									value="${not empty(yName)?yName:'' }"> <input
									type="submit" value="查询" class="layui-btn layuiadmin-btn-admin"
									data-type="batchdel"
									style="float: right;margin-right: 465px;margin-top: -29px;" />

								<button class="layui-btn layuiadmin-btn-admin"
									data-type="batchdel" onclick="edit(0);"
									style="float: right;margin-right: 380px;margin-top: -29px;">新增</button>
							</div>
							<table class="layui-table" lay-even="" lay-skin="row"
								style="width:900px;text-align:center;margin-left:20px;line-height:20px;margin-top:-15px;">
								<colgroup>
									<col width="200">
									<col width="200">
									<col width="200">
									<col width="200">
								</colgroup>
								<thead>
									<tr style="text-align:center;">
										<th style="text-align:center;">序号</th>
										<th style="text-align:center;">园区名称</th>
										<th style="text-align:center;">排名详情</th>
										<th style="text-align:center;">操作</th>
									</tr>
								</thead>
								<tbody>
									<div class="layui-btn-group">
										<c:forEach var="list" items="${list}" varStatus="t">
											<tr>
												<td>${t.index+1 }</td>
												<td>${list.yName }</td>
												<td>
												<button
														class="layui-btn layuiadmin-btn-admin layui-btn-small"
														data-type="batchdel" onclick="xq(${list.id});">详情</button></td>
												<td>
													<button
														class="layui-btn layuiadmin-btn-admin layui-btn-small"
														data-type="batchdel" onclick="edit(${list.id});">编辑</button>
													<button
														class="layui-btn layuiadmin-btx layui-btn-small`pe="
														batchdel" onclick="dele(${list.id});">删除</button>

												</td>
												
											</tr>
										</c:forEach>
									</div>
								</tbody>
							</table>
							<div class="layui-card-body" style="margin-left:500px;">
								<div id="test-laypage-demo1">
									<div class="layui-box layui-laypage layui-laypage-default"
										id="layui-laypage-2">
										<a
											href="<%=path %>/park/toList.action?pageIndex=1&yName=${yName}"
											data-page="1">首页</a>
										<c:choose>
											<c:when test="${page.pageNum==page.firstPage}">
												<a href="javascript:void(0)" data-page="${page.firstPage}">上一页</a>
											</c:when>
											<c:otherwise>
												<a class="layui-laypage-prev"
													href="<%=path %>/park/toList.action?pageIndex=${page.prePage}&yName=${yName}">上一页</a>
											</c:otherwise>
										</c:choose>
										<a href="javascript:void(0)" data-page="${page.pageNum}">当前为第${page.pageNum}页</a>
										<c:choose>
											<c:when test="${page.pageNum==page.pages}">
												<a href="javascript:void(0)" data-page="${page.lastPage}">下一页</a>
											</c:when>
											<c:otherwise>
												<a class="layui-laypage-next"
													href="<%=path %>/park/toList.action?pageIndex=${page.nextPage}&yName=${yName}">下一页</a>
											</c:otherwise>
										</c:choose>
										<a
											href="<%=path %>/park/toList.action?pageIndex=${page.pages}&yName=${yName}"
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

</body>
<script src="<%=path%>/layui/layui.js"></script>
<script src="<%=path%>/js/layui/layer.js"></script>
<script type="text/javascript">
 
   	function dele(id){
   		
				document.getElementById("id").value=id;
  				document.forms.form1.action="<%=path%>/park/delePark.action";
  				document.forms.form1.submit();
		}
		  	
    
    function edit(id){
  		document.forms.form1.action="<%=path%>/park/"+id+".action";
  		document.forms.form1.submit();
  	} 
	function xq(id){
		document.getElementById("pId").value=id;
		document.forms.form1.action="<%=path%>/pm/toList.action";
  				document.forms.form1.submit();
	}
  </script>
</html>