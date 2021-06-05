package com.entity;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/4
 * Time: 17:53
 */
public class Goods {
    private Integer id;
    private String name;
    private Integer amount;
    private float price;

    public Goods() {
    }

    public Goods(Integer id, String name, Integer amount, float price) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
