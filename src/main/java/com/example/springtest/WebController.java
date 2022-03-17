package com.example.springtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class WebController {

    @Autowired
    WebService webService;

    @GetMapping("getName")
    public String getName(){
        System.out.println("in");
        webService.getName();
        String name1 = webService.getName1();
        System.out.println("out");
        System.out.println("("+name1+")");
        return "name1";
    }
}
