package com.books.zh.bookszhclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableHystrix//开启断路器
@EnableHystrixDashboard//断路器组件
@EnableCircuitBreaker
public class BooksZhClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksZhClientApplication.class, args);
    }

}

