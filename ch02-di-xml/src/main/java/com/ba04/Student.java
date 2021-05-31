package com.ba04;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/30
 * Time: 13:02
 */
public class Student {
    private Integer id;

    public Student(Integer id, String name, String sex, School school) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.school = school;
    }

    public Student() {
    }

    private String name;
    private String sex;
    private School school;


    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSchool(School school) {
        System.out.println("setSchool" + school);
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sax='" + sex + '\'' +
                ", school=" + school +
                '}';
    }
}
