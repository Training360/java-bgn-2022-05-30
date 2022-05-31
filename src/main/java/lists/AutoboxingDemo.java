package lists;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingDemo {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int number = 15;
        numbers.add(number);

        for (int i: numbers) {

        }

        int i = Integer.parseInt("123");
    }
}
