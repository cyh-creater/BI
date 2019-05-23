package com.zx.system.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.zx.system.pojo.SPower;
import com.zx.system.pojo.SRP;
import com.zx.system.service.SUserService;
import com.zx.system.service.ZtreeService;

/**
 * <p>
 *title:SRoleController.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-11下午10:32:15
 *@version 1.0
 */

@Controller
@RequestMapping("/ztree")
public class ZtreeController {
	private static final HttpServletResponse HttpServletResponse = null;
	private static final HttpServletRequest HttpServletRequest = null;
	@Resource
	private SUserService sus;
//	@Resource
//	private SUserVOService suVOs;
	
	@Resource
	private ZtreeService tree;
	/*
	 * 查询所有用户信息包括用户表信息及部门信息及角色信息
	 * 分页
	 */
	Integer rids=null;
	@RequestMapping("/tolist")
	public  String  toList(Model model,Integer rid,Integer uid) throws IOException{	
		System.out.println(rid);
		/*List<SUserVO> suservo=sus.selectAllSUserVO();*/
		rids = rid;
		List<SPower>  power1=tree.selectrolePower(rids);
		System.out.println(power1);
		/*显示所有权限*/
		List<SPower>  power=tree.selectPower();
		List list1=new ArrayList();
		for(int i=0;i<power.size();i++){
			
			Map map=new HashMap();
			map.put("id", power.get(i).getpId());
			map.put("pId", power.get(i).getHighlevel());
			map.put("name", power.get(i).getpName());
			map.put("open", true);
			for(int j=0;j<power1.size();j++){
				if(power1.get(j).getpId()==power.get(i).getpId()){
					map.put("checked",true);
				}
			}
			list1.add(map);
		}
        String listjson1=JSONArray.toJSON(list1).toString();
		//System.out.println(listjson1);
		model.addAttribute("list", listjson1);
		
        return "forward:/home/zTree.jsp";
	}
	
	@RequestMapping("/update")
	public void add(Integer pid,boolean checked){
		SRP srp = new SRP(rids,pid);
		if(checked){
			tree.adduser(srp);
		}else{
			tree.deleuser(srp);
		}
		

		
	}

}
