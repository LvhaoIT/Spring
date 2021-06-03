package com.ba05;

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

    @Override
    public String doOther(String name, Integer age) {
        //在方法之后做一个提交功能
        System.out.println("======目标方法doOther执行=======");
        return "abcd";
    }

    @Override
    public String doFirst(String name, Integer age) {

        System.out.println("======业务方法doFirst执行=======");
        return "doFirst";
    }

    @Override
    public void doSecond() {
        System.out.println("======业务方法doSecond执行=======");

    }

    @Override
    public void doThird() {
        System.out.println("======业务方法doThird执行=======" + 1 / 0);


    }


}
