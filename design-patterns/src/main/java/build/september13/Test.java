package build.september13;

public class Test {
    public static void main(String[] args) {

        Student builder = Student.builder().id("123456").builder();

        System.out.println(builder);

    }
}
