package build.september19;

public class Test {

    public static void main(String[] args) {

        Student.StudentBuilder builder = Student.builder();

        Student builder1 = builder.id("111").build();
        System.out.println(builder1);
    }
}
