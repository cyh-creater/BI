package com.zx.business.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.zx.business.pojo.AreaProduceSum;
import com.zx.business.pojo.BBrowseConcern;
import com.zx.business.pojo.BRealTimeData;
import com.zx.business.pojo.BankingGxye;
import com.zx.business.pojo.GudingzichanTz;
import com.zx.business.pojo.IndustryAdd;
import com.zx.business.pojo.IndustryCcPriceZs;
import com.zx.business.pojo.ParkCompanyAmount;
import com.zx.business.pojo.ParkCompanyStruct;
import com.zx.business.pojo.ParkTax;
import com.zx.business.pojo.PublicBudgetSr;
import com.zx.business.pojo.SocialRetailSum;
import com.zx.business.pojo.TotalExportImportVolume;
import com.zx.business.pojo.TotalTourismIncome;
import com.zx.business.service.AreaProduceSumService;
import com.zx.business.service.BBrowseConcernService;
import com.zx.business.service.BRealTimeDataService;
import com.zx.business.service.BankingGxyeService;
import com.zx.business.service.GudingzichanTzService;
import com.zx.business.service.IndustryAddService;
import com.zx.business.service.IndustryCcPriceZsService;
import com.zx.business.service.ParkCompanyAmountService;
import com.zx.business.service.ParkCompanyStructService;
import com.zx.business.service.ParkTaxService;
import com.zx.business.service.PublicBudgetSrService;
import com.zx.business.service.SocialRetailSumService;
import com.zx.business.service.TotalExportImportVolumeService;
import com.zx.business.service.TotalTourismIncomeService;
import com.zx.business.zidingyi.ZiDingYi;

/**
 * <p>
 *title:AreaProduceSumController.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-12下午4:08:59
 *@version 1.0
 */
@Controller
@RequestMapping("/shengchanzongzhi")
public class AreaProduceSumController {
	
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
//	企业数量分布图
	private ParkCompanyAmountService amountService;
	
	@Resource
//	企业结构分布图
	private ParkCompanyStructService companyStructService;
	
	@Resource
//	园区税收排名
	private ParkTaxService parkTaxService;
	
	@Resource
//	右侧实时数据的查询
	private BRealTimeDataService bRealTimeDataService;
	
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
	
	@Resource
//	右下侧数据
	private BBrowseConcernService concernService;
	@RequestMapping("/tolist")
	public String tolist(HttpServletRequest req){
//		地区生产总值
		List<ZiDingYi> lists=new ArrayList<ZiDingYi>();
		List<AreaProduceSum> list = areaProduceSumService.selectaps();
		for (AreaProduceSum areaProduceSum : list) {
			lists.add(new ZiDingYi(areaProduceSum.getMonth(),areaProduceSum.getFirstIndustry(),areaProduceSum.getSecondIndustry(),areaProduceSum.getThirdIndustry()));
		}
		 String listjson1=JSONArray.toJSON(lists).toString();
		 System.out.println(listjson1);
		 req.setAttribute("listjson1", listjson1);
		req.setAttribute("areaProduceSumList", list);
		
//		固定资产投资
		List<GudingzichanTz> list1 = gudingzichanTzService.selectAll();
		req.setAttribute("data1", list1);
		
//		社会消费品零售总额变化情况
		List<SocialRetailSum> list2 = socialRetailSumService.selectAll();
		req.setAttribute("data2", list2);
		
//		出口变化情况
		List<TotalExportImportVolume> list3 = exportImportVolumeService.selectAllOut();
		req.setAttribute("data3", list3);
		
//		企业数量分布图
		ParkCompanyAmount pca = amountService.selectpca();
		req.setAttribute("list", pca);
		
//		企业结构分布图
		ParkCompanyStruct pcs = companyStructService.selectpcs();
		req.setAttribute("list1", pcs);
		
//		园区税收排名
		List<ParkTax> pk = parkTaxService.selectAllTax();
		req.setAttribute("sspm", pk);
		
//		园区用电量排名
		List<ParkTax> pt = parkTaxService.selectAllydlTax();
		req.setAttribute("ydlpm", pt);
		
//		右上实时数据展示
		List<BRealTimeData> bRealTimeDatas = bRealTimeDataService.selectAll();	
		req.setAttribute("sssj", bRealTimeDatas);

//		右下侧数据
		BBrowseConcern concern = concernService.select(1);
		req.setAttribute("con", concern);
		return "forward:/zgg.jsp";
		
	}
	
	@RequestMapping("/zlist")
	public String zList(@PathVariable Integer id,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		 
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
		return "business/Grp/Grp_list";
	}
	
	
	/*
	 * 准备数据
	 */
	Integer month = null;
	@RequestMapping("/{id}")
	public String readyData(@PathVariable Integer id,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		
		month = id;
		String str = zList(id, request, response);
		str = "business/Grp/Grp_edit";
		return str;	
	}
	/*
	 *	保存数据
	 */
	@RequestMapping("/update")
	public String updateAps(AreaProduceSum aps,IndustryAdd add,PublicBudgetSr budgetSr,GudingzichanTz tz,SocialRetailSum sum,
			TotalTourismIncome income,TotalExportImportVolume volume,BankingGxye gxye,IndustryCcPriceZs zs){
		aps.setMonth(month);
		add.setMonth(month);
		budgetSr.setMonth(month);
		tz.setMonth(month);
		sum.setMonth(month);
		income.setMonth(month);
		volume.setMonth(month);
		gxye.setMonth(month);
		zs.setMonth(month);
		areaProduceSumService.updateAps(aps);
		addService.update(add);
		budgetSrService.updapbs(budgetSr);
		gudingzichanTzService.updagdzc(tz);
		socialRetailSumService.updasrs(sum);
		incomeService.updais(income);
		exportImportVolumeService.updaim(volume);
		bankingGxyeService.updabg(gxye);
		ccPriceZsService.updapz(zs);
		
		return "redirect:/dmc/toList.action";		
	}
	
}
