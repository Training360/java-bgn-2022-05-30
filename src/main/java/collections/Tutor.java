package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tutor {

    private String name;

    private List<String> skills = new ArrayList<>();

    public void addSkill(String skill) {
        skills.add(skill);
    }

    public Tutor(String name) {
        this.name = name;
    }

    public Tutor(Tutor another) {
        name = another.name;
        skills = new ArrayList<>(another.skills);
    }

    public List<String> getSkills() {
        return Collections.unmodifiableList(skills);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "name='" + name + '\'' +
                ", skills=" + skills +
                '}';
    }

    public static void main(String[] args) {
        Tutor tutor = new Tutor("John Doe");
        tutor.addSkill("Java");
        tutor.addSkill("JavaScript");
        System.out.println(tutor.getSkills());

//        tutor.getSkills().clear();
//        System.out.println(tutor.getSkills());

        Tutor john2 = new Tutor(tutor);
        System.out.println(tutor);
        System.out.println(john2);

        System.out.println(tutor == john2);
        john2.setName("John John");
        System.out.println(tutor);
        System.out.println(john2);

        tutor.addSkill("Python");
        System.out.println(tutor);
        System.out.println(john2);
    }
}
