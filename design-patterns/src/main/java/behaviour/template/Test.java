package behaviour.template;

public class Test {

    public static void main(String[] args) {
        AbstractDiagnosis diagnosis = new ColdDiagnosis();
        diagnosis.test();

    }
}
