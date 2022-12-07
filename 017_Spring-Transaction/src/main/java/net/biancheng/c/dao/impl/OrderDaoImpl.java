package net.biancheng.c.dao.impl;

/*
@author YG
@create 2022/12/7   15:48
*/

import net.biancheng.c.dao.OrderDao;
import net.biancheng.c.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public int createOrder(Order order) {
        String sql = "insert into `order`(order_id,user_id,product_id,`count`,money,status) values(?,?,?,?,?,?)";
        int i = jdbcTemplate.update(sql, order.getOrderId(), order.getUserId(), order.getProductId(),
                order.getCount(), order.getMoney(), order.getStatus());
        return i;
    }

    public void updateOrderStatus(String orderId, Integer status) {
        String sql = "update `order` set status = 1 where order_id = ? and status = ?";
        int i = jdbcTemplate.update(sql, orderId, status);
    }
}
