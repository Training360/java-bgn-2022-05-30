package employees;

public class Employee {

    private String name;

    private double salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(int   percent) {
        salary += (percent / 100.0) * salary;
    }

    public String getInfo() {
        return String.format("%s has salary: %f", name, salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
