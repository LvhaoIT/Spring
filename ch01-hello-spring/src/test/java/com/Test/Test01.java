package com.Test;

import com.service.Impl.SomeServiceImpl;
import com.service.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/29
 * Time: 16:26
 */
public class Test01 {
    @Test
    public void testDoSome() {
        SomeService service = new SomeServiceImpl();
        service.doSome();
    }

    /**
     * spring默认创建对象的时间：在创建spring的容器时，它会创建配置文件中所有的对象.
     * spring创建对象：默认调用的是无参构造方法
     */
    @Test
    public void testspringDoSome() {
        //使用spring容器创建的对象
        //1.指定spring配置文件的命
        String str = "beans.xml";
        //2.创建表示spring容器的对象， ApplicationContext
        //ApplicationContext就表示Spring容器，通过容器对象就可以获取对象了
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);

        //从容器中获取某个对象，你要调用对象的方法
        SomeService service = (SomeService) ac.getBean("someService");
        //使用spring创建好的对象
        service.doSome();
    }

    @Test
    public void test03() {
        String str = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        //使用spring提供的方法，获取容器中定义的对象的数量
        int nums = ac.getBeanDefinitionCount();
        System.out.println("容器中定义的对象的数量为：" + nums);

        //容器中每个定义的对象的名称
        String[] names = ac.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }


    /**
     * 获取一个非自定义类的对象
     */
    @Test
    public void test04() {
        String str = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(str);
        Date date = (Date) ac.getBean("mydate");
        System.out.println(date);
    }
}
