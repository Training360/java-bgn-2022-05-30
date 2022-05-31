package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsMain {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("John");
        names.add("Jack");

        System.out.println(names);
        System.out.println(names.get(1));

        names.set(1, "Jane");
        System.out.println(names);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
            // Módosíthatatlan hossza
        System.out.println(numbers);
        numbers.set(1, 10);
        System.out.println(numbers);

//        numbers.add(6);

        Integer[] arr = {1, 2, 3, 4, 5};
        List<Integer> nums = Arrays.asList(arr);
        System.out.println(nums);
        nums.set(1, 20);
        System.out.println(Arrays.toString(arr));

        // 9 Javatól kezdve, az inicializálás

        List<Integer> ages = List.of(1, 2, 3, 4, 5);
            // Immutable listát ad vissza
        System.out.println(ages);

        List<String> employees = new ArrayList<>(List.of("John", "Jack"));
        employees.add("Jane");
        System.out.println(employees);

        for (String employee: employees) {
            System.out.println(employee);
        }
    }
}
