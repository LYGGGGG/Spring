package net.biancheng.c.dao.impl;

/*
@author YG
@create 2022/12/6   22:55
*/

import net.biancheng.c.dao.UserDao;
import net.biancheng.c.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int addUer(User user) {
        String sql = "Insert into user values(null,?,?)";
        int update = jdbcTemplate.update(sql, user.getUserName(), user.getStatus());
        return update;
    }

    public int update(User user, Integer i) {
        String sql = "update user set user_name = ?,status=? where user_id = ?";
        int update = jdbcTemplate.update(sql, user.getUserName(), user.getStatus(), i);
        return update;
    }

    public int delete(User user) {
        String sql = "delete from user where user_name = ?";
        int update = jdbcTemplate.update(sql, user.getUserName());
        return update;
    }

    public int count(User user) {
        return 0;
    }

    public List<User> getList(User user) {
        return null;
    }

    public User getUser(User user) {
        return null;
    }

    public void batchAddUser(List<Object[]> batchArgs) {

    }
}
