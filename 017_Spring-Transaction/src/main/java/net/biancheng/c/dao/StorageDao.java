package net.biancheng.c.dao;

/*
@author YG
@create 2022/12/7   15:45
*/

import net.biancheng.c.entity.Storage;

public interface StorageDao {
    /**
     * 查询商品库存
     */
    Storage selectByProductId(String productId);

    /**
     * 扣减库存
     */
    int decrease(Storage storage);
}
