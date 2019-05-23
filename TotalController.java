package com.zx.business.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zx.business.service.AreaProduceSumService;

/**
 * <p>
 *title:TotalController.java
 *</p >
 *Description 【获得所有表数据】
 *
 *作者：WYH 2019-4-12上午8:19:19
 *@version 1.0
 */
@Controller
@RequestMapping("/total")
public class TotalController {
	
	@Resource
	private AreaProduceSumService areaProduceSunService;
	
	
	/*
	 * 获取税收
	 */
}
