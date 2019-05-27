package com.zx.business.mapper;

import com.zx.business.pojo.TotalExportImportVolume;
import com.zx.business.pojo.TotalExportImportVolumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalExportImportVolumeMapper {
    long countByExample(TotalExportImportVolumeExample example);

    int deleteByExample(TotalExportImportVolumeExample example);

    int deleteByPrimaryKey(Integer month);

    int insert(TotalExportImportVolume record);

    int insertSelective(TotalExportImportVolume record);

    List<TotalExportImportVolume> selectByExample(TotalExportImportVolumeExample example);

    TotalExportImportVolume selectByPrimaryKey(Integer month);

    int updateByExampleSelective(@Param("record") TotalExportImportVolume record, @Param("example") TotalExportImportVolumeExample example);

    int updateByExample(@Param("record") TotalExportImportVolume record, @Param("example") TotalExportImportVolumeExample example);

    int updateByPrimaryKeySelective(TotalExportImportVolume record);

    int updateByPrimaryKey(TotalExportImportVolume record);
}