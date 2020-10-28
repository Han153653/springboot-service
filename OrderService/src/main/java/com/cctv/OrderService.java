package com.cctv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cctv.dao")
public class OrderService {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(OrderService.class, args);
	}

}
