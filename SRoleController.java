package com.zx.system.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zx.system.pojo.SRole;
import com.zx.system.service.SRoleService;


/**
 * <p>
 *title:SRoleController.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-11下午4:29:25
 *@version 1.0
 */
@Controller
@RequestMapping("/roles")
public class SRoleController {

	@Resource(name="SRoleService")
	private SRoleService roleService;

	@RequestMapping("/toList")
	public String toList(SRole role,HttpServletRequest request,HttpServletResponse response,@RequestParam(required = true, defaultValue = "1") Integer pageIndex) throws ServletException, IOException{
		PageHelper.startPage(pageIndex, 10);
		List<SRole> roles = roleService.selectSRole(role);
		PageInfo<SRole> pagehelper = new PageInfo<SRole>(roles);
		request.setAttribute("page", pagehelper);
		request.setAttribute("roles", roles);
		request.setAttribute("rName", role.getrName());
		return "system/roleManager/role_list";
	}
	
	@RequestMapping("/{id}")
	//@RequestMapping("/toEdit")
	public ModelAndView toEdit(@PathVariable Integer id) throws ServletException, IOException{
		ModelAndView mv=new ModelAndView();
		SRole role;
		String a;
		if(id==0){
			role=new SRole();
			a="添加";
		}else{
			role = roleService.selectSRoleById(id);
			a="编辑";
		}
		mv.addObject("role", role);
		mv.addObject("a", a);
		mv.setViewName("system/roleManager/role_edit");
		return mv;
	}
	
	@RequestMapping("/saveRole")
	public String saveRole(SRole role)throws ServletException, IOException{
		roleService.saveSRole(role);
		return "redirect:toList.action";
	}
	
	@RequestMapping("/deleRole")
	public String deleRole(Integer rId) throws ServletException, IOException{
		roleService.deleteSRole(rId);
		return "redirect:toList.action";
	}
	
	@RequestMapping("/updateRole")
	public String updateRole(SRole role) throws ServletException, IOException{
		roleService.updateSRole(role);
		return "redirect:toList.action";
	}
	@RequestMapping("/out")
	public String outUser(HttpSession session) throws ServletException, IOException{
		
		return "redirect:Manages/login.jsp";
	}
	public void setRoleService(SRoleService roleService) {
		this.roleService = roleService;
	}
	
}
