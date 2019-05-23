package com.zx.business.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zx.business.pojo.BPark;
import com.zx.business.pojo.BPm;
import com.zx.business.service.BParkService;
import com.zx.business.service.BPmService;
import com.zx.system.pojo.SDept;

/**
 * <p>
 *title:BParkController.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-28上午10:30:21
 *@version 1.0
 */
@Controller
@RequestMapping("/park")
public class BParkController {
	
	@Resource
	private BParkService parkService;
	
	
	@RequestMapping("/toList")
	public String tolist(BPark park,HttpServletRequest request,HttpServletResponse response,@RequestParam(required = true, defaultValue = "1") Integer pageIndex){
		PageHelper.startPage(pageIndex, 5);
		List<BPark> list = parkService.selectBPark(park);
		PageInfo<BPark> pagehelper = new PageInfo<BPark>(list);
		request.setAttribute("page", pagehelper);
		request.setAttribute("list", list);
		request.setAttribute("yName",park.getyName());
		return "business/park/park_list";
		
	}
	@RequestMapping("/{id}")
	public ModelAndView readysdata(@PathVariable Integer id,HttpServletRequest request){
		ModelAndView mv=new ModelAndView();
		BPark park=null;
		if(id==0){
			park = new BPark();
		}else{
			park = parkService.selectBParkById(id);
		}
		mv.addObject("park",park);
		mv.setViewName("business/park/park_edit");
		return mv;
			
	}
	@RequestMapping("savePark")
	public String savePark(BPark park){
		parkService.saveBPark(park);
		return "redirect:toList.action";
		
	}
	@RequestMapping("delePark")
	public String delPark(Integer id){
		
		parkService.deleteBPark(id);
		return "redirect:toList.action";
		
	}
	@RequestMapping("updatePark")
	public String updatePark(BPark park){
		parkService.updateBPark(park);
		return "redirect:toList.action";
		
	}
}
