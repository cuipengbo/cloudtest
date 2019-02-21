package com.jh;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServiceMain {

	public static void main(String[] args) {
		//SpringApplication.run(ConfigApplication.class, args);
		new SpringApplicationBuilder(ConfigServiceMain.class).web(true).run(args);
		System.out.println("123456");
	}
}
