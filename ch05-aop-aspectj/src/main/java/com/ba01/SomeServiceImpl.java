package com.ba01;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/2
 * Time: 15:49
 */

//目标类
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, Integer age) {
        //给它增加功能，在doSome之前给它增加一个输出执行时间
        System.out.println("======目标方法doSome执行=======");
    }
}
