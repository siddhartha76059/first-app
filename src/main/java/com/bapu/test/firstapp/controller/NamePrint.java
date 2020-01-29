package com.bapu.test.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class NamePrint {
    @GetMapping("/hello/{name}")
    public String name(@PathVariable String name){
        Random rn = new Random();
        int a = rn.nextInt(1000);
        return "["+a+"] Hello " + name;
    }
}
