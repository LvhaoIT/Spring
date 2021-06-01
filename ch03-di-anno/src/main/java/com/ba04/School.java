package com.ba04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/31
 * Time: 20:46
 */
@Component("mySchool04")
public class School {
    @Value("北大")
    private String name;
    @Value("北京")
    private String address;

    public School() {
    }

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
