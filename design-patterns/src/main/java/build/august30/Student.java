package build.august30;

import lombok.Builder;

@Builder
public class Student {

    private String id;


    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public Student(String id) {
        this.id = id;
    }

    public static class StudentBuilder{
        private String id;
        public StudentBuilder id(String id) {
            this.id = id;
            return this;
        }
        public Student builder(){
            return new Student(id);
        }
    }
}
