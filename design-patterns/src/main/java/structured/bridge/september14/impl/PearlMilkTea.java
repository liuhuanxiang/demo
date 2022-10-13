package structured.bridge.september14.impl;

import structured.bridge.september14.RefinedAbstractTea;
import structured.bridge.september14.Size;

public class PearlMilkTea extends RefinedAbstractTea {

    public PearlMilkTea(Size size) {
        super(size);
    }

    @Override
    public String getType() {
        return "珍珠奶茶";
    }
}
