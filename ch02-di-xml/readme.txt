ch02-di-xml: 在spring的配置文件中，给java对象的属性赋值

di: 依赖注入，表示创建对象，给属性赋值

di的实现语法有两种 :
1.在spring的配置文件中，使用标签和属性来完成，叫做基于XML的di实现
2.使用spring中的注解，完成属性赋值，叫做基于注解的di实现

di的语法分类：
 1. set注入（设置注入） : spring调用类的set方法，用set方法可以实现属性的赋值
    80左右都是使用set注入。
 2. 构造注入，spring调用类的有参数构造方法，创建对象。在构造方法中完成赋值

 实现步骤
     1.创建maven项目
     2.加入maven的依赖
         spring的依赖 版本        5.3.7
                     稳定版本     5.2.15.RELEASE

     3.创建类(接口和它的实现类)
       和没有使用框架一样，就是普通的类

     4.创建spring需要用的配置未经
       声明类的信息，这些类由spring创建和管理
       通过spring的语法，完成属性的赋值。

     5.测试spring创建的对象