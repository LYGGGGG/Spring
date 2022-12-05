package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ApplicationContext接口的实现类ClassPathXmlApplicationContext等测试
 */

/**
 * 单例模式、原型模式的测试-->Beans.xml文件修改属性
 */
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