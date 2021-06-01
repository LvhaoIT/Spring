package com.ba02;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/31
 * Time: 14:49
 */

@Component("myStudent02")
public class Student {

    /**
     * @Value: 简单类型的属性赋值
     * 属性： value 是String类型的，表示简单类型的属性值
     * 位置：  1。在属性定义的上面，无需set方法 （推荐使用）
     * :      2。在set方法的上面，赋值使用的是对应的set方法
     */
    @Value(value = "张飞")
    private String name;
    @Value(value = "21")
    private Integer age;

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
