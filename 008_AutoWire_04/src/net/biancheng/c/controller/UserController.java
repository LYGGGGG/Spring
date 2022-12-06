package net.biancheng.c.controller;

/*
@author YG
@create 2022/12/6   11:18
*/

import net.biancheng.c.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller // component
public class UserController {
    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void doStr() {
        userService.out();
        System.out.println("微服务架构---Controller");
    }
}
