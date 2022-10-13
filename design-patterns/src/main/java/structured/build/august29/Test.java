package structured.build.august29;

public class Test {

    public static void main(String[] args) {
//        Student.StudentBuilder builder = Student.builder();
//        builder.sex("111");
//        Student.StudentBuilder builder2 = Student.builder();
//        builder2.sex("222");
//        System.out.println(builder2);
//        System.out.println(builder);
        Student.Builder builder = Student.builder();
        Student builder1 = builder.id("111").sex("222").builder();
        System.out.println(builder1);
    }
}
