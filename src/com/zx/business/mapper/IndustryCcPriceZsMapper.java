package com.zx.business.mapper;

import com.zx.business.pojo.IndustryCcPriceZs;
import com.zx.business.pojo.IndustryCcPriceZsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryCcPriceZsMapper {
    long countByExample(IndustryCcPriceZsExample example);

    int deleteByExample(IndustryCcPriceZsExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(IndustryCcPriceZs record);

    int insertSelective(IndustryCcPriceZs record);

    List<IndustryCcPriceZs> selectByExample(IndustryCcPriceZsExample example);

    IndustryCcPriceZs selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") IndustryCcPriceZs record, @Param("example") IndustryCcPriceZsExample example);

    int updateByExample(@Param("record") IndustryCcPriceZs record, @Param("example") IndustryCcPriceZsExample example);

    int updateByPrimaryKeySelective(IndustryCcPriceZs record);

    int updateByPrimaryKey(IndustryCcPriceZs record);
}