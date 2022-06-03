package calculator;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

// Teszt osztály
@TestMethodOrder(MethodOrderer.Random.class)
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void init() {
        System.out.println("Init");
        calculator = new Calculator();
    }

    // Teszteset
    @Test
    void add() {
        // BDD: behaviour driven design
        // given - when - then (assert)
        // given
        // when
        int result = calculator.add(5, 6);
        // then
        assertEquals(11, result);
    }

    @Test
    @DisplayName("With two positive numbers")
    void test_given_two_positive_number_should_return_sum_of_them() {
        assertEquals(11, calculator.add(5, 6));
    }

    @Test
    void test_add_negative_numbers() {
        assertEquals(-3, calculator.add(-1, -2));
    }

    @Test
    void test_mul() {
        assertEquals(0.3, calculator.mul(0.1, 3), 0.005);
    }

    @Test
    void test_employee() {
        assertEquals(new Employee("John Doe"), new Employee("John Doe"));
        var employee = new Employee("Jack Doe");
        var another = employee;
        assertSame(employee, another);
    }
}