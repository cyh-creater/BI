<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
<!-- <link rel="stylesheet" href="layui/style/style.css" type="text/css"></link> -->
<link rel="stylesheet" href="layui/css/layui.css" type="text/css"></link>
<script type="text/javascript" src="js/layui/layui.js"></script><body>

	<div class="layui-table-tool">
		<div class="layui-table-tool-temp">
			<div class="layui-inline" lay-event="add">
				<i class="layui-icon layui-icon-add-1"></i>
			</div>
			<div class="layui-inline" lay-event="update">
				<i class="layui-icon layui-icon-edit"></i>
			</div>
			<div class="layui-inline" lay-event="delete">
				<i class="layui-icon layui-icon-delete"></i>
			</div>
		</div>
		<div class="layui-table-tool-self">
			<div class="layui-inline" title="筛选列" lay-event="LAYTABLE_COLS">
				<i class="layui-icon layui-icon-cols"></i>
			</div>
			<div class="layui-inline" title="导出" lay-event="LAYTABLE_EXPORT">
				<i class="layui-icon layui-icon-export"></i>
			</div>
			<div class="layui-inline" title="打印" lay-event="LAYTABLE_PRINT">
				<i class="layui-icon layui-icon-print"></i>
			</div>
		</div>
	</div>
	<div class="layui-table-box">
		<div class="layui-table-header">
			<table class="layui-table" cellspacing="0" cellpadding="0" border="0">
				<thead>
					<tr>
						<th data-field="0" data-key="1-0-0" data-unresize="true"
							class=" layui-table-col-special">
							<div
								class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
								<input type="checkbox" name="layTableCheckbox"
									lay-skin="primary" lay-filter="layTableAllChoose">
								<div class="layui-unselect layui-form-checkbox"
									lay-skin="primary">
									<i class="layui-icon layui-icon-ok"></i>
								</div>
							</div></th>
						<th data-field="id" data-key="1-0-1" class=" layui-unselect">
							<div class="layui-table-cell laytable-cell-1-0-1">
								<span>ID</span><span class="layui-table-sort layui-inline"><i
									class="layui-edge layui-table-sort-asc" title="升序"></i><i
									class="layui-edge layui-table-sort-desc" title="降序"></i>
								</span>
							</div>
						</th>
						<th data-field="username" data-key="1-0-2" class=""><div
								class="layui-table-cell laytable-cell-1-0-2">
								<span>用户名</span>
							</div>
						</th>
						<th data-field="experience" data-key="1-0-3"
							class=" layui-unselect"><div
								class="layui-table-cell laytable-cell-1-0-3">
								<span>积分</span><span class="layui-table-sort layui-inline"><i
									class="layui-edge layui-table-sort-asc" title="升序"></i><i
									class="layui-edge layui-table-sort-desc" title="降序"></i>
								</span>
							</div>
						</th>
						<th data-field="sex" data-key="1-0-4" class=" layui-unselect"><div
								class="layui-table-cell laytable-cell-1-0-4">
								<span>性别</span><span class="layui-table-sort layui-inline"><i
									class="layui-edge layui-table-sort-asc" title="升序"></i><i
									class="layui-edge layui-table-sort-desc" title="降序"></i>
								</span>
							</div>
						</th>
						<th data-field="score" data-key="1-0-5" class=" layui-unselect"><div
								class="layui-table-cell laytable-cell-1-0-5">
								<span>评分</span><span class="layui-table-sort layui-inline"><i
									class="layui-edge layui-table-sort-asc" title="升序"></i><i
									class="layui-edge layui-table-sort-desc" title="降序"></i>
								</span>
							</div>
						</th>
						<th data-field="city" data-key="1-0-6" class=""><div
								class="layui-table-cell laytable-cell-1-0-6">
								<span>城市</span>
							</div>
						</th>
						<th data-field="sign" data-key="1-0-7" class=""><div
								class="layui-table-cell laytable-cell-1-0-7">
								<span>签名</span>
							</div>
						</th>
						<th data-field="classify" data-key="1-0-8" class=""><div
								class="layui-table-cell laytable-cell-1-0-8">
								<span>职业</span>
							</div>
						</th>
						<th data-field="wealth" data-key="1-0-9" class=" layui-unselect"><div
								class="layui-table-cell laytable-cell-1-0-9">
								<span>财富</span><span class="layui-table-sort layui-inline"><i
									class="layui-edge layui-table-sort-asc" title="升序"></i><i
									class="layui-edge layui-table-sort-desc" title="降序"></i>
								</span>
							</div>
						</th>
						<th data-field="10" data-key="1-0-10"
							class=" layui-table-col-special"><div
								class="layui-table-cell laytable-cell-1-0-10" align="center">
								<span></span>
							</div>
						</th>
						<th class="layui-table-patch"><div class="layui-table-cell"
								style="width: 17px;"></div>
						</th>
					</tr>
				</thead>
			</table>
		</div>
		<div class="layui-table-body layui-table-main" style="height: 247px;">
			<table class="layui-table" cellspacing="0" cellpadding="0" border="0">
				<tbody>
					<tr data-index="0">
						<td data-field="0" data-key="1-0-0"
							class="layui-table-col-special"><div
								class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
								<input type="checkbox" name="layTableCheckbox"
									lay-skin="primary">
								<div class="layui-unselect layui-form-checkbox"
									lay-skin="primary">
									<i class="layui-icon layui-icon-ok"></i>
								</div>
							</div>
						</td>
						<td data-field="id" data-key="1-0-1" class=""><div
								class="layui-table-cell laytable-cell-1-0-1">10000</div>
						</td>
						<td data-field="username" data-key="1-0-2" class=""><div
								class="layui-table-cell laytable-cell-1-0-2">user-0</div>
						</td>
						<td data-field="experience" data-key="1-0-3" class=""><div
								class="layui-table-cell laytable-cell-1-0-3">255</div>
						</td>
						<td data-field="sex" data-key="1-0-4" class=""><div
								class="layui-table-cell laytable-cell-1-0-4">女</div>
						</td>
						<td data-field="score" data-key="1-0-5" class=""><div
								class="layui-table-cell laytable-cell-1-0-5">57</div>
						</td>
						<td data-field="city" data-key="1-0-6" class=""><div
								class="layui-table-cell laytable-cell-1-0-6">城市-0</div>
						</td>
						<td data-field="sign" data-key="1-0-7" class=""><div
								class="layui-table-cell laytable-cell-1-0-7">签名-0</div>
						</td>
						<td data-field="classify" data-key="1-0-8" class=""><div
								class="layui-table-cell laytable-cell-1-0-8">作家</div>
						</td>
						<td data-field="wealth" data-key="1-0-9" class=""><div
								class="layui-table-cell laytable-cell-1-0-9">82830700</div>
						</td>
						<td data-field="10" data-key="1-0-10" data-off="true"
							class="layui-table-col-special" align="center"><div
								class="layui-table-cell laytable-cell-1-0-10">
								<a class="layui-btn layui-btn-primary layui-btn-xs"
									lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
									lay-event="edit">编辑</a> <a
									class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
							</div>
						</td>
					</tr>
					<tr data-index="1">
						<td data-field="0" data-key="1-0-0"
							class="layui-table-col-special"><div
								class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
								<input type="checkbox" name="layTableCheckbox"
									lay-skin="primary">
								<div class="layui-unselect layui-form-checkbox"
									lay-skin="primary">
									<i class="layui-icon layui-icon-ok"></i>
								</div>
							</div>
						</td>
						<td data-field="id" data-key="1-0-1" class=""><div
								class="layui-table-cell laytable-cell-1-0-1">10001</div>
						</td>
						<td data-field="username" data-key="1-0-2" class=""><div
								class="layui-table-cell laytable-cell-1-0-2">user-1</div>
						</td>
						<td data-field="experience" data-key="1-0-3" class=""><div
								class="layui-table-cell laytable-cell-1-0-3">884</div>
						</td>
						<td data-field="sex" data-key="1-0-4" class=""><div
								class="layui-table-cell laytable-cell-1-0-4">男</div>
						</td>
						<td data-field="score" data-key="1-0-5" class=""><div
								class="layui-table-cell laytable-cell-1-0-5">27</div>
						</td>
						<td data-field="city" data-key="1-0-6" class=""><div
								class="layui-table-cell laytable-cell-1-0-6">城市-1</div>
						</td>
						<td data-field="sign" data-key="1-0-7" class=""><div
								class="layui-table-cell laytable-cell-1-0-7">签名-1</div>
						</td>
						<td data-field="classify" data-key="1-0-8" class=""><div
								class="layui-table-cell laytable-cell-1-0-8">词人</div>
						</td>
						<td data-field="wealth" data-key="1-0-9" class=""><div
								class="layui-table-cell laytable-cell-1-0-9">64928690</div>
						</td>
						<td data-field="10" data-key="1-0-10" data-off="true"
							class="layui-table-col-special" align="center"><div
								class="layui-table-cell laytable-cell-1-0-10">
								<a class="layui-btn layui-btn-primary layui-btn-xs"
									lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
									lay-event="edit">编辑</a> <a
									class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
							</div>
						</td>
					</tr>
					<tr data-index="2">
						<td data-field="0" data-key="1-0-0"
							class="layui-table-col-special"><div
								class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
								<input type="checkbox" name="layTableCheckbox"
									lay-skin="primary">
								<div class="layui-unselect layui-form-checkbox"
									lay-skin="primary">
									<i class="layui-icon layui-icon-ok"></i>
								</div>
							</div>
						</td>
						<td data-field="id" data-key="1-0-1" class=""><div
								class="layui-table-cell laytable-cell-1-0-1">10002</div>
						</td>
						<td data-field="username" data-key="1-0-2" class=""><div
								class="layui-table-cell laytable-cell-1-0-2">user-2</div>
						</td>
						<td data-field="experience" data-key="1-0-3" class=""><div
								class="layui-table-cell laytable-cell-1-0-3">650</div>
						</td>
						<td data-field="sex" data-key="1-0-4" class=""><div
								class="layui-table-cell laytable-cell-1-0-4">女</div>
						</td>
						<td data-field="score" data-key="1-0-5" class=""><div
								class="layui-table-cell laytable-cell-1-0-5">31</div>
						</td>
						<td data-field="city" data-key="1-0-6" class=""><div
								class="layui-table-cell laytable-cell-1-0-6">城市-2</div>
						</td>
						<td data-field="sign" data-key="1-0-7" class=""><div
								class="layui-table-cell laytable-cell-1-0-7">签名-2</div>
						</td>
						<td data-field="classify" data-key="1-0-8" class=""><div
								class="layui-table-cell laytable-cell-1-0-8">酱油</div>
						</td>
						<td data-field="wealth" data-key="1-0-9" class=""><div
								class="layui-table-cell laytable-cell-1-0-9">6298078</div>
						</td>
						<td data-field="10" data-key="1-0-10" data-off="true"
							class="layui-table-col-special" align="center"><div
								class="layui-table-cell laytable-cell-1-0-10">
								<a class="layui-btn layui-btn-primary layui-btn-xs"
									lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
									lay-event="edit">编辑</a> <a
									class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
							</div>
						</td>
					</tr>
					<tr data-index="3" class="">
						<td data-field="0" data-key="1-0-0"
							class="layui-table-col-special"><div
								class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
								<input type="checkbox" name="layTableCheckbox"
									lay-skin="primary">
								<div class="layui-unselect layui-form-checkbox"
									lay-skin="primary">
									<i class="layui-icon layui-icon-ok"></i>
								</div>
							</div>
						</td>
						<td data-field="id" data-key="1-0-1" class=""><div
								class="layui-table-cell laytable-cell-1-0-1">10003</div>
						</td>
						<td data-field="username" data-key="1-0-2" class=""><div
								class="layui-table-cell laytable-cell-1-0-2">user-3</div>
						</td>
						<td data-field="experience" data-key="1-0-3" class=""><div
								class="layui-table-cell laytable-cell-1-0-3">362</div>
						</td>
						<td data-field="sex" data-key="1-0-4" class=""><div
								class="layui-table-cell laytable-cell-1-0-4">女</div>
						</td>
						<td data-field="score" data-key="1-0-5" class=""><div
								class="layui-table-cell laytable-cell-1-0-5">68</div>
						</td>
						<td data-field="city" data-key="1-0-6" class=""><div
								class="layui-table-cell laytable-cell-1-0-6">城市-3</div>
						</td>
						<td data-field="sign" data-key="1-0-7" class=""><div
								class="layui-table-cell laytable-cell-1-0-7">签名-3</div>
						</td>
						<td data-field="classify" data-key="1-0-8" class=""><div
								class="layui-table-cell laytable-cell-1-0-8">诗人</div>
						</td>
						<td data-field="wealth" data-key="1-0-9" class=""><div
								class="layui-table-cell laytable-cell-1-0-9">37117017</div>
						</td>
						<td data-field="10" data-key="1-0-10" data-off="true"
							class="layui-table-col-special" align="center"><div
								class="layui-table-cell laytable-cell-1-0-10">
								<a class="layui-btn layui-btn-primary layui-btn-xs"
									lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
									lay-event="edit">编辑</a> <a
									class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
							</div>
						</td>
					</tr>
					<tr data-index="4" class="">
						<td data-field="0" data-key="1-0-0"
							class="layui-table-col-special"><div
								class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
								<input type="checkbox" name="layTableCheckbox"
									lay-skin="primary">
								<div class="layui-unselect layui-form-checkbox"
									lay-skin="primary">
									<i class="layui-icon layui-icon-ok"></i>
								</div>
							</div>
						</td>
						<td data-field="id" data-key="1-0-1" class=""><div
								class="layui-table-cell laytable-cell-1-0-1">10004</div>
						</td>
						<td data-field="username" data-key="1-0-2" class=""><div
								class="layui-table-cell laytable-cell-1-0-2">user-4</div>
						</td>
						<td data-field="experience" data-key="1-0-3" class=""><div
								class="layui-table-cell laytable-cell-1-0-3">807</div>
						</td>
						<td data-field="sex" data-key="1-0-4" class=""><div
								class="layui-table-cell laytable-cell-1-0-4">男</div>
						</td>
						<td data-field="score" data-key="1-0-5" class=""><div
								class="layui-table-cell laytable-cell-1-0-5">6</div>
						</td>
						<td data-field="city" data-key="1-0-6" class=""><div
								class="layui-table-cell laytable-cell-1-0-6">城市-4</div>
						</td>
						<td data-field="sign" data-key="1-0-7" class=""><div
								class="layui-table-cell laytable-cell-1-0-7">签名-4</div>
						</td>
						<td data-field="classify" data-key="1-0-8" class=""><div
								class="layui-table-cell laytable-cell-1-0-8">作家</div>
						</td>
						<td data-field="wealth" data-key="1-0-9" class=""><div
								class="layui-table-cell laytable-cell-1-0-9">76263262</div>
						</td>
						<td data-field="10" data-key="1-0-10" data-off="true"
							class="layui-table-col-special" align="center"><div
								class="layui-table-cell laytable-cell-1-0-10">
								<a class="layui-btn layui-btn-primary layui-btn-xs"
									lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
									lay-event="edit">编辑</a> <a
									class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
							</div>
						</td>
					</tr>
					<tr data-index="5" class="">
						<td data-field="0" data-key="1-0-0"
							class="layui-table-col-special"><div
								class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
								<input type="checkbox" name="layTableCheckbox"
									lay-skin="primary">
								<div class="layui-unselect layui-form-checkbox"
									lay-skin="primary">
									<i class="layui-icon layui-icon-ok"></i>
								</div>
							</div>
						</td>
						<td data-field="id" data-key="1-0-1" class=""><div
								class="layui-table-cell laytable-cell-1-0-1">10005</div>
						</td>
						<td data-field="username" data-key="1-0-2" class=""><div
								class="layui-table-cell laytable-cell-1-0-2">user-5</div>
						</td>
						<td data-field="experience" data-key="1-0-3" class=""><div
								class="layui-table-cell laytable-cell-1-0-3">173</div>
						</td>
						<td data-field="sex" data-key="1-0-4" class=""><div
								class="layui-table-cell laytable-cell-1-0-4">女</div>
						</td>
						<td data-field="score" data-key="1-0-5" class=""><div
								class="layui-table-cell laytable-cell-1-0-5">87</div>
						</td>
						<td data-field="city" data-key="1-0-6" class=""><div
								class="layui-table-cell laytable-cell-1-0-6">城市-5</div>
						</td>
						<td data-field="sign" data-key="1-0-7" class=""><div
								class="layui-table-cell laytable-cell-1-0-7">签名-5</div>
						</td>
						<td data-field="classify" data-key="1-0-8" class=""><div
								class="layui-table-cell laytable-cell-1-0-8">作家</div>
						</td>
						<td data-field="wealth" data-key="1-0-9" class=""><div
								class="layui-table-cell laytable-cell-1-0-9">60344147</div>
						</td>
						<td data-field="10" data-key="1-0-10" data-off="true"
							class="layui-table-col-special" align="center"><div
								class="layui-table-cell laytable-cell-1-0-10">
								<a class="layui-btn layui-btn-primary layui-btn-xs"
									lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
									lay-event="edit">编辑</a> <a
									class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
							</div>
						</td>
					</tr>
					<tr data-index="6" class="">
						<td data-field="0" data-key="1-0-0"
							class="layui-table-col-special"><div
								class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
								<input type="checkbox" name="layTableCheckbox"
									lay-skin="primary">
								<div class="layui-unselect layui-form-checkbox"
									lay-skin="primary">
									<i class="layui-icon layui-icon-ok"></i>
								</div>
							</div>
						</td>
						<td data-field="id" data-key="1-0-1" class=""><div
								class="layui-table-cell laytable-cell-1-0-1">10006</div>
						</td>
						<td data-field="username" data-key="1-0-2" class=""><div
								class="layui-table-cell laytable-cell-1-0-2">user-6</div>
						</td>
						<td data-field="experience" data-key="1-0-3" class=""><div
								class="layui-table-cell laytable-cell-1-0-3">982</div>
						</td>
						<td data-field="sex" data-key="1-0-4" class=""><div
								class="layui-table-cell laytable-cell-1-0-4">女</div>
						</td>
						<td data-field="score" data-key="1-0-5" class=""><div
								class="layui-table-cell laytable-cell-1-0-5">34</div>
						</td>
						<td data-field="city" data-key="1-0-6" class=""><div
								class="layui-table-cell laytable-cell-1-0-6">城市-6</div>
						</td>
						<td data-field="sign" data-key="1-0-7" class=""><div
								class="layui-table-cell laytable-cell-1-0-7">签名-6</div>
						</td>
						<td data-field="classify" data-key="1-0-8" class=""><div
								class="layui-table-cell laytable-cell-1-0-8">作家</div>
						</td>
						<td data-field="wealth" data-key="1-0-9" class=""><div
								class="layui-table-cell laytable-cell-1-0-9">57768166</div>
						</td>
						<td data-field="10" data-key="1-0-10" data-off="true"
							class="layui-table-col-special" align="center"><div
								class="layui-table-cell laytable-cell-1-0-10">
								<a class="layui-btn layui-btn-primary layui-btn-xs"
									lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
									lay-event="edit">编辑</a> <a
									class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
							</div>
						</td>
					</tr>
					<tr data-index="7" class="">
						<td data-field="0" data-key="1-0-0"
							class="layui-table-col-special"><div
								class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
								<input type="checkbox" name="layTableCheckbox"
									lay-skin="primary">
								<div class="layui-unselect layui-form-checkbox"
									lay-skin="primary">
									<i class="layui-icon layui-icon-ok"></i>
								</div>
							</div>
						</td>
						<td data-field="id" data-key="1-0-1" class=""><div
								class="layui-table-cell laytable-cell-1-0-1">10007</div>
						</td>
						<td data-field="username" data-key="1-0-2" class=""><div
								class="layui-table-cell laytable-cell-1-0-2">user-7</div>
						</td>
						<td data-field="experience" data-key="1-0-3" class=""><div
								class="layui-table-cell laytable-cell-1-0-3">727</div>
						</td>
						<td data-field="sex" data-key="1-0-4" class=""><div
								class="layui-table-cell laytable-cell-1-0-4">男</div>
						</td>
						<td data-field="score" data-key="1-0-5" class=""><div
								class="layui-table-cell laytable-cell-1-0-5">28</div>
						</td>
						<td data-field="city" data-key="1-0-6" class=""><div
								class="layui-table-cell laytable-cell-1-0-6">城市-7</div>
						</td>
						<td data-field="sign" data-key="1-0-7" class=""><div
								class="layui-table-cell laytable-cell-1-0-7">签名-7</div>
						</td>
						<td data-field="classify" data-key="1-0-8" class=""><div
								class="layui-table-cell laytable-cell-1-0-8">作家</div>
						</td>
						<td data-field="wealth" data-key="1-0-9" class=""><div
								class="layui-table-cell laytable-cell-1-0-9">82030578</div>
						</td>
						<td data-field="10" data-key="1-0-10" data-off="true"
							class="layui-table-col-special" align="center"><div
								class="layui-table-cell laytable-cell-1-0-10">
								<a class="layui-btn layui-btn-primary layui-btn-xs"
									lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
									lay-event="edit">编辑</a> <a
									class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
							</div>
						</td>
					</tr>
					<tr data-index="8" class="">
						<td data-field="0" data-key="1-0-0"
							class="layui-table-col-special"><div
								class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
								<input type="checkbox" name="layTableCheckbox"
									lay-skin="primary">
								<div class="layui-unselect layui-form-checkbox"
									lay-skin="primary">
									<i class="layui-icon layui-icon-ok"></i>
								</div>
							</div>
						</td>
						<td data-field="id" data-key="1-0-1" class=""><div
								class="layui-table-cell laytable-cell-1-0-1">10008</div>
						</td>
						<td data-field="username" data-key="1-0-2" class=""><div
								class="layui-table-cell laytable-cell-1-0-2">user-8</div>
						</td>
						<td data-field="experience" data-key="1-0-3" class=""><div
								class="layui-table-cell laytable-cell-1-0-3">951</div>
						</td>
						<td data-field="sex" data-key="1-0-4" class=""><div
								class="layui-table-cell laytable-cell-1-0-4">男</div>
						</td>
						<td data-field="score" data-key="1-0-5" class=""><div
								class="layui-table-cell laytable-cell-1-0-5">14</div>
						</td>
						<td data-field="city" data-key="1-0-6" class=""><div
								class="layui-table-cell laytable-cell-1-0-6">城市-8</div>
						</td>
						<td data-field="sign" data-key="1-0-7" class=""><div
								class="layui-table-cell laytable-cell-1-0-7">签名-8</div>
						</td>
						<td data-field="classify" data-key="1-0-8" class=""><div
								class="layui-table-cell laytable-cell-1-0-8">词人</div>
						</td>
						<td data-field="wealth" data-key="1-0-9" class=""><div
								class="layui-table-cell laytable-cell-1-0-9">16503371</div>
						</td>
						<td data-field="10" data-key="1-0-10" data-off="true"
							class="layui-table-col-special" align="center"><div
								class="layui-table-cell laytable-cell-1-0-10">
								<a class="layui-btn layui-btn-primary layui-btn-xs"
									lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
									lay-event="edit">编辑</a> <a
									class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
							</div>
						</td>
					</tr>
					<tr data-index="9" class="">
						<td data-field="0" data-key="1-0-0"
							class="layui-table-col-special"><div
								class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
								<input type="checkbox" name="layTableCheckbox"
									lay-skin="primary">
								<div class="layui-unselect layui-form-checkbox"
									lay-skin="primary">
									<i class="layui-icon layui-icon-ok"></i>
								</div>
							</div>
						</td>
						<td data-field="id" data-key="1-0-1" class=""><div
								class="layui-table-cell laytable-cell-1-0-1">10009</div>
						</td>
						<td data-field="username" data-key="1-0-2" class=""><div
								class="layui-table-cell laytable-cell-1-0-2">user-9</div>
						</td>
						<td data-field="experience" data-key="1-0-3" class=""><div
								class="layui-table-cell laytable-cell-1-0-3">484</div>
						</td>
						<td data-field="sex" data-key="1-0-4" class=""><div
								class="layui-table-cell laytable-cell-1-0-4">女</div>
						</td>
						<td data-field="score" data-key="1-0-5" class=""><div
								class="layui-table-cell laytable-cell-1-0-5">75</div>
						</td>
						<td data-field="city" data-key="1-0-6" class=""><div
								class="layui-table-cell laytable-cell-1-0-6">城市-9</div>
						</td>
						<td data-field="sign" data-key="1-0-7" class=""><div
								class="layui-table-cell laytable-cell-1-0-7">签名-9</div>
						</td>
						<td data-field="classify" data-key="1-0-8" class=""><div
								class="layui-table-cell laytable-cell-1-0-8">词人</div>
						</td>
						<td data-field="wealth" data-key="1-0-9" class=""><div
								class="layui-table-cell laytable-cell-1-0-9">86801934</div>
						</td>
						<td data-field="10" data-key="1-0-10" data-off="true"
							class="layui-table-col-special" align="center"><div
								class="layui-table-cell laytable-cell-1-0-10">
								<a class="layui-btn layui-btn-primary layui-btn-xs"
									lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
									lay-event="edit">编辑</a> <a
									class="layui-btn layui-btn-danger layui-btn-xs" lay-event="del">删除</a>
							</div>
						</td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="layui-table-fixed layui-table-fixed-l">
			<div class="layui-table-header">
				<table class="layui-table" cellspacing="0" cellpadding="0"
					border="0">
					<thead>
						<tr>
							<th data-field="0" data-key="1-0-0" data-unresize="true"
								class=" layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
									<input type="checkbox" name="layTableCheckbox"
										lay-skin="primary" lay-filter="layTableAllChoose">
									<div class="layui-unselect layui-form-checkbox"
										lay-skin="primary">
										<i class="layui-icon layui-icon-ok"></i>
									</div>
								</div>
							</th>
							<th data-field="id" data-key="1-0-1" class=" layui-unselect"><div
									class="layui-table-cell laytable-cell-1-0-1">
									<span>ID</span><span class="layui-table-sort layui-inline"><i
										class="layui-edge layui-table-sort-asc" title="升序"></i><i
										class="layui-edge layui-table-sort-desc" title="降序"></i>
									</span>
								</div>
							</th>
						</tr>
					</thead>
				</table>
			</div>
			<div class="layui-table-body" style="height: 230px;">
				<table class="layui-table" cellspacing="0" cellpadding="0"
					border="0">
					<tbody>
						<tr data-index="0">
							<td data-field="0" data-key="1-0-0"
								class="layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
									<input type="checkbox" name="layTableCheckbox"
										lay-skin="primary">
									<div class="layui-unselect layui-form-checkbox"
										lay-skin="primary">
										<i class="layui-icon layui-icon-ok"></i>
									</div>
								</div>
							</td>
							<td data-field="id" data-key="1-0-1" class=""><div
									class="layui-table-cell laytable-cell-1-0-1">10000</div>
							</td>
						</tr>
						<tr data-index="1">
							<td data-field="0" data-key="1-0-0"
								class="layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
									<input type="checkbox" name="layTableCheckbox"
										lay-skin="primary">
									<div class="layui-unselect layui-form-checkbox"
										lay-skin="primary">
										<i class="layui-icon layui-icon-ok"></i>
									</div>
								</div>
							</td>
							<td data-field="id" data-key="1-0-1" class=""><div
									class="layui-table-cell laytable-cell-1-0-1">10001</div>
							</td>
						</tr>
						<tr data-index="2">
							<td data-field="0" data-key="1-0-0"
								class="layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
									<input type="checkbox" name="layTableCheckbox"
										lay-skin="primary">
									<div class="layui-unselect layui-form-checkbox"
										lay-skin="primary">
										<i class="layui-icon layui-icon-ok"></i>
									</div>
								</div>
							</td>
							<td data-field="id" data-key="1-0-1" class=""><div
									class="layui-table-cell laytable-cell-1-0-1">10002</div>
							</td>
						</tr>
						<tr data-index="3" class="">
							<td data-field="0" data-key="1-0-0"
								class="layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
									<input type="checkbox" name="layTableCheckbox"
										lay-skin="primary">
									<div class="layui-unselect layui-form-checkbox"
										lay-skin="primary">
										<i class="layui-icon layui-icon-ok"></i>
									</div>
								</div>
							</td>
							<td data-field="id" data-key="1-0-1" class=""><div
									class="layui-table-cell laytable-cell-1-0-1">10003</div>
							</td>
						</tr>
						<tr data-index="4" class="">
							<td data-field="0" data-key="1-0-0"
								class="layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
									<input type="checkbox" name="layTableCheckbox"
										lay-skin="primary">
									<div class="layui-unselect layui-form-checkbox"
										lay-skin="primary">
										<i class="layui-icon layui-icon-ok"></i>
									</div>
								</div>
							</td>
							<td data-field="id" data-key="1-0-1" class=""><div
									class="layui-table-cell laytable-cell-1-0-1">10004</div>
							</td>
						</tr>
						<tr data-index="5" class="">
							<td data-field="0" data-key="1-0-0"
								class="layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
									<input type="checkbox" name="layTableCheckbox"
										lay-skin="primary">
									<div class="layui-unselect layui-form-checkbox"
										lay-skin="primary">
										<i class="layui-icon layui-icon-ok"></i>
									</div>
								</div>
							</td>
							<td data-field="id" data-key="1-0-1" class=""><div
									class="layui-table-cell laytable-cell-1-0-1">10005</div>
							</td>
						</tr>
						<tr data-index="6" class="">
							<td data-field="0" data-key="1-0-0"
								class="layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
									<input type="checkbox" name="layTableCheckbox"
										lay-skin="primary">
									<div class="layui-unselect layui-form-checkbox"
										lay-skin="primary">
										<i class="layui-icon layui-icon-ok"></i>
									</div>
								</div>
							</td>
							<td data-field="id" data-key="1-0-1" class=""><div
									class="layui-table-cell laytable-cell-1-0-1">10006</div>
							</td>
						</tr>
						<tr data-index="7" class="">
							<td data-field="0" data-key="1-0-0"
								class="layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
									<input type="checkbox" name="layTableCheckbox"
										lay-skin="primary">
									<div class="layui-unselect layui-form-checkbox"
										lay-skin="primary">
										<i class="layui-icon layui-icon-ok"></i>
									</div>
								</div>
							</td>
							<td data-field="id" data-key="1-0-1" class=""><div
									class="layui-table-cell laytable-cell-1-0-1">10007</div>
							</td>
						</tr>
						<tr data-index="8" class="">
							<td data-field="0" data-key="1-0-0"
								class="layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
									<input type="checkbox" name="layTableCheckbox"
										lay-skin="primary">
									<div class="layui-unselect layui-form-checkbox"
										lay-skin="primary">
										<i class="layui-icon layui-icon-ok"></i>
									</div>
								</div>
							</td>
							<td data-field="id" data-key="1-0-1" class=""><div
									class="layui-table-cell laytable-cell-1-0-1">10008</div>
							</td>
						</tr>
						<tr data-index="9" class="">
							<td data-field="0" data-key="1-0-0"
								class="layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox">
									<input type="checkbox" name="layTableCheckbox"
										lay-skin="primary">
									<div class="layui-unselect layui-form-checkbox"
										lay-skin="primary">
										<i class="layui-icon layui-icon-ok"></i>
									</div>
								</div>
							</td>
							<td data-field="id" data-key="1-0-1" class=""><div
									class="layui-table-cell laytable-cell-1-0-1">10009</div>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
		<div class="layui-table-fixed layui-table-fixed-r"
			style="right: 16px;">
			<div class="layui-table-header">
				<table class="layui-table" cellspacing="0" cellpadding="0"
					border="0">
					<thead>
						<tr>
							<th data-field="10" data-key="1-0-10"
								class=" layui-table-col-special"><div
									class="layui-table-cell laytable-cell-1-0-10" align="center">
									<span></span>
								</div>
							</th>
						</tr>
					</thead>
				</table>
				<div class="layui-table-mend"></div>
			</div>
			<div class="layui-table-body" style="height: 230px;">
				<table class="layui-table" cellspacing="0" cellpadding="0"
					border="0">
					<tbody>
						<tr data-index="0">
							<td data-field="10" data-key="1-0-10" data-off="true"
								class="layui-table-col-special" align="center"><div
									class="layui-table-cell laytable-cell-1-0-10">
									<a class="layui-btn layui-btn-primary layui-btn-xs"
										lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
										lay-event="edit">编辑</a> <a
										class="layui-btn layui-btn-danger layui-btn-xs"
										lay-event="del">删除</a>
								</div>
							</td>
						</tr>
						<tr data-index="1">
							<td data-field="10" data-key="1-0-10" data-off="true"
								class="layui-table-col-special" align="center"><div
									class="layui-table-cell laytable-cell-1-0-10">
									<a class="layui-btn layui-btn-primary layui-btn-xs"
										lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
										lay-event="edit">编辑</a> <a
										class="layui-btn layui-btn-danger layui-btn-xs"
										lay-event="del">删除</a>
								</div>
							</td>
						</tr>
						<tr data-index="2">
							<td data-field="10" data-key="1-0-10" data-off="true"
								class="layui-table-col-special" align="center"><div
									class="layui-table-cell laytable-cell-1-0-10">
									<a class="layui-btn layui-btn-primary layui-btn-xs"
										lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
										lay-event="edit">编辑</a> <a
										class="layui-btn layui-btn-danger layui-btn-xs"
										lay-event="del">删除</a>
								</div>
							</td>
						</tr>
						<tr data-index="3" class="">
							<td data-field="10" data-key="1-0-10" data-off="true"
								class="layui-table-col-special" align="center"><div
									class="layui-table-cell laytable-cell-1-0-10">
									<a class="layui-btn layui-btn-primary layui-btn-xs"
										lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
										lay-event="edit">编辑</a> <a
										class="layui-btn layui-btn-danger layui-btn-xs"
										lay-event="del">删除</a>
								</div>
							</td>
						</tr>
						<tr data-index="4" class="">
							<td data-field="10" data-key="1-0-10" data-off="true"
								class="layui-table-col-special" align="center"><div
									class="layui-table-cell laytable-cell-1-0-10">
									<a class="layui-btn layui-btn-primary layui-btn-xs"
										lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
										lay-event="edit">编辑</a> <a
										class="layui-btn layui-btn-danger layui-btn-xs"
										lay-event="del">删除</a>
								</div>
							</td>
						</tr>
						<tr data-index="5" class="">
							<td data-field="10" data-key="1-0-10" data-off="true"
								class="layui-table-col-special" align="center"><div
									class="layui-table-cell laytable-cell-1-0-10">
									<a class="layui-btn layui-btn-primary layui-btn-xs"
										lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
										lay-event="edit">编辑</a> <a
										class="layui-btn layui-btn-danger layui-btn-xs"
										lay-event="del">删除</a>
								</div>
							</td>
						</tr>
						<tr data-index="6" class="">
							<td data-field="10" data-key="1-0-10" data-off="true"
								class="layui-table-col-special" align="center"><div
									class="layui-table-cell laytable-cell-1-0-10">
									<a class="layui-btn layui-btn-primary layui-btn-xs"
										lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
										lay-event="edit">编辑</a> <a
										class="layui-btn layui-btn-danger layui-btn-xs"
										lay-event="del">删除</a>
								</div>
							</td>
						</tr>
						<tr data-index="7" class="">
							<td data-field="10" data-key="1-0-10" data-off="true"
								class="layui-table-col-special" align="center"><div
									class="layui-table-cell laytable-cell-1-0-10">
									<a class="layui-btn layui-btn-primary layui-btn-xs"
										lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
										lay-event="edit">编辑</a> <a
										class="layui-btn layui-btn-danger layui-btn-xs"
										lay-event="del">删除</a>
								</div>
							</td>
						</tr>
						<tr data-index="8" class="">
							<td data-field="10" data-key="1-0-10" data-off="true"
								class="layui-table-col-special" align="center"><div
									class="layui-table-cell laytable-cell-1-0-10">
									<a class="layui-btn layui-btn-primary layui-btn-xs"
										lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
										lay-event="edit">编辑</a> <a
										class="layui-btn layui-btn-danger layui-btn-xs"
										lay-event="del">删除</a>
								</div>
							</td>
						</tr>
						<tr data-index="9" class="">
							<td data-field="10" data-key="1-0-10" data-off="true"
								class="layui-table-col-special" align="center"><div
									class="layui-table-cell laytable-cell-1-0-10">
									<a class="layui-btn layui-btn-primary layui-btn-xs"
										lay-event="detail">查看</a> <a class="layui-btn layui-btn-xs"
										lay-event="edit">编辑</a> <a
										class="layui-btn layui-btn-danger layui-btn-xs"
										lay-event="del">删除</a>
								</div>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<div class="layui-table-total">
		<table class="layui-table" cellspacing="0" cellpadding="0" border="0">
			<tbody>
				<tr>
					<td data-field="0" data-key="1-0-0" class="layui-table-col-special"><div
							class="layui-table-cell laytable-cell-1-0-0 laytable-cell-checkbox"></div>
					</td>
					<td data-field="id" data-key="1-0-1" class=""><div
							class="layui-table-cell laytable-cell-1-0-1">合计：</div>
					</td>
					<td data-field="username" data-key="1-0-2" class=""><div
							class="layui-table-cell laytable-cell-1-0-2"></div>
					</td>
					<td data-field="experience" data-key="1-0-3" class=""><div
							class="layui-table-cell laytable-cell-1-0-3">6275.00</div>
					</td>
					<td data-field="sex" data-key="1-0-4" class=""><div
							class="layui-table-cell laytable-cell-1-0-4"></div>
					</td>
					<td data-field="score" data-key="1-0-5" class=""><div
							class="layui-table-cell laytable-cell-1-0-5">427.00</div>
					</td>
					<td data-field="city" data-key="1-0-6" class=""><div
							class="layui-table-cell laytable-cell-1-0-6"></div>
					</td>
					<td data-field="sign" data-key="1-0-7" class=""><div
							class="layui-table-cell laytable-cell-1-0-7"></div>
					</td>
					<td data-field="classify" data-key="1-0-8" class=""><div
							class="layui-table-cell laytable-cell-1-0-8"></div>
					</td>
					<td data-field="wealth" data-key="1-0-9" class=""><div
							class="layui-table-cell laytable-cell-1-0-9">570885943.00</div>
					</td>
					<td data-field="10" data-key="1-0-10"
						class="layui-table-col-special" align="center"><div
							class="layui-table-cell laytable-cell-1-0-10"></div>
					</td>
					<th class="layui-table-patch"><div class="layui-table-cell"
							style="width: 17px;"></div>
					</th>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="layui-table-page">
		<div id="layui-table-page1">
			<div class="layui-box layui-laypage layui-laypage-default"
				id="layui-laypage-2">
				<a href="javascript:;" class="layui-laypage-prev layui-disabled"
					data-page="0"><i class="layui-icon"></i>
				</a><span class="layui-laypage-curr"><em class="layui-laypage-em"></em><em>1</em>
				</span><a href="javascript:;" data-page="2">2</a><a href="javascript:;"
					data-page="3">3</a><span class="layui-laypage-spr">…</span><a
					href="javascript:;" class="layui-laypage-last" title="尾页"
					data-page="100">100</a><a href="javascript:;"
					class="layui-laypage-next" data-page="2"><i class="layui-icon"></i>
				</a><span class="layui-laypage-skip">到第<input type="text" min="1"
					value="1" class="layui-input">页
					<button type="button" class="layui-laypage-btn">确定</button>
				</span><span class="layui-laypage-count">共 1000 条</span><span
					class="layui-laypage-limits"><select lay-ignore=""><option
							value="10" selected="">10 条/页</option>
						<option value="20">20 条/页</option>
						<option value="30">30 条/页</option>
						<option value="40">40 条/页</option>
						<option value="50">50 条/页</option>
						<option value="60">60 条/页</option>
						<option value="70">70 条/页</option>
						<option value="80">80 条/页</option>
						<option value="90">90 条/页</option>
				</select>
				</span>
			</div>
		</div>
	</div>
	<style>
.laytable-cell-1-0-0 {
	width: 48px;
}

.laytable-cell-1-0-1 {
	width: 80px;
}

.laytable-cell-1-0-2 {
	width: 80px;
}

.laytable-cell-1-0-3 {
	width: 90px;
}

.laytable-cell-1-0-4 {
	width: 80px;
}

.laytable-cell-1-0-5 {
	width: 80px;
}

.laytable-cell-1-0-6 {
	width: 150px;
}

.laytable-cell-1-0-7 {
	width: 200px;
}

.laytable-cell-1-0-8 {
	width: 100px;
}

.laytable-cell-1-0-9 {
	width: 135px;
}

.laytable-cell-1-0-10 {
	width: 165px;
}
</style>
</body>

</html>
