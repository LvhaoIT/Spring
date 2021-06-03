package com.ba07;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/2
 * Time: 15:52
 */

/**
 * @Aspect ： 是aspectj框架中的注解，
 * 作用：表示当前类是切面类
 * 切面类：是用来给业务方法增加功能的类，在这个类中有切面的功能代码
 * 位置，是在类定义的上面
 */
@Aspect
public class MyAspect {

    @Pointcut(value = "execution(* *..SomeServiceImpl.doSome(..))")
    public void mypt() {
        //无需代码
    }

    @After(value = "mypt()")
    public void myAfter() {
        System.out.println("执行最终通知，总会被执行的代码");
        //一般用来做资源清除工作
    }

    @Before(value = "mypt()")
    public void myBefore() {
        System.out.println("执行前置通知---");

    }

}
