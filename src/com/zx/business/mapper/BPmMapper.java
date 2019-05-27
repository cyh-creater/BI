package com.zx.business.mapper;

import com.zx.business.pojo.BPm;
import com.zx.business.pojo.BPmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BPmMapper {
    long countByExample(BPmExample example);

    int deleteByExample(BPmExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BPm record);

    int insertSelective(BPm record);

    List<BPm> selectByExample(BPmExample example);

    BPm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BPm record, @Param("example") BPmExample example);

    int updateByExample(@Param("record") BPm record, @Param("example") BPmExample example);

    int updateByPrimaryKeySelective(BPm record);

    int updateByPrimaryKey(BPm record);
    
    List<BPm> selectpm(@Param(value="acid") Integer acid,@Param("example") BPmExample example);
}