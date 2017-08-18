package com.cecgw.virtualresource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.cecgw.virtualresource.mapper")
public class VirtualresourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualresourceApplication.class, args);
	}
}
