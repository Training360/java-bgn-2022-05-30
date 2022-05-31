package strings;

import java.util.Locale;

public class StringsDemo {

    public static void main(String[] args) {
        String name = "John Doe";
        System.out.println(name.toUpperCase());

        System.out.println("Apple".toUpperCase());

        String favouriteName = null;

        String empty = "";
        System.out.println(empty.length());
        System.out.println(name.length());

        System.out.println(name.equals("John Doe"));
        System.out.println(name.equals("Jack Doe"));

        System.out.println("John Doe".indexOf("Doe"));
        System.out.println("John Doe".indexOf("Apple"));

        System.out.println("John Doe".substring(3, 6));

        System.out.println("alma\nkorte");
    }
}
