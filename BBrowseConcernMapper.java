package com.zx.business.mapper;

import com.zx.business.pojo.BBrowseConcern;
import com.zx.business.pojo.BBrowseConcernExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BBrowseConcernMapper {
    long countByExample(BBrowseConcernExample example);

    int deleteByExample(BBrowseConcernExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BBrowseConcern record);

    int insertSelective(BBrowseConcern record);

    List<BBrowseConcern> selectByExample(BBrowseConcernExample example);

    BBrowseConcern selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BBrowseConcern record, @Param("example") BBrowseConcernExample example);

    int updateByExample(@Param("record") BBrowseConcern record, @Param("example") BBrowseConcernExample example);

    int updateByPrimaryKeySelective(BBrowseConcern record);

    int updateByPrimaryKey(BBrowseConcern record);
}