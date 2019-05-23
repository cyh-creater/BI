package com.zx.system.mapper;

import com.zx.system.pojo.SUser;
import com.zx.system.pojo.SUserExample;
import com.zx.system.vo.SUserVO;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SUserMapper {
    int countByExample(SUserExample example);

    int deleteByExample(SUserExample example);

    int deleteByPrimaryKey(Integer uId);

    int insert(SUser record);

    int insertSelective(SUser record);

    List<SUser> selectByExample(SUserExample example);

    SUser selectByPrimaryKey(Integer uId);

    int updateByExampleSelective(@Param("record") SUser record, @Param("example") SUserExample example);

    int updateByExample(@Param("record") SUser record, @Param("example") SUserExample example);

    int updateByPrimaryKeySelective(SUser record);

    int updateByPrimaryKey(SUser record);
    
    List<SUserVO>  selectUser(SUserExample example);
}