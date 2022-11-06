package com.example.project3_restcontroller.controller;

import com.example.project3_restcontroller.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This controller has Controller and ResponseBody both annotation
public class RestControllerExample {
    @RequestMapping("/")
    public String home(){
        return "Hello World";
    }
    @RequestMapping("/user")
    public User user(){
        User user = new User();
        user.setName("Rajat");
        user.setEmail("rajat@gmail.com");
        user.setPassword("password@gmail.com");
        user.setId("38");
        return user;
    }

    // Instead of doing RequestMapping we have some good annotation

    @GetMapping("/test") // Get method for testing, similarly we can also use postMapping
    public String test(){
        return "test";
    }


}
