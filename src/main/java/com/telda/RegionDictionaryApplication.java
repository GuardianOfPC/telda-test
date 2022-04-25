package com.telda;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.telda.mapper")
public class RegionDictionaryApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegionDictionaryApplication.class, args);
	}

}
