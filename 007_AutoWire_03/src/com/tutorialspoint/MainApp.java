package com.tutorialspoint;

/*
@author YG
@create 2022/12/5   20:27
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// 自动装配 constructor
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
        textEditor.spellCheck();
    }
}
