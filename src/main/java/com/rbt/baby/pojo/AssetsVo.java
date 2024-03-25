package com.rbt.baby.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class AssetsVo implements Serializable {

    private String id;

    private String assetsName;

    private String assetsDesc;

    private String assetsUsage;
}
