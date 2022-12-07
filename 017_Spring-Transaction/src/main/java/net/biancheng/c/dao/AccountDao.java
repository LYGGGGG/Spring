package net.biancheng.c.dao;

/*
@author YG
@create 2022/12/7   15:44
*/

import net.biancheng.c.entity.Account;

import java.math.BigDecimal;

public interface AccountDao {
    /**
     * 根据用户id查询账户金额
     */
    Account selectByUserId(String userId);

    /**
     * 扣减账户金额
     */
    int decrease(String userId, BigDecimal money);
}
