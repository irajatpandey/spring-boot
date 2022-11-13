package com.example.project4.controller;

import com.example.project4.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/user")
    public User getUser(){
        User user = new User();
        user.setName("Rajat");
        user.setRollno(12);
        user.setAddress("Prayagraj");
        return user;
    }
    //   Single Path Variable
//    @GetMapping("/{id}")
//    public String pathVariable(@PathVariable String id){
//        return "This is the path Variable " + id;
//
//    }

    // Multiple Path variable
//    @GetMapping("/{id}/{id2}")
//    public String pathVariable(@PathVariable String id, @PathVariable String id2){
//        return "This is the path Variable " + id + " : " + id2;
//
//    }

    // user mdefined names for the path variable
    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable("id") String name, @PathVariable("id2") String list){
        return "This is the path Variable " + name + " : " + list;

    }



}
