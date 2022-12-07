package net.biancheng.c.dao.impl;

/*
@author YG
@create 2022/12/7   16:38
*/

import net.biancheng.c.dao.StorageDao;
import net.biancheng.c.entity.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StorageDaoImpl implements StorageDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Storage selectByProductId(String productId) {
        String sql = "select * from storage where product_id = ?";
        Storage storage = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Storage>(Storage.class), productId);
        return storage;
    }

    public int decrease(Storage storage) {
//        String sql = " update storage set  used =? ,residue=? where product_id=?";
        String sql = "update storage set used = used + ?,residue = residue-? where product_id = ?";
        int i = jdbcTemplate.update(sql, storage.getUsed(), storage.getResidue(), storage.getProductId());
        return i;
    }
}
