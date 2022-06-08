package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MapDemo {

    public static void main(String[] args) {
        Map<String, String> dict =
                new HashMap<>();

        dict.put("apple", "alma");
        dict.put("dog", "kutya");

        System.out.println(dict);

        System.out.println(dict.get("dog"));

        dict.put("dog", "blöki");
        System.out.println(dict);

        System.out.println(dict.get("cat"));
        System.out.println(dict.containsKey("cat"));

        if (dict.containsKey("cat")) {
            System.out.println(dict.get("cat"));
        }

        Optional
                .ofNullable(dict.get("cat"))
                .ifPresent((v) -> System.out.println(v));

        Optional
                .ofNullable(dict.get("dog"))
                .ifPresent((v) -> System.out.println(v));

        // SOSE CSINÁLJUNK ILYET!
//        for (String key: dict.keySet()) {
//            System.out.println(key + " - " + dict.get(key));
//        }
        for (Map.Entry entry: dict.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }



    }
}
