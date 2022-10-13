package structured.composite.september15;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {

    List<Component> child = new ArrayList();

    @Override
    void addComponent(Component component) {
        child.add(component);
    }

    @Override
    void removeComponent(Component component) {
        child.remove(component);
    }

    @Override
    Component getChild(int index) {
        return child.get(index);
    }

    @Override
    void test() {
        child.forEach(Component::test);
    }
}
