package com.zx.business.service;

import java.util.List;

import com.zx.business.pojo.GudingzichanTz;

/**
 * <p>
 *title:GudingzichanTz.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-15上午10:59:36
 *@version 1.0
 */

public interface GudingzichanTzService {

	List<GudingzichanTz> selectAll();
	
	/*
	 * 后台的数据
	 */
	GudingzichanTz selsecctById(Integer month);
	
	/*
	 * 修改
	 */
	void updagdzc(GudingzichanTz tz);
	
	/*
	 * 删除
	 */
	void del(Integer id);
	/*
	 * 增加
	 */
	void insert(GudingzichanTz tz);
}
