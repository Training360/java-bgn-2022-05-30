package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Numbers {

    public static void main(String[] args) {
        Set<Integer> n = new LinkedHashSet<>();

        System.out.println(n);

        n.add(15);
        n.add(10);
        System.out.println(n);

        n.add(15);
        System.out.println(n);

        for (int i: n) {
            System.out.println(i);
        }
    }
}
