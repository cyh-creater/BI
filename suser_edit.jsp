<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>用户</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
  <link rel="stylesheet" href="<%=path %>/layui/css/layui.css" media="all">
  <link rel="stylesheet" href="<%=path %>/layui/style/admin.css" media="all">
  <link rel="stylesheet" href="<%=path %>/layui/css/modules/layer/default/layer.css">
  <script type="text/javascript" src="<%=path %>/js/layui/jquery.js"></script>
</head>
<body>

  <div class="layui-fluid">
    <div class="layui-card">
      <div class="layui-card-header">${a }用户 </div>
      <div class="layui-card-body" style="padding: 15px;">
        <form class="layui-form" name="form1" action="<%=path %>/suser/updateSUser.action" lay-filter="component-form-group">
          <input type="hidden" name="uId" value="${user.uId }">
          <input type="hidden" name="status" value=0>
          <div class="layui-form-item">
            <label class="layui-form-label">用户名：</label>
            <div class="layui-input-block">
              <input type="text" name="uName" value="${user.uName }" lay-verify="title" autocomplete="off" placeholder="请输入用户名" class="layui-input" style="width:300px;">
            </div>
            <label class="layui-form-label">密码：</label>
            <div class="layui-input-block">
              <input type="text" name="pwd" value="${user.pwd }" lay-verify="title" autocomplete="off" placeholder="请输入用户名" class="layui-input" style="width:300px;">
            </div>
            <label class="layui-form-label">部门：</label>
            <div class="layui-inline">
                <select name="deptid">
                  <option value="">请选部门</option>
                  <c:forEach var="dept" items="${sdepts}">
                  	<c:choose>
                  		<c:when test="${user.deptid == dept.dId}">
                  			<option value="${dept.dId }" selected="selected">${dept.dName }</option>
                  		</c:when>
                  		<c:otherwise>
                  			<option value="${dept.dId }">${dept.dName }</option>
                  		</c:otherwise>
                  	</c:choose>
                  </c:forEach>
                </select>
            </div>
            <label class="layui-form-label">角色：</label>
            <div class="layui-inline">
                <select name="roleid">
                  <option value="">请选角色</option>
                  <c:forEach var="role" items="${roles}">
                  	<c:choose>
                  		<c:when test="${user.roleid == role.rId}">
                  			<option value="${role.rId }" selected="selected">${role.rName }</option>
                  		</c:when>
                  		<c:otherwise>
                  			<option value="${role.rId }">${role.rName }</option>
                  		</c:otherwise>
                  	</c:choose>
                  </c:forEach>
                </select>
            </div>
            <input type="button" value="保存" class="layui-btn layuiadmin-btn-admin" data-type="batchdel" style="float: left;margin-left: 120px;margin-top: 20px;" onclick="edit1(${user.uId });"/>
            <input type="button" value="取消" class="layui-btn layuiadmin-btn-admin" data-type="batchdel" style="float: left;margin-left: 20px;margin-top: 20px;" onclick="history.go(-1);"/>
          </div>
          
        </form>
      </div>
    </div>
  </div>

  <script src="<%=path%>/js/layui/layer.js"></script>
  <script src="../layui/layui.js"></script>  
  <script type="text/javascript">
  	function add() {
	layer.open({
	  type: 2, 
	  content: '<%=path%>/home/edit.jsp'
	});
	}
  	function edit1(id){
  		if(id!=null){
  			document.forms.form1.action="<%=path%>/suser/updateSUser.action";
  		}else{
  			document.forms.form1.action="<%=path%>/suser/saveSuser.action";
  		}
  		document.forms.form1.submit();
  	}
  	
  </script>
</body>
</html>

