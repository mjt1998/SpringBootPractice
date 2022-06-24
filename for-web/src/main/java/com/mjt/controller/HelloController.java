package com.mjt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author mjt
 * @Time 2022/6/23
 */

@RestController()
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("hello world!");
        return ("hello world!");
    }

}
