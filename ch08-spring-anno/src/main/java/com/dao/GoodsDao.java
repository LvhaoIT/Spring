package com.dao;

import com.entity.Goods;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/4
 * Time: 18:44
 */
public interface GoodsDao {

    //更新库存
    public int updateGoods(Goods goods);

    //查询库存
    public Goods selectGoods(Integer id);

}
