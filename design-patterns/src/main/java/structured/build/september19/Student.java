package structured.build.september19;


import lombok.Builder;

@Builder
public class Student {

    private String id;

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                '}';
    }

    public Student(String id) {
        this.id = id;
    }

//    public static Builder builder(){
//        return new Builder();
//    }

//    public static class Builder {
//        private String id;
//
//        public Builder id(String id) {
//            this.id = id;
//            return this;
//        }
//
//        public Student builder() {
//            return new Student(id);
//        }
//    }
}
