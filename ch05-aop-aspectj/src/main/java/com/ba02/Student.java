package com.ba02;

import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/5/31
 * Time: 14:49
 */

/**
 * @Component: 用来创建对象，等同于<bean>的功能
 * 属性： value 就是对象的名称，也就是bean中的id值
 * value的值是唯一的，创建的对象在整个spring容器中就只有一个
 * @component(value = "myStudent") 等同于
 * <bean id="myStudent class="com.bao1.student" />
 * <p>
 * spring中和@Component功能一致，创建对象的注解还有：
 * 1. @Repository （持久层）：放在dao层的，放在dao的实现类上面，
 * 表示创建dao对象，dao对象是能访问数据库的
 * 2. @Service（用在业务层类的上面）：放在service的实现类上面，
 * 创建service对象，service对象是做业务处理的，可以有事务等功能的
 * 3. @Controller（放在控制器上面），放在控制器（处理器）类的上面的，创建控制器对象，
 * 控制器对象，能够接收用户提交的数据显示请求的处理结果的
 * 以上三个注解的语法和Component是一样的，都能创建对象，但是这三个注解还有额外功能的
 * @Repository，@Service，@controller是给项目的对象分层的
 */
//@Component(value = "myStudent")//也可以写成
@Component("myStudent") //还可以省略
//@Component //不指定对象名称，由spring提供默认名称，类名的首字母小写
public class Student {
    private String name;
    private String age;

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
