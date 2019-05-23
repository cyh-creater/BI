package com.zx.business.service.imp;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.IndustryCcPriceZsMapper;
import com.zx.business.pojo.IndustryCcPriceZs;
import com.zx.business.service.IndustryCcPriceZsService;

/**
 * <p>
 *title:IndustryCcPriceZsServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-22下午3:26:40
 *@version 1.0
 */
@Service("IndustryCcPriceZsService")
public class IndustryCcPriceZsServiceImp implements IndustryCcPriceZsService{
	
	@Autowired
	private IndustryCcPriceZsMapper zsMapper;
	/* (根据id查询)
	 * @see com.zx.business.service.IndustryCcPriceZsService#selecticById(java.lang.Integer)
	 */
	public IndustryCcPriceZs selecticById(Integer month) {
		IndustryCcPriceZs zs;
		if(month == null){
			Calendar cal=Calendar.getInstance();
			int month1 = cal.get(Calendar.MONTH);
			zs = zsMapper.selectByPrimaryKey(month1+1);
		}else{
			zs = zsMapper.selectByPrimaryKey(month);
		}
		return zs;
	}
	/* (修改)
	 * @see com.zx.business.service.IndustryCcPriceZsService#updapz(com.zx.business.pojo.IndustryCcPriceZs)
	 */
	public void updapz(IndustryCcPriceZs pz) {

		zsMapper.updateByPrimaryKey(pz);
		
	}
	public void del(Integer id){
		zsMapper.deleteByPrimaryKey(id);
	}
	/* (增加)
	 * @see com.zx.business.service.IndustryCcPriceZsService#insert(com.zx.business.pojo.IndustryCcPriceZs)
	 */
	public void insert(IndustryCcPriceZs pz) {
		zsMapper.insert(pz);
	}
	
}
