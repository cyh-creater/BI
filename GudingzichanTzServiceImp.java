package com.zx.business.service.imp;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.GudingzichanTzMapper;
import com.zx.business.pojo.GudingzichanTz;
import com.zx.business.pojo.GudingzichanTzExample;
import com.zx.business.service.GudingzichanTzService;

/**
 * <p>
 *title:GudingzichanTzServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-15上午11:02:22
 *@version 1.0
 */
@Service("GudingzichanTzService")
public class GudingzichanTzServiceImp implements GudingzichanTzService{
	
	@Autowired
	private GudingzichanTzMapper mapper;

	/* 查询所有的固定资产投资
	 * @see com.zx.business.service.GudingzichanTzService#selectAll()
	 */
	public List<GudingzichanTz> selectAll() {
		GudingzichanTzExample example = new GudingzichanTzExample();
		List<GudingzichanTz> list= mapper.selectByExample(example);
		return list;
	}

	/* (根据月份来查数值)
	 * @see com.zx.business.service.GudingzichanTzService#selsecctById(java.lang.Integer)
	 */
	public GudingzichanTz selsecctById(Integer month) {
		GudingzichanTz gudingzichanTz;
		if(month == null){
			Calendar cal=Calendar.getInstance();
			int month1 = cal.get(Calendar.MONTH);
			gudingzichanTz = mapper.selectByPrimaryKey(month1+1);
		}else{
			gudingzichanTz = mapper.selectByPrimaryKey(month);
		}
		return gudingzichanTz;
	}

	/* (修改)
	 * @see com.zx.business.service.GudingzichanTzService#updagdzc(com.zx.business.pojo.GudingzichanTz)
	 */
	public void updagdzc(GudingzichanTz tz) {
		
		mapper.updateByPrimaryKey(tz);
		
	}

	/*
	 * 删除
	 */
	public void del(Integer id){
		mapper.deleteByPrimaryKey(id);
	}

	/* (增加)
	 * @see com.zx.business.service.GudingzichanTzService#insert(com.zx.business.pojo.GudingzichanTz)
	 */
	public void insert(GudingzichanTz tz) {

		mapper.insert(tz);
		
	}
}
