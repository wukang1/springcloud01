package com.kk.eurekaconsumer02.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * author: wk
 * Date: 2020/3/13
 * Time: 14:52
 */
@Service
@FeignClient("eureka-provider")
public interface HelloFeignService {

    @RequestMapping("/hello/{name}")
    String test(@PathVariable("name") String name);

}
