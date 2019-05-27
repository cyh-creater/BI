<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta http-equiv="content-type" content="text/html;charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<title>统计后台登录</title>

<link rel="stylesheet" type="text/css" href="css/style.css">

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/vector.js"></script>
<style type="text/css">
	#entry_btn{
		background-color: #fff;
		color: #757575;
	}
</style>
<link rel="stylesheet"
	href="<%=path%>/layui/css/modules/layer/default/layer.css">
<link rel="stylesheet" href="../layui/css/modules/layer/default/layer.css" type="text/css"></link>
<script type="text/javascript" src="<%=path %>/layui/layui.js"></script>
<script type="text/javascript" src="<%=path %>/layui/layer.js">
<script type="text/javascript">
	
		var num = document.getElementById("pds").value;
		alert(num);
		if(num==1){
		layui.use('layer', function(){
			layer.open({
  				title: '登录失败',
  				content: '账号或密码错误，请重新输入'
  				});
		});  
	}
</script>
</head>

<body>

<div id="container">
	<div id="output">
		<div class="containerT">
			<h1>用户登录</h1>
			<form class="form" id="entry_form" action="<%=path%>/suser/Login.action" method="post">
				<input type="hidden" id="pds" value="${pd}">
				<input type="text" placeholder="用户名" id="entry_name" name="userName">
				<input type="password" placeholder="密码" id="entry_password" name="Password">
				<input type="submit" id="entry_btn" value="登录"></input>
				<div id="prompt" class="prompt"></div>
			</form>
		</div>
	</div>
</div>
</script>
<script type="text/javascript">
    $(function(){
        Victor("container", "output");   //登陆背景函数
        $("#entry_name").focus();
        $(document).keydown(function(event){
            if(event.keyCode==13){
                $("#entry_btn").click();
            }
        });
    });
</script>

</body>

</html>

