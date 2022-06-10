package i18n;

import java.text.MessageFormat;
import java.util.Locale;

public class Formatter {

    public static void main(String[] args) {
//        MessageFormat messageFormat = new MessageFormat("A {0} fizetése {1,number,currency}",
//                new Locale("en", "US"));
        MessageFormat messageFormat = new MessageFormat("A {0} fizetése {1,number,000,000.00}",
                new Locale("en", "US"));
//        String message = MessageFormat.format("A {0} fizetése {1}", "John Doe", 100_000.12345);
        System.out.println(messageFormat.format(new Object[]{"John Doe", 100_000.12345}));
    }
}
