package com.bapu.test.firstapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NamePrint {
    @GetMapping("/hello/{name}")
    public String name(@PathVariable String name){
        return "Hello " + name;
    }
}
