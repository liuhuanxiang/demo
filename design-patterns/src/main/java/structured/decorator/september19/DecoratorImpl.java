package structured.decorator.september19;

public class DecoratorImpl extends Decorator{

    public DecoratorImpl(Base base) {
        super(base);
    }

    @Override
    public void test() {
        System.out.println("执行前方法");
        base.test();
        System.out.println("执行后方法");
    }
}
