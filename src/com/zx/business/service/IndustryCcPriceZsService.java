package com.zx.business.service;

import com.zx.business.pojo.IndustryCcPriceZs;

/**
 * <p>
 *title:IndustryCcPriceZsService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-22下午3:25:35
 *@version 1.0
 */

public interface IndustryCcPriceZsService {
	/*
	 * 根据id查询
	 */
	IndustryCcPriceZs selecticById(Integer month);
	
	/*
	 * 修改
	 */
	void updapz(IndustryCcPriceZs pz);
	
	/*
	 * 删除
	 */
	void del(Integer id);
	/*
	 * 增加
	 */
	void insert(IndustryCcPriceZs pz);
}
