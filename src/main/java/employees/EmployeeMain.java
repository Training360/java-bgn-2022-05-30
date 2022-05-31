package employees;

public class EmployeeMain {

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 100_000);
        System.out.println(employee.getInfo());
        employee.increaseSalary(15);
        System.out.println(employee.getInfo());
    }
}
