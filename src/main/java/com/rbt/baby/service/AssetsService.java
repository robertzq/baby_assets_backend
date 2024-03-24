package com.rbt.baby.service;

import com.rbt.baby.dao.AssetsMapper;
import com.rbt.baby.pojo.AssetsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetsService {

    @Autowired
    AssetsMapper assetsMapper;

    public List<AssetsVo> getAllAssets(){
        return assetsMapper.getAllAssets();
    }

    public AssetsVo getAssetsById(String id) {
        return assetsMapper.getAssetById(id);
    }

    public void addAssets(AssetsVo assetsVo) {
        assetsMapper.addAssets(assetsVo);
    }
}
