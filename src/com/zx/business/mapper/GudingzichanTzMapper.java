package com.zx.business.mapper;

import com.zx.business.pojo.GudingzichanTz;
import com.zx.business.pojo.GudingzichanTzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GudingzichanTzMapper {
    long countByExample(GudingzichanTzExample example);

    int deleteByExample(GudingzichanTzExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(GudingzichanTz record);

    int insertSelective(GudingzichanTz record);

    List<GudingzichanTz> selectByExample(GudingzichanTzExample example);

    GudingzichanTz selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") GudingzichanTz record, @Param("example") GudingzichanTzExample example);

    int updateByExample(@Param("record") GudingzichanTz record, @Param("example") GudingzichanTzExample example);

    int updateByPrimaryKeySelective(GudingzichanTz record);

    int updateByPrimaryKey(GudingzichanTz record);
}