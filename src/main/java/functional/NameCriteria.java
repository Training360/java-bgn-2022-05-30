package functional;

import java.util.function.Predicate;

public class NameCriteria implements Predicate<Employee> {

    private String name;

    public NameCriteria(String name) {
        this.name = name;
    }

    @Override
    public boolean test(Employee employee) {
        return employee.getName().equals(name);
    }
}
