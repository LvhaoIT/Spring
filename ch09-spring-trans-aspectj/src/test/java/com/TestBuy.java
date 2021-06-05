package com;

import com.service.BuyGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/4
 * Time: 22:58
 */
public class TestBuy {
    @Test
    public void testBuy() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        //从容器中获取service
        BuyGoodsService bgs = (BuyGoodsService) ac.getBean("buyGoodsService");
        System.out.println(bgs.getClass().getName());
//        调用方法
        bgs.buy(1001, 2);
    }
}
