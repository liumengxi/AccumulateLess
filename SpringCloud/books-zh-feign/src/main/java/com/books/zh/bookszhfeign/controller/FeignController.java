package com.books.zh.bookszhfeign.controller;

import com.books.zh.bookszhfeign.feign.ServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description Feign模拟控制层
 * @date 2019-01-25 20:58
 * @Copyright 2019 Alibaba.com All right reserved.
 */
@RestController
public class FeignController {

    @Autowired
    private ServiceHello serviceHello;

    @GetMapping(value = "hello")
    public String hello(@RequestParam(value = "name") String name){
        return serviceHello.helloService(name);
    }

}
