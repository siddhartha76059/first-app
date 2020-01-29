package com.bapu.test.firstapp.controller;

import com.bapu.test.firstapp.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RestController
public class NamePrint {
    @GetMapping("/hello/{name}")
    public String name(@PathVariable String name){
        Random rn = new Random();
        int a = rn.nextInt(1000);
        return "["+a+"] Get Hello " + name;
    }

    @GetMapping("/users")
    public User GetUsers(){
        Random rn = new Random();
        int a = rn.nextInt(1000);
        User u = new User();
        u.setAge("23");
        u.setName("bapu");
        u.setEmail("bapu@gmail.com");
        return u;
    }

    @PostMapping("/users")
    public String createUser(@RequestBody User user){
        Random rn = new Random();
        int a = rn.nextInt(1000);
        return "["+a+"] Post Hello " + user.toString();
    }
}
