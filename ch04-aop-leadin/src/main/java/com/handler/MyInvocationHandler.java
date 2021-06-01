package com.handler;

import com.util.ServiceTools;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/1
 * Time: 14:59
 */
public class MyInvocationHandler implements InvocationHandler {
    //目标对象
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //通过代理对象指向方式时会调用这个invoke

        Object res = null;
        String methodName = method.getName();
        if ("doSome".equals(methodName)) {
            ServiceTools.doLog();
            //执行目标类的方法，通过Methon
            res = method.invoke(target, args);
            ServiceTools.doCommit();
        } else {
            res = method.invoke(target, args);
        }

        return res;
    }
}
