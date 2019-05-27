package com.zx.system.mapper;

import com.zx.system.pojo.SPower;
import com.zx.system.pojo.SPowerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SPowerMapper {
    int countByExample(SPowerExample example);

    int deleteByExample(SPowerExample example);

    int deleteByPrimaryKey(Integer pId);

    int insert(SPower record);

    int insertSelective(SPower record);

    List<SPower> selectByExample(SPowerExample example);

    SPower selectByPrimaryKey(Integer pId);

    int updateByExampleSelective(@Param("record") SPower record, @Param("example") SPowerExample example);

    int updateByExample(@Param("record") SPower record, @Param("example") SPowerExample example);

    int updateByPrimaryKeySelective(SPower record);

    int updateByPrimaryKey(SPower record);
    List<SPower> selectpower(Integer rid);
}