package com.test.secu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class SecuApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecuApplication.class, args);
	}

}
