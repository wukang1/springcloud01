package com.kk.eurekaconsumer01.service;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * author: wk
 * Date: 2020/3/14
 * Time: 17:08
 */
@Component
public class HelloServiceFallback implements HelloFeignService {
    @Override
    public String hello(String name) {
        return "系统弄繁忙";
    }

    @Override
    public String addUser(String userName, String passWord) {
        return null;
    }
}
