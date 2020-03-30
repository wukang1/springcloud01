package com.kk.eurekaconsumer02.controller;

import com.kk.eurekaconsumer02.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * author: wk
 * Date: 2020/3/13
 * Time: 15:32
 */
@RestController
public class TestController {

    @Autowired
    private HelloFeignService helloFeignService;

    @RequestMapping("/test/{name}")
    public String test(@PathVariable("name") String name){
        return helloFeignService.test(name);
    }

}
