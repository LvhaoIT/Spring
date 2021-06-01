import com.handler.MyInvocationHandler;
import com.service.Impl.SomeServiceImpl;
import com.service.SomeService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by IntelliJ IDEA.
 * User: LvHaoIT (asus)
 * Date: 2021/6/1
 * Time: 15:14
 */
public class MyApp {
    public static void main(String[] args) {
        //创建一个被代理对象
        SomeService sos = new SomeServiceImpl();
        //    使用jdk的动态代理，创建代理对象
        InvocationHandler handler = new MyInvocationHandler(sos);
        //使用Proxy创建代理
        /**
         * Proxy.newProxyInstance有三个参数
         * 1是你当前代理类的类加载器,classLoader
         * 2被代理对象的接口
         * 3代理的对象
         * 返回值即成功被代理后的对象
         * 因为返回值为一个obj类型，所以必须要用接口进行强转
         */
        SomeService proxy = (SomeService) Proxy.newProxyInstance(
                sos.getClass().getClassLoader(),
                sos.getClass().getInterfaces(), handler);

        //通过代理执行方法
        proxy.doSome();
        proxy.doOther();
    }

}
