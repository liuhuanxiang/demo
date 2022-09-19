package composite.september15;

public class File extends Component{

    @Override
    void addComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    void removeComponent(Component component) {
        throw new UnsupportedOperationException();
    }

    @Override
    Component getChild(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    void test() {
        System.out.println("测试文件："+this);
    }
}
