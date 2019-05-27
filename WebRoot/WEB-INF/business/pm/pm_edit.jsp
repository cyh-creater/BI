<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>实时数据修改</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="<%=path %>/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="<%=path %>/layui/style/admin.css" media="all">
  <style type="text/css">
  	.layui-form-label{
  		width: 170px;
  		text-align: center;
  	}
  </style>
</head>
<body>

  <div class="layui-fluid">
    <div class="layui-card">
      <div class="layui-card-header">${str }</div>
      <div class="layui-card-body" style="padding: 15px;">
        <form class="layui-form" name="form1" action="<%=path %>/pm/updatepm.action" lay-filter="component-form-group">
				<input type="hidden" name="pId" value="${pm.pId }">
				<input type="hidden" name="pmData" value="${pm.pmData }">
          <div class="layui-form-item">
            <input type="hidden" name="id" value="${pm.id}">
            <div class="layui-input-block">
            <c:if test="${pm.id==null}">
            	<input type="hidden" name="yName" value="${name}">
            	<span style=""><b>园区  ：${name}</b></span><br>
            	<div class="layui-inline">
	      			<label class="layui-form-label">时间  ：</label>
	      			<div class="layui-input-inline">
	       				<input type="text" class="layui-input" name="pmData" id="test1" placeholder="请选择时间">
	      			</div>
   				</div><br>
            	<br>
            </c:if>
            <c:if test="${pm.id!=null}">
            	<input type="hidden" name="yName" value="${name}">
            	<span class="layui-form-label">园区名称：</span>${name}<br>
            </c:if>
     			<div style="margin-bottom: 15px"><span class="layui-form-label">园区税收（亿万元）：</span><input type="text" name="pmTax" value="${pm.pmTax}" lay-verify="title" autocomplete="off" placeholder="请输入园区税收" class="layui-input" style="width:300px;display: inline-block;"></div>
     			<span class="layui-form-label">工业用电量（亿千瓦时）：</span><input type="text" name="pmElectric" value="${pm.pmElectric}" lay-verify="title" autocomplete="off" placeholder="请输入工业用电量" class="layui-input" style="width:300px;display: inline-block;"><br>
            </div>
            <input type="button" value="保存" class="layui-btn layuiadmin-btn-admin" data-type="batchdel" style="float: left;margin-left: 120px;margin-top: 20px;" onclick="edit1(${pm.id});"/>
            <input type="button" value="取消" class="layui-btn layuiadmin-btn-admin" data-type="batchdel" style="float: left;margin-left: 20px;margin-top: 20px;" onclick="history.go(-1);"/>
          </div>
          
        </form>
      </div>
    </div>
  </div>

    
  <script src="<%=path %>/layui/layui.js"></script>  
<script type="text/javascript">
  	function edit1(id){
  	
  		
  		if(id==null){
  			
  			document.forms.form1.action="<%=path%>/pm/save.action";
  			document.forms.form1.submit();
  		}else{
  			document.forms.form1.submit();
  			<%-- document.forms.form1.action="<%=path%>/pm/updatepm.action"; --%>
  		}
  		
  	}
  	
  </script>
  <script>
layui.use('laydate', function(){
  var laydate = layui.laydate;
  
  //执行一个laydate实例
  laydate.render({
    elem: '#test1' //指定元素
  });
});
</script>
</body>
</html>

