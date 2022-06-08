package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Tilos {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Stream.generate(Math::random)
                .parallel()
                .map(e ->  (int) (e.doubleValue() * 1000))
                .limit(10)
                .forEach(i -> numbers.add(i));

        System.out.println(numbers);

        List<Employee> employees = Stream.of(new Employee("John Doe"), new Employee("Jane Doe"))
                .peek(e -> e.setName(e.getName().toUpperCase()))
                .toList();
        System.out.println(employees);
    }
}
