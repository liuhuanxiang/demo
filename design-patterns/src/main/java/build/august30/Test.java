package build.august30;

public class Test {

    public static void main(String[] args) {
        Student.StudentBuilder builder = Student.builder();
        Student.StudentBuilder id = builder.id("111");
        Student builder1 = id.builder();
        System.out.println(builder1);

//        Student.builder()
    }
}
