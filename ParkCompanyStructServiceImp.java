package com.zx.business.service.imp;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.ParkCompanyStructMapper;
import com.zx.business.pojo.ParkCompanyStruct;

/**
 * <p>
 *title:ParkCompanyStructService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-16上午9:54:49
 *@version 1.0
 */
@Service("ParkCompanyStructService")
public class ParkCompanyStructServiceImp implements com.zx.business.service.ParkCompanyStructService{
	
	@Autowired
	private ParkCompanyStructMapper mapper;
	/* (查询本月企业结构数)
	 * @see com.zx.business.service.ParkCompanyStructService#selectpcs()
	 */
	public ParkCompanyStruct selectpcs() {
		ParkCompanyStruct pcs = null;
//		获取当前系统月数
		Calendar cal = Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		pcs = mapper.selectByPrimaryKey(month);
		return pcs;
	}

	/*
	 * 删除
	 */
	public void del(Integer id){
		mapper.deleteByPrimaryKey(id);
	}

}
