package com.zx.business.service.imp;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.TotalExportImportVolumeMapper;
import com.zx.business.pojo.TotalExportImportVolume;
import com.zx.business.pojo.TotalExportImportVolumeExample;
import com.zx.business.service.TotalExportImportVolumeService;

/**
 * <p>
 *title:TotalExportImportVolumeServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-15下午4:59:38
 *@version 1.0
 */
@Service("TotalExportImportVolumeService")
public class TotalExportImportVolumeServiceImp implements TotalExportImportVolumeService{
	
	@Autowired
	private TotalExportImportVolumeMapper mapper;
	/* (查询所有的进出口数)
	 * @see com.zx.business.service.TotalExportImportVolumeService#selectAll()
	 */
	public List<TotalExportImportVolume> selectAllOut() {
		TotalExportImportVolumeExample example = new TotalExportImportVolumeExample();
		List<TotalExportImportVolume> list = mapper.selectByExample(example);
		return list;
	}
	/* (根据id查询进出口总额)
	 * @see com.zx.business.service.TotalExportImportVolumeService#selectIoById(java.lang.Integer)
	 */
	public TotalExportImportVolume selectIoById(Integer month) {
		TotalExportImportVolume exportImportVolume;
		if(month == null){
			Calendar cal=Calendar.getInstance();
			int month1 = cal.get(Calendar.MONTH);
			exportImportVolume = mapper.selectByPrimaryKey(month1+1);
		}else{
			exportImportVolume = mapper.selectByPrimaryKey(month);
		}
		return exportImportVolume;
		
	}
	/* (修改)
	 * @see com.zx.business.service.TotalExportImportVolumeService#updaim(com.zx.business.pojo.TotalExportImportVolume)
	 */
	public void updaim(TotalExportImportVolume volume) {
		
		mapper.updateByPrimaryKey(volume);
		
	}
	/*
	 * 删除
	 */
	public void del(Integer id){
		mapper.deleteByPrimaryKey(id);
	}
	/* (增加)
	 * @see com.zx.business.service.TotalExportImportVolumeService#insert(com.zx.business.pojo.TotalExportImportVolume)
	 */
	public void insert(TotalExportImportVolume volume) {

		mapper.insert(volume);
		
	}
}
