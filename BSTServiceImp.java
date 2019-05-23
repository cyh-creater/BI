package com.zx.business.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.BSTMapper;
import com.zx.business.pojo.BST;
import com.zx.business.pojo.BSTExample;
import com.zx.business.pojo.BSTExample.Criteria;
import com.zx.business.service.BSTService;

/**
 * <p>
 *title:BSTServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-30下午1:23:31
 *@version 1.0
 */
@Service("BSTService")
public class BSTServiceImp implements BSTService{
	
	@Autowired
	private BSTMapper mapper;
	/* (non-Javadoc)
	 * @see com.zx.business.service.BSTService#seleBPms()
	 */
	public List<BST> seleBPms(BST bst) {
		BSTExample example = new BSTExample();
		if(bst.getTime()!=null && ""!=bst.getTime()){
			Criteria criteria = example.createCriteria();
			criteria.andTimeLike("%"+bst.getTime()+"%");
		}
		List<BST> list = mapper.selectByExample(example);
		return list;
	}

	/* (non-Javadoc)
	 * @see com.zx.business.service.BSTService#selectById(java.lang.Integer)
	 */
	public BST selectById(Integer id) {
		BST bst = mapper.selectByPrimaryKey(id);
		return bst;
	}

	/* (non-Javadoc)
	 * @see com.zx.business.service.BSTService#delBpm(java.lang.Integer)
	 */
	public void delBpm(Integer id) {
		
		mapper.deleteByPrimaryKey(id);
		
	}

	/* (non-Javadoc)
	 * @see com.zx.business.service.BSTService#insertBpm(com.zx.business.pojo.BST)
	 */
	public void insertBpm(BST pm) {
			
		mapper.insert(pm);
		
	}

	/* (non-Javadoc)
	 * @see com.zx.business.service.BSTService#updateBpm(com.zx.business.pojo.BST)
	 */
	public void updateBpm(BST pm) {

		mapper.updateByPrimaryKey(pm);
		
	}

}
