package com.zx.business.service;

import java.util.List;

import com.zx.business.pojo.SocialRetailSum;

/**
 * <p>
 *title:SocialRetailSumService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-15下午4:49:53
 *@version 1.0
 */

public interface SocialRetailSumService {
	
	/*
	 * 查询所有
	 */
	List<SocialRetailSum> selectAll();
	
	SocialRetailSum selectsrsById(Integer month);
	
	/*
	 * 修改
	 */
	void updasrs(SocialRetailSum retailSum);
	/*
	 * 删除
	 */
	void del(Integer id);
	/*
	 * 增加
	 */
	void insert(SocialRetailSum retailSum);
}
