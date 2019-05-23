package com.zx.system.service;

import java.util.List;

import com.zx.system.pojo.SUser;
import com.zx.system.vo.SUserVO;



/**
 * <p>
 *title:SUserService.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-9下午4:38:02
 *@version 1.0
 */

	

	public interface SUserService {
		/**
		 * 根据用户对象新增后台用户
		 * @param user 用户
		 */
		public boolean saveSUser(SUser user);
		/**
		 * 根据主键禁用用户
		 * @param userid
		 */
		public boolean deleSUser(int userid);
		/**
		 * 根据对象id更新用户
		 * @param user
		 */
		public boolean updateSUser(SUser user);
		/**
		 * 根据查找所有用户信息
		 * @param user
		 * 
		 */
		public List<SUser> selectAllSUser();
		/**
		 * 根据主查找用户
		 * @param userid
		 * 返回该用户信息
		 */
		public SUser selectSUser(int userid);
		/**
		 * 查找所有用户VO
		 * @return
		 */
		public List<SUserVO> selectAllSUserVO(SUser user);
		/**
		 * 用户登录
		 * @param userName 账号
		 * @param Password 密码
		 * @return
		 */
		public SUser SUserLogin(String userName,String Password);
		
		/**
		 * 通过id获得扩展对象
		 * @param id
		 * @return
		 */
		public SUserVO selectSUserVOById(Integer id);
		
		/**
		 * 判断角色下是否有用户
		 * @param roleid
		 * @return
		 */
		boolean checkroleid(Integer roleid);
		
		/**
		 * 判断部门下是否有用户
		 * @param deptid
		 * @return
		 */
		boolean checkdeptid(Integer deptid);
		
		/**
		 * 修改user
		 * @param user
		 * @return
		 */
		boolean updateuser(SUser user);
	}

		


