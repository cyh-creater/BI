<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%String ref = request.getHeader("REFERER");%>
<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title> 山西转型综合改革示范区金融大数据监控平台后台管理</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="<%=path %>/layui/css/layui.css" media="all">
  	<link rel="stylesheet" href="<%=path %>/layui/style/admin.css" media="all">
  	
	
  </head>
  
  <body class="layui-layout-body">

<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
         <!-- 头部区域 -->
        <ul class="layui-nav layui-layout-left">
          <li class="layui-nav-item layadmin-flexible" lay-unselect>

            <a href="javascript:window.location='<%=ref%>';" layadmin-event="flexible" title="侧边伸缩">

            <a  layadmin-event="flexible" title="侧边伸缩">

              <i class="layui-icon layui-icon-shrink-right" id="LAY_app_flexible"></i>
            </a>
          </li>
          <li class="layui-nav-item layui-hide-xs" lay-unselect>
            <a href="<%=path %>/shengchanzongzhi/tolist.action" target="_blank" title="前台">
              <i class="layui-icon layui-icon-website"></i>
            </a>
          </li>
          <li class="layui-nav-item" lay-unselect>
            <a href="javascript:location.reload();" layadmin-event="refresh" title="刷新">
              <i class="layui-icon layui-icon-refresh-3"></i>
            </a>
          </li>
          <!-- <li class="layui-nav-item layui-hide-xs" lay-unselect>
            <input type="text" placeholder="搜索..." autocomplete="off" class="layui-input layui-input-search" layadmin-event="serach" lay-action="template/search.html?keywords="> 
          </li> -->
        </ul>
        <ul class="layui-nav layui-layout-right" lay-filter="layadmin-layout-right">
          
       
          <li class="layui-nav-item" lay-unselect>
          
            <a href="javascript:;">
              <cite>${temp.uName}</cite>
            </a>
            <dl class="layui-nav-child">
              <dd><a lay-href="set/user/info.html">基本资料</a></dd>
              <dd>
	              <!-- <%=path%>/suser/editpwd.action?userid=${temp.uId} -->
	              <a lay-href="#">修改密码</a>
              </dd>
              <hr>
              <dd layadmin-event="logout" style="text-align: center;"><a href="<%=path%>/suser/outLogin.action">退出</a></dd>
            </dl>
          </li>
          
          <li class="layui-nav-item layui-hide-xs" lay-unselect>
            <a href="javascript:;" layadmin-event="about"><i class="layui-icon layui-icon-more-vertical"></i></a>
          </li>
          <li class="layui-nav-item layui-show-xs-inline-block layui-hide-sm" lay-unselect>
            <a href="javascript:;" layadmin-event="more"><i class="layui-icon layui-icon-more-vertical"></i></a>
          </li>
        </ul>
    </div>
