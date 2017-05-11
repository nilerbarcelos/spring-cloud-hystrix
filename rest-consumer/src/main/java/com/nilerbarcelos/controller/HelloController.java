package com.nilerbarcelos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nilerbarcelos.service.HelloService;

@Controller
public class HelloController {
    @Autowired
    private HelloService helloService;
 
    @RequestMapping("/get-hello/{username}")
    public String getHello(Model model, @PathVariable("username") String username) {
        model.addAttribute("hello", helloService.getHello(username));
        return "hello-view";
    }
}
