package com.service.Impl;

import com.service.SomeService;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/1
 * Time: 14:49
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("执行业务方法doSome");
    }

    @Override
    public void doOther() {
        System.out.println("执行业务方法doOther");

    }
}
