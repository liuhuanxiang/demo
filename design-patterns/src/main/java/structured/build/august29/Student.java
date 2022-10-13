package structured.build.august29;

//@Builder
public class Student {

    private String id;
    private String name;
    private String sex;

    private Student(String id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder{

        private String id;
        private String name;
        private String sex;

        public  Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Student builder() {
            return new Student(id, name, sex);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
