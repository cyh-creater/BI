package com.zx.system.vo;

import java.util.List;

import com.zx.system.pojo.SPower;
import com.zx.system.pojo.SRole;



/**
 * <p>
 *title:SRoleVO.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-10上午10:58:51
 *@version 1.0
 */

public class SRoleVO extends SRole{

	private List<SPower> power;

	public List<SPower> getPower() {
		return power;
	}
	
	public void setPower(List<SPower> power) {
		this.power = power;
	}


}
