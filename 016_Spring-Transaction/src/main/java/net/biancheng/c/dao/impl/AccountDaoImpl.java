package net.biancheng.c.dao.impl;

/*
@author YG
@create 2022/12/7   16:10
*/

import net.biancheng.c.dao.AccountDao;
import net.biancheng.c.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class AccountDaoImpl implements AccountDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Account selectByUserId(String userId) {
        String sql = "select * from account where user_id = ?";
        // 使用BeanPropertyRowMapper将数据库查询结果转换为Java类对象。
        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Account>(Account.class), userId);
        return account;
    }

    public int decrease(String userId, BigDecimal money) {
        String sql = "update account set used = used+ ?,residue = residue-? where user_id = ?";
        int update = jdbcTemplate.update(sql, money, money, userId);
        return update;
    }
}
