package net.biancheng.c.service;

/*
@author YG
@create 2022/12/7   16:44
*/

import net.biancheng.c.entity.Order;

public interface OrderService {
    /**
     * 创建订单
     */
    public void createOrder(Order order);
}
