package com.zx.business.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zx.business.pojo.BRealTimeData;
import com.zx.business.service.BRealTimeDataService;

/**
 * <p>
 *title:BRealTimeDataController.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-23下午4:49:35
 *@version 1.0
 */
@Controller
@RequestMapping("/ss")
public class BRealTimeDataController {
	String rnum = null;
	@Resource
	private BRealTimeDataService bRealTimeDataService;
	
	@RequestMapping("/tolist")
	public String tolist(HttpServletRequest request){
		List<BRealTimeData> list = bRealTimeDataService.selectAll();
		request.setAttribute("list", list);
		return "business/Ss/ss_list";
		
	}
	
	@RequestMapping("/{id}")
	public String edit(@PathVariable Integer id,HttpServletRequest request){
		BRealTimeData bRealTimeData =  bRealTimeDataService.selectById(id);
		request.setAttribute("br", bRealTimeData);
		rnum = bRealTimeData.getrNumber();
		return "business/Ss/ss_edit";
	}
	
	@RequestMapping("/updass")
	public String updatwss(BRealTimeData bRealTimeData){
		if(Integer.valueOf(bRealTimeData.getrNumber())-Integer.valueOf(rnum)>0){
			float fa = ((Float.parseFloat(bRealTimeData.getrNumber())-Float.parseFloat(rnum))/Float.parseFloat(rnum))*100;
			bRealTimeData.setrRising(String.valueOf((float)(Math.round(fa*1000))/1000));
			bRealTimeData.setrQnumber(rnum);
		}
		
		bRealTimeDataService.updaRt(bRealTimeData);
		return "redirect:tolist.action";
		
	}
	
}
