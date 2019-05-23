package com.zx.business.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.ParkTaxMapper;
import com.zx.business.pojo.ParkTax;
import com.zx.business.pojo.ParkTaxExample;
import com.zx.business.service.ParkTaxService;

/**
 * <p>
 *title:ParkTaxServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-12上午10:17:31
 *@version 1.0
 */
@Service("ParkTaxService")
public class ParkTaxServiceImp implements ParkTaxService{
	
	@Autowired
	private ParkTaxMapper mapper;
	/* 查询园区所有税收
	 * @see com.zx.business.service.ParkTaxService#selectAllTax()
	 */
	public List<ParkTax> selectAllTax() {
		ParkTaxExample example = new ParkTaxExample();
		List<ParkTax> list = mapper.selectalldesc(example);
		return list;
	}
	/* (查询园区所有用电量排名)
	 * @see com.zx.business.service.ParkTaxService#selectAllydlTax()
	 */
	public List<ParkTax> selectAllydlTax() {
		ParkTaxExample example = new ParkTaxExample();
		List<ParkTax> list = mapper.selectallydldesc(example);
		return list;
	}
	/* (根据id查询)
	 * @see com.zx.business.service.ParkTaxService#selectById(java.lang.Integer)
	 */
	public ParkTax selectById(Integer id) {
		ParkTax parkTax = mapper.selectByPrimaryKey(id);
		return parkTax;
	}
	/* (修改)
	 * @see com.zx.business.service.ParkTaxService#updatax(com.zx.business.pojo.ParkTax)
	 */
	public void updatax(ParkTax tax) {
		mapper.updateByPrimaryKey(tax);
		
	}
	/* (新增)
	 * @see com.zx.business.service.ParkTaxService#save(com.zx.business.pojo.ParkTax)
	 */
	public void save(ParkTax tax) {
		mapper.insert(tax);
		
	}
	/* (删除)
	 * @see com.zx.business.service.ParkTaxService#delpt(java.lang.Integer)
	 */
	public void delpt(Integer id) {
		
		mapper.deleteByPrimaryKey(id);
		
	}

}
