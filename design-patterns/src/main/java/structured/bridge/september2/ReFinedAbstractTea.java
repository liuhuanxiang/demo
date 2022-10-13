package structured.bridge.september2;

public abstract class ReFinedAbstractTea extends AbstractTea{

    public ReFinedAbstractTea(Size size) {
        super(size);
    }

    public String getSize() {
        return size.getSize();
    }
}
