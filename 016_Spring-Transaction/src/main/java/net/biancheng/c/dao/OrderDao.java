package net.biancheng.c.dao;

/*
@author YG
@create 2022/12/7   15:40
*/

import net.biancheng.c.entity.Order;

public interface OrderDao {
    /**
     * 创建订单
     */
    public int createOrder(Order order);

    /**
     * 修改订单状态，0-->1
     */

    public void updateOrderStatus(String orderId, Integer status);
}
