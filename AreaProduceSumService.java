package com.zx.business.service;

import java.util.List;

import com.zx.business.pojo.AreaProduceSum;

/**
 * <p>
 *title:AreaProduceSunService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-11下午9:55:41
 *@version 1.0
 */

public interface AreaProduceSumService {
	
	/**
	 * 模糊查询
	 */
	List<AreaProduceSum> selectaps(AreaProduceSum aps);
	
	/**
	 * 查询到所有
	 */
	List<AreaProduceSum> selectaps();
	
	/*
	 * 修改表数据
	 */
	void updateAps(AreaProduceSum aps);
	
	/*
	 * 增加
	 */
	void insertAps(AreaProduceSum aps);
	
	/*
	 * 删除
	 */
	void delAps(Integer id);
	
	/*
	 * 根据id查询
	 */
	AreaProduceSum selectApsById(Integer id);
}
