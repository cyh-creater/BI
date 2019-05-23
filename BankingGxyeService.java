package com.zx.business.service;

import com.zx.business.pojo.BankingGxye;

/**
 * <p>
 *title:BankingGxyeService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-22下午3:20:51
 *@version 1.0
 */

public interface BankingGxyeService {
	
	BankingGxye selectbgById(Integer month);
	
	void updabg(BankingGxye gxye);
	
	void del(Integer id);
	
	void insert(BankingGxye gxye);
}
