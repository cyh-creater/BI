package com.zx.business.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.business.mapper.BPmMapper;
import com.zx.business.pojo.BPm;
import com.zx.business.pojo.BPmExample;
import com.zx.business.pojo.BPmExample.Criteria;
import com.zx.business.service.BPmService;

/**
 * <p>
 *title:BPmServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-29上午10:48:30
 *@version 1.0
 */
@Service("BPmService")
public class BPmServiceImp implements BPmService{
	
	@Autowired
	private BPmMapper mapper;
	/* (根据园区id查询所有的用电量和园区税收)
	 * @see com.zx.business.service.BPmService#selectpm(java.lang.Integer)
	 */
	public List<BPm> selectpm(BPm pm) {
	    BPmExample bPmExample = new BPmExample();
	    if(pm.getPmData()!=null || ""!=pm.getPmData()){
	    	Criteria criteria = bPmExample.createCriteria();
	    	criteria.andPmDataLike("%"+pm.getPmData()+"%");
	    	criteria.andPIdEqualTo(pm.getpId());
	    }
		List<BPm> list = mapper.selectpm(pm.getpId(),bPmExample);
		
		return list;
	}
	/* (non-Javadoc)
	 * @see com.zx.business.service.BPmService#seleBPms()
	 */
	public List<BPm> seleBPms() {
		BPmExample example = new BPmExample();
		List<BPm> bPms = mapper.selectByExample(example);
		return bPms;
	}
	/* (non-Javadoc)
	 * @see com.zx.business.service.BPmService#selectById(java.lang.Integer)
	 */
	public BPm selectById(Integer id) {
		BPm pm = mapper.selectByPrimaryKey(id);
		return pm;
	}
	/* (non-Javadoc)
	 * @see com.zx.business.service.BPmService#delBpm(java.lang.Integer)
	 */
	public void delBpm(Integer id) {
		
		mapper.deleteByPrimaryKey(id);
		
	}
	/* (non-Javadoc)
	 * @see com.zx.business.service.BPmService#insertBpm(com.zx.business.pojo.BPm)
	 */
	public void insertBpm(BPm pm) {
		mapper.insert(pm);
		
	}
	/* (non-Javadoc)
	 * @see com.zx.business.service.BPmService#updateBpm(com.zx.business.pojo.BPm)
	 */
	public void updateBpm(BPm pm) {
		
		mapper.updateByPrimaryKey(pm);
		
	}

}
