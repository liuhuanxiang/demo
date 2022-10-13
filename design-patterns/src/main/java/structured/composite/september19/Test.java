package structured.composite.september19;

public class Test {

    public static void main(String[] args) {
        Directory directory = new Directory();
        Directory directory1 = new Directory();
        directory.addComponent(new File());
        directory.addComponent(directory1);
        directory1.addComponent(new File());
        directory1.addComponent(new File());
        directory.test();
    }
}
