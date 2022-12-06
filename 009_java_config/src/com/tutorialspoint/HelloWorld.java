package com.tutorialspoint;

/*
@author YG
@create 2022/12/6   12:54
*/

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message);
    }
}
