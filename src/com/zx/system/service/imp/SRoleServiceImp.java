package com.zx.system.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zx.system.mapper.SRoleMapper;
import com.zx.system.pojo.SRole;
import com.zx.system.pojo.SRoleExample;
import com.zx.system.pojo.SRoleExample.Criteria;
import com.zx.system.service.SRoleService;

/**
 * <p>
 *title:SRoleServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-10下午2:34:54
 *@version 1.0
 */
@Service("SRoleService")
public class SRoleServiceImp implements SRoleService{
	
	@Autowired
	private SRoleMapper roleMapper;
	/* (non-Javadoc)
	 * @see com.zx.system.service.SRoleService#saveSRole(com.zx.system.pojo.SRole)
	 */
	public boolean saveSRole(SRole role) {
		
		boolean flag=false;
		int num = roleMapper.insert(role);
		if(num!=0){
			flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see com.zx.system.service.SRoleService#deleteSRole(java.lang.Integer)
	 */
	public boolean deleteSRole(Integer id) {
		boolean flag=false;
		int num = roleMapper.deleteByPrimaryKey(id);
		if(num!=0){
			flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see com.zx.system.service.SRoleService#updateSRole(com.zx.system.pojo.SRole)
	 */
	public boolean updateSRole(SRole role) {
		boolean flag=false;
		int num = roleMapper.updateByPrimaryKey(role);
		if(num!=0){
			flag=true;
		}
		return flag;
	}

	/* (non-Javadoc)
	 * @see com.zx.system.service.SRoleService#selectSRole(com.zx.system.pojo.SRole)
	 */
	public List<SRole> selectSRole(SRole role) {
		SRoleExample example = new SRoleExample();
		if(role.getrName()!=null&&!"".equals(role.getrName())){
			Criteria criteria = example.createCriteria();
			criteria.andRNameLike("%"+role.getrName()+"%");
		}
		List<SRole> roles = roleMapper.selectByExample(example);
		return roles;
	}

	/* (non-Javadoc)
	 * @see com.zx.system.service.SRoleService#selectSRoleById(java.lang.Integer)
	 */
	public SRole selectSRoleById(Integer id) {
		SRole role = roleMapper.selectByPrimaryKey(id);
		return role;
	}
	public void setRoleMapper(SRoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}

}
