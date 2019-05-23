<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
<head>
<base href="<%=basePath%>">
	<title> ZTREE DEMO - select menu</title>
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="<%=basePath%>css/demo.css" type="text/css">
	<link rel="stylesheet" href="<%=basePath%>css/zTreeStyle/zTreeStyle.css" type="text/css">
	<script type="text/javascript" src="<%=basePath%>/ztree_js/jquery-1.4.4.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/ztree_js/jquery.ztree.core.js"></script>
	<script type="text/javascript" src="<%=basePath%>/ztree_js/jquery.ztree.excheck.js"></script>
	<script type="text/javascript" src="<%=basePath%>/ztree_js/jquery.ztree.exedit.js"></script>
	<script type="text/javascript">
		
		var setting = {
			view: {
				dblClickExpand: false
			},
			check: {
				enable: true,
			},
			data: {
       			 simpleData: {
           			 enable: true
      			  }
   			 },
			callback: {
				onCheck: onCheck
			},
			edit:{
				enable: true,	
				showRemoveBtn: true,
				showRenameBtn: true,
			}
			 <%-- async:{
				enable: true,
				type:"post",
				autoParam:["id"],
				url: '<%=path%>/ztree/update.action?pid=treeNode.id'
			}	 --%> 
		};
		
		/* alert('${list}'); */
 		var zNodes =eval('${list}'); 
		var zTree, rMenu;
		$(document).ready(function(){
			$.fn.zTree.init($("#treeDemo"), setting, zNodes);
			zTree = $.fn.zTree.getZTreeObj("treeDemo");
			rMenu = $("#rMenu");
		});
		var clearFlag=false;
		function onCheck(e, treeId, treeNode) {
			/* alert(treeNode.id);
		 		alert(treeNode.checked); */
				$.getJSON("<%=path%>/ztree/update.action",{pid:treeNode.id,checked:treeNode.checked}); 
			if (clearFlag) {
				clearCheckedOldNodes();
			}
		}
		
	</script>
<style type="text/css">
		div#rMenu {
			position:absolute; 
			visibility:hidden; 
			top:0; 
			background-color: #E0E0E0;
			text-align: center;
			padding: 2px;
		}
		div#rMenu ul li{
			margin: 1px 0;
			padding: 0 5px;
			cursor: pointer;
			list-style: none outside none;
			background-color: #F0F0F0;
		}
</style>
 </head>

<body>

<div class="content_wrap">
	<div class="zTreeDemoBackground left">
		<ul id="treeDemo" class="ztree"></ul>
		<input type="hidden" name="pid">
	</div>
</div>

</body>
</html>