package com.cecgw.keystone;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.cecgw.keystone.dao")
public class KeystoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeystoneApplication.class, args);
	}
}
