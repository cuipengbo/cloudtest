package com.jh;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class ZhuceServiceMain {

	public static void main(String[] args) {
		//		SpringApplication.run(ZhuceApplication.class, args);
		new SpringApplicationBuilder(ZhuceServiceMain.class).web(true).run(args);
		//LOGGER.info("注册中心启动完成...");
	}
}
