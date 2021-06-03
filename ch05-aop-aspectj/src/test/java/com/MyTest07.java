package com;


import com.ba07.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/2
 * Time: 16:20
 */
public class MyTest07 {

    @Test
    public void test06() {
        String xml = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        //从容器中获取对象
        SomeServiceImpl proxy = (SomeServiceImpl) ac.getBean("someService");

        /**
         * 目标类没有接口，使用cglib动态代理，spring框架会自动应用cglib
         * com.ba07.SomeServiceImpl$$EnhancerBySpringCGLIB$$46160842
         */
        System.out.println(proxy.getClass().getName());

        proxy.doSome("1", 10);


    }

}
