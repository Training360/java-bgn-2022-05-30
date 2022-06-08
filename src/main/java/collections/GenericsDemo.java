package collections;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

    public static void main(String[] args) {
//        List names = new ArrayList();
//        names.add("john");

        List<String> names = new ArrayList<>();
        names.add("John Doe");

        List objects = names;

        objects.add(1);

        System.out.println(names.get(1));
    }
}
