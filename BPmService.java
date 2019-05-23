package com.zx.business.service;

import java.util.List;

import com.zx.business.pojo.BPm;

/**
 * <p>
 *title:BPmService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-29上午10:46:05
 *@version 1.0
 */

public interface BPmService {
	
	/*
	 * 查找本园区所有的数据
	 */
	List<BPm> selectpm(BPm pm);
	
	/*
	 * 查询所有数据
	 */
	List<BPm> seleBPms();
	
	/*
	 * 根据id查询
	 */
	BPm selectById(Integer id);
	
	/*
	 * 删除
	 */
	void delBpm(Integer id);
	
	/*
	 * 增加
	 */
	void insertBpm(BPm pm);
	
	/*
	 * 修改
	 */
	void updateBpm(BPm pm);
}
