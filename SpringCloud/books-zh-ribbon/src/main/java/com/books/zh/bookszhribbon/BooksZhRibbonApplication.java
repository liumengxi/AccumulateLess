package com.books.zh.bookszhribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * ribbon是一个负载均衡客户端，可以很好的控制http和tcp的一些行为。
 */
@SpringBootApplication
@EnableEurekaClient //让服务发现服务器,使用服务器.Spring cloud 实现服务发现
@EnableDiscoveryClient//让服务发现服务器,向服务中心注册 不分注册服务器
@EnableHystrix
public class BooksZhRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksZhRibbonApplication.class, args);
    }

    @Bean//向程序的IOC注册一个bean
    @LoadBalanced//注解表明这个restTemplate开启负载均衡功能
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

}

