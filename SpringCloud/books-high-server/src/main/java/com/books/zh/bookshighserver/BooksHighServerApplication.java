package com.books.zh.bookshighserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BooksHighServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksHighServerApplication.class, args);
    }

}

