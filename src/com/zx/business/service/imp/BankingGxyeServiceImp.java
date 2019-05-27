package com.zx.business.service.imp;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.BankingGxyeMapper;
import com.zx.business.pojo.BankingGxye;
import com.zx.business.service.BankingGxyeService;

/**
 * <p>
 *title:BankingGxyeServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-22下午3:22:20
 *@version 1.0
 */
@Service("BankingGxyeService")
public class BankingGxyeServiceImp implements BankingGxyeService{
	
	@Autowired
	private BankingGxyeMapper mapper;
	/* (non-Javadoc)
	 * @see com.zx.business.service.BankingGxyeService#selectbgById(java.lang.Integer)
	 */
	public BankingGxye selectbgById(Integer month) {
		BankingGxye gxye;
		if(month == null){
			Calendar cal=Calendar.getInstance();
			int month1 = cal.get(Calendar.MONTH);
			gxye = mapper.selectByPrimaryKey(month1+1);
		}else{
			gxye = mapper.selectByPrimaryKey(month);
		}
		return gxye;
		
	}
	/* (修改)
	 * @see com.zx.business.service.BankingGxyeService#updabg(com.zx.business.pojo.BankingGxye)
	 */
	public void updabg(BankingGxye gxye) {
			
		mapper.updateByPrimaryKey(gxye);
		
	}
	
	/*
	 * 删除
	 */
	public void del(Integer id){
		mapper.deleteByPrimaryKey(id);
	}
	/* (增加)
	 * @see com.zx.business.service.BankingGxyeService#insert(com.zx.business.pojo.BankingGxye)
	 */
	public void insert(BankingGxye gxye) {
		mapper.insert(gxye);
		
	}
}
