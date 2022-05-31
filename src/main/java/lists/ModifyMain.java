package lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static lists.Colors.*;

public class ModifyMain {

        public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(2, 3, 2, 3, 5, 3, 5));
//        for (var number: numbers) {
//            if (number % 2 == 0) {
//                numbers.remove(number);
//            }
//        }
        var it = numbers.iterator();
        while (it.hasNext()) {
            var number = it.next();
            System.out.printf("Number: %d\n", number);
            if (number % 2 == 0) {
                System.out.printf("%s delete %s\n", ANSI_RED, ANSI_RESET);
                it.remove();
            }
        }
        System.out.println(numbers);

    }
}
