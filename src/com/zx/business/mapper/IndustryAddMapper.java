package com.zx.business.mapper;

import com.zx.business.pojo.IndustryAdd;
import com.zx.business.pojo.IndustryAddExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryAddMapper {
    long countByExample(IndustryAddExample example);

    int deleteByExample(IndustryAddExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(IndustryAdd record);

    int insertSelective(IndustryAdd record);

    List<IndustryAdd> selectByExample(IndustryAddExample example);

    IndustryAdd selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") IndustryAdd record, @Param("example") IndustryAddExample example);

    int updateByExample(@Param("record") IndustryAdd record, @Param("example") IndustryAddExample example);

    int updateByPrimaryKeySelective(IndustryAdd record);

    int updateByPrimaryKey(IndustryAdd record);
}