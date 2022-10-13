package structured.bridge.september6;

public abstract class RefinedAbstractTea extends AbstractTea{


    RefinedAbstractTea(Size size) {
        super(size);
    }

    public String getSize() {
        return size.getSize();
    }
}
