package structured.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TestProxy implements MethodInterceptor {

    private final Object target;

    public TestProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("现在是由CGLib进行代理操作！"+o.getClass());
        return method.invoke(target, objects);
    }
}
