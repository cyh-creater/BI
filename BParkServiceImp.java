package com.zx.business.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.BParkMapper;
import com.zx.business.pojo.BPark;
import com.zx.business.pojo.BParkExample;
import com.zx.business.pojo.BParkExample.Criteria;
import com.zx.business.service.BParkService;
import com.zx.business.vo.BParkVo;

/**
 * <p>
 *title:BParkServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-28上午10:16:11
 *@version 1.0
 */
@Service("BParkService")
public class BParkServiceImp implements BParkService{
	
	@Autowired
	private BParkMapper mapper;
	/* (non-Javadoc)
	 * @see com.zx.business.service.BParkService#selectSRole(com.zx.business.pojo.BPark)
	 */
	public List<BPark> selectBPark(BPark park) {
		BParkExample example = new BParkExample();
		if(park.getyName()!=null && ""!=park.getyName()){
			Criteria criteria = example.createCriteria();
			criteria.andYNameLike("%"+park.getyName()+"%");
		}
		List<BPark> list = mapper.selectByExample(example);
		return list;
	}

	/* (non-Javadoc)
	 * @see com.zx.business.service.BParkService#selectBParkById(java.lang.Integer)
	 */
	public BPark selectBParkById(Integer id) {
		BPark park = mapper.selectByPrimaryKey(id);
		return park;
	}

	/* (non-Javadoc)
	 * @see com.zx.business.service.BParkService#saveBPark(com.zx.business.pojo.BPark)
	 */
	public void saveBPark(BPark park) {
		
		mapper.insert(park);
		
	}

	/* (non-Javadoc)
	 * @see com.zx.business.service.BParkService#deleteBPark(java.lang.Integer)
	 */
	public void deleteBPark(Integer id) {
		
		mapper.deleteByPrimaryKey(id);
		
	}

	/* (non-Javadoc)
	 * @see com.zx.business.service.BParkService#updateBPark(com.zx.business.pojo.BPark)
	 */
	public void updateBPark(BPark park) {
			
		mapper.updateByPrimaryKey(park);
		
	}
	
	public List<BParkVo> selerts(Integer id){
		List<BParkVo> list = mapper.selectParkInfo(id);
		return list;
		
	}

	/**
	 * @return the mapper
	 */
	public BParkMapper getMapper() {
		return mapper;
	}

	/**
	 * @param mapper the mapper to set
	 */ 
	public void setMapper(BParkMapper mapper) {
		this.mapper = mapper;
	}
	
	
}
