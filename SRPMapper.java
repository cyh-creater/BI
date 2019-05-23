package com.zx.system.mapper;

import com.zx.system.pojo.SRP;
import com.zx.system.pojo.SRPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SRPMapper {
    int countByExample(SRPExample example);

    int deleteByExample(SRPExample example);

    int deleteByPrimaryKey(Integer rPId);

    int insert(SRP record);

    int insertSelective(SRP record);

    List<SRP> selectByExample(SRPExample example);

    SRP selectByPrimaryKey(Integer rPId);

    int updateByExampleSelective(@Param("record") SRP record, @Param("example") SRPExample example);

    int updateByExample(@Param("record") SRP record, @Param("example") SRPExample example);

    int updateByPrimaryKeySelective(SRP record);

    int updateByPrimaryKey(SRP record);
}