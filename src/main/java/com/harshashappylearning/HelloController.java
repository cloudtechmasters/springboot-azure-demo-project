package com.harshashappylearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //return heelo world as a reponse

    @GetMapping("/hello")
    public String hello(){
        return "Hello World & Welcome to my Zone";
    }
}
