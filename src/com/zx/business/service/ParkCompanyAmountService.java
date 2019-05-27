package com.zx.business.service;

import java.util.List;

import com.zx.business.pojo.ParkCompanyAmount;


/**
 * <p>
 *title:ParkCompanyAmountService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-12上午8:57:24
 *@version 1.0
 */

public interface ParkCompanyAmountService {
	
	/*
	 * (查询到所有的园区企业数)
	 */
	List<ParkCompanyAmount> selectipcas();
	/*
	 * 根据id查询企业数
	 */
	ParkCompanyAmount selectpca();
	
	/*
	 * 修改企业
	 */
	void update(ParkCompanyAmount amount);
	/*
	 * 删除企业
	 */
	void dele(Integer id);
	
	/*
	 * 增加企业
	 */
	void inser(ParkCompanyAmount amount);
}
