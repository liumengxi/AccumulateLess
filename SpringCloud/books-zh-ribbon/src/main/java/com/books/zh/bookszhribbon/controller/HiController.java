package com.books.zh.bookszhribbon.controller;

import com.books.zh.bookszhribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private HelloService helloService;

    @RequestMapping("/hello")
    public String helloWorld(@RequestParam(value = "name") String name){
        return helloService.hiService(name);
    }
}
