package bridge.september14.impl;

import bridge.september14.RefinedAbstractTea;
import bridge.september14.Size;

public class PearlMilkTea extends RefinedAbstractTea {

    public PearlMilkTea(Size size) {
        super(size);
    }

    @Override
    public String getType() {
        return "珍珠奶茶";
    }
}
