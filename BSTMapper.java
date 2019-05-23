package com.zx.business.mapper;

import com.zx.business.pojo.BST;
import com.zx.business.pojo.BSTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BSTMapper {
    long countByExample(BSTExample example);

    int deleteByExample(BSTExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BST record);

    int insertSelective(BST record);

    List<BST> selectByExample(BSTExample example);

    BST selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BST record, @Param("example") BSTExample example);

    int updateByExample(@Param("record") BST record, @Param("example") BSTExample example);

    int updateByPrimaryKeySelective(BST record);

    int updateByPrimaryKey(BST record);
}