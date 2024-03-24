package com.learning.myApplication.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {

    @Value("${user.name}")
    private String userName;

    @GetMapping("/")
    public String printHello(){
        return "Hello World!!" + getUserName();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
