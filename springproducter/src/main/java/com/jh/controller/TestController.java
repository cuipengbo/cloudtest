package com.jh.controller;

import com.jh.SchedualServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

	@Value("${message.yunxin1}")
    private String message;

	@Autowired
	private SchedualServiceFeign schedualServiceFeign;

    /**
     * 测试从配置文件获取信息
     * @return
     */
    @RequestMapping("/hello")
    public String hello() {
        return "hello " + message;
    }

    /**
     * 测试fegin调用是否好用
     * @param name
     * @return
     */
    @RequestMapping("/{name}")
    public String home(@PathVariable("name") String name) {
        schedualServiceFeign.sayHiFromClientOne(name);
        return name + "终于访问到来了";
    }
    
    
}
