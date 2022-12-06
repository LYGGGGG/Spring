package com.tutorialspoint;

import org.springframework.context.annotation.Bean;

/*
@author YG
@create 2022/12/6   12:54
*/
public class HelloWorldConfig {
    @Bean
    public HelloWorld helloWorld(){
        return new HelloWorld();
    }
}
