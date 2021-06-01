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
public class myTest02 {
    @Test
    public void testBa02() {
        String str = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        com.ba02.Student stu = (com.ba02.Student) ac.getBean("myStudent02");
        System.out.println(stu);
    }
}
