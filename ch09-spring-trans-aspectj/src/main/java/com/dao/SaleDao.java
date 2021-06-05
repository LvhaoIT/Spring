package com.dao;

import com.entity.Sale;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/4
 * Time: 18:44
 */
public interface SaleDao {
    //添加销售记录
    public int insertSale(Sale sale);
}
