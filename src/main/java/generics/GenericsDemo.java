package generics;

import java.util.List;
import java.util.Map;

public class GenericsDemo {

    public static void main(String[] args) {
        Map<Integer, List<String>> words =
                Map.of(2, List.of("aa", "bb"), 3,
                        List.of("aaa", "bbb"));

        List<String> names = List.of("John Doe", "Jack Doe");
        names.forEach(e -> System.out.println(e));
    }
}
