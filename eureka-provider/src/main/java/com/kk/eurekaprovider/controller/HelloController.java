package com.kk.eurekaprovider.controller;

import com.kk.eurekaprovider.mapper.PubRegionMapper;
import com.kk.eurekaprovider.model.PubRegion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * author: wk
 * Date: 2020/3/10
 * Time: 10:27
 */
@RestController
public class HelloController {
    @Autowired
    private PubRegionMapper pubRegionMapper;

    @Value("${server.port}")
    private Integer port;

    @Value("${config.hello}")
    private String msg;

    @RequestMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        return "我是"+port+"生产者：你好【"+name+"】很高兴为你提供服务"+msg;
    }


    @RequestMapping("/addUser")
    public String addUser(@RequestParam("userName") String userName,
                          @RequestParam("passWord") String passWord){
        System.out.println("userName"+userName+", passWord"+passWord);
        return "添加成功";
    }

    @RequestMapping("/queryPubRegion")
    public List<PubRegion> queryPubRegion(){
        List<PubRegion> pubRegions = pubRegionMapper.selectAll();
        return pubRegions;
    }


}
