package com.books.zh.bookszhfeign.feign;

import com.books.zh.bookszhfeign.hystrix.hystrixFallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
 * @date 2019/01/25
 */
@FeignClient(value = "eureka-client",fallback = hystrixFallBack.class)
public interface ServiceHello {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String helloService(@RequestParam(value = "name") String name);
}
