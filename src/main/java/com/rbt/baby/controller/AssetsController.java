package com.rbt.baby.controller;

import com.rbt.baby.pojo.AssetsVo;
import com.rbt.baby.service.AssetsService;
import com.rbt.baby.service.QRCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AssetsController {

    @Autowired
    AssetsService assetsService;
    @Autowired
    QRCodeService qrCodeService;

    @GetMapping("/assets")
    public List<AssetsVo> getAssets() {
        return assetsService.getAllAssets();
    }

    @GetMapping("/assetsItem/{id}")
    public AssetsVo getAssetById(@PathVariable String id) {
        return assetsService.getAssetsById(id);
    }

    @GetMapping("/createUUIDQR/{id}")
    public void createUUIDQR(@PathVariable String id) throws Exception {
         qrCodeService.generateQRCodeImageToFile( id,"D:\\"+id+".png");
    }
}
