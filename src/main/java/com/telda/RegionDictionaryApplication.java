package com.telda;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@SpringBootApplication
@MapperScan("com.telda.mapper")
@EnableCaching
public class RegionDictionaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegionDictionaryApplication.class, args);
	}

}
