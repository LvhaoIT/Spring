package com.Test;

import com.ba01.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/30
 * Time: 13:06
 */
public class test01 {
    @Test
    public void testMyStudent01() {
        String str = "ba01/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        Student stu = (Student) ac.getBean("myStudent");
        System.out.println("stu=" + stu.toString());
        Date date = (Date) ac.getBean("mydate");
        System.out.println("Date = " + date);

    }

    @Test
    public void testMyStudent02() {
        String str = "ba02/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        com.ba02.Student student = (com.ba02.Student) ac.getBean("myStudent");
        System.out.println("stu=" + student.toString());

    }

    @Test
    public void testMyStudent03() {
        String str = "ba03/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        com.ba03.Student student = (com.ba03.Student) ac.getBean("myStudent03");
        System.out.println("stu=" + student.toString());

        File f1 = (File) ac.getBean("myFile");
        System.out.println("f1的文件名:" + f1.getAbsolutePath());
    }

    @Test
    public void testMyStudent04() {
        String str = "ba04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        com.ba04.Student student = (com.ba04.Student) ac.getBean("myStudentAuto01");
        System.out.println("stu=" + student.toString());

    }

    @Test
    public void testMyStudent05() {
        String str = "ba04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        com.ba04.Student student = (com.ba04.Student) ac.getBean("myStudentAuto02");
        System.out.println("stu=" + student.toString());

    }
}
