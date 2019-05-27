//package com.zx.text;
//
//import java.util.List;
//
//import javax.annotation.Resource;
//
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//
//import com.zx.business.pojo.Aaa;
//import com.zx.system.service.AaaService;
//
//
//
///**
// * <p>
// *title:Tests.java
// *</p >
// *Description 【请输入一段文字描述该文件功能】
// *
// *作者：WYH 2019-4-9下午3:12:16
// *@version 1.0
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:applicationContext.xml")
//public class Tests {
//	@Resource(name="AaaService")
//	private AaaService as;
//	
//	/*
//	 * 增
//	 */
//	@Test
//	public void saveAaa(){
//		Aaa a = new Aaa();
//		as.saveAaa(a);
//	}
//	/*
//	 * 查询
//	 */
//	@Test
//	public void SelectAllAaa(){
//		List<Aaa> list = as.selectAllAaa();
//		for (Aaa aaa : list) {
//			System.out.println(aaa.getName());
//		}
//	}
//}
