package com.learning.myApplication.Rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {


    @GetMapping("/print")
    public String printHello(){
        return "Hello World!!";
    }

}
