package com.rbt.baby;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rbt.baby.dao")
public class BabyApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabyApplication.class, args);
	}

}
