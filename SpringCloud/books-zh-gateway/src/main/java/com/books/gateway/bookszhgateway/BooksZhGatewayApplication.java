package com.books.gateway.bookszhgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BooksZhGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksZhGatewayApplication.class, args);
    }

    //@Bean
    //public RouteLocator myRoutes(RouteLocatorBuilder builder) {
    //    return builder.routes()
    //        .route(p -> p
    //            .path("/get")
    //            .filters(f -> f.addRequestHeader("Hello", "World"))
    //            .uri("http://httpbin.org:80"))
    //        .build();
    //}

}

