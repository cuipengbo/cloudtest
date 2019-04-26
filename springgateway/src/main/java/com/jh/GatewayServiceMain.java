package com.jh;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.jh.config.EveryFilter;

/**
 * 网关简单demo
 * @author pengbo.cui
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class GatewayServiceMain {

	public static void main(String[] args) {
		//SpringApplication.run(ConfigApplication.class, args);
		new SpringApplicationBuilder(GatewayServiceMain.class).web(true).run(args);
		
	}
	
	@Bean
	public EveryFilter getEveryFilter() {
		return new EveryFilter();
	}
}
