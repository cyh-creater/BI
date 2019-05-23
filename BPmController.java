package com.zx.business.controller;

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

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zx.business.pojo.BPark;
import com.zx.business.pojo.BPm;
import com.zx.business.service.BParkService;
import com.zx.business.service.BPmService;
import com.zx.business.vo.BParkVo;

/**
 * <p>
 *title:BPmController.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-29下午4:36:59
 *@version 1.0
 */
@Controller
@RequestMapping("/pm")
public class BPmController {
	
	@Resource
	private BPmService bPmService;
	
	@Resource
	private BParkService bParkService;
	Integer ids = null;
	@RequestMapping("/toList")
	public String toList(BPm pm,BPark park,HttpServletRequest request,HttpServletResponse response,@RequestParam(required = true, defaultValue = "1") Integer pageIndex) throws ServletException, IOException{
		PageHelper.startPage(pageIndex, 5);
		if(pm.getpId()!=null){
			ids = pm.getpId();
		}else{
			 pm.setpId(ids);
		}
		if(park.getyName()!=null && ""!=park.getyName()){
			List<BPark> parks = bParkService.selectBPark(park);
			for (BPark bPark : parks) {
				pm.setpId(bPark.getId());
			}	
		}
		String name = null;
		List<BPm> pms = bPmService.selectpm(pm);
		List<BParkVo> l = bParkService.selerts(pm.getpId());
		for (BParkVo bParkVo : l) {
			name = bParkVo.getyName();
		}
		PageInfo<BPm> pagehelper = new PageInfo<BPm>(pms);
		request.setAttribute("page", pagehelper);
		request.setAttribute("pms", pms);
		request.setAttribute("yName", name);
		request.setAttribute("pId", pm.getpId());
		request.setAttribute("pmData", pm.getPmData());
		return "business/pm/pm_list";
	}
	@RequestMapping("/{id}")
	public String editOrsave(@PathVariable Integer id,BPark park,HttpServletRequest request){
		String str = null;
		BPm bPm=null;
		if(id==null){
			bPm = new BPm();
			str="新增";
		}else{
			bPm = bPmService.selectById(id);
		}
		request.setAttribute("pm", bPm);
		request.setAttribute("str", str);
		request.setAttribute("name", park.getyName());
		return "business/pm/pm_edit";
		
	}
	@RequestMapping("/updatepm")
	public String update(BPm pm){
		pm.setpId(ids);
		bPmService.updateBpm(pm);
		return "redirect:toList.action";
	}
	@RequestMapping("/save")
	public String save(BPm pm){
		pm.setpId(ids);
		bPmService.insertBpm(pm);
		return "redirect:toList.action";
	}
	
	@RequestMapping("/delpm")
	public String delpm(@RequestParam Integer id){
		bPmService.delBpm(id);
		return "redirect:toList.action";
		
	}
}
