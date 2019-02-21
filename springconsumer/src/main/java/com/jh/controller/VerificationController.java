package com.jh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/verfivation")
public class VerificationController {


    @RequestMapping("/fegin")
    public String hello(@RequestParam(value = "name") String name) {
        System.out.println("收到信息" + name);
        return "hello 验证好了";
    }

}
