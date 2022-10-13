package structured.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        InvocationHandler handler = new TestProxy(subject);
        Subject proxy = (Subject) Proxy.newProxyInstance(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                handler
        );
        proxy.test();
        //代理模式对应方法为
        proxy.test1();

    }
}
