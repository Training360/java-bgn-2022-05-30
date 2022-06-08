package collections;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        Set<String> names = Set.of("jane", "jack", "joe");
        System.out.println(names.size());

        Map<String, Integer> numbers = Map.of("jane", 15, "jack", 3, "joe", 10);
        System.out.println(numbers.get("jack"));
        // numbers.put("john", 22);
        // java.lang.UnsupportedOperationException

        List<Integer> ages = new ArrayList<>();
        ages.add(1);
        ages.add(2);
        ages.add(3);
        System.out.println(ages);

        List<Integer> unmodifiable = Collections.unmodifiableList(ages);
//        unmodifiable.add(4);

        ages.add(5);
        System.out.println(unmodifiable);
    }
}
