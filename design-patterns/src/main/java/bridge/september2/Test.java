package bridge.september2;

public class Test {

    public static void main(String[] args) {
        KissTea kissTea = new KissTea(new Large());
        System.out.println(kissTea.getType());
        System.out.println(kissTea.getSize());
    }
}
