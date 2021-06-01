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
public class myTest04 {
    @Test
    public void testBa04() {
        String str = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        com.ba04.Student stu = (com.ba04.Student) ac.getBean("myStudent04");
        System.out.println(stu);
    }
}
