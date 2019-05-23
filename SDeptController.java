package com.zx.system.controller;

import java.io.IOException;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zx.system.pojo.SDept;
import com.zx.system.service.SDeptService;

/**
 * <p>
 *title:SRoleController.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-11上午10:32:15
 *@version 1.0
 */

@Controller
@RequestMapping("/depts")
public class SDeptController {

	@Resource(name="SDeptService")
	private SDeptService DeptService;

	
	@RequestMapping("/toList")
	public String toList(SDept dept,HttpServletRequest request,HttpServletResponse response,@RequestParam(required = true, defaultValue = "1") Integer pageIndex) throws ServletException, IOException{
		PageHelper.startPage(pageIndex, 10);
		List<SDept> depts = DeptService.selectSDept(dept);
		PageInfo<SDept> pagehelper = new PageInfo<SDept>(depts);
		request.setAttribute("page", pagehelper);
		request.setAttribute("depts", depts);
		request.setAttribute("dName", dept.getdName());
		return "system/deptManager/dept_list";
	}
	
	

	@RequestMapping("/{id}")	
	public ModelAndView toEdit(@PathVariable Integer id) throws ServletException, IOException{
		ModelAndView mv=new ModelAndView();
		SDept dept;
		String a;
		if(id==0){
			dept = new SDept();
			a="添加";
		}else{
			dept=  DeptService.selectSDeptById(id);
			a="编辑";
		}
		mv.addObject("a", a);
		mv.addObject("dept", dept);
		mv.setViewName("system/deptManager/dept_edit");
		return mv;
	}
	
	
	@RequestMapping("/saveDept")
	public String saveDept(SDept dept)throws ServletException, IOException{
		DeptService.saveSDept(dept);
		return "redirect:toList.action";
	}
	
	@RequestMapping("/delDept")
	public String deleDept(Integer dId) throws ServletException, IOException{
		DeptService.deleSDept(dId);
		return "redirect:toList.action";
	}
	
	@RequestMapping("/updateDept")
	public String updateDept(SDept dept) throws ServletException, IOException{
		DeptService.updateSDept(dept);
		return "redirect:toList.action";
	}
	
	public void setDeptService(SDeptService DeptService) {
		this.DeptService = DeptService;
	}
	


}
