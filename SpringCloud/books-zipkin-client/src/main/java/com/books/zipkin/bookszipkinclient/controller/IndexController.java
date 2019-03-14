package com.books.zipkin.bookszipkinclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Description zipkin客户端
 * @date 2019-01-28 16:49
 * @Copyright 2019 Alibaba.com All right reserved.
 */
@RestController
public class IndexController {
    @Autowired
    private RestTemplate restTemplate;
    private static final Logger LOG = Logger.getLogger(IndexController.class.getName());

    @RequestMapping(value = "/client")
    public String client() {
        LOG.log(Level.INFO, "calling trace client....");
        return restTemplate.getForObject("http://127.0.0.1:9110/info", String.class);
    }

    @RequestMapping(value = "/info")
    public String info() {
        LOG.log(Level.INFO, "calling trace client....");
        return "i 'm zipkin client";
    }

}
