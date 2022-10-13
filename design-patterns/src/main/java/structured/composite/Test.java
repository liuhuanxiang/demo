package structured.composite;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        Directory outer = new Directory();
        Directory inner = new Directory();
        outer.addComponent(inner);
        outer.addComponent(new File());
        inner.addComponent(new File());
        inner.addComponent(new File());
        List<Component> s = outer.child;

        outer.test();
    }
}
