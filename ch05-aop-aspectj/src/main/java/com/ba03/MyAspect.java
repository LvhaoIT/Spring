package com.ba03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import java.util.Date;

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
     * 环绕通知方法的定义格式
     *  1.public
     *  2.必须有一个返回值，推荐使用Object
     *  3.方法名称自定义
     *  4.方法有参数，固定的参数 ProceedingJoinPoint
     */

    /**
     * @Around: 环绕通知
     * 属性：value 切入点表达式
     * 位置：在方法的定义什么
     * 特点：
     * 1.它是功能最强的通知
     * 2.在目标方法的前和后都能增强功能。
     * 3.控制目标方法是否被调用执行
     * 4.修改原来的目标方法的执行结果。 影响最后的调用结果
     * <p>
     * 环绕通知，等同于jdk动态代理的，InvocationHandler接口
     * <p>
     * 参数：  ProceedingJoinPoint 就等同于 Method
     * 作用：执行目标方法的
     * 返回值： 就是目标方法的执行结果，可以被修改。
     * <p>
     * 环绕通知： 经常做事务， 在目标方法之前开启事务，执行目标方法， 在目标方法之后提交事务
     */

    @Around(value = "execution(* *..SomeServiceImpl.doFirst(..))")
    public Object MyAround(ProceedingJoinPoint pjp) throws Throwable {
        Object result = null;
        Object args[] = pjp.getArgs();//获取参数
        String name = "";
        if (args.length > 1 && args != null) {
            name = (String) args[0];
        }
        if ("zhangsan".equals(name)) {
            System.out.println("方法调用前 ，增加一个时间打印：" + new Date());
            //符合条件，执行功能
            result = pjp.proceed();//功能相当于method.invoke(); Object result = doFirst();
            System.out.println("方法调用后 ，执行一个提交");
        } else {
            System.out.println("方法调用前 ，增加一个时间打印：" + new Date());
            System.out.println("方法调用后 ，执行一个提交");
        }

        //可以修改最后的返回值
        if (result != null) {
            result = "环绕通知成功修改值！";
        }

        return result;
    }


}
