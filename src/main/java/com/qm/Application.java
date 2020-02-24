package com.qm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//生成Dao接口的实例至spring容器中
@MapperScan(basePackages = {"com.qm.dao"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.err.println("666");
		
	}

}

