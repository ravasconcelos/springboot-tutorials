package com.ravasconcelos.helloworld.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HelloWorldModel {

    private String greeting;
    private String firstName;
    private String lastName;

}
