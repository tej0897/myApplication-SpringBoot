package com.learning.SpringBoot.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {


    // inject the values from application.properties here using @Value annotation

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // expose an endpoint for these team / coach values

    @GetMapping("/teamData")
    public String teamData(){
        return "Coach Name: " +coachName + " and Team name is: " +teamName;
    }

    @GetMapping("/")
    public String printHello(){
        return "Hello World!!";
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return "run 5k man!";
    }

    @GetMapping("/fortune")
    public String testAPI(){
        return "you will have a great day today!!";
    }
}
