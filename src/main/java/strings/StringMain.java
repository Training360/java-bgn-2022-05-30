package strings;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class StringMain {

    public static void main(String[] args) {
        String first = "apple";
        String second = "apple";
        System.out.println(first == second);

        char[] chars = new char[5];
        for (int i = 0; i < 5; i++) {
            chars[i] = (char)('a' + i);
        }
        String letters = new String(chars);

        System.out.println(letters);
        System.out.println(letters == "abcde");
        System.out.println(letters.equals("abcde"));

        String part1 = "abc";
        String part2 = "de";
        String parts = part1 + part2;
        System.out.println("equals? " + (letters == parts));

        String parts2 = "abc" + "de";
        System.out.println(parts2 == "abcde");

        String parts3 = parts.intern();
        System.out.println(parts3 == "abcde");

        String s1 = new String("banana");
        String s2 = new String("banana");
        System.out.println(s1 == s2);

        System.out.println(s1.intern() == s2.intern());

        System.out.println(Charset.defaultCharset());
        byte[] bytes = "almá".getBytes(StandardCharsets.UTF_8);
        System.out.println(bytes.length);
        String s = new String(bytes, StandardCharsets.UTF_8);

        System.out.println(5 + 6 + "alma");
        System.out.println("alma" + 5 + 6);

        String fruit = "alma";
        fruit = fruit.toUpperCase();
        System.out.println(fruit);

        System.out.println("john".equalsIgnoreCase("JOHN"));

        System.out.println("árvíztűrőtükörfúrógép".toUpperCase().substring(5, 11));

        System.out.println("alma".repeat(10).strip());

        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("hu", "HU"));
        System.out.println(format.format(30));
        String ss1 = format.format(30);
        String ss2 = "30,00 Ft";
        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(ss1.equals(ss2));

        String[] names = {"a", "bb", "CCC"};
        System.out.println(String.join("---", names));

        String numbers = "";
        for (int i = 0; i < 1000; i++) {
            numbers = numbers + i;
        }
        System.out.println(numbers);

        StringBuilder sb = new StringBuilder(12);
        for (int i = 0; i < 1000; i++) {
            sb.append(i);
        }
        System.out.println(sb);

        List<String> namesNames = new ArrayList<>(5);

        String s10 = "alma";
        String s20 = "korte";
        System.out.println(s10+s20);

        StringBuilder sb2 = new StringBuilder();
        sb2.append("alma");
        sb2.append("korte");

        System.out.println("werweew " + 12 + "   !!!");
        System.out.println(new StringBuilder().append("werweew ").append(12).append("   !!!"));

        Random r = new Random();
        for (int i = 0; i < 100;i++) {
            int number = r.nextInt(100_000);
            System.out.printf("A szám: %10d\n", number);
        }
    }
}
