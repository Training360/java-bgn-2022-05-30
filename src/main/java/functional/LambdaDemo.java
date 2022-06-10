package functional;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class LambdaDemo {

    public static void main(String[] args) {
        UnaryOperator<String> firstToLetter = s -> s.substring(0, 2);

        System.out.println(firstToLetter.apply("hello world"));

        var employees = Stream.of("John Doe", "Jane Doe", "Jack Doe")
                .map(Employee::new)
                .toList();

        // name -> new Employee(name)
    }
}
