package com.jh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = { "com.jh" })
@EnableFeignClients(basePackages = { "com.jh" })
@EnableHystrixDashboard //实时监控作用
public class ProductServerMain {

	public static void main(String[] args) {
		SpringApplication.run(ProductServerMain.class, args);
		System.out.println("ProductServerMain");
	}
}
