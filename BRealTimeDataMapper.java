package com.zx.business.mapper;

import com.zx.business.pojo.BRealTimeData;
import com.zx.business.pojo.BRealTimeDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BRealTimeDataMapper {
    long countByExample(BRealTimeDataExample example);

    int deleteByExample(BRealTimeDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BRealTimeData record);

    int insertSelective(BRealTimeData record);

    List<BRealTimeData> selectByExample(BRealTimeDataExample example);

    BRealTimeData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BRealTimeData record, @Param("example") BRealTimeDataExample example);

    int updateByExample(@Param("record") BRealTimeData record, @Param("example") BRealTimeDataExample example);

    int updateByPrimaryKeySelective(BRealTimeData record);

    int updateByPrimaryKey(BRealTimeData record);
}