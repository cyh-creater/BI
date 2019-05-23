package com.zx.business.service.imp;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.AreaProduceSumMapper;
import com.zx.business.pojo.AreaProduceSum;
import com.zx.business.pojo.AreaProduceSumExample;
import com.zx.business.pojo.AreaProduceSumExample.Criteria;
import com.zx.business.service.AreaProduceSumService;



/**
 * <p>
 *title:AreaProduceSunServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-11下午9:58:34
 *@version 1.0
 */
@Service("AreaProduceSunService")
public class AreaProduceSumServiceImp implements AreaProduceSumService{
	
	@Autowired
	private AreaProduceSumMapper areaProduceSumMapper;
	/*
	 * (查询)
	 * @see com.zx.business.service.AreaProduceSunService#selectaps()
	 */
	public List<AreaProduceSum> selectaps(AreaProduceSum aps) {
		AreaProduceSumExample example = new AreaProduceSumExample();
		if(aps.getMonth()!= null&&!"".equals(aps.getMonth())){
			Criteria criteria = example.createCriteria();
			criteria.andMonthEqualTo(aps.getMonth());	
		}
		List<AreaProduceSum> list = areaProduceSumMapper.selectByExample(example);
		return list;
	}
	
	public List<AreaProduceSum> selectaps(){
		AreaProduceSumExample example = new AreaProduceSumExample();
		List<AreaProduceSum> list = areaProduceSumMapper.selectByExample(example);
		return list;
		
	}

	/* (修改)
	 * @see com.zx.business.service.AreaProduceSumService#updateAps()
	 */
	public void updateAps(AreaProduceSum aps) {
		
		 areaProduceSumMapper.updateByPrimaryKeySelective(aps);
		
	}

	/* (增加)
	 * @see com.zx.business.service.AreaProduceSumService#insertAps(com.zx.business.pojo.AreaProduceSum)
	 */
	public void insertAps(AreaProduceSum aps) {
		
		areaProduceSumMapper.insert(aps);
		
	}

	/* (删除)
	 * @see com.zx.business.service.AreaProduceSumService#delAps(java.lang.Integer)
	 */
	public void delAps(Integer id) {
		
		areaProduceSumMapper.deleteByPrimaryKey(id);
	}

	/* (根据id查询)
	 * @see com.zx.business.service.AreaProduceSumService#selectApsById(java.lang.Integer)
	 */
	public AreaProduceSum selectApsById(Integer id) {
		AreaProduceSum areaProduceSum;
		if(id == null){
			Calendar cal=Calendar.getInstance();
			int month1 = cal.get(Calendar.MONTH);
			areaProduceSum = areaProduceSumMapper.selectByPrimaryKey(month1+1);
		}else{
			areaProduceSum = areaProduceSumMapper.selectByPrimaryKey(id);
		}
		return areaProduceSum;
		
	}
	
	
	
	
}
