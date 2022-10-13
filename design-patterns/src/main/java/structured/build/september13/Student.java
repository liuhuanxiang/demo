package structured.build.september13;

public class Student {

    private String id;

    public Student(String id) {
        this.id = id;
    }

    public static Builder builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                '}';
    }

    public static class Builder{

        private String id;

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Student builder() {
            return new Student(this.id);
        }
    }
}
