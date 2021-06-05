package com.entity;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/4
 * Time: 17:49
 */
public class Sale {
    private Integer id;
    private Integer gid;
    private Integer nums;

    public Sale() {
    }

    public Sale(Integer gid, Integer nums) {
        this.gid = gid;
        this.nums = nums;
    }

    public Sale(Integer id, Integer gid, Integer nums) {
        this.id = id;
        this.gid = gid;
        this.nums = nums;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }
}
