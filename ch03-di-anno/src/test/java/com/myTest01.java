package com;

import com.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/31
 * Time: 19:47
 */
public class myTest01 {
    @Test
    public void testBa01() {
        String str = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        Student stu = (Student) ac.getBean("myStudent");
        System.out.println(stu);
    }
}
