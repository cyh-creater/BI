package com.zx.business.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.BRealTimeDataMapper;
import com.zx.business.pojo.BRealTimeData;
import com.zx.business.pojo.BRealTimeDataExample;
import com.zx.business.service.BRealTimeDataService;

/**
 * <p>
 *title:BRealTimeDataImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-17上午10:27:09
 *@version 1.0
 */
@Service("BRealTimeDataService")
public class BRealTimeDataServiceImp implements BRealTimeDataService{
	
	@Autowired
	private BRealTimeDataMapper mapper;
	/* (查询所有金融平台右侧边数据排名)
	 * @see com.zx.business.service.BRealTimeDataService#selectAll()
	 */
	public List<BRealTimeData> selectAll() {
		BRealTimeDataExample example = new BRealTimeDataExample();
		
		List<BRealTimeData> list = mapper.selectByExample(example);
		return list;
	}
	/* (修改)
	 * @see com.zx.business.service.BRealTimeDataService#updaRt()
	 */
	public void updaRt(BRealTimeData data) {
		
		mapper.updateByPrimaryKey(data);
		
	}
	/* (根据id查询)
	 * @see com.zx.business.service.BRealTimeDataService#selectById(java.lang.Integer)
	 */
	public BRealTimeData selectById(Integer id) {
		
		BRealTimeData bRealTimeData = mapper.selectByPrimaryKey(id);
		return bRealTimeData;
	}
	
}
