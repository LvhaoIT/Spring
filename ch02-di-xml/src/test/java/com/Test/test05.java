package com.Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/30
 * Time: 13:06
 */
public class test05 {

    @Test
    public void testMyStudentBa05() {
        String str = "ba05/total.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        com.ba05.Student student = (com.ba05.Student) ac.getBean("myStudentAuto02");
        System.out.println("stu=" + student.toString());
    }
}
