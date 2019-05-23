package com.zx.business.mapper;

import com.zx.business.pojo.TotalTourismIncome;
import com.zx.business.pojo.TotalTourismIncomeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalTourismIncomeMapper {
    long countByExample(TotalTourismIncomeExample example);

    int deleteByExample(TotalTourismIncomeExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(TotalTourismIncome record);

    int insertSelective(TotalTourismIncome record);

    List<TotalTourismIncome> selectByExample(TotalTourismIncomeExample example);

    TotalTourismIncome selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") TotalTourismIncome record, @Param("example") TotalTourismIncomeExample example);

    int updateByExample(@Param("record") TotalTourismIncome record, @Param("example") TotalTourismIncomeExample example);

    int updateByPrimaryKeySelective(TotalTourismIncome record);

    int updateByPrimaryKey(TotalTourismIncome record);
}