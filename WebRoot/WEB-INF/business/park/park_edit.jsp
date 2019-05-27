<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>部门</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="<%=path %>/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="<%=path %>/layui/style/admin.css" media="all">
</head>
<body>

  <div class="layui-fluid">
    <div class="layui-card">
      <div class="layui-card-header">编辑园区 </div>
      <div class="layui-card-body" style="padding: 15px;">
        <form class="layui-form" name="form1" action="<%=path %>/park/updatePark.action" lay-filter="component-form-group">
          <input type="hidden" name="id" value="${park.id }">
          <div class="layui-form-item">
            
            <div class="layui-input-block">
              <input type="text" name="yName" value="${park.yName }" lay-verify="title" autocomplete="off" placeholder="请输入园区名称" class="layui-input" style="width:300px;">            </div>
            <input type="button" value="保存" class="layui-btn layuiadmin-btn-admin" data-type="batchdel" style="float: left;margin-left: 120px;margin-top: 20px;" onclick="edit1(${park.id });"/>
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
  			
  			document.forms.form1.action="<%=path%>/park/savePark.action";
  		}else{
  			document.forms.form1.action="<%=path%>/park/updatePark.action";
  		}
  		document.forms.form1.submit();
  	}
  	
  </script>
</body>
</html>

