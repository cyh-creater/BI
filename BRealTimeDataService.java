package com.zx.business.service;

import java.util.List;

import com.zx.business.pojo.BRealTimeData;

/**
 * <p>
 *title:BRealTimeDataService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-17上午10:23:30
 *@version 1.0
 */

public interface BRealTimeDataService {
	/*
	 * 查询所有数据
	 */
	List<BRealTimeData> selectAll();
	/*
	 * 数据修改
	 */
	void updaRt(BRealTimeData data);
	/*
	 * 根据id查询
	 */
	 BRealTimeData selectById(Integer id);
}
