package com.ba06;

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


    /**
     * @Pointcut: 定义和管理切入点， 如果你的项目中有多个切入点表达式是重复的，可以复用的。
     * 可以使用@Pointcut
     * 属性：value 切入点表达式
     * 位置：在自定义的方法上面
     * 特点：
     * 当使用@Pointcut定义在一个方法的上面 ，此时这个方法的名称就是切入点表达式的别名。
     * 其它的通知中，value属性就可以使用这个方法名称，代替切入点表达式了
     */
    @Pointcut(value = "execution(* *..SomeServiceImpl.doThird(..))")
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
