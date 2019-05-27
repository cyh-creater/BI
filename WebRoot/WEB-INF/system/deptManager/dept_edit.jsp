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
  <link rel="stylesheet" href="../layui/css/layui.css" media="all">
  <link rel="stylesheet" href="../layui/style/admin.css" media="all">
</head>
<body>

  <div class="layui-fluid">
    <div class="layui-card">
      <div class="layui-card-header">${a }部门 </div>
      <div class="layui-card-body" style="padding: 15px;">
        <form class="layui-form" name="form1" action="<%=path %>/depts/updateDept.action" lay-filter="component-form-group">
          <input type="hidden" name="dId" value="${dept.dId }">
          <div class="layui-form-item">
            
            <div class="layui-input-block">
              <input type="text" name="dName" value="${dept.dName }" lay-verify="title" autocomplete="off" placeholder="请输入部门名称" class="layui-input" style="width:300px;">
               <input type="text" name="dNum" value="${dept.dNum }" lay-verify="title" autocomplete="off" placeholder="请输入部门编号" class="layui-input" style="width:300px;">
            </div>
            <input type="button" value="保存" class="layui-btn layuiadmin-btn-admin" data-type="batchdel" style="float: left;margin-left: 120px;margin-top: 20px;" onclick="edit1(${dept.dId });"/>
            <input type="button" value="取消" class="layui-btn layuiadmin-btn-admin" data-type="batchdel" style="float: left;margin-left: 20px;margin-top: 20px;" onclick="history.go(-1);"/>
          </div>
          
        </form>
      </div>
    </div>
  </div>

    
  <script src="../layui/layui.js"></script>  
  <script type="text/javascript">
  	function edit1(id){
  	
  		
  		if(id==null){
  			
  			document.forms.form1.action="<%=path%>/depts/saveDept.action";
  		}else{
  			document.forms.form1.action="<%=path%>/depts/updateDept.action";
  		}
  		document.forms.form1.submit();
  	}
  	
  </script>
</body>
</html>

