package com.books.config.booksconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description 配置文件客户端访问服务器测试控制层
 * @date 2019-01-27 13:52
 * @Copyright 2019 Alibaba.com All right reserved.
 */

@RestController
@RefreshScope
public class IndexController {

    //由配置文件服务器获取的属性值
    @Value("${serverPort}")
    String serverPort;

    //返回从配置服务器获取的端口
    @RequestMapping(value = "/port")
    public String index(){
        return serverPort;
    }


}
