package collections;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ListTest {

    @Test
    void testList() {
        List<Employee> employees = List.of(
                new Employee("John Doe", 100),
                new Employee("Jane Doe", 200),
                new Employee("Jack Doe", 300)
        );

        assertEquals(3, employees.size());
        assertEquals("Jane Doe", employees.get(1).getName());

//        List<String> names =
//                employees.stream()
//                        .map(e -> e.getName())
//                        .toList();
//        System.out.println(names);

        assertEquals(List.of("John Doe", "Jane Doe", "Jack Doe"),
                employees.stream()
                        .map(e -> e.getName())
                        .toList());

        assertThat(employees)
                .extracting(Employee::getName, Employee::getSalary)
                .hasSize(3)
                .contains(
                        tuple("Jane Doe", 200)
                );
    }
}
