package com.tutorialspoint;

/*
@author YG
@create 2022/12/6   11:45
*/

import org.springframework.beans.factory.annotation.Required;

public class Student {
    private Integer age;
    private String name;
    @Required
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}