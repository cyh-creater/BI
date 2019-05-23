package com.zx.system.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.zx.system.mapper.SUserMapper;
import com.zx.system.pojo.SUser;
import com.zx.system.pojo.SUserExample;
import com.zx.system.pojo.SUserExample.Criteria;
import com.zx.system.service.SUserService;
import com.zx.system.vo.SUserVO;

/**
 * <p>
 *title:SUserServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-10上午10:34:53
 *@version 1.0
 */
@Service("SUserService")
public class SUserServiceImp implements SUserService{
	
	@Autowired
	private SUserMapper sum;
	/**
	 * 根据主键停用用户
	 * @param userid
	 */
	public boolean deleSUser(int userid) {
		SUser user = new SUser();
		user = sum.selectByPrimaryKey(userid);
		user.setStatus(1);
		int i = 0;
		i = sum.updateByPrimaryKey(user);
		if(i!=0){
			return true;
		}
		return false;
	}

	
	public boolean saveSUser(SUser user) {
		int i = 0;
		i = sum.insert(user);
		if(i!=0){
			return true;
		}
		return false;
	}
	/**
	 * 返回所有用户信息
	 */
	
	public List<SUser> selectAllSUser() {
		List<SUser> users = new ArrayList();
		SUserExample sue = new SUserExample();
		
		users = sum.selectByExample(sue);
		return users;
	}

	
	public SUser selectSUser(int userid) {
		SUser user = new SUser();
		user = sum.selectByPrimaryKey(userid);
		return user;
	}
	/**
	 * 根据用户对象新增后台用户
	 * @param user 用户
	 */
	
	public boolean updateSUser(SUser user) {
		int i = 0;
		i=sum.updateByPrimaryKey(user);
		if(i!=0){
			return true;
		}
		return false;
	}

	
	public List<SUserVO> selectAllSUserVO(SUser user) {
		List<SUserVO> users = new ArrayList();
		SUserExample example=new SUserExample();
		Criteria criteria = example.createCriteria();
		if(user.getuName()!=null&&!"".equals(user.getuName())){
			criteria.andUNameLike("%"+user.getuName()+"%");
		}
		users = sum.selectUser(example);
		return users;
	}
	
	public SUser SUserLogin(String userName,String Password){
		SUser suser = null;
		SUserExample ex = new SUserExample();
		Criteria c = ex.createCriteria();
		c.andUNameEqualTo(userName);
		c.andPwdEqualTo(Password);
		c.andStatusEqualTo(0);
		List<SUser> user = sum.selectByExample(ex);
		SUserExample example=new SUserExample();
		List<SUserVO> uservo=sum.selectUser(example);
		
		if(user.size()>0){
			suser = user.get(0);
		}
		return suser;
	}

	
	public SUserVO selectSUserVOById(Integer id) {
		SUserExample example=new SUserExample();
		List<SUserVO>  users=sum.selectUser(example);
		SUserVO suservo=new SUserVO();
		for(int i=0;i<users.size();i++){
			if(users.get(i).getuId()==id){
				suservo=users.get(i);
				
			}
			
		}
		return suservo;
	}

	
	public boolean checkroleid(Integer roleid) {
		SUserExample example=new SUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andRoleidEqualTo(roleid);
		List<SUser> users = sum.selectByExample(example);
		if(users.size()!=0){
			return false;
		}
		return true;
	}

	
	public boolean checkdeptid(Integer deptid) {
		SUserExample example=new SUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andDeptidEqualTo(deptid);
		List<SUser> users = sum.selectByExample(example);
		if(users.size()!=0){
			return false;
		}
		return true;
	}
	
	public boolean updateuser(SUser user) {
		int i = 0;
		
		i=sum.updateByPrimaryKeySelective(user);
		if(i!=0){
			return true;
		}
		return false;
	}
}


