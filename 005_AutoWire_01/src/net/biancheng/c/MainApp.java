package net.biancheng.c;

/*
@author YG
@create 2022/12/5   20:07
*/

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
    }
}
