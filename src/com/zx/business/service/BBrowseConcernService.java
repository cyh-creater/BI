package com.zx.business.service;


import com.zx.business.pojo.BBrowseConcern;

/**
 * <p>
 *title:BBrowseCooncern.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-24下午5:19:48
 *@version 1.0
 */

public interface BBrowseConcernService {
	
	/*
	 * 改
	 */
	void update(BBrowseConcern bBrowseCooncern);
	/*
	 * 查
	 */
	BBrowseConcern select(Integer id);
	
	/*
	 * 增加
	 */
	void insert(BBrowseConcern bBrowseCooncern);
}
