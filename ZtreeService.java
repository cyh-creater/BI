package com.zx.system.service;

import java.util.List;

import com.zx.system.pojo.SPower;
import com.zx.system.pojo.SRP;


/**
 * <p>
 *title:ZtreeService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-11下午9:45:40
 *@version 1.0
 */
public interface ZtreeService {
	
   List<SPower> selectPower();
   
   List<SPower> selectrolePower(Integer rid);
   
   void adduser(SRP srp);
   
   void deleuser(SRP srp);
   
   void update(Integer pid,Integer rid);
}
