package com.zx.business.service;

import com.zx.business.pojo.PublicBudgetSr;

/**
 * <p>
 *title:PublicBudgetSrService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-22下午3:02:59
 *@version 1.0
 */

public interface PublicBudgetSrService {
	
	PublicBudgetSr selectpbsById(Integer month);
	
	void updapbs(PublicBudgetSr sr);
	
	void del(Integer id);
	
	void insert(PublicBudgetSr sr);
}
