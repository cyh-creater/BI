package com.zx.business.service;

import java.util.List;

import com.zx.business.pojo.BPark;
import com.zx.business.vo.BParkVo;

/**
 * <p>
 *title:BParkService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-28上午10:07:09
 *@version 1.0
 */

public interface BParkService {
	
	/**
	 * 查询所有园区信息信息
	 * @param BPark 传入BPark对象
	 * @return 返回查询的所有角色对象
	 */
	List<BPark> selectBPark(BPark park);
	
	/**
	 * 通过id查询角色信息
	 * @param id 传入id
	 * @return  返回id值对应的park对象
	 */
	BPark selectBParkById(Integer id);
	
	/**
	 * 新增园区
	 * @param BPark 传入BPark对象
	 */
	void saveBPark(BPark park);
	
	/**
	 * 删除园区
	 * @param id 传入id
	 */
	void deleteBPark(Integer id);
	
	/**
	 * 修改角色信息
	 * @param BPark 传入BPark对象
	 */
	void updateBPark(BPark park);
	
	List<BParkVo> selerts(Integer id);
}
