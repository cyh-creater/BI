package com.zx.system.mapper;

import com.zx.system.pojo.SDept;
import com.zx.system.pojo.SDeptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SDeptMapper {
    int countByExample(SDeptExample example);

    int deleteByExample(SDeptExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(SDept record);

    int insertSelective(SDept record);

    List<SDept> selectByExample(SDeptExample example);

    SDept selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") SDept record, @Param("example") SDeptExample example);

    int updateByExample(@Param("record") SDept record, @Param("example") SDeptExample example);

    int updateByPrimaryKeySelective(SDept record);

    int updateByPrimaryKey(SDept record);
}