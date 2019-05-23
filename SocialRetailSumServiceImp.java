package com.zx.business.service.imp;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.SocialRetailSumMapper;
import com.zx.business.pojo.SocialRetailSum;
import com.zx.business.pojo.SocialRetailSumExample;
import com.zx.business.service.SocialRetailSumService;

/**
 * <p>
 *title:SocialRetailSumServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-15下午4:51:11
 *@version 1.0
 */
@Service("SocialRetailSumService")
public class SocialRetailSumServiceImp implements SocialRetailSumService{
	
	@Autowired
	private SocialRetailSumMapper mapper;
	/* (查询所有的社会消费品零售总额)
	 * @see com.zx.business.service.SocialRetailSumService#selectAll()
	 */
	public List<SocialRetailSum> selectAll() {
		SocialRetailSumExample example = new SocialRetailSumExample();
		List<SocialRetailSum> list = mapper.selectByExample(example);
		return list;
	}
	/* (根据id查询社会消费品零售总额)
	 * @see com.zx.business.service.SocialRetailSumService#selectsrsById(java.lang.Integer)
	 */
	public SocialRetailSum selectsrsById(Integer month) {
		SocialRetailSum retailSum;
		if(month == null){
			Calendar cal=Calendar.getInstance();
			int month1 = cal.get(Calendar.MONTH);
			retailSum = mapper.selectByPrimaryKey(month1+1);
		}else{
			retailSum = mapper.selectByPrimaryKey(month);
		}
		return retailSum;
		
	}
	/* (修改)
	 * @see com.zx.business.service.SocialRetailSumService#updasrs(com.zx.business.pojo.SocialRetailSum)
	 */
	public void updasrs(SocialRetailSum retailSum) {
		
		mapper.updateByPrimaryKey(retailSum);
		
	}
	/*
	 * 删除
	 */
	public void del(Integer id){
		mapper.deleteByPrimaryKey(id);
	}
	/* (增加)
	 * @see com.zx.business.service.SocialRetailSumService#insert(com.zx.business.pojo.SocialRetailSum)
	 */
	public void insert(SocialRetailSum retailSum) {

		mapper.insert(retailSum);
		
	}
}
