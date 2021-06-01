package com.ba06;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/31
 * Time: 14:49
 */

@Component("myStudent06")
public class Student {


    @Value(value = "张飞")
    private String name;
    @Value(value = "21")
    private Integer age;
    @Resource(name = "MyShool") //自动注入
    private School school;

    /**
     * 引用类型：
     *
     * @Resource: 来自于JDK中的注解，spring框架提供了对这个注解的功能支持，可以使用它给引用的类型赋值
     * 使用的也是自动注入原理，支持byName，byType，
     * 默认是byName，先使用byName自动注入，如果byName赋值失败，在使用byType
     * <p>
     * 位置：1. 在属性之上，无需set方法(推荐使用)
     * ：   2. 在set方法的上面
     * @Resource 只使用byName方式，需要增加一个属性 name
     * name的值是bean的id（名称）
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
