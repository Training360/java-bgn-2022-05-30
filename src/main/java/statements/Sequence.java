package statements;

import java.util.ArrayList;
import java.util.List;

public class Sequence {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2));
        for (int i = 0; i < 5; i++) {
            numbers.add(numbers.get(i) * numbers.get(i + 1));
        }
        System.out.println(numbers);
    }
}
