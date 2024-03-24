package com.rbt.baby.dao;

import com.rbt.baby.pojo.AssetsVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AssetsMapper {

     List<AssetsVo> getAllAssets();

     AssetsVo getAssetById(@Param("id")String id);
}
