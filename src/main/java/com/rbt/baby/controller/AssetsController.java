package com.rbt.baby.controller;

import com.rbt.baby.pojo.AssetsVo;
import com.rbt.baby.service.AssetsService;
import com.rbt.baby.service.QRCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        AssetsVo assetsVo = assetsService.getAssetsById(id);
        if (assetsVo == null) {
            AssetsVo assetsVo1 = new AssetsVo();
            assetsVo1.setId(id);
            return assetsVo1;
        } else {
            return assetsVo;
        }
    }

    @GetMapping("/createUUIDQR/{id}")
    public void createUUIDQR(@PathVariable String id) throws Exception {
         qrCodeService.generateQRCodeImageToFile( id,"D:\\"+id+".png");
    }

    @PostMapping("/addAssets")
    public String addAssets(@RequestBody AssetsVo assetsVo) {
        assetsService.addAssets(assetsVo);
        return "addAssets";
    }
}
