package com;

import com.ba01.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/2
 * Time: 16:20
 */
public class MyTest01 {

    @Test
    public void test01() {
        String xml = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(xml);
        //从容器中获取对象
        SomeService proxy = (SomeService) ac.getBean("someService");

        //通过代理对象执行方法，实现目标方法执行时，增强了功能

        proxy.doSome("李四", 20);

    }
}
