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
import com.zx.system.service.ZtreeService;




/**
 * <p>
 *title:ZtreeServiceImp.java
 *</p >
 *Description 【请输入一段文字描述该文件功能】
 *
 *作者：WYH 2019-4-11下午9:50:06
 *@version 1.0
 */
@Service("ZtreeService")
public class ZtreeServiceImp implements ZtreeService{
  
	@Autowired
	private SPowerMapper mapper;
	
	@Autowired
	private SRPMapper smapper;
	
	
	public List<SPower> selectPower() {
		SPowerExample example = new SPowerExample();
	
		List<SPower> list=mapper.selectByExample(example);
		return list;
	}
   
	 public List<SPower> selectrolePower(Integer rid){
		 
		 List<SPower> list=mapper.selectpower(rid);
		 return list;
		 
		 
	 }
	
	public void adduser(SRP sp) {
		
		smapper.insert(sp);
		
		
	}

	
	public void deleuser(SRP sp) {
		SRPExample srpExample = new SRPExample();
		SRPExample.Criteria criteria = srpExample.createCriteria();
		criteria.andPIdEqualTo(sp.getpId());
		criteria.andRIdEqualTo(sp.getrId());
		smapper.deleteByExample(srpExample);
		
	}

	public void update(Integer pid,Integer rid) {
		boolean bol=true;
		SRPExample srpExample = new SRPExample();
		SRPExample.Criteria criteria = srpExample.createCriteria();
		criteria.andPIdEqualTo(pid);
		criteria.andRIdEqualTo(rid);
		List<SRP> list = smapper.selectByExample(srpExample);
		if(list.size()==1){
			smapper.deleteByPrimaryKey(list.get(0).getrPId());
		}else{
			SRP srp = new SRP(pid,rid);
			smapper.insert(srp);
		}
		
	}

}
