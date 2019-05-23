package com.zx.business.service.imp;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.IndustryAddMapper;
import com.zx.business.pojo.IndustryAdd;
import com.zx.business.pojo.IndustryAddExample;
import com.zx.business.pojo.IndustryAddExample.Criteria;
import com.zx.business.service.IndustryAddService;

/**
 * <p>
 *title:IndustryAddService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-22上午8:52:24
 *@version 1.0
 */
@Service("IndustryAddService")
public class IndustryAddServiceImp implements IndustryAddService{
	//规模以上工业增加值
	@Autowired
	private IndustryAddMapper addMapper;
	/* (条件查询)
	 * @see com.zx.business.service.IndustryAddService#selectipcas()
	 */
	public List<IndustryAdd> selectias(IndustryAdd industryAdd) {
		IndustryAddExample example = new IndustryAddExample();
		if(industryAdd.getMonth()!= null&&!"".equals(industryAdd.getMonth())){
			Criteria criteria = example.createCriteria();
			criteria.andMonthEqualTo(industryAdd.getMonth());	
		}
		List<IndustryAdd> list = addMapper.selectByExample(example);
		return list;
		
	}

	/* (根据id查)
	 * @see com.zx.business.service.IndustryAddService#selectpca()
	 */
	public IndustryAdd selectiaById(Integer id) {
		IndustryAdd industryAdd;
		if(id == null){
			Calendar cal=Calendar.getInstance();
			int month1 = cal.get(Calendar.MONTH);
			industryAdd = addMapper.selectByPrimaryKey(month1+1);
		}else{
			industryAdd = addMapper.selectByPrimaryKey(id);
		}
		return industryAdd;
		
	}
	
	

	/* (改)
	 * @see com.zx.business.service.IndustryAddService#update(com.zx.business.pojo.IndustryAdd)
	 */
	public void update(IndustryAdd amount) {
		
		addMapper.updateByPrimaryKey(amount);
		
		
	}

	/* (删)
	 * @see com.zx.business.service.IndustryAddService#dele(com.zx.business.pojo.IndustryAdd)
	 */
	public void dele(Integer id) {

		addMapper.deleteByPrimaryKey(id);
		
	}

	/* (增加)
	 * @see com.zx.business.service.IndustryAddService#inser(com.zx.business.pojo.IndustryAdd)
	 */
	public void inser(IndustryAdd amount) {
		
		addMapper.insert(amount);
		
	}
	
	
}
