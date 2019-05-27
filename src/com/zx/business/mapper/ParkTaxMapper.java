package com.zx.business.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.zx.business.pojo.ParkTax;
import com.zx.business.pojo.ParkTaxExample;

public interface ParkTaxMapper {
    long countByExample(ParkTaxExample example);

    int deleteByExample(ParkTaxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ParkTax record);

    int insertSelective(ParkTax record);

    List<ParkTax> selectByExample(ParkTaxExample example);

    ParkTax selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ParkTax record, @Param("example") ParkTaxExample example);

    int updateByExample(@Param("record") ParkTax record, @Param("example") ParkTaxExample example);

    int updateByPrimaryKeySelective(ParkTax record);

    int updateByPrimaryKey(ParkTax record);
    
    List<ParkTax> selectalldesc(ParkTaxExample example);
    
    List<ParkTax> selectallydldesc(ParkTaxExample example);
}