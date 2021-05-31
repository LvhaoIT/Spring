package com.service.Impl;

import com.service.SomeService;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/29
 * Time: 16:25
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        System.out.println("指向了SomeServiceImpl的dosome方法");
    }
}
