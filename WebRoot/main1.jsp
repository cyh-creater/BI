<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
     <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>My JSP 'main1.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<link rel="stylesheet" href="<%=path %>/css/layui.css" media="all">
	
  <link rel="stylesheet" href="<%=path %>/layui/style/admin.css" media="all"></link>
  <script type="text/javascript" src="https://hm.baidu.com/hm.js?d214947968792b839fd669a4decaaffc"></script></head>
  
 
    <body class="layui-layout-body">
    
               <div class="layui-input-inline">
                <select name="quiz">
                  <option value="">请选择问题</option>
                  <optgroup label="城市记忆">
                    <option value="你工作的第一个城市">你工作的第一个城市</option>
                  </optgroup>
                  <optgroup label="学生时代">
                    <option value="你的工号">你的工号</option>
                    <option value="你最喜欢的老师">你最喜欢的老师</option>
                  </optgroup>
                </select>
                <div class="layui-unselect layui-form-select">
                	<div class="layui-select-title">
                		<input type="text" placeholder="请选择问题" value="" readonly="" class="layui-input layui-unselect">
                			<i class="layui-edge"></i>
                	</div>
                	<dl class="layui-anim layui-anim-upbit layui-select-group" style="">
                		<dd lay-value="" class="layui-select-tips layui-this">请选择问题</dd>
                			<dt>城市记忆</dt>
                		<dd lay-value="你工作的第一个城市" class="">你工作的第一个城市</dd>
                			<dt>学生时代</dt>
                		<dd lay-value="你的工号" class="">你的工号</dd>
                		<dd lay-value="你最喜欢的老师" class="">你最喜欢的老师</dd>
                	</dl>
                </div>
              </div>
              
    </body>
    </html>
 
