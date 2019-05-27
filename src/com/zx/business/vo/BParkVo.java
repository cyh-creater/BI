package com.zx.business.vo;

import java.util.List;

import com.zx.business.pojo.BPark;
import com.zx.business.pojo.BPm;

/**
 * <p>
 *title:BParkVo.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-29上午9:10:43
 *@version 1.0
 */

public class BParkVo extends BPark{
	
	private List<BPm> pms;

	/**
	 * @return the pms
	 */
	public List<BPm> getPms() {
		return pms;
	}

	/**
	 * @param pms the pms to set
	 */
	public void setPms(List<BPm> pms) {
		this.pms = pms;
	}
	
	
}
