package structured.composite.september19;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Component {

    List<Component> child = new ArrayList();

    @Override
    public void addComponent(Component component) {
        child.add(component);
    }

    @Override
    public void removeComponent(Component component) {
        child.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return child.get(index);
    }

    @Override
    public void test() {
        child.forEach(Component::test);
    }
}
