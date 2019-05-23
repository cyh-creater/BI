package com.zx.business.service.imp;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.TotalTourismIncomeMapper;
import com.zx.business.pojo.TotalTourismIncome;
import com.zx.business.service.TotalTourismIncomeService;

/**
 * <p>
 *title:TotalTourismIncomeImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-22下午3:16:22
 *@version 1.0
 */
@Service("TotalTourismIncomeService")
public class TotalTourismIncomeServiceImp implements TotalTourismIncomeService{
	
	@Autowired
	private TotalTourismIncomeMapper incomeMapper;
	/* (根据id查询旅游总收入)
	 * @see com.zx.business.service.TotalTourismIncomeService#selectttiById(java.lang.Integer)
	 */
	public TotalTourismIncome selectttiById(Integer month) {
		TotalTourismIncome income;
		if(month == null){
			Calendar cal=Calendar.getInstance();
			int month1 = cal.get(Calendar.MONTH);
			income = incomeMapper.selectByPrimaryKey(month1+1);
		}else{
			income = incomeMapper.selectByPrimaryKey(month);
		}
		return income;
		
	}
	/* (修改)
	 * @see com.zx.business.service.TotalTourismIncomeService#updais(com.zx.business.pojo.TotalTourismIncome)
	 */
	public void updais(TotalTourismIncome income) {
		
		incomeMapper.updateByPrimaryKey(income);
		
	}
	/*
	 * 删除
	 */
	public void del(Integer id){
		incomeMapper.deleteByPrimaryKey(id);
	}
	/* (增加)
	 * @see com.zx.business.service.TotalTourismIncomeService#insert(com.zx.business.pojo.TotalTourismIncome)
	 */
	public void insert(TotalTourismIncome income) {
		
		incomeMapper.insert(income);
		
	}
}
