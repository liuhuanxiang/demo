package composite.september19;

/**
 * 它就像是一个树形结构一样，有分支有叶子，而组合模式则是可以对整个树形结构上的所有节点进行递归处理，比如我们现在希望将所有文件夹中的文件的名称前面都添加一个前缀，那么就可以使用组合模式。
 * 组合模式的示例如下，这里我们就用文件和文件夹的例子来讲解：
 */
public abstract class Component {
    public abstract void addComponent(Component component);

    public abstract void removeComponent(Component component);

    public abstract Component getChild(int index);

    public abstract void test();
}
