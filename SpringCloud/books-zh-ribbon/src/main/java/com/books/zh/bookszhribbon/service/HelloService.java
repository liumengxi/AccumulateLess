package com.books.zh.bookszhribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description 服务类
 * @date 2019-01-25 19:20
 * @Copyright 2019 Alibaba.com All right reserved.
 */
@Service //在业务逻辑层(service层)使用
public class HelloService {

    @Autowired//注入Bean的注解
    private RestTemplate restTemplate;

    //远程访问eureka-client微服务api，返回string
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello?name = " + name, String.class);
    }
    public String hiError(String name){
        return "hi," + name +",sorry,error!";
    }
}
