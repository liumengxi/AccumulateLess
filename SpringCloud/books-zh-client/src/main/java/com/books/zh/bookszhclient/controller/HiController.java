package com.books.zh.bookszhclient.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 控制层
 * @date 2019-01-25 18:00
 * @Copyright 2019 Alibaba.com All right reserved.
 */
@RestController
public class HiController {
    @Value("${server.port}")
    private String port;

    @RequestMapping("/hello")
    @HystrixCommand(fallbackMethod = "helloError")//开启断路点
    public String helloWorld(@RequestParam(value = "name" ,defaultValue = "hi") String name){
        return name + " this is my first eureka .. the port is " + port;
    }

    //调用断路器时返回的方法
    public String helloError(String name){
        return name + "client server call hello method error,Sorry";
    }


}
