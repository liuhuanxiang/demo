package structured.composite.september15;

public class Test {

    public static void main(String[] args) {
        Directory outer = new Directory();
        Directory inner = new Directory();
        outer.addComponent(inner);
        outer.addComponent(new File());
        outer.addComponent(new File());
        inner.addComponent(new File());
        inner.addComponent(new File());
        outer.test();

        System.out.println();
        inner.test();
    }
}
