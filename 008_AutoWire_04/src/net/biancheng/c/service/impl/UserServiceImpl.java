package net.biancheng.c.service.impl;

/*
@author YG
@create 2022/12/6   11:14
*/

import net.biancheng.c.dao.UserDao;
import net.biancheng.c.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserDao getUserDao(){
        return userDao;
    }

    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void out() {
        userDao.print();
        System.out.println("Spring框架快速搭建项目---Service");
    }
}
