package com.nilerbarcelos.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HelloService {
    @HystrixCommand(fallbackMethod = "defaultHello")
    public String getHello(String username) {
        return new RestTemplate()
          .getForObject("http://localhost:9090/hello/{username}", 
          String.class, username);
    }
 
    private String defaultHello(String username) {
        return "Hello User!";
    }
}
