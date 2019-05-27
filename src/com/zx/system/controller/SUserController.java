package com.zx.system.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zx.system.pojo.SDept;
import com.zx.system.pojo.SPower;
import com.zx.system.pojo.SRole;
import com.zx.system.pojo.SUser;
import com.zx.system.service.SDeptService;
import com.zx.system.service.SRoleService;
import com.zx.system.service.SUserService;
import com.zx.system.vo.SRoleVO;
import com.zx.system.vo.SUserVO;


/**
 * <p>
 *title:SUserController.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-10上午10:53:34
 *@version 1.0
 */

@Controller
@RequestMapping("/suser")
public class SUserController {
	@Resource
	private SUserService sus;
	@Resource
	private SRoleService srs;
	@Resource
	private SDeptService sds;
	/*
	 * 查询所有用户信息包括用户表信息及部门信息及角色信息
	 * 分页
	 */
	@RequestMapping("/tolist")
	public String toList(SUser user,HttpServletRequest req,HttpServletResponse res,@RequestParam(required = true, defaultValue = "1") Integer pageIndex){
		PageHelper.startPage(pageIndex, 5);
		List<SUserVO> uservos = sus.selectAllSUserVO(user);
		for(int i=0;i<uservos.size(); i++){
			if(uservos.get(i).getStatus()==1){
				uservos.get(i).setZhuangtai("停用");
			}else{
				uservos.get(i).setZhuangtai("使用中");
			}
		}
		PageInfo<SUserVO> page = new PageInfo<SUserVO>(uservos);
		req.setAttribute("page", page);
		req.setAttribute("uservos", uservos);
		req.setAttribute("uName", user.getuName());
		return "system/userManager/user-list";
	}
	//根据id是否存在判断跳转页面
	@RequestMapping("/{id}")
	//@RequestMapping("/toEdit")
	public ModelAndView toEdit(@PathVariable Integer id) throws ServletException, IOException{
		ModelAndView mv=new ModelAndView();
		SUser user = new SUserVO();
		List<SRole> roles = new ArrayList();
		List<SDept> sdepts = new ArrayList();
		SRole role = new SRole();
		SDept dept = new SDept();
		String a="添加";
		if(id!=0){
		 user = sus.selectSUser(id);
		 a="编辑";
		}
		roles = srs.selectSRole(role);
		sdepts = sds.selectSDept(dept);
		mv.addObject("roles",roles );
		mv.addObject("sdepts",sdepts );
		mv.addObject("user", user);
		mv.addObject("a", a);
		mv.setViewName("system/userManager/suser_edit");
		return mv;
	}
	/*
	 * 禁用该用户
	 */
	@RequestMapping("/deleUser")
	public String deleSUser(Integer uid){
		sus.deleSUser(uid);
		return "redirect:tolist.action";
	}
	//新增用户
	@RequestMapping("/saveSuser")
	public String saveSUser(SUser user){
		boolean saveSUser = sus.saveSUser(user);
		return "redirect:tolist.action";
	}
	//修改用户
	@RequestMapping("/updateSUser")
	public String updateSUser(SUser user){
		sus.updateSUser(user);
		return "redirect:tolist.action";
	}
	//登录
	@RequestMapping("/Login")
	public String UserLogin(String userName,String Password,HttpServletRequest req,HttpServletResponse res){
		
		SUser temp = sus.SUserLogin(userName, Password);
		if(temp!=null){
			SUserVO uservos = sus.selectSUserVOById(temp.getuId());
				SRoleVO srole = uservos.getRole();
				List<SPower> power=srole.getPower();
				int sss = uservos.getuId();
				req.setAttribute("quxianList",power);
				req.setAttribute("temp", temp);
				req.setAttribute("uid",sss);
			return "main";
		}else{
			req.setAttribute("pd", 1);
			return "redirect:/login/Login.jsp";
		}
		
	}
	
	@RequestMapping(value="/checkroleid", produces = "application/json")
	@ResponseBody
	public String checkroleid(Model model,Integer roleid,HttpServletRequest req,HttpServletResponse res){
		PrintWriter writer =null;
		try {
			writer= res.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean checkroleid = sus.checkroleid(roleid);
		if(checkroleid){
			writer.print(true);
			return "success";
		}else{
			writer.print(false);
			return "error";
		}
	}
	
	@RequestMapping(value="/checkdeptid", produces = "application/json")
	@ResponseBody
	public String checkdeptid(Model model,Integer deptid,HttpServletRequest req,HttpServletResponse res){
		PrintWriter writer =null;
		try {
			writer= res.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean checkdeptid = sus.checkdeptid(deptid);
		if(checkdeptid){
			writer.print(true);
			return "success";
		}else{
			writer.print(false);
			return "error";
		}
	}
	@RequestMapping("outLogin")
	public String out(HttpSession session){
		session.invalidate();
		return "redirect:/login/Login.jsp";
		
		
	}
}

