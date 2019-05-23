package com.zx.system.service;

import java.util.List;

import com.zx.system.pojo.SRole;



/**
 * <p>
 *title:SRoleService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-10上午10:55:26
 *@version 1.0
 */

public interface SRoleService {
	
	/**
	 * 新增角色信息
	 * @param role 传入role对象
	 */
	boolean saveSRole(SRole role);
	
	/**
	 * 删除角色信息
	 * @param id 传入id
	 */
	boolean deleteSRole(Integer id);
	
	/**
	 * 修改角色信息
	 * @param role 传入role对象
	 */
	boolean updateSRole(SRole role);
	
	/**
	 * 查询所有角色信息
	 * @param role 传入role对象
	 * @return 返回查询的所有角色对象
	 */
	List<SRole> selectSRole(SRole role);
	
	/**
	 * 通过id查询角色信息
	 * @param id 传入id
	 * @return  返回id值对应的role对象
	 */
	SRole selectSRoleById(Integer id);
}
