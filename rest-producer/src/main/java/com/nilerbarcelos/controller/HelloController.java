package com.nilerbarcelos.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface HelloController {
    @RequestMapping("/hello/{username}")
    String hello(@PathVariable("username") String username);
}
