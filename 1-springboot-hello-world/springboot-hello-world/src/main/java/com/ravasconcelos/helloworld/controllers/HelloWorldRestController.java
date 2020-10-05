package com.ravasconcelos.helloworld.controllers;

import com.ravasconcelos.helloworld.model.HelloWorldModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldRestController {

    @GetMapping
    public HelloWorldModel getGreeting(String firstName, String lastName) {
        return HelloWorldModel.builder()
                .greeting("Hello")
                .firstName(firstName)
                .lastName(lastName)
                .build();
    }
}
