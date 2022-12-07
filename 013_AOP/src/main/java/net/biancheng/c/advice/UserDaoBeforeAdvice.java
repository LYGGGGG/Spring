package net.biancheng.c.advice;

/*
@author YG
@create 2022/12/7   21:07
*/

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class UserDaoBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println();
        System.out.println("正在执行 前置 增强操作…………");
    }
}
