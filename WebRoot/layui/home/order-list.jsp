<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  
  <head>
    <meta charset="UTF-8">
    <title>欢迎页面-X-admin2.0</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,user-scalable=yes, minimum-scale=0.4, initial-scale=0.8,target-densitydpi=low-dpi" />
    <link rel="shortcut icon" href="/favicon.ico" type="image/x-icon" />
    <link rel="stylesheet" href="./css/font.css">
    <link rel="stylesheet" href="./css/xadmin.css">
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
    <script type="text/javascript" src="./lib/layui/layui.js" charset="utf-8"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
    <!-- 让IE8/9支持媒体查询，从而兼容栅格 -->
    <!--[if lt IE 9]>
      <script src="https://cdn.staticfile.org/html5shiv/r29/html5.min.js"></script>
      <script src="https://cdn.staticfile.org/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  	<script type="text/javascript" src="../js/jquery-1.8.3.min.js"></script>
  	<script type="text/javascript" src="../js/jquery.validate.min.js"></script>
  	<script type="text/javascript" src="../js/messages_zh.js"></script>
	<script type="text/javascript">
  		$(document).ready(function(){
    		$.getJSON("<%=path%>/company/selectAll.action",function(corps){
    			$.each(corps,function(index,corp){
    				var text="<tr><td><div class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='"+corp.id+"'><i class='layui-icon'>&#xe605;</i></div></td><td>"+corp.corpName+"</td><td>"+corp.addr+"</td><td>"+corp.belongOrg+"</td><td>"+corp.belongDistOrg+"</td><td>"+corp.belongTrade+"</td><td>"+corp.econKind+"</td><td>"+corp.admitMain+"</td><td>"+corp.startDate+"</td><td>"+corp.operManName+"</td><td>"+corp.corpStatus+"</td><td class='td-manage'><a title='查看'  onclick="+"companyUpdata("+corp.id+")"+" href='javascript:;'><i class='layui-icon'>&#xe63c;</i></a><a title='删除' onclick="+"X-admin/member_del(this,'"+corp.id+"')"+" href='javascript:;'><i class='layui-icon'>&#xe640;</i></a></td></tr>";
    				$("#tbody").append(text);
    			})
    		})
		})
  	</script>
  	</head>
  	
  <body>
    <div class="x-nav">
      <span class="layui-breadcrumb">
        <a href="">首页</a>
        <a href="">公司管理</a>
        <a>
          <cite>公司列表</cite></a>
      </span>
      <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right" href="javascript:location.replace(location.href);" title="刷新">
        <i class="layui-icon" style="line-height:30px">ဂ</i></a>
    </div>
    <div class="x-body">
      <div class="layui-row">
          <input type="text" id="corpName"  placeholder="请输入企业名称" autocomplete="off" class="layui-input">
          <button class="layui-btn"  lay-submit="" lay-filter="sreach" onclick="companyName()"><i class="layui-icon">&#xe615;</i></button>
      </div>
      <xblock>
      <!-- 批量删除 -->
      <!-- 添加 -->
      <!-- 数据总条数 -->
      <!-- 分页 -->
        <button class="layui-btn layui-btn-danger" onclick="delAll()"><i class="layui-icon"></i>批量删除</button>
        
        <button class="layui-btn" onclick="x_admin_show('添加公司','./order-add.jsp')"><i class="layui-icon"></i>添加</button>
        <span class="x-right" style="line-height:40px">共有数据：88 条</span>
      </xblock>
      <table class="layui-table">
        <thead>
          <tr>
            <th>
              <div class="layui-unselect header layui-form-checkbox" lay-skin="primary"><i class="layui-icon">&#xe605;</i></div>
            </th>
            <th>企业名称</th>
            <th>企业地址</th>
            <th>登记机关</th>
            <th>所属地区</th>
            <th>所属行业</th>
            <th>公司类型</th>
            <th>企业大类</th>
            <th>成立日期</th>
            <th>法人名称</th>
            <th>经营状态</th>
            <th >操作</th>
            </tr>
        </thead>
        <tbody id="tbody">
        </tbody>
      </table>
      <div class="page">
        <div>
          <a class="prev" href="">&lt;&lt;</a>
          <a class="num" href="">1</a>
          <span class="current">2</span>
          <a class="num" href="">3</a>
          <a class="num" href="">489</a>
          <a class="next" href="">&gt;&gt;</a>
        </div>
      </div>

    </div>
    <script>
      layui.use('laydate', function(){
        var laydate = layui.laydate;
        
        //执行一个laydate实例
        laydate.render({
          elem: '#start' //指定元素
        });

        //执行一个laydate实例
        laydate.render({
          elem: '#end' //指定元素
        });
      });
      /*公司信息编辑*/
      function companyUpdata(id){
      	alert(id);
      	document.cookie = "corpid="+id;
      	x_admin_show('编辑','./order-view.jsp');
      }
      /*根据公司名进行查询*/
      function companyName(){
      		var corpName = $("#corpName").val();
      		$.getJSON("<%=path%>/company/selectCompany.action?corpName="+corpName,function(corps){
      			$("#tbody").html("");
      			$.each(corps,function(index,corp){
    				var text="<tr><td><div class='layui-unselect layui-form-checkbox' lay-skin='primary' data-id='"+corp.id+"'><i class='layui-icon'>&#xe605;</i></div></td><td>"+corp.corpName+"</td><td>"+corp.addr+"</td><td>"+corp.belongOrg+"</td><td>"+corp.belongDistOrg+"</td><td>"+corp.belongTrade+"</td><td>"+corp.econKind+"</td><td>"+corp.admitMain+"</td><td>"+corp.startDate+"</td><td>"+corp.operManName+"</td><td>"+corp.corpStatus+"</td><td class='td-manage'><a title='查看'  onclick="+"x_admin_show('编辑','./order-view.jsp?corpid="+corp.id+"')"+" href='javascript:;'><i class='layui-icon'>&#xe63c;</i></a><a title='删除' onclick="+"X-admin/member_del(this,'"+corp.id+"')"+" href='javascript:;'><i class='layui-icon'>&#xe640;</i></a></td></tr>";
    				$("#tbody").append(text);
    			})
      		})
      }

       /*用户-停用*/
      function member_stop(obj,id){
          layer.confirm('确认要停用吗？',function(index){

              if($(obj).attr('title')=='启用'){

                //发异步把用户状态进行更改
                $(obj).attr('title','停用')
                $(obj).find('i').html('&#xe62f;');

                $(obj).parents("tr").find(".td-status").find('span').addClass('layui-btn-disabled').html('已停用');
                layer.msg('已停用!',{icon: 5,time:1000});

              }else{
                $(obj).attr('title','启用')
                $(obj).find('i').html('&#xe601;');

                $(obj).parents("tr").find(".td-status").find('span').removeClass('layui-btn-disabled').html('已启用');
                layer.msg('已启用!',{icon: 5,time:1000});
              }
              
          });
      }

      /*用户-删除*/
      function member_del(obj,id){
          layer.confirm('确认要删除吗？',function(index){
         	 alert(id);
              //发异步删除数据
              $.getJSON("<%=path%>/company/delete.action?data="+id,function(temp){
              		if(temp){
              			$(obj).parents("tr").remove();
              			layer.msg('已删除!',{icon:1,time:1000});
              		}
              });
          });
      }



      function delAll (argument) {

        var data = tableCheck.getData();
  
        layer.confirm('确认要删除吗？'+data,function(index){
            //捉到所有被选中的，发异步进行删除
            $.getJSON("<%=path%>/company/deleteList.action?data="+data,function(temp){
            	if(temp){
            		layer.msg('删除成功', {icon: 1});
            		$(".layui-form-checked").not('.header').parents('tr').remove();
            	}
            });
        });
      }
    </script>
    <script>var _hmt = _hmt || []; (function() {
        var hm = document.createElement("script");
        hm.src = "https://hm.baidu.com/hm.js?b393d153aeb26b46e9431fabaf0f6190";
        var s = document.getElementsByTagName("script")[0];
        s.parentNode.insertBefore(hm, s);
      })();</script>
  </body>

</html>