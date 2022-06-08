package schoolrecords;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ClassRecords {

    private List<Student> students = new ArrayList<>();

    private String className;

    private Random random;

    public ClassRecords(String className, Random random) {
        this.className = className;
        this.random = random;
    }

    public boolean addStudent(String name) {
        Student student = new Student(name);
        if (getStudentByNameOrNull(student.getName()) != null) {
            return false;
        }
        return students.add(student);
    }

    public boolean removeStudent(String name) {
        Student foundStudent = getStudentByNameOrNull(name);
        if (foundStudent != null) {
            students.remove(foundStudent);
            return true;
        } else {
            return false;
        }
    }

    public double calculateClassAverage() {
        validateStudents();
        double classAverage = 0;
        int countStudent = 0;
        for (Student student : students){
            double studentAverage = student.calculateAverage();
            if (studentAverage != 0){
                classAverage += studentAverage;
                countStudent++;
            }
        }
        if (countStudent == 0){
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Math.round(100 * classAverage / countStudent ) / 100.0;
    }

    public double calculateClassAverageBySubject(Subject subject) {
        validateStudents();
        double classAverage = 0;
        int countStudent = 0;
        for (Student student : students){
            double studentAverage = student.calculateSubjectAverage(subject);
            if (studentAverage != 0){
                classAverage += studentAverage;
                countStudent++;
            }
        }
        if (countStudent == 0){
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }
        return Math.round(100 * classAverage / countStudent ) / 100.0;
    }

    public String findStudentByName(String name) {
        validateStudentsAndName(name);
        Student student = getStudentByNameOrNull(name);
        if (student == null) {
            throw new IllegalArgumentException("Student by this name cannot be found! " + name);
        }
        return student.getName();
    }

    private Student getStudentByNameOrNull(String name) {
        for (Student student : students){
            if (student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    public String repetition() {
        if (students.isEmpty()){
            throw new IllegalStateException("No students to select for repetition!");
        }
        return students.get(random.nextInt(students.size())).getName();
    }

    public List<StudyResultByName> listStudyResults(){

        List<StudyResultByName> tempList = new ArrayList<>();
        for (Student student : students){
            tempList.add(new StudyResultByName(student.calculateAverage(), student.getName()));
        }
        return tempList;
    }

    public List<String> listStudentNames(){
        List<String> names = new ArrayList<>();
        for (Student student : students) {
            names.add(student.getName());
        }
        return names;
    }

    public String getClassName() {
        return className;
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    private void validateStudents() {
        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }
    }

    private void validateStudentsAndName(String name) {
        if (students.isEmpty()){
            throw new IllegalStateException("No students to search!");
        }
        if (isEmpty(name)) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
    }

    public void grade(String name, MarkType markType, Subject subject, Tutor tutor) {
        Mark actualMark = new Mark(markType, subject, tutor);
        Student student = getStudentByNameOrNull(name);
        student.grade(actualMark);
    }

    public double calculateAverage(String name) {
        return getStudentByNameOrNull(name).calculateAverage();
    }

    public double calculateSubjectAverage(String name, Subject subject) {
        return getStudentByNameOrNull(name).calculateSubjectAverage(subject);
    }
}
