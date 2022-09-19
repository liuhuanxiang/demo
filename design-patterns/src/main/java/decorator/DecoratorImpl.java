package decorator;

public class DecoratorImpl extends Decorator{

    public DecoratorImpl(Base base) {
        super(base);
    }

    @Override
    public void test() {
        System.out.println("装饰方法：我是操作前逻辑");
        super.test();
        System.out.println("装饰方法：我是操作后逻辑");
    }
}
