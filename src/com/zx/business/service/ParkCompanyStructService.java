package com.zx.business.service;

import com.zx.business.pojo.ParkCompanyStruct;

/**
 * <p>
 *title:ParkCompanyStructService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-16上午9:51:41
 *@version 1.0
 */

public interface ParkCompanyStructService {
	/*
	 * 查询本月企业数
	 */
	ParkCompanyStruct selectpcs();
	
	/*
	 * 删除
	 */
	void del(Integer id);
	
	/*
	 * 
	 */
}
