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
public class myTest05 {
    @Test
    public void testBa05() {
        String str = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        com.ba05.Student stu = (com.ba05.Student) ac.getBean("myStudent05");
        System.out.println(stu);
    }
}
