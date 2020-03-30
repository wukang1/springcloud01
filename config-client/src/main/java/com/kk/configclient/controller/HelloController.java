package com.kk.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * author: wk
 * Date: 2020/3/26
 * Time: 21:11
 */
@RestController
public class HelloController {

    @Value("${config.hello}")
    private String msg;


    @PostMapping("/hello")
    public String hello(){
        return "我是"+msg;
    }
}
