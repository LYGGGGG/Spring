package com.tutorialspoint;

/*
@author YG
@create 2022/12/6   14:36
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        context.start();
        HelloWorld helloWorld = context.getBean("HelloWorld", HelloWorld.class);
        helloWorld.setMessage("Hello world");
        helloWorld.getMessage();
        context.stop();
    }
}
