package com.example.project2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        return "Hello Home";
    }
    @RequestMapping("/")
    public String index(){
        return "Hello Index";
    }
}
