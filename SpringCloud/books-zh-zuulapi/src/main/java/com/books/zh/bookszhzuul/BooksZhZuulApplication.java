package com.books.zh.bookszhzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 在Spring Cloud微服务系统中，一种常见的负载均衡方式是，客户端的请求首先经过负载均衡（zuul、Ngnix），
 * 再到达服务网关（zuul集群），然后再到具体的服。
 * ，服务统一注册到高可用的服务注册中心集群，服务的所有的配置文件由配置服务管理，
 * 配置服务的配置文件放在git仓库，方便开发人员随时改配置。
 *
 * Zuul的主要功能是路由转发和过滤器。
 * 路由功能是微服务的一部分，
 * 比如／api/user转发到到user服务，/api/shop转发到到shop服务。
 * zuul默认和Ribbon结合实现了负载均衡的功能
 */
@SpringBootApplication
@EnableZuulProxy //开启网关功能
@EnableDiscoveryClient
public class BooksZhZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksZhZuulApplication.class, args);
    }

}

