package com;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/31
 * Time: 19:47
 */
public class myTest03 {
    @Test
    public void testBa03() {
        String str = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        com.ba03.Student stu = (com.ba03.Student) ac.getBean("myStudent03");
        System.out.println(stu);
    }
}
