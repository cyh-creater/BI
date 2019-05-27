<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%-- 
<button class="layui-btn layuiadmin-btn-admin"
													data-type="batchdel" onclick="edit(${aps.month});">
													编辑</button></td> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>修改数据</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
<link rel="stylesheet" href="<%=path%>/layui/css/layui.css" media="all">
<link rel="stylesheet" href="<%=path%>/layui/style/admin.css"
	media="all">
<link rel="stylesheet"
	href="<%=path%>/layui/css/modules/layer/default/layer.css">
<script type="text/javascript" src="<%=path%>/js/layui/jquery.js"></script>
<style type="text/css">
	td>input{
		border: hidden;
		text-align: center;
	}
</style>
</head>
<body style="height: 1400px;">

	<div class="layui-card layadmin-header">
		<div class="layui-breadcrumb" lay-filter="breadcrumb">
			<a lay-href="">主页</a> <a><cite>组件</cite>
			</a> <a><cite>静态表格</cite>
			</a>
		</div>
	</div>

	<div class="layui-fluid">
		<div class="layui-row layui-col-space15">
			<div class="layui-col-md12">
				<div class="layui-card">
					<div class="layui-card-header"></div>
					<div class="layui-card-body">
						<form action="<%=path%>/shengchanzongzhi/zlist.action" name="form1" method="post">
							<input type="hidden" id="month" name="month" />
							<div class="layui-input-block" style="margin-left:15px;">
							
								<label style="float:left;margin-left: 15px;line-height: 30px;margin-right: 15px;">
									${bst2.time}月${bst2.priject}
								</label>
									<button class="layui-btn layuiadmin-btn-admin" data-type="batchdel" 
										onclick="edit(${list.month});" style="float: right;">编辑</button>
							</div>
							<table class="layui-table" style="text-align: center;height: 100px">
								<colgroup>
									<col width="150">
									<col width="150">
									<col>
								</colgroup>
								<thead  class="layui-table-header">
									<tr style="text-align:center;">
										<th style="text-align:center;">经济指标</th>
										<th style="text-align:center;">单位（亿元）</th>
									</tr>
								</thead>
								<tbody class="layui-table-body layui-table-main" style="height: 100px;">
									
										<tr>
											<td>一、地区生产总值</td>
											<td>${list.sum }</td>	
										</tr>
										<tr>
											<td>第一产业</td>
											<td>${list.firstIndustry }</td>	
										</tr>
										<tr>
											<td>第二产业</td>
											<td>${list.secondIndustry }</td>	
										</tr>
										<tr>
											<td>第三产业</td>
											<td>${list.thirdIndustry }</td>	
										</tr>
										<tr>
											<td>二、规模以上的工业增加值</td>
											<td></td>	
										</tr>
										<tr>
											<td>大中小型企业</td>
											<td>${list1.bigZxqyAdd }</td>
										</tr>
										<tr>
											<td>工业产品销售率（%）</td>
											<td>${list1.industryCpxsl }</td>
										</tr>
										<tr>
											<td>发电量（亿千瓦时）</td>
											<td>${list1.fadianliang}</td>
										</tr>
										<tr>
											<td>铁路货运量（万吨）</td>
											<td>${list1.railHyl }</td>
										</tr>
										<tr>
											<td>公路货运量</td>
											<td>${list1.roadHyl }</td>
										</tr>
										<tr>
											<td>三、一般公共预算收入</td>
											<td>${list2.publicBudgetSr }</td>
										</tr>
										<tr>
											<td>一般公共预算支出</td>
											<td>${list2.publicBudgetZc }</td>
										</tr>
										<tr>
											<td>四、固定资产投资</td>
											<td></td>
										</tr>
										<tr>
											<td>第一产业</td>
											<td>${list3.firstIndustry }</td>
										</tr>
										<tr>
											<td>第二产业</td>
											<td>${list3.secondIndustry }</td>
										</tr>
										<tr>
											<td>第三产业</td>
											<td>${list3.thirdIndustry }</td>
										</tr>
										<tr>
											<td>房地产开发</td>
											<td>${list3.fangdichan }</td>
										</tr>
										<tr>
											<td>五、社会消费品零售总额</td>
											<td>${list4.socialRetail }</td>
										</tr>
										<tr>
											<td>六、旅游总收入</td>
											<td>${list5.totalTourismIncome }</td>
										</tr>
										<tr>
											<td>七、进出口总额</td>
											<td>${list6.totalExportImportVolume }</td>
										</tr>
										<tr>
											<td>出口总额</td>
											<td>${list6.totalExportVolume }</td>
										</tr>
										<tr>
											<td>进口总额</td>
											<td>${list6.totalImportVolume }</td>
										</tr>
										<tr>
											<td>八、金融机构各项存款余额</td>
											<td>${list7.bankingCkye }</td>
										</tr>
										<tr>
											<td>金融机构各项贷款余额</td>
											<td>${list7.bankingDkye }</td>
										</tr>
										<tr>
											<td>九、工业生产者出厂价格指数</td>
											<td>${list8.industryCcPriceZs }</td>
										</tr>
								</tbody>
							</table>
							
						</form>
					</div>
				</div>
			</div>


		</div>
	</div>

	<script src="<%=path%>/layui/layui.js"></script>
	<script src="<%=path%>/js/layui/layer.js"></script>
	<script type="text/javascript">
  	
  	function edit(id){
  		document.forms.form1.action="<%=path%>/shengchanzongzhi/"+id+".action";
  		document.forms.form1.submit();
  	}
  </script>
</body>
</html>
