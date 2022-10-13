package structured.composite.september15;

public abstract class Component {

    abstract void addComponent(Component component);

    abstract void removeComponent(Component component);

    abstract Component getChild(int index);

    abstract void test();
}