<div class="layui-side layui-side-menu">
        <div class="layui-side-scroll">
          <div class="layui-logo" lay-href="home/console.html">
            <span>管理平台</span>
          </div>
          
            <!-- 左侧垂直导航区域-->
            <!--lay-href="<%=path %>/ztree1/tolist.action?rid=1"  -->
            
	           <ul class="layui-nav layui-nav-tree" lay-shrink="" id="LAY-system-side-menu" lay-filter="layadmin-system-side-menu">
		           <!--父管理项  -->
		           <li data-name="home" class="layui-nav-item layui-nav-itemed">
			              <a href="javascript:;" lay-tips="主页" lay-direction="2">
			                <i class="layui-icon layui-icon-home"></i>
			                <cite>后台管理</cite>
			              </a>
			              <!--子管理项  -->
			              <dl class="layui-nav-child"  id="power">
				              <c:forEach var="qx" items="${quxianList}" varStatus="t">
					                <dd data-name="console" class="layui-this">
					                	<c:if test="${qx.highlevel==4 }">
						                	<c:choose>
						                		<c:when test='${qx.pName=="角色管理"}'>
						                			<a lay-href="<%=path %>${qx.url}?uid=${uid}" data-id="${qx.pId }" data-title="${qx.pName}">${qx.pName}</a>
						                		</c:when>
						                		<c:otherwise>
						                			<a lay-href="<%=path %>${qx.url}" data-id="${qx.pId }" data-title="${qx.pName}">${qx.pName}</a>
						                		</c:otherwise>
						                	</c:choose>
					                	</c:if>
					                </dd>
				              </c:forEach>
			              </dl> 
		            </li>
	            	
		            <li data-name="home" class="layui-nav-item layui-nav-itemed">
		           		 <!--父管理项  -->
			              <a href="javascript:;" lay-tips="主页" lay-direction="2">
			                <i class="layui-icon layui-icon-home"></i>
			                <cite>前台管理</cite>
			              </a>
			               <!--子管理项  -->
			              <dl class="layui-nav-child"  id="power">
				              <c:forEach var="qx" items="${quxianList}" varStatus="t">
					                <dd data-name="console" class="layui-this">
					                	<c:if test="${qx.highlevel==5}">	
					                		<a lay-href="<%=path %>${qx.url}" data-id="${qx.pId }" data-title="${qx.pName}">${qx.pName}</a>	                	
					                	</c:if>
					                </dd>
				              </c:forEach>
			              </dl>
		            </li>
	          </ul>
        </div>
    </div>
 <!-- 页面标签 -->
      <!-- 页面标签 -->
    <div class="layadmin-pagetabs" id="LAY_app_tabs">
        
        	<button type="button" onclick="black();" class="layui-icon layadmin-tabs-control layui-icon-prev" layadmin-event="leftPage"></button>
       
        <div class="layui-icon layadmin-tabs-control layui-icon-next" layadmin-event="rightPage"></div>
        <div class="layui-icon layadmin-tabs-control layui-icon-down">
          <ul class="layui-nav layadmin-tabs-select" lay-filter="layadmin-pagetabs-nav">
            <li class="layui-nav-item" lay-unselect>
              <a href="javascript:;"></a>
               <dl class="layui-nav-child layui-anim-fadein">
                <dd class="" layadmin-event="closeThisTabs"><a href="javascript:;">关闭当前标签页</a></dd>
                <dd layadmin-event="closeOtherTabs"><a href="javascript:;">关闭其它标签页</a></dd>
                <dd layadmin-event="closeAllTabs"><a href="javascript:;">关闭全部标签页</a></dd>
              </dl>
            </li>
          </ul>  
        </div>
        <div class="layui-tab" lay-unauto lay-allowClose="true" lay-filter="demo">
          <ul class="layui-tab-title" id="LAY_app_tabsheader">
            <li lay-id="home/console.html" lay-attr="home/console.html" class="layui-this"><i class="layui-icon layui-icon-home"></i></li>
          </ul>
		  <div class="layui-tab-content">
		   		
		   </div> 
        </div>
		
      </div>
	<!-- 主体内容 -->
      <div class="layui-body" id="LAY_app_body">
        <div class="layadmin-tabsbody-item layui-show" style="padding: 0;width: 100%;">
          <iframe src="" frameborder="0" class="layadmin-iframe" id="frame1"></iframe>
        </div>
     <div class="layui-footer" style="text-align:center;">
		    <!-- 底部固定区域 -->
		   山西转型综合改革示范区金融大数据监控平台
	</div>  
    </div>
  	<script src="<%=path %>/layui/layui.js"></script>
  	
  	<script src="<%=path %>/js/layui/jquery.js"></script>
    
  <script>
      layui.use(['element', 'layer', 'jquery'], function () {
        var element = layui.element;
        var $ = layui.$;
        // 配置tab实践在下面无法获取到菜单元素
        $('dd a').on('click', function () {
            var dataid = $(this);
            //这时会判断右侧.layui-tab-title属性下的有lay-id属性的li的数目，即已经打开的tab项数目
            if ($(".layui-tab-title li[lay-id]").length <= 0) {
                //如果比零小，则直接打开新的tab项
                active.tabAdd(dataid.attr("lay-href"), dataid.attr("data-id"), dataid.attr("data-title"));
            } else {
                //否则判断该tab项是否以及存在
                var isData = false; //初始化一个标志，为false说明未打开该tab项 为true则说明已有
                $.each($(".layui-tab-title li[lay-id]"), function () {
                    //如果点击左侧菜单栏所传入的id 在右侧tab项中的lay-id属性可以找到，则说明该tab项已经打开
                    if ($(this).attr("lay-id") == dataid.attr("data-id")) {
                        isData = true;
                    }
                });
                if (isData == false) {
                    //标志为false 新增一个tab项
                    active.tabAdd(dataid.attr("lay-href"), dataid.attr("data-id"), dataid.attr("data-title"));
                }
            }
            //最后不管是否新增tab，最后都转到要打开的选项页面上
            active.tabChange(dataid.attr("data-id"));
        });

        var active = {
            //在这里给active绑定几项事件，后面可通过active调用这些事件
            tabAdd: function (url, id, name) {
                //新增一个Tab项 传入三个参数，分别对应其标题，tab页面的地址，还有一个规定的id，是标签中data-id的属性值
                //关于tabAdd的方法所传入的参数可看layui的开发文档中基础方法部分

                element.tabAdd('demo', {
                    title: name,
                    content: '<iframe id="frame'+id+'" data-frameid="' + id + '" scrolling="auto" frameborder="0" src="' + url + '" style="width:100%;height:99%;"></iframe>',
                    id: id //规定好的id
                })
				//增加点击关闭事件  
                    var r = $(".layui-tab-title").find("li");
					
                    //每次新打开tab都是最后一个，所以只对最后一个tab添加点击关闭事件  
                    r.eq(r.length - 1).children("i").on("click", function () {
                     
				$("#frame"+$(this).parent("li").attr('lay-id')).remove();
                element.tabDelete("demo", $(this).parent("li").attr('lay-id'));//删除
				 
				
                        tabDelete("demo", $(this).parent("li").attr('lay-id'));
                    }), element.tabChange("demo", r.length - 1);
                    element.init(); 
				$(".layui-tab-item").css('display','none');
                $("#frame"+id).attr("src",url);
				$("#frame"+id).parent().css("display",'block');
                FrameWH();  //计算ifram层的大小
				  

            },
            tabChange: function (id) {
                //切换到指定Tab项
				
                element.tabChange('demo', id); //根据传入的id传入到指定的tab项
				$(".layui-tab-item").css('display','none');
                $("#frame"+id).attr("src",$("#frame"+id).attr("src"));
				$("#frame"+id).parent().css("display",'block');
            },
            tabDelete: function (othis,id) {
				
            }
        };
		

        function FrameWH() {
            var h = $(window).height();
            $("iframe").css("height",h+"px");
        }
    }); 
   
 <%-- function editpwd(id){
   			layer.open({
	  		type: 2, 
	  		area: ['900px', '900px'],
	  		shadeClose: true,
	 		content: "<%=path%>/suser/editpwd.action?userid="+id
		}); 
   }  --%>
   function black(){
   		window.history.go(-1);
   }
  </script>
</body>
</html>
