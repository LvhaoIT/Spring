package com.util;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/1
 * Time: 15:09
 */
public class ServiceTools {
    public static void doLog() {
        System.out.println("执行日志：" + new Date());
    }

    public static void doCommit() {
        System.out.println("执行提交事务：commit");
    }

}
