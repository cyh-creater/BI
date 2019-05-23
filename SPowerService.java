package com.zx.system.service;

import java.util.List;

import com.zx.system.pojo.SPower;
import com.zx.system.pojo.SRP;



/**
 * <p>
 *title:SPowerService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-10下午2:50:28
 *@version 1.0
 */

public interface SPowerService {
	
	List<SPower> selectPower();
	
	List<SPower> selectrolePower(Integer rid);
	   
	void adduser(SRP srp);
	   
	void deleuser(SRP srp);
	   
	void update(Integer pid,Integer rid);
}
