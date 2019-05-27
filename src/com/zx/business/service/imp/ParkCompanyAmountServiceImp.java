package com.zx.business.service.imp;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.ParkCompanyAmountMapper;
import com.zx.business.pojo.ParkCompanyAmount;
import com.zx.business.pojo.ParkCompanyAmountExample;
import com.zx.business.service.ParkCompanyAmountService;

/**
 * <p>
 *title:ParkCompanyAmountServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-12上午8:59:20
 *@version 1.0
 */
@Service("ParkCompanyAmountService")
public class ParkCompanyAmountServiceImp implements ParkCompanyAmountService{
	
	/*
	 * (查询到所有的园区企业数)
	 */
	@Autowired
	private ParkCompanyAmountMapper amountMapper;
	
	public List<ParkCompanyAmount> selectipcas() {
		ParkCompanyAmountExample example = new ParkCompanyAmountExample();
		List<ParkCompanyAmount> list = amountMapper.selectByExample(example);
		return list;
	}
	/*
	 * 根据月份查询企业数
	 */
	public ParkCompanyAmount selectpca(){
		ParkCompanyAmount amount= null;
		Calendar cal=Calendar.getInstance();
		int month = cal.get(Calendar.MONTH);
		amount = amountMapper.selectByPrimaryKey(month+1);
		return amount;
		
	}
	/* (non-Javadoc)
	 * @see com.zx.business.service.ParkCompanyAmountService#update(com.zx.business.pojo.ParkCompanyAmount)
	 */
	public void update(ParkCompanyAmount amount) {
		amountMapper.updateByPrimaryKeySelective(amount);
		
	}
	/* (non-Javadoc)
	 * @see com.zx.business.service.ParkCompanyAmountService#dele(com.zx.business.pojo.ParkCompanyAmount)
	 */
	public void dele(Integer id) {
		amountMapper.deleteByPrimaryKey(id);
		
	}
	/* (non-Javadoc)
	 * @see com.zx.business.service.ParkCompanyAmountService#inser(com.zx.business.pojo.ParkCompanyAmount)
	 */
	public void inser(ParkCompanyAmount amount) {
		amountMapper.insertSelective(amount);
		
	}
}
