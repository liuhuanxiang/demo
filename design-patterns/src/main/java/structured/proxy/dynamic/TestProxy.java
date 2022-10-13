package structured.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestProxy implements InvocationHandler {

    private final Object object;

    public TestProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理对象："+proxy.getClass());
        Object invoke = method.invoke(object, args);
        System.out.println("方法调用完成，返回值为："+invoke);
        return invoke;
    }
}
