package com.zx.business.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zx.business.pojo.IndustryAdd;
import com.zx.business.service.IndustryAddService;
/**
 * <p>
 *title:Industry.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-22上午8:47:06
 *@version 1.0
 */
@Controller
@RequestMapping("/addvalue")
public class IndustryAddController {
	
	@Resource
	private IndustryAddService addService;
	
	@RequestMapping("/toList1")
	public String toList(IndustryAdd ias,HttpServletRequest request,HttpServletResponse response,@RequestParam(required = true, defaultValue = "1") Integer pageIndex) throws ServletException, IOException{
		PageHelper.startPage(pageIndex, 5);
		List<IndustryAdd> aps = addService.selectias(ias);
		PageInfo<IndustryAdd> pagehelper = new PageInfo<IndustryAdd>(aps);
		request.setAttribute("page", pagehelper);
		request.setAttribute("aps", aps);
		request.setAttribute("month", ias.getMonth());
		return "business/Grp/Grp_list";
	}
	
}
