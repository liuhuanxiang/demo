package structured.decorator.september19;

public class Test {

    public static void main(String[] args) {

        DecoratorImpl decorator = new DecoratorImpl(new BaseImpl());
        DecoratorImpl decorator1 = new DecoratorImpl(decorator);

        decorator1.test();
    }
}
