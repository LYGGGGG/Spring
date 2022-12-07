package net.biancheng.c.service.impl;

/*
@author YG
@create 2022/12/6   23:04
*/

import net.biancheng.c.dao.UserDao;
import net.biancheng.c.entity.User;
import net.biancheng.c.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    public int addUser(User user) {
        return userDao.addUer(user);
    }

    public int updateUser(User user, Integer i) {
        return userDao.update(user, i);
    }

    public int deleteUser(User user) {
        return userDao.delete(user);
    }

    public int countUser(User user) {
        return userDao.count(user);
    }

    public List<User> getUserList(User user) {
        return null;
    }

    public User getUser(User user) {
        return null;
    }

    public void batchAddUser(List<Object[]> batchArgs) {

    }
}
