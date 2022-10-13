package structured.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import structured.proxy.SubjectImpl;

public class Test {
    public static void main(String[] args) {
        SubjectImpl subject = new SubjectImpl();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SubjectImpl.class);
        enhancer.setCallback(new TestProxy(subject));
        SubjectImpl proxy = (SubjectImpl) enhancer.create();
        proxy.test();
    }
}
