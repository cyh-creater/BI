<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>角色编辑</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="../layui/css/layui.css" media="all">
  <link rel="stylesheet" href="../layui/style/admin.css" media="all">
  <link rel="stylesheet" href="<%=path %>/layui/css/modules/layer/default/layer.css">
  <script type="text/javascript" src="../../../js/layui/jquery.js"></script><body>

  <div class="layui-fluid">
    <div class="layui-card">
    
    
    
      <div class="layui-card-header">${a}角色 </div>
      <div class="layui-card-body" style="padding: 15px;">
        <form class="layui-form" name="form1" action="<%=path %>/roles/updateRole.action" lay-filter="component-form-group">
          <input type="hidden" name="rId" value="${role.rId }" id="rid">
          <div class="layui-form-item">
            <label class="layui-form-label">角色名：</label>
            <div class="layui-input-block">
              <input type="text" name="rName" value="${role.rName }" required="required" lay-verify="title" autocomplete="off" placeholder="请输入角色名" class="layui-input" style="width:300px;">
            </div>
            <input type="button" value="保存" class="layui-btn layuiadmin-btn-admin" data-type="batchdel" style="float: left;margin-left: 120px;margin-top: 20px;" onclick="edit1(${role.rId });"/>
            <input type="button" value="取消" class="layui-btn layuiadmin-btn-admin" data-type="batchdel" style="float: left;margin-left: 20px;margin-top: 20px;" onclick="history.go(-1);"/>
          </div>
          
        </form>
      </div>
    </div>
  </div>

    
  <script src="../layui/layui.js"></script> 
  <script src="<%=path%>/js/layui/layer.js"></script> 
  <script type="text/javascript">
  	function edit1(id){
  		//alert(id);
  		//询问框
		layer.confirm('是否提交？', {
		  btn: ['提交','取消'] //按钮
		}, function(){
		  	layer.msg('保存成功！', {icon: 1});
		  	if(id==null){
	  			document.forms.form1.action="<%=path%>/roles/saveRole.action";
	  		}else{
	  			document.forms.form1.action="<%=path%>/roles/updateRole.action";
	  		}
	  		document.forms.form1.submit();
		}, function(){
		   	layer.msg('取消成功！', {icon: 1});
		  	document.forms.form1.action="<%=path%>/roles/"+id+".action";
		});
  	}	
	
  </script>
</body>
</html>

