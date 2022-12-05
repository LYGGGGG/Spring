package com.tutorialspoint;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");
//        ApplicationContext context = new FileSystemXmlApplicationContext("E:\\code\\HelloSpring2\\src\\com\\tutorialspoint\\Beans.xml");
        HelloWorld obj1 = (HelloWorld) context.getBean("helloWorld");
        obj1.setMessage("I'm obj1");
        obj1.getMessage();
        HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld");
        obj2.getMessage();
    }
}

