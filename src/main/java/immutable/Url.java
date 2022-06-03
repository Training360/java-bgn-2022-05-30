package immutable;

import java.util.ArrayList;
import java.util.List;

public class Url {

    private final String host;

    public Url(String host) {
        this.host = host;
    }

    public static void main(String[] args) {
        final int i;
        System.out.println("hello world");
        i = 10;
        System.out.println(i);

        final List<String> names = new ArrayList<>();
        names.add("John Doe");
        System.out.println(names);

        final Employee employee = new Employee("John Doe");
        employee.setName("Jack Doe");
        System.out.println(employee.getName());

        // Ezt nem lehet: employee = new Employee("Jane Doe");

    }

    public void repeat(int i) {
        i = 10;
    }

    public void addNumber(int i) {
        if (i == 0) {
            return;
        }
        System.out.println("do something");
    }

}
