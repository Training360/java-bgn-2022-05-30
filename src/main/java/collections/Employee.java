package collections;

import java.util.Objects;

public class Employee {

    private String name;

    private int yearOfBirth;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Employee)) {
//            return false;
//        }
//        if (name == null) {
//            return false;
//        }
//        return name.equals(((Employee) obj).name);
//
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return yearOfBirth == employee.yearOfBirth && Objects.equals(name, employee.name);
    }


    public static void main(String[] args) {
        Employee e1 = new Employee("John Doe");
        Employee e2 = new Employee("John Doe");

        System.out.println(e1 == e2);
        // e1.equals(e2)
        System.out.println(e1.equals(e2));

        System.out.println(e1.equals("Jane Doe"));

        System.out.println(e1.equals(null));

        System.out.println(null instanceof Object);

        Employee e3 = new Employee(null);
        System.out.println(e3.equals(e1));
    }
}
