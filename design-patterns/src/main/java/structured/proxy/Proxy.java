package structured.proxy;

public class Proxy extends Subject{

    Subject target;

    public Proxy(Subject target) {
        this.target = target;
    }

    @Override
    public void test() {
        System.out.println("代理前绕方法");
        target.test();
        System.out.println("代理后绕方法");
    }
}
