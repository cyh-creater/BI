package com.zx.business.mapper;

import com.zx.business.pojo.ParkCompanyAmount;
import com.zx.business.pojo.ParkCompanyAmountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkCompanyAmountMapper {
    long countByExample(ParkCompanyAmountExample example);

    int deleteByExample(ParkCompanyAmountExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(ParkCompanyAmount record);

    int insertSelective(ParkCompanyAmount record);

    List<ParkCompanyAmount> selectByExample(ParkCompanyAmountExample example);

    ParkCompanyAmount selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") ParkCompanyAmount record, @Param("example") ParkCompanyAmountExample example);

    int updateByExample(@Param("record") ParkCompanyAmount record, @Param("example") ParkCompanyAmountExample example);

    int updateByPrimaryKeySelective(ParkCompanyAmount record);

    int updateByPrimaryKey(ParkCompanyAmount record);
}