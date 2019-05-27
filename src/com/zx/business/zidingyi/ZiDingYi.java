package com.zx.business.zidingyi;
/**
 * <p>
 *title:ZiDingYi.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-19上午9:50:49
 *@version 1.0
 */

public class ZiDingYi {
	
	Integer month;
	double num;
	double num1;
	double num2;
	double num3;
	public ZiDingYi(Integer month, double num) {
		super();
		this.month = month;
		this.num = num;
	}
	public ZiDingYi(Integer month, double num, double num1, double num2) {
		super();
		this.month = month;
		this.num = num;
		this.num1 = num1;
		this.num2 = num2;
	}
	public ZiDingYi(Integer month, double num, double num1, double num2,
			double num3) {
		super();
		this.month = month;
		this.num = num;
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	/**
	 * @return the month
	 */
	public Integer getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(Integer month) {
		this.month = month;
	}
	/**
	 * @return the num
	 */
	public double getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(double num) {
		this.num = num;
	}
	/**
	 * @return the num1
	 */
	public double getNum1() {
		return num1;
	}
	/**
	 * @param num1 the num1 to set
	 */
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	/**
	 * @return the num2
	 */
	public double getNum2() {
		return num2;
	}
	/**
	 * @param num2 the num2 to set
	 */
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	/**
	 * @return the num3
	 */
	public double getNum3() {
		return num3;
	}
	/**
	 * @param num3 the num3 to set
	 */
	public void setNum3(double num3) {
		this.num3 = num3;
	}
	
}
