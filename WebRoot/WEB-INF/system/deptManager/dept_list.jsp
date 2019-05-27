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
						<form action="<%=path%>/depts/toList.action" name="form1" method="post">
							<input type="hidden" id="did" name="dId" />
							<div class="layui-input-block" style="margin-left:15px;">
							
							<label style="float:left;margin-left: 15px;line-height: 30px;margin-right: 15px;">
								部门：	
							</label>
								<input type="text" name="dName" placeholder="请输入想查询的部门"
									autocomplete="off" class="layui-input"
									value="${not empty(dName)?dName:'' }"
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
									<col width="200">
								</colgroup>
								<thead>
									<tr style="text-align:center;">
										<th style="text-align:center;">序号</th>
										<th style="text-align:center;">部门编号</th>
										<th style="text-align:center;">部门名</th>
										<th style="text-align:center;">操作</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach var="depts" items="${depts}" varStatus="t">
										<tr>
											<%-- <td> <input type="checkbox" name="ids" value="${goods.id }" /></td> --%>
											<td>${t.index+1 }</td>
											<td>${depts.dNum }</td>
											<td>${depts.dName }</td>
											<td>
												<button class="layui-btn layuiadmin-btx`pe="
													batchdel" onclick="dele(${depts.dId});">删除</button>
												<button class="layui-btn layuiadmin-btn-admin"
													data-type="batchdel" onclick="edit(${depts.dId});">编辑</button>
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
											href="<%=path %>/depts/toList.action?pageIndex=${page.firstPage}&dName=${dName}"
											data-page="1">首页</a>
										<c:choose>
											<c:when test="${page.pageNum==page.firstPage}">
												<a href="javascript:void(0)" data-page="${page.firstPage}">上一页</a>
											</c:when>
											<c:otherwise>
												<a class="layui-laypage-prev"
													href="<%=path %>/depts/toList.action?pageIndex=${page.prePage}&dName=${dName}">上一页</a>
											</c:otherwise>
										</c:choose>
										<a href="javascript:void(0)" data-page="${page.pageNum}">当前为第${page.pageNum}页</a>
										<c:choose>
											<c:when test="${page.pageNum==page.pages}">
												<a href="javascript:void(0)" data-page="${page.lastPage}">下一页</a>
											</c:when>
											<c:otherwise>
												<a class="layui-laypage-next"
													href="<%=path %>/depts/toList.action?pageIndex=${page.nextPage}&dName=${dName}">下一页</a>
											</c:otherwise>
										</c:choose>
										<a
											href="<%=path %>/depts/toList.action?pageIndex=${page.pages}&dName=${dName}"
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
  		$.ajax({
			async : false,  
			type: "POST",
			url: "<%=path%>/suser/checkdeptid.action",
			data:"deptid=" + id,//发送给服务器的参数
			dataType: "json",
			success: function(result) {
	
			//eval("(" + result.responseText + ")")
				if (result) {
					alert("可以删除！");
					document.getElementById("did").value=id;
			  		document.forms.form1.action="<%=path%>/depts/delDept.action";
			  		document.forms.form1.submit();
				 }else{
					alert("该部门不能被删除！");
				}
			}
		});
  	}
  	function edit(id){
  		document.forms.form1.action="<%=path%>/depts/"+id+".action";
  		document.forms.form1.submit();
  	}
  </script>
</body>
</html>