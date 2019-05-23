package com.zx.business.mapper;

import com.zx.business.pojo.BankingGxye;
import com.zx.business.pojo.BankingGxyeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BankingGxyeMapper {
    long countByExample(BankingGxyeExample example);

    int deleteByExample(BankingGxyeExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(BankingGxye record);

    int insertSelective(BankingGxye record);

    List<BankingGxye> selectByExample(BankingGxyeExample example);

    BankingGxye selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") BankingGxye record, @Param("example") BankingGxyeExample example);

    int updateByExample(@Param("record") BankingGxye record, @Param("example") BankingGxyeExample example);

    int updateByPrimaryKeySelective(BankingGxye record);

    int updateByPrimaryKey(BankingGxye record);
}