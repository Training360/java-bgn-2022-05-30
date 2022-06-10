package demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collections {

    public static void main(String[] args) {
        List names = new ArrayList();
        // raw type
        names.add("kutya");

        if (names.get(0) instanceof String) {
            System.out.println(((String) names.get(0)).toUpperCase());
        }

        List<Double> doubles = new ArrayList<>(List.of(1.0, 2.0, 3.0));
        Iterator<Double> it = doubles.iterator();
        while (it.hasNext()) {
            double d = it.next();
            it.remove();
        }
    }
}
