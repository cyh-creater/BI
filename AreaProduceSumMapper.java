package com.zx.business.mapper;

import com.zx.business.pojo.AreaProduceSum;
import com.zx.business.pojo.AreaProduceSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreaProduceSumMapper {
    long countByExample(AreaProduceSumExample example);

    int deleteByExample(AreaProduceSumExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(AreaProduceSum record);

    int insertSelective(AreaProduceSum record);

    List<AreaProduceSum> selectByExample(AreaProduceSumExample example);

    AreaProduceSum selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") AreaProduceSum record, @Param("example") AreaProduceSumExample example);

    int updateByExample(@Param("record") AreaProduceSum record, @Param("example") AreaProduceSumExample example);

    int updateByPrimaryKeySelective(AreaProduceSum record);

    int updateByPrimaryKey(AreaProduceSum record);
}