package structured.bridge.september2;

public abstract class AbstractTea {
    protected  Size size;

    protected AbstractTea(Size size) {
        this.size = size;
    }

    public abstract String getType();
}
