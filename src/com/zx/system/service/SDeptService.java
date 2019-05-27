package com.zx.system.service;

import java.util.List;

import com.zx.system.pojo.SDept;



/**
 * <p>
 *title:SDepartmentService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-10上午10:56:36
 *@version 1.0
 */

public interface SDeptService {
	
	/*
	 * 插入部门
	 * 
	 */
	void saveSDept(SDept dept); 
	
	/*
	 * 删除部门
	 */
	void deleSDept(int id);
	/*
	 * 更新部门
	 */
	void updateSDept(SDept dept); 
	
	/*
	 * 查询部门
	 */
	List<SDept> selectSDept(SDept dept);
	
	
	SDept selectSDeptById(int id);

}
