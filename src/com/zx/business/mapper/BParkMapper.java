package com.zx.business.mapper;

import com.zx.business.pojo.BPark;
import com.zx.business.pojo.BParkExample;
import com.zx.business.vo.BParkVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BParkMapper {
    long countByExample(BParkExample example);

    int deleteByExample(BParkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BPark record);

    int insertSelective(BPark record);

    List<BPark> selectByExample(BParkExample example);

    BPark selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BPark record, @Param("example") BParkExample example);

    int updateByExample(@Param("record") BPark record, @Param("example") BParkExample example);

    int updateByPrimaryKeySelective(BPark record);

    int updateByPrimaryKey(BPark record);
    
    List<BParkVo> selectParkInfo(@Param("pId") Integer pId);
}