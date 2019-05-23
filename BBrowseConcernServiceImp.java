package com.zx.business.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.BBrowseConcernMapper;
import com.zx.business.pojo.BBrowseConcern;
import com.zx.business.service.BBrowseConcernService;

/**
 * <p>
 *title:BBrowseConcernServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-24下午5:24:43
 *@version 1.0
 */
@Service("BBrowseConcernService")
public class BBrowseConcernServiceImp implements BBrowseConcernService{

	@Autowired
	private BBrowseConcernMapper mapper;
	/* (修改)
	 * @see com.zx.business.service.BBrowseConcernService#update(com.zx.business.pojo.BBrowseConcern)
	 */
	public void update(BBrowseConcern bBrowseCooncern) {
		
		mapper.updateByPrimaryKey(bBrowseCooncern);
		
	}

	/* (查询)
	 * @see com.zx.business.service.BBrowseConcernService#select(java.lang.Integer)
	 */
	public BBrowseConcern select(Integer id) {
		
		BBrowseConcern concern = mapper.selectByPrimaryKey(id);
		return concern;
	}

	/*
	 * 删除
	 */
	public void del(Integer id){
		mapper.deleteByPrimaryKey(id);
	}

	/* (增加)
	 * @see com.zx.business.service.BBrowseConcernService#insert(com.zx.business.pojo.BBrowseConcern)
	 */
	public void insert(BBrowseConcern bBrowseCooncern) {
		
		mapper.insert(bBrowseCooncern);
		
	}
}
