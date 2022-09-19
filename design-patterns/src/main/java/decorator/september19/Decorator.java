package decorator.september19;

public class Decorator extends Base{

    protected Base base;

    public Decorator(Base base) {
        this.base = base;
    }

    @Override
    public void test() {
        base.test();
    }
}
