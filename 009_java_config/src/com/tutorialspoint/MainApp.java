package com.tutorialspoint;

/*
@author YG
@create 2022/12/6   12:55
*/

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();
        System.out.println(helloWorld.hashCode());

        HelloWorld helloWorld2 = context.getBean("helloWorld", HelloWorld.class);
        System.out.println(helloWorld2.hashCode());
        helloWorld2.getMessage();
    }
}
