package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private String name;

    private String idCard;

    public Student(String name, String idCard) {
        this.name = name;
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idCard='" + idCard + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe", "1234"));

        System.out.println(students.contains(new Student("John Doe", "9999")));
    }
}
