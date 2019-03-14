package com.books.zh.bookszhfeign.hystrix;

import com.books.zh.bookszhfeign.feign.ServiceHello;
import org.springframework.stereotype.Component;

/**
 * @Description 断路器返回的方法
 * @date 2019-01-26 14:45
 * @Copyright 2019 Alibaba.com All right reserved.
 */
@Component
public class hystrixFallBack implements ServiceHello {

    @Override
    public String helloService(String name){
        return  "Sorry ," + name;
    }
}
