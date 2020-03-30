package com.kk.eurekaconsumer01.util;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Created with IntelliJ IDEA.
 * author: wk
 * Date: 2020/3/12
 * Time: 17:04
 */
@Configuration
public class RestConfig {
    @Bean
//    @LoadBalanced    //Ribbon负载均衡(手动开启)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
