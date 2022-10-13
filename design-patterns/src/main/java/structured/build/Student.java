package structured.build;

import lombok.Getter;

import java.util.List;

@Getter
public class Student {
    int id;
    int age;
    int grade;
    String name;
    String college;
    String profession;
    List<String> awards;

    public Student(int id, int age, int grade) {
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {
        private int id;
        private int age;
        private int grade;
        public Builder id(int id){
            this.id = id;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder grade(int grade){
            this.grade = grade;
            return this;
        }
        public Student builder() {
            return new Student(id, age, grade);
        }
    }

}
