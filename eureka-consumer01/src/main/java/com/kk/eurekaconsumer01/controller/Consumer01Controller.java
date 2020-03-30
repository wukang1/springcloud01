package com.kk.eurekaconsumer01.controller;

import com.kk.eurekaconsumer01.service.HelloFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * author: wk
 * Date: 2020/3/12
 * Time: 17:03
 */
@RestController
public class Consumer01Controller {

    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private HelloFeignService helloFeignService;


    @RequestMapping(value = "/test/{name}",method = RequestMethod.GET)
    public String test(@PathVariable("name") String name){
        String url="http://localhost:7201/hello/"+name;
        String message = restTemplate.getForObject(url, String.class);
        return message;
    }


    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return helloFeignService.hello(name);
    }


    @RequestMapping("/addUser")
    public String addUser(@RequestParam("userName") String userName,
                          @RequestParam("passWord") String passWord){
        System.out.println("userName"+userName+", passWord"+passWord);
        return helloFeignService.addUser(userName,passWord);
    }
}
