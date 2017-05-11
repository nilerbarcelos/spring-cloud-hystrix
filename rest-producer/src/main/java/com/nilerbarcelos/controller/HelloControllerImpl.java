package com.nilerbarcelos.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllerImpl implements HelloController {
    @Override
    public String hello(@PathVariable("username") String username) {
        return String.format("Hello %s!\n", username);
    }
}
