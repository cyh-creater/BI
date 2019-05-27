package com.zx.business.mapper;

import com.zx.business.pojo.ParkCompanyTax;
import com.zx.business.pojo.ParkCompanyTaxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkCompanyTaxMapper {
    long countByExample(ParkCompanyTaxExample example);

    int deleteByExample(ParkCompanyTaxExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(ParkCompanyTax record);

    int insertSelective(ParkCompanyTax record);

    List<ParkCompanyTax> selectByExample(ParkCompanyTaxExample example);

    ParkCompanyTax selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") ParkCompanyTax record, @Param("example") ParkCompanyTaxExample example);

    int updateByExample(@Param("record") ParkCompanyTax record, @Param("example") ParkCompanyTaxExample example);

    int updateByPrimaryKeySelective(ParkCompanyTax record);

    int updateByPrimaryKey(ParkCompanyTax record);
}