package innerclasses;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("JANEbbb", "jackaa", "johnc"));
        //names.sort(new StringComparator());
//        names.sort(new LenghComparator());

//        names.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });

        names.sort((o1, o2) -> o1.length() - o2.length());

        System.out.println(names);
    }
}
