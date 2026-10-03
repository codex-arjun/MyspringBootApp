package com.arjunit.microservices.MyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/welcome")
    public String welcom(){
       String msg ="Welcom to arjuns pc";
        return msg;
    }
}
