package com.zx.business.service.imp;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.PublicBudgetSrMapper;
import com.zx.business.pojo.PublicBudgetSr;
import com.zx.business.service.PublicBudgetSrService;

/**
 * <p>
 *title:PublicBudgetSrServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-22下午3:04:15
 *@version 1.0
 */
@Service("PublicBudgetSrService")
public class PublicBudgetSrServiceImp implements PublicBudgetSrService{
	
	@Autowired
	private PublicBudgetSrMapper budgetSrMapper;
	/* (根据月份查询或本月)
	 * @see com.zx.business.service.PublicBudgetSrService#selectpbsById(java.lang.Integer)
	 */
	public PublicBudgetSr selectpbsById(Integer month) {
		PublicBudgetSr publicBudgetSr;
		if(month == null){
			Calendar cal=Calendar.getInstance();
			int month1 = cal.get(Calendar.MONTH);
			publicBudgetSr = budgetSrMapper.selectByPrimaryKey(month1+1);
		}else{
			publicBudgetSr = budgetSrMapper.selectByPrimaryKey(month);
		}
		return publicBudgetSr;
		
	}
	/* (修改)
	 * @see com.zx.business.service.PublicBudgetSrService#updapbs(com.zx.business.pojo.PublicBudgetSr)
	 */
	public void updapbs(PublicBudgetSr sr) {
		
		budgetSrMapper.updateByPrimaryKey(sr);
		
	}

	/*
	 * 删除
	 */
	public void del(Integer id){
		budgetSrMapper.deleteByPrimaryKey(id);
	}
	/* (增加)
	 * @see com.zx.business.service.PublicBudgetSrService#insert(com.zx.business.pojo.PublicBudgetSr)
	 */
	public void insert(PublicBudgetSr sr) {

		budgetSrMapper.insert(sr);
		
	}
}
