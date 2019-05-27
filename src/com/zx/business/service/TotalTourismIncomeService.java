package com.zx.business.service;

import com.zx.business.pojo.TotalTourismIncome;

/**
 * <p>
 *title:TotalTourismIncome.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-22下午3:14:22
 *@version 1.0
 */

public interface TotalTourismIncomeService {
	
	/*
	 * 根据id查询旅游总收入
	 */
	TotalTourismIncome selectttiById(Integer month);
	
	/*
	 * 修改
	 */
	void updais(TotalTourismIncome income);
	
	/*
	 * 删除
	 */
	void del(Integer id);
	/*
	 * 增加
	 */
	void insert(TotalTourismIncome income);
}
