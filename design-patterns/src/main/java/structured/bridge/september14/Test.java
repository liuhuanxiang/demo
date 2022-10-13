package structured.bridge.september14;

import structured.bridge.september14.impl.PearlMilkTea;

public class Test {
    public static void main(String[] args) {
        KissTea kissTea = new KissTea(new Large());
        System.out.println(kissTea.getSize() + " "+ kissTea.getType());

        PearlMilkTea pearlMilkTea = new PearlMilkTea(new Large());
        System.out.println(pearlMilkTea.getSize() +" "+ pearlMilkTea.getType());
    }
}
