package com.zx.business.service;

import java.util.List;

import com.zx.business.pojo.IndustryAdd;

/**
 * <p>
 *title:IndustryAddService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-17上午9:42:04
 *@version 1.0
 */

public interface IndustryAddService {
	/*
	 * 查询
	 */
	List<IndustryAdd> selectias(IndustryAdd industryAdd);
	/*
	 * 根据id查询
	 */
	IndustryAdd selectiaById(Integer id);
	
	/*
	 * 修改
	 */
	void update(IndustryAdd ia);
	/*
	 * 删除
	 */
	void dele(Integer id);
	
	/*
	 * 增加
	 */
	void inser(IndustryAdd ia);
}
