package structured.proxy.dynamic;

public class SubjectImpl implements Subject{
    @Override
    public void test() {
        System.out.println("我是测试方法！");
    }

    @Override
    public void test1() {
        System.out.println("我是测试方法1！");
    }
}
