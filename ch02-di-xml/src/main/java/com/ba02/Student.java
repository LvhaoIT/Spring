package com.ba02;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/30
 * Time: 13:02
 */
public class Student {
    private Integer id;
    private String name;
    private String sax;
    private School school;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSax(String sax) {
        this.sax = sax;
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
                ", sax='" + sax + '\'' +
                ", school=" + school +
                '}';
    }
}
