package structured.bridge.september14;

public class KissTea extends RefinedAbstractTea{
    protected KissTea(Size size) {
        super(size);
    }

    @Override
    public String getType() {
        return "芋圆啵啵奶茶";
    }
}
