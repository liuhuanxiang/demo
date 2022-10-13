package structured.bridge.september14;

public abstract class RefinedAbstractTea extends AbstractTea{

   protected RefinedAbstractTea(Size size) {
        super(size);
    }

   protected String getSize() {
        return size.getSize();
   }
}
