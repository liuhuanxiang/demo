package structured.bridge.september14;

public class DemoInterfaceImpl implements DemoInterface {

    public DemoInterfaceImpl() {
    }

    @Override
    public void method() {

    }

    private class DemoProtected{

        public DemoProtected() {
        }
        private void method(){
            DemoProtected demoProtected = new DemoProtected();
        }

        private class DemoC{
            private void method(){
                DemoInterfaceImpl demoProtected = new DemoInterfaceImpl();
            }

        }

    }

    private class DemoPrivate{
        private void method(){
            DemoProtected demoProtected = new DemoProtected();
        }
    }
}
