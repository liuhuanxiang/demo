package bridge.september6;

public abstract class AbstractTea {

    Size size;

    AbstractTea(Size size) {
        this.size = size;
    }

    public abstract String getType();
}
