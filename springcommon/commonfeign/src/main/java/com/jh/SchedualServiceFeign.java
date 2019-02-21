package com.jh;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "spring-cloud-consumer", fallback = SchedualServiceFeignFallBack.class)
public interface SchedualServiceFeign {
	
    @RequestMapping(value = "/verfivation/fegin",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

@Component
class SchedualServiceFeignFallBack implements SchedualServiceFeign {

	@Override
	public String sayHiFromClientOne(String name) {
		return name + "熔断走此路！";
	}
	
}