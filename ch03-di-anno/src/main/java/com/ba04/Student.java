package com.ba04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/31
 * Time: 14:49
 */

@Component("myStudent04")
public class Student {


    @Value(value = "张飞")
    private String name;
    @Value(value = "21")
    private Integer age;
    @Autowired //自动注入
    @Qualifier("mySchool04") //采用找名字的方式，byName
    private School school;

    /**
     * 引用类型：
     *
     * @Autowired : spring框架提供的注解，实现引用类型的赋值
     * Spring中通过注解给引用类型赋值，使用的是自动注入原理，支持byName，byType
     * @Autowired ： 默认使用的是byType自动注入
     * 位置：1. 在属性之上，无需set方法(推荐使用)
     * ：   2. 在set方法的上面
     * <p>
     * 如果要使用byName方式，需要做的是：
     * 1. 在属性上面加入@Autowired
     * 2。在属性上面加入@Qualifier(value=“bean的id”): 表示使用指定名称的bean完成赋值
     */

    public Student(String name, Integer age, School school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Value(value = "21")
    public void setAge(Integer age) {
        System.out.println("放在set方法上的value值为：" + age);
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
