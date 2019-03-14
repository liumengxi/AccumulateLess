package com.books.bookszhserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class BooksZhServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksZhServerApplication.class, args);
    }

}

