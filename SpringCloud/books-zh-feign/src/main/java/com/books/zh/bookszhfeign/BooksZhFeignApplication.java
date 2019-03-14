package com.books.zh.bookszhfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Feign简介
 * Feign是一个声明式的伪http客户端，它使得http客户端变得简单。使用feign，只需要创建一个接口
 * 并注解。它具有可插拔的注解特性，可使用Feign注解和JAX-RS注解。Feign支持可插拔的编码器和解码器
 * Feign默认集成了Ribbon，并和Eureka结合。默认实现了负载均衡的效果。
 * 1、Feign采用了基于接口的注解
 * 2、Feign整合了Ribbon，具有负载均衡的能力。
 * 3、整合了Hystrix,具有熔断的能力。
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
public class BooksZhFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksZhFeignApplication.class, args);
    }

}

