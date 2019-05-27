package com.zx.business.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.github.pagehelper.PageInfo;
import com.zx.business.pojo.ParkTax;
import com.zx.business.service.ParkTaxService;

/**
 * <p>
 *title:ParkTaxController.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-12上午10:44:39
 *@version 1.0
 */
@Controller
@RequestMapping("/tax")
public class ParkTaxController {
	
	@Resource
	private ParkTaxService parkTaxService;
	//前端页面
	@RequestMapping("alllist")
	public String alltax(HttpServletRequest req){
		
		List<ParkTax> list = parkTaxService.selectAllTax();
		req.setAttribute("allList", list);
		return "forward:/zgg.jsp";
		
	}
	@RequestMapping("tolist")
	public String toList(ParkTax tax,HttpServletRequest request,@RequestParam(required = true, defaultValue = "1") Integer pageIndex){
		List<ParkTax> list = parkTaxService.selectAllydlTax();
		PageInfo<ParkTax> pagehelper = new PageInfo<ParkTax>(list);
		request.setAttribute("page", pagehelper);
		request.setAttribute("list", list);
		request.setAttribute("pname", tax.getParkName());
		return "business/pm/pm_list";
		
	}
	@RequestMapping("/{id}")	
	public ModelAndView toEdit(@PathVariable Integer id) throws ServletException, IOException{
		ModelAndView mv=new ModelAndView();
		ParkTax parkTax;
		String a;
		if(id==0){
			parkTax = new ParkTax();
			a="添加";
		}else{
			parkTax = parkTaxService.selectById(id);
			a="编辑";
		}
		mv.addObject("a", a);
		mv.addObject("pt",parkTax);
		mv.setViewName("business/pm/pm_edit");
		return mv;
	}
	@RequestMapping("uptatax")
	public String uptatax(ParkTax tax){
		parkTaxService.updatax(tax);
		return "redirect:tolist.action";
	}
	@RequestMapping("save")
	public String save(ParkTax tax){
		parkTaxService.save(tax);
		return "redirect:tolist.action";
	}
	@RequestMapping("del")
	public String delpt(Integer id){
		parkTaxService.delpt(id);
		return "redirect:tolist.action";
	}
}

