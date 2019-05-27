package com.zx.business.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zx.business.pojo.AreaProduceSum;
import com.zx.business.pojo.BST;
import com.zx.business.pojo.BankingGxye;
import com.zx.business.pojo.GudingzichanTz;
import com.zx.business.pojo.IndustryAdd;
import com.zx.business.pojo.IndustryCcPriceZs;
import com.zx.business.pojo.PublicBudgetSr;
import com.zx.business.pojo.SocialRetailSum;
import com.zx.business.pojo.TotalExportImportVolume;
import com.zx.business.pojo.TotalTourismIncome;
import com.zx.business.service.AreaProduceSumService;
import com.zx.business.service.BSTService;
import com.zx.business.service.BankingGxyeService;
import com.zx.business.service.GudingzichanTzService;
import com.zx.business.service.IndustryAddService;
import com.zx.business.service.IndustryCcPriceZsService;
import com.zx.business.service.PublicBudgetSrService;
import com.zx.business.service.SocialRetailSumService;
import com.zx.business.service.TotalExportImportVolumeService;
import com.zx.business.service.TotalTourismIncomeService;

/**
 * <p>
 *title:DataManagesController.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-30下午1:18:06
 *@version 1.0
 */
@Controller
@RequestMapping("/dmc")
public class DataManagesController {
	
	@Resource
	private BSTService bstService;
	@Resource
//	地区生产总值
	private AreaProduceSumService areaProduceSumService;
	
	@Resource
//	固定资产投资
	private GudingzichanTzService gudingzichanTzService;
	
	@Resource
//	社会消费品零售总额变化情况
	private SocialRetailSumService socialRetailSumService;
	
	@Resource
//	出口变化情况
	private TotalExportImportVolumeService exportImportVolumeService;
	
	@Resource
// 	规模以上工业增加值
	private IndustryAddService addService;
	
	@Resource
//	一般公共预算收支
	private PublicBudgetSrService budgetSrService;
	
	@Resource
//	旅游总收入
	private TotalTourismIncomeService incomeService;
	
	@Resource
//	金融机构各项存款余额
	private BankingGxyeService bankingGxyeService;
	
	@Resource
//	工业生产者出厂价格指数
	private IndustryCcPriceZsService ccPriceZsService;


	@RequestMapping("/toList")
	public String toList(BST bst,HttpServletRequest request,HttpServletResponse response,@RequestParam(required = true, defaultValue = "1") Integer pageIndex) throws ServletException, IOException{
		PageHelper.startPage(pageIndex, 10);
		List<BST> bsts = bstService.seleBPms(bst);
		PageInfo<BST> pagehelper = new PageInfo<BST>(bsts);
		request.setAttribute("page", pagehelper);
		request.setAttribute("bsts", bsts);
		request.setAttribute("time",bst.getTime());
		return "business/BST/bst_list";
	}
	@RequestMapping("/zs")
	public String Exhibition(BST bst,HttpServletRequest request) throws ServletException, IOException{
			 Integer id = bst.getId();
			 if(id == 0){
				 return "business/Grp/Grp_edit";
			 }
			/*
			 * 地区生产总值
			 */
			AreaProduceSum areaProduceSum = areaProduceSumService.selectApsById(id);
			request.setAttribute("list", areaProduceSum);
			/*
			 * 规模以上工业增加值
			 */
			IndustryAdd add = addService.selectiaById(id);
			request.setAttribute("list1", add);
			/*
			 * 一般公共预算收支
			 */
			PublicBudgetSr budgetSr = budgetSrService.selectpbsById(id);
			request.setAttribute("list2", budgetSr);
			/*
			 * 固定资产投资
			 */
			GudingzichanTz tz = gudingzichanTzService.selsecctById(id);
			request.setAttribute("list3", tz);
			/*
			 * 社会消费品零售总额
			 */
			SocialRetailSum sum  = socialRetailSumService.selectsrsById(id);
			request.setAttribute("list4", sum);
			/*
			 * 旅游总收入
			 */
			TotalTourismIncome income = incomeService.selectttiById(id);
			request.setAttribute("list5", income);
			/*
			 * 进出口总额
			 */
			TotalExportImportVolume volume = exportImportVolumeService.selectIoById(id);
			request.setAttribute("list6", volume);
			/*
			 * 金融机构各项存款余额
			 */
			BankingGxye gxye = bankingGxyeService.selectbgById(id);
			request.setAttribute("list7", gxye);
			/*
			 * 工业生产者出厂价格指数
			 */
			IndustryCcPriceZs zs = ccPriceZsService.selecticById(id);
			request.setAttribute("list8", zs);
			/*
			 * 时间值
			 */
			BST bst2 = bstService.selectById(id);
			request.setAttribute("bst2", bst2);
			
			return "business/Grp/Grp_list";
		}
		
		@RequestMapping("/del")
		public String dels(Integer id){
			areaProduceSumService.delAps(id);
			addService.dele(id);
			budgetSrService.del(id);
			gudingzichanTzService.del(id);
			socialRetailSumService.del(id);
			incomeService.del(id);
			exportImportVolumeService.del(id);
			bankingGxyeService.del(id);
			ccPriceZsService.del(id);
			bstService.delBpm(id);
			return "redirect:toList.action";
			
		}
		@RequestMapping("/save")
		public String save(AreaProduceSum aps,IndustryAdd add,PublicBudgetSr budgetSr,GudingzichanTz tz,SocialRetailSum sum,
				TotalTourismIncome income,TotalExportImportVolume volume,BankingGxye gxye,IndustryCcPriceZs zs,BST bst){
			Integer month = null;
			bst.setPriject("经济指标");
			bstService.insertBpm(bst);
			List<BST> list = bstService.seleBPms(bst);
			for (BST bst2 : list) {
				month = bst2.getId();
			}
			aps.setMonth(month);
			add.setMonth(month);
			budgetSr.setMonth(month);
			tz.setMonth(month);
			sum.setMonth(month);
			income.setMonth(month);
			volume.setMonth(month);
			gxye.setMonth(month);
			zs.setMonth(month);
			areaProduceSumService.insertAps(aps);
			addService.inser(add);
			budgetSrService.insert(budgetSr);
			gudingzichanTzService.insert(tz);
			socialRetailSumService.insert(sum);
			incomeService.insert(income);
			exportImportVolumeService.insert(volume);
			bankingGxyeService.insert(gxye);
			ccPriceZsService.insert(zs);
			
			return "redirect:toList.action";
			
		}
	}
	
	

