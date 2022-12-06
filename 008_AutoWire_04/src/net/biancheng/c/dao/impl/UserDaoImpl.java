package net.biancheng.c.dao.impl;

/*
@author YG
@create 2022/12/6   11:13
*/

import net.biancheng.c.dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository // component
public class UserDaoImpl implements UserDao {
    @Override
    public void print() {
        System.out.println("java语言--Dao");
    }
}
