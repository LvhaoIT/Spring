package com.ba02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;

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
     * @AfterReturning:后置通知 属性：1.value 切入点表达式
     * 2.returning 自定义的变量，表示目标方法的返回值的。
     * 自定义变量名必须和通知方法的形参名一样。
     * 位置：在方法定义的上面
     * 特点：
     * 1。在目标方法之后执行的。
     * 2. 能够获取到目标方法的返回值，可以根据这个返回值做不同的处理功能
     * Object res = doOther();
     * 3. 可以修改这个返回值
     * <p>
     * 后置通知的执行
     * Object res = doOther();
     * 参数传递： 传值， 传引用
     * myAfterReturing(res);
     * System.out.println("res="+res)
     */

    @AfterReturning(value = "execution(* *..ba02.SomeServiceImpl.doOther(..))", returning = "res")
    public void myAfterReturing(Object res) {
        //Object res:是目标方法执行后的返回值，根据返回值做你的切面的功能处理
        System.out.println("后置通知：在目标方法之后执行，获取的返回值是：" + res);
        res = "1234";

    }


    @AfterReturning(value = "execution(* *..ba02.SomeServiceImpl.doOther2(..))", returning = "res")
    public void myAfterReturing02(Object res) {
        //Object res:是目标方法执行后的返回值，根据返回值做你的切面的功能处理
        System.out.println("后置通知：在目标方法之后执行，获取的返回值是：" + res);

        // res = new Student("笑笑", "20");


        Student stu = (Student) res;
        ((Student) res).setName("xiaoxiao");

        //stu.setName("xiaoxiao");
        System.out.println("后置通知中res" + res);
        System.out.println("后置通知中stu" + stu);

    }


}
