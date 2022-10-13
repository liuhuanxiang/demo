package structured.bridge.september14;

public abstract class AbstractTea {

    Size size;

    protected AbstractTea(Size size) {
        this.size = size;
    }

    protected abstract String getType();
}
