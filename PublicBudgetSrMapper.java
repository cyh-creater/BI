package com.zx.business.mapper;

import com.zx.business.pojo.PublicBudgetSr;
import com.zx.business.pojo.PublicBudgetSrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PublicBudgetSrMapper {
    long countByExample(PublicBudgetSrExample example);

    int deleteByExample(PublicBudgetSrExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(PublicBudgetSr record);

    int insertSelective(PublicBudgetSr record);

    List<PublicBudgetSr> selectByExample(PublicBudgetSrExample example);

    PublicBudgetSr selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") PublicBudgetSr record, @Param("example") PublicBudgetSrExample example);

    int updateByExample(@Param("record") PublicBudgetSr record, @Param("example") PublicBudgetSrExample example);

    int updateByPrimaryKeySelective(PublicBudgetSr record);

    int updateByPrimaryKey(PublicBudgetSr record);
}