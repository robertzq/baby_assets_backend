package com.rbt.baby.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 对所有的路径应用规则
                .allowedOrigins("*") // 允许来自example.com的请求
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 允许的请求方法
                .allowCredentials(true) // 允许发送cookies
                .maxAge(3600); // 预检请求的缓存时间（秒）
    }
}
