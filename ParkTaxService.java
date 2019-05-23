package com.zx.business.service;

import java.util.List;

import com.zx.business.pojo.ParkTax;


/**
 * <p>
 *title:ParkTaxService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-12上午10:15:08
 *@version 1.0
 */

public interface ParkTaxService {
	
	/*
	 * 查询所有园区税收
	 */
	List<ParkTax> selectAllTax();
	
	/*
	 * 查询所有园区用电量并排名
	 */
	List<ParkTax> selectAllydlTax();
	
	/*
	 * 根据id查询
	 */
	ParkTax selectById(Integer id);
	
	/*
	 * 修改
	 */
	void updatax(ParkTax tax);
	
	/*
	 * 新增
	 */
	void save(ParkTax tax);
	
	/*
	 * 删除
	 */
	void delpt(Integer id);
}
