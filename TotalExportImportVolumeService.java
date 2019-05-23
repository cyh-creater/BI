package com.zx.business.service;

import java.util.List;

import com.zx.business.pojo.TotalExportImportVolume;

/**
 * <p>
 *title:TotalExportImportVolumeService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-15下午4:58:06
 *@version 1.0
 */
public interface TotalExportImportVolumeService {
	/*
	 * 查询所有的出口总额
	 */
	List<TotalExportImportVolume> selectAllOut();
	/*
	 * 根据id查询进出口总额
	 */
	TotalExportImportVolume selectIoById(Integer month);
	
	/*
	 * 修改
	 */
	void updaim(TotalExportImportVolume volume);
	
	/*
	 * 删除
	 */
	void del(Integer id);
	/*
	 * 增加
	 */
	void insert(TotalExportImportVolume volume);
}
