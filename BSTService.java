package com.zx.business.service;

import java.util.List;

import com.zx.business.pojo.BST;

/**
 * <p>
 *title:BSTService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-30下午1:20:56
 *@version 1.0
 */

public interface BSTService {
	
	
	/*
	 * 查询所有数据
	 */
	List<BST> seleBPms(BST bst);
	
	/*
	 * 根据id查询
	 */
	BST selectById(Integer id);
	
	/*
	 * 删除
	 */
	void delBpm(Integer id);
	
	/*
	 * 增加
	 */
	void insertBpm(BST pm);
	
	/*
	 * 修改
	 */
	void updateBpm(BST pm);
}
