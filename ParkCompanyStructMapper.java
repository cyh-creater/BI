package com.zx.business.mapper;

import com.zx.business.pojo.ParkCompanyStruct;
import com.zx.business.pojo.ParkCompanyStructExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkCompanyStructMapper {
    long countByExample(ParkCompanyStructExample example);

    int deleteByExample(ParkCompanyStructExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(ParkCompanyStruct record);

    int insertSelective(ParkCompanyStruct record);

    List<ParkCompanyStruct> selectByExample(ParkCompanyStructExample example);

    ParkCompanyStruct selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") ParkCompanyStruct record, @Param("example") ParkCompanyStructExample example);

    int updateByExample(@Param("record") ParkCompanyStruct record, @Param("example") ParkCompanyStructExample example);

    int updateByPrimaryKeySelective(ParkCompanyStruct record);

    int updateByPrimaryKey(ParkCompanyStruct record);
}