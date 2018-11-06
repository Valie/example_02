package com.a2_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient //激活服务发现
@SpringBootApplication
public class A2ServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(A2ServiceApplication.class, args);
	}
}
