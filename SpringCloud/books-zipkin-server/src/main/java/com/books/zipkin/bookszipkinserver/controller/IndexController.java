package com.books.zipkin.bookszipkinserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @Description 对外暴露接口
 * @Author wb-yzh498839@alibaba-inc.com
 * @date 2019-01-28 16:31
 * @Copyright 2019 Alibaba.com All right reserved.
 */
@RestController
public class IndexController {

    private static final Logger LOG = Logger.getLogger(IndexController.class.getName());
    @Autowired
    private RestTemplate restTemplate;

    //访问client服务
    @RequestMapping(value = "/server")
    public String callClient() {
        LOG.log(Level.INFO, "calling trace server....");
        return restTemplate.getForObject("http://127.0.0.1:9120/info", String.class);
    }

    @RequestMapping(value = "/info")
    public String info() {
        LOG.log(Level.INFO, "calling trace server....");
        return "i'm trace server...";
    }

}
