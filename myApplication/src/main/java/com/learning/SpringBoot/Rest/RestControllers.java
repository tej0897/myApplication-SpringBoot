package com.learning.SpringBoot.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {


    @GetMapping("/")
    public String printHello(){
        return "Hello World!!";
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return "run 5k man!";
    }
}
