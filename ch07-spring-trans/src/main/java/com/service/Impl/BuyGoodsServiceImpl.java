package com.service.Impl;

import com.dao.GoodsDao;
import com.dao.SaleDao;
import com.entity.Goods;
import com.entity.Sale;
import com.excep.NotEnoughException;
import com.service.BuyGoodsService;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/4
 * Time: 22:30
 */
public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    @Override
    public void buy(Integer goodId, Integer nums) {
        System.out.println("buy方法的开始==========");

        //记录销售信息，向sale表增加记录
        Sale sale = new Sale(goodId, nums);
        saleDao.insertSale(sale);

        //更新库存
        Goods goods = goodsDao.selectGoods(goodId);
        if (goods == null) {
            throw new NullPointerException("编号为：" + goodId + "商品不存在");
        } else if (goods.getAmount() < nums) {
            throw new NotEnoughException("编号为：" + goodId + "商品不足");
        }
        //修改库存
        Goods buyGoods = new Goods();
        buyGoods.setId(goodId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);

        System.out.println("buy方法的结束==========");
    }
}
