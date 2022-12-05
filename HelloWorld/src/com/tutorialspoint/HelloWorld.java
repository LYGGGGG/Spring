package com.tutorialspoint;

/*
@author YG
@create 2022/12/5   17:30
*/


public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }
}