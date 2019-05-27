package com.zx.system.vo;

import com.zx.system.pojo.SDept;
import com.zx.system.pojo.SUser;



/**
 * <p>
 *title:SUserVO.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-10上午9:39:48
 *@version 1.0
 */

public class SUserVO extends SUser {

	private SDept dept;
	private SRoleVO role;



	private String zhuangtai;//状态



	public SDept getDept() {
		return dept;
	}



	/**
	 * @param dept the dept to set
	 */
	public void setDept(SDept dept) {
		this.dept = dept;
	}



	/**
	 * @return the role
	 */
	public SRoleVO getRole() {
		return role;
	}



	/**
	 * @param role the role to set
	 */
	public void setRole(SRoleVO role) {
		this.role = role;
	}



	/**
	 * @return the zhuangtai
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}



	/**
	 * @param zhuangtai the zhuangtai to set
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}

	
}

