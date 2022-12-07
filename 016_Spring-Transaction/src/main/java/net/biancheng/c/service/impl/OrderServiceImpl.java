package net.biancheng.c.service.impl;

/*
@author YG
@create 2022/12/7   16:45
*/

import net.biancheng.c.dao.AccountDao;
import net.biancheng.c.dao.OrderDao;
import net.biancheng.c.dao.StorageDao;
import net.biancheng.c.entity.Account;
import net.biancheng.c.entity.Order;
import net.biancheng.c.entity.Storage;
import net.biancheng.c.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 3步：创建order，账户扣钱，库存扣减
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    private StorageDao storageDao;

    @Autowired
    private AccountDao accountDao;

    public void createOrder(Order order) {
        /**
         * 自动生成订单 id
         */
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        String format = dateFormat.format(new Date());
        String orderId = order.getUserId() + order.getProductId() + format;
        System.out.println("自动生成的订单 id 为：" + orderId);
        order.setOrderId(orderId);
        /**
         * 创建订单数据
         */
        System.out.println("开始创建订单数据，订单号为：" + orderId);
        orderDao.createOrder(order);
        System.out.println("订单数据创建完成，订单号为：" + orderId);

        /**
         * 减库存
         */
        System.out.println("开始查询商品库存，商品 id 为：" + order.getProductId());
        Storage storage = storageDao.selectByProductId(order.getProductId());
        if (storage != null && storage.getResidue().intValue() >= order.getCount().intValue()) {
            System.out.println("商品库存充足，正在扣减商品库存");
            storage.setUsed(order.getCount());
            storage.setResidue(storage.getUsed());
            int i = storageDao.decrease(storage);
            System.out.println("商品库存扣减完成");
        } else {
            System.out.println("警告：库存不足，正在回滚！");
            throw new RuntimeException("库存不足");
        }

        /**
         * 扣账户余额
         */
        System.out.println("开始查询账户余额");
        Account account = accountDao.selectByUserId(order.getUserId());
        if (account != null && account.getResidue().intValue() >= order.getMoney().intValue()) {
            System.out.println("账户余额充足，正在扣减账户余额");
            accountDao.decrease(order.getUserId(), order.getMoney());
            System.out.println("账户余额扣减完成");
        } else {
            System.out.println("警告：余额不足，正在回滚");
            throw new RuntimeException("余额不足");
        }

        /**
         * 订单状态修改收尾工作，走到这里说明库存扣减成功、余额扣减成功
         */
        System.out.println("开始修改订单状态，0 --> 1");
        orderDao.updateOrderStatus(orderId, 0);
        System.out.println("订单状态修改完成!");
    }
}
