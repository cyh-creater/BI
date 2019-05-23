package com.zx.system.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.system.mapper.SPowerMapper;
import com.zx.system.mapper.SRPMapper;
import com.zx.system.pojo.SPower;
import com.zx.system.pojo.SPowerExample;
import com.zx.system.pojo.SRP;
import com.zx.system.pojo.SRPExample;
import com.zx.system.service.SPowerService;

/**
 * <p>
 *title:SPowerServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-10下午2:54:45
 *@version 1.0
 */
@Service("SPowerService")
public class SPowerServiceImp implements SPowerService{
	
	@Autowired
	private SPowerMapper spm;
	
	@Autowired
	private SRPMapper sprm;
	/* (non-Javadoc)
	 * @see com.zx.system.service.SPowerService#selectPower()
	 */
	public List<SPower> selectPower() {
		SPowerExample example = new SPowerExample();
	
		List<SPower> list=spm.selectByExample(example);
		return list;
	}
   
	 public List<SPower> selectrolePower(Integer rid){
		 
		 List<SPower> list=spm.selectpower(rid);
		 return list;
		 
		 
	 }
	public void adduser(SRP sp) {
		
		sprm.insert(sp);
		
		
	}

	public void deleuser(SRP sp) {
		SRPExample srpExample = new SRPExample();
		SRPExample.Criteria criteria = srpExample.createCriteria();
		criteria.andRIdEqualTo(sp.getrId());
		criteria.andPIdEqualTo(sp.getpId());
		sprm.deleteByExample(srpExample);
		
	}

	public void update(Integer pid,Integer rid) {
		boolean bol=true;
		SRPExample srpExample = new SRPExample();
		SRPExample.Criteria criteria = srpExample.createCriteria();
		criteria.andPIdEqualTo(pid);
		criteria.andRIdEqualTo(rid);
		List<SRP> list = sprm.selectByExample(srpExample);
		if(list.size()==1){
			sprm.deleteByPrimaryKey(list.get(0).getrPId());
		}else{
			SRP srp = new SRP(pid,rid);
			sprm.insert(srp);
		}
		
	}

}
