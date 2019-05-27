package com.zx.system.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.system.mapper.SDeptMapper;
import com.zx.system.pojo.SDept;
import com.zx.system.pojo.SDeptExample;
import com.zx.system.pojo.SDeptExample.Criteria;
import com.zx.system.service.SDeptService;

/**
 * <p>
 *title:SDepartmentSercice.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-10下午2:45:29
 *@version 1.0
 */
@Service("SDeptService")
public class SDeptSerciceImp implements SDeptService{

	
	@Autowired
	private SDeptMapper mapper;
	
	public void saveSDept(SDept dept) {
	int i =	mapper.insert(dept);
	

	}

	public void deleSDept(int id) {
	int i = mapper.deleteByPrimaryKey(id);
	}

	public void updateSDept(SDept dept) {
		SDeptExample example=new SDeptExample();
		
		Criteria criteria = example.createCriteria();
		criteria.andDIdIsNotNull();
		
		mapper.updateByPrimaryKeySelective(dept);
	}

	
	public List<SDept> selectSDept(SDept dept) {
		SDeptExample example=new SDeptExample();
		
		if(dept.getdName() != null&&!"".equals(dept.getdName())){
			Criteria criteria = example.createCriteria();
			criteria.andDNameLike("%"+dept.getdName()+"%");	
		}
		List<SDept> depts = mapper.selectByExample(example);
		return depts;
	}

	
	public SDept selectSDeptById(int id) {
		
		SDept dept = mapper.selectByPrimaryKey(id);
		return dept;
	}

	
	
}
