package decorator;

public class Test {

    public static void main(String[] args) {
        BaseImpl base = new BaseImpl();
        DecoratorImpl decorator = new DecoratorImpl(base);
        DecoratorImpl outer = new DecoratorImpl(decorator);
        DecoratorImpl outer1 = new DecoratorImpl(outer);
        decorator.test();
        outer.test();
        System.out.println();
        outer1.test();
    }
}