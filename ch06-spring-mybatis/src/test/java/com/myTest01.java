package com;

import com.entity.Users;
import com.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/3
 * Time: 20:58
 */
public class myTest01 {
    @Test
    public void test01() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        String name[] = ac.getBeanDefinitionNames();
        for (String a : name) {
            System.out.println("容器中对象名：===========" + a);
        }
    }


    @Test
    public void testDaoSelect() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService userService = (UserService) ac.getBean("usersService");
        List<Users> list = userService.queryUsers();
        for (Users user : list) {
            System.out.println(user);
        }

    }

    @Test
    public void testDaoInsert() {
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        UserService userService = (UserService) ac.getBean("usersService");
        int result = userService.addUsers(new Users(8, "lvhao", "123", "男", "123@qq"));
        System.out.println("result=" + result);

    }
}
