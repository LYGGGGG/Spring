package net.biancheng.c;

/*
@author YG
@create 2022/12/7   17:59
*/

import net.biancheng.c.entity.Order;
import net.biancheng.c.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.math.BigDecimal;

public class MainApp {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        OrderService orderService = context.getBean("orderService", OrderService.class);
        Order order = new Order();
        order.setProductId("1");
        order.setCount(30);
        order.setMoney(new BigDecimal(600));
        order.setUserId("1");
        order.setStatus(0);
        orderService.createOrder(order);
    }
}
