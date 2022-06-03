package params;

import java.util.ArrayList;
import java.util.List;

public class ParamsDemo {

    public void add(int i, String s, List<String> l) {
        i = 5;
        s = "hello";
//        l = List.of("Jane");
        l.add("Jane");
    }

    public static void main(String[] args) {
        int j = 10;
        String world = "world";
        List<String> names = new ArrayList<>(List.of("John", "Jack"));
        new ParamsDemo().add(j, world, names);
        System.out.println(j);
        System.out.println(world);
        System.out.println(names);
    }
}
