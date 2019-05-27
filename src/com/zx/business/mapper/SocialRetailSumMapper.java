package com.zx.business.mapper;

import com.zx.business.pojo.SocialRetailSum;
import com.zx.business.pojo.SocialRetailSumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SocialRetailSumMapper {
    long countByExample(SocialRetailSumExample example);

    int deleteByExample(SocialRetailSumExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(SocialRetailSum record);

    int insertSelective(SocialRetailSum record);

    List<SocialRetailSum> selectByExample(SocialRetailSumExample example);

    SocialRetailSum selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") SocialRetailSum record, @Param("example") SocialRetailSumExample example);

    int updateByExample(@Param("record") SocialRetailSum record, @Param("example") SocialRetailSumExample example);

    int updateByPrimaryKeySelective(SocialRetailSum record);

    int updateByPrimaryKey(SocialRetailSum record);
}