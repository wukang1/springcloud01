package com.kk.eurekaconsumer01.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created with IntelliJ IDEA.
 * author: wk
 * Date: 2020/3/14
 * Time: 15:14
 */
@Service
@FeignClient(value = "eureka-provider",fallback = HelloServiceFallback.class)
public interface HelloFeignService {

    @RequestMapping("/hello/{name}")
    String hello(@PathVariable("name") String name);


    @RequestMapping("/addUser")
    String addUser(@RequestParam("userName") String userName,
                   @RequestParam("passWord") String passWord);

}
